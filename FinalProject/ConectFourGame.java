package FinalProject;

//imports all needed tools
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class ConectFourGame {
    //initializes needed variables
    private static final int red = 1;
    private static final int blue = 2;
    private int turn = ConectFourGame.red;
    static int redWonGames = 0;
    static int blueWonGames = 0;
    int newRedScore = 0;
    int newBlueScore = 0;
    int redWonSaved = 0;
    int blueWonSaved = 0;
    int redWonCurrent = 0;
    int blueWonCurrent = 0;
    
    int board[][] = new int[6][7];
    
    /***
     * cleans the board when restart button is pressed
     */
    public void cleanBoard(){
        board = new int[6][7];
        turn = ConectFourGame.red;
    }
    
    /***
     * returns turn int when called
     * @return 
     */
    public int getTurn(){
        return turn;
    }
    
    /***
     * displays the entire board using println
     */
    public void displayBoard(){
        for(int row = 0; row < 6; row++){
            for(int column = 0; column < 7; column++){
                System.out.print(board[row][column] + " ");
            }
            System.out.println("");
        }
    }
    
    /***
     * loads game state from a file
     */
    public void loadGame(){
        board = new int[6][7];
        try{
            FileReader file = new FileReader("C:\\projects\\ConnectFourData\\BoardSaveState.dat");
            BufferedReader buffer = new BufferedReader(file);
            for(int row = 0; row < 6; row++){
                for(int column = 0; column < 7; column++){
                    board[row][column] = Integer.parseInt(buffer.readLine());
                }
            }
            turn = Integer.parseInt(buffer.readLine());
            buffer.close();
            file.close();
        }
        catch(IOException e){
            System.out.println("Sorry, file not found.");
        }
    }
    
    /***
     * saves game state to a file
     */
    public void saveGame(){
        File myObj = new File("C:\\projects\\ConnectFourData\\BoardSaveState.dat");
        try{
            FileWriter myWriter = new FileWriter("C:\\projects\\ConnectFourData\\BoardSaveState.dat");
            for(int row = 0; row < 6; row++){
                for(int column = 0; column < 7; column++){
                    myWriter.write("" + board[row][column] + "\n");
                }
            }
            myWriter.write("" + turn);
            myWriter.close();
        }
        catch(IOException e){
        }
    }
    
    /***
     * saves and reads game scores from and to file
     */
    public void saveScores(){
        
        newRedScore = 0;
        newBlueScore = 0;
        
        //reads file
        try{
            FileReader file = new FileReader("C:\\projects\\ConnectFourData\\storedScores.dat");
            BufferedReader buffer = new BufferedReader(file);
            redWonSaved = Integer.parseInt(buffer.readLine());
            blueWonSaved = Integer.parseInt(buffer.readLine());
            buffer.close();
            file.close();
        }
        catch(IOException e){
        }
        
        newRedScore = redWonCurrent + redWonSaved;
        newBlueScore = blueWonCurrent + blueWonSaved;
       
        //creates and writes to file
        File myObj = new File("C:\\projects\\ConnectFourData\\storedScores.dat");
        try{
            FileWriter myWriter = new FileWriter("C:\\projects\\ConnectFourData\\storedScores.dat");
            myWriter.write("" + newRedScore + "\n");
            myWriter.write("" + newBlueScore);
            myWriter.close();
        }
        catch(IOException e){
        }
        
        redWonCurrent = 0;
        blueWonCurrent = 0;
        
    }
   
    /***
     * finds first available spot in row to place a token
     * @param column
     * @return 
     */
    private int findAvailableRow(int column){
        int availableRow = 0;
        for(int row = 5; row >= 0; row--){
            if(board[row][column] == 0){
                availableRow = row;
                break;
            }
        }
        return availableRow;
    }
    
    /***
     * figures out whether or not this column can be used
     * @param column
     * @return 
     */
    private boolean canUseColumn(int column){
        boolean canUseColumn = false;
            if(board[0][column] == 0){
                canUseColumn = true;
            }
        return canUseColumn;
    }
    
    /***
     * places token of a certain colour to a specified column and row
     * @param colour
     * @param availableRow
     * @param column 
     */
    private void colourAvailableCell(int colour, int availableRow, int column){
        board[availableRow][column] = colour;
    }
    
    /***
     *places token into specified column if possible
     * @param colour
     * @param column
     * @return 
     */
    public boolean putToken(int column){
        boolean canUseColumnBool = canUseColumn(column);
        
        if (canUseColumnBool == true){
            int availableRow = findAvailableRow(column);
            colourAvailableCell(turn, availableRow, column);
            if(turn == ConectFourGame.red){
                turn = ConectFourGame.blue;
            }
            else{
                turn = ConectFourGame.red;
            }
        }
        return canUseColumnBool;
    }
    
    /***
     * subroutine used in the findLineOfFour Method. looks for diagonal matches of 4
     * @param startingColumn
     * @param startingRow
     * @param directionOfSearch
     * @return 
     */
    public boolean checkColoursInDiagonal(int startingColumn, int startingRow, boolean directionOfSearch){
        int column = startingColumn;
        int currentColour;
        int lastColour = 0;
        int foundRow = 1;
        boolean findLineOfFour = false;
        for(int row = startingRow; row < 6; row++){
            if((directionOfSearch == true && column < 7) || (directionOfSearch == false && column > -1)){
                currentColour = board[row][column];
                if (currentColour == lastColour && currentColour != 0){
                    foundRow++;
                    if(foundRow >= 4){
                        findLineOfFour = true;
                        return findLineOfFour;
                    }
                }
                else{
                    foundRow = 1;
                }
                lastColour = currentColour;
            }
            if(directionOfSearch == true){
                column++;
            }
            else{
                column--;
            }
            
        }
        return findLineOfFour;
    }
    
    
    /***
     * scans columns and rows for 4 consecutive tokens of the same colour
     * @return 
     */
    public boolean findLineOfFour(){
        int foundRow = 1;
        boolean findLineOfFour = false;
        int currentColour;
        int lastColour = 0;
        
        //horizontal scan
        for(int row = 0; row < 6; row++){
            for(int column = 0; column < 7; column++){
                currentColour = board[row][column];
                if (currentColour == lastColour && currentColour != 0){
                    foundRow++;
                    if(foundRow >= 4){
                        findLineOfFour = true;
                        return findLineOfFour;
                    }
                }
                else{
                    foundRow = 1;
                }
            lastColour = currentColour;
            }
        lastColour = 0;
        }
        
        foundRow = 1;
        currentColour = 0;
        lastColour = 0;
        
        //vertacle scan
        for(int column = 0; column < 7; column++){
            for(int row = 0; row < 6; row++){
                currentColour = board[row][column];
                if (currentColour == lastColour && currentColour != 0){
                    foundRow++;
                    if(foundRow >= 4){
                        findLineOfFour = true;
                        return findLineOfFour;
                    }
                }
                else{
                    foundRow = 1;
                }
            lastColour = currentColour;
            }
        lastColour = 0;
        }
        
        //diagonal scans
        int[] startingColumnOne = {0,0,0,1,2,3};
        int[] startingRowOne = {2,1,0,0,0,0};
        
        for(int i = 0; i < 6; i++){
            findLineOfFour = checkColoursInDiagonal(startingColumnOne[i], startingRowOne[i], true);
            if(findLineOfFour == true){
                return findLineOfFour;
            }
        }
        int[] startingColumnTwo = {6,6,6,5,4,3};
        
        for(int i = 0; i < 6; i++){
            findLineOfFour = checkColoursInDiagonal(startingColumnTwo[i], startingRowOne[i], false);
            if(findLineOfFour == true){
                return findLineOfFour;
            }
        }
        
        return findLineOfFour;
    }
    
    //main method used for testing game logic before implementing GUI
    public static void main(String[] args){
        ConectFourGame game = new ConectFourGame();
/*        game.putToken(ConectFourGame.red, 3);
        game.putToken(ConectFourGame.blue, 4);
        game.putToken(ConectFourGame.red, 6);
        game.putToken(ConectFourGame.red, 6);
        game.putToken(ConectFourGame.blue, 6);
        game.putToken(ConectFourGame.red, 6);
        game.putToken(ConectFourGame.red, 6);
        game.putToken(ConectFourGame.red, 6);
        game.putToken(ConectFourGame.red, 5);
        game.putToken(ConectFourGame.red, 5);
        game.putToken(ConectFourGame.red, 5);
        game.putToken(ConectFourGame.red, 5);
        game.putToken(ConectFourGame.red, 5);
        game.putToken(ConectFourGame.red, 5); 
        
 /*       game.putToken(ConectFourGame.blue, 6);
        game.putToken(ConectFourGame.red, 6);
        game.putToken(ConectFourGame.blue, 5);
        game.putToken(ConectFourGame.red, 5); */
        game.displayBoard();
        boolean test = game.findLineOfFour();
        if (test == true) {
            System.out.println("Game Won!");

        }
    }
    
        
    
}
