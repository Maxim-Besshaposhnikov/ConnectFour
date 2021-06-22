# ConnectFour
Connect Four Game

Final Project: Connect 4
    The program I decided to make is Connect 4. Connect 4 is a well known game in which players take turns placing a token into a column of a board and you win by having 4 tokens of the same colour line up horizontally, vertically, or diagonally. This program uses a simple GUI to display the game with a simple to use design. To place a token, you simply press a button above the column that you would like to place your token into. If the game is over or you simply want to reset the game, there is a button you can click to wipe the board and restart the game. Below the restart button, there are two buttons. One of them is to save the state of the current game, and another is to load that saved state of the game (this uses a database) The bottom left of the GUI displays the amount of games won by each colour during the current session, and the total for all sessions (this also uses a database). Some of the things I learned to do on my own for this project are changing the background colour of the text frames using code (example: Line 14, ConnectFour.java), disabling buttons using code (example: Line 24, ConnectFour.java), using a separate java class for the main logic of a given program, and using a double array to create a 2d structure as a playfield (example: Line 24, ConectFourGame.Java).

Testing: 
    Since the only input you can give is buttons there is not a lot of testing to be done, but some issues that did come up are as follows:
    Multiple instances of there being 4 tokens in a row and the game not recognizing it. The fix was to debug and edit the logic of the code used to scan for this.
    Buttons not working the way they should. The fix was looking over the logic used to create the functionalities.
    Storage files not working and scoreboards working incorrectly. The fix was looking over the logic that found/created files and saved information inside of them.
    For the remainder of the testing, I attempted playing the game with different ways to connect four (different colour, location, axis of the consecutive tokens) until everything worked the way it was meant to.
    

Database uses: 
Save and Load a state of game.
Save and print scoreboard.

New feature used:
    using a double array to create a 2d structure as a playfield (Line 24, ConnectFour.java)

Method Headers: 

* cleans the board when restart button is pressed*
public void cleanBoard()

* returns turn int when called*
public int getTurn()

* displays the entire board using println*
public void displayBoard()

* loads game state from a file*
public void loadGame()

* saves game state to a file*
public void saveGame()

* saves and reads game scores from and to file*
public void saveScores()

 * finds first available spot in row to place a token*
private int findAvailableRow(int column)

* figures out whether or not this column can be used*
private boolean canUseColumn(int column)

* places token of a certain colour to a specified column and row*
private void colourAvailableCell(int colour, int availableRow, int column)

*places token into specified column if possible*
public boolean putToken(int column){

* subroutine used in the findLineOfFour Method. looks for diagonal matches of 4*
public boolean checkColoursInDiagonal(int startingColumn, int startingRow, boolean directionOfSearch)

* scans columns and rows for 4 consecutive tokens of the same colour*
public boolean findLineOfFour()

*main method used for testing game logic before implementing GUI*
public static void main(String[] args)

* starts all needed methods to initialize the game*
public ConnectFour()

* if game is won, this method is called to prevent play after a finished game*
private void disableButtons()

* if game is reset, the buttons need to work again*
private void enableButtons()

* places the token in selected place based on button choice*
private void placingTokens(int column)

* restart game button*
private void buttonRestartActionPerformed(java.awt.event.ActionEvent evt)

* loads a save state*
private void buttonLoadActionPerformed(java.awt.event.ActionEvent evt)

* updates the playing field display*
private void displayBoard()


