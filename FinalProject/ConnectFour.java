package FinalProject;
import java.io.*;

public class ConnectFour extends javax.swing.JFrame {

    ConectFourGame game = new ConectFourGame();
    
    /***
     * starts all needed methods to initialize the game
     */
    public ConnectFour() {
        initComponents();
        lblTurn.setText("Red Turn");
        lblTurn.setForeground(new java.awt.Color(255, 0, 0));
        game.saveScores();
        lblRedWinsAll.setText("" + game.newRedScore);
        lblBlueWinsAll.setText("" + game.newBlueScore);
    }
    
    /***
     * if game is won, this method is called to prevent play after a finished game
     */
    private void disableButtons(){
        buttonColumn1.setEnabled(false);
        buttonColumn2.setEnabled(false);
        buttonColumn3.setEnabled(false);
        buttonColumn4.setEnabled(false);
        buttonColumn5.setEnabled(false);
        buttonColumn6.setEnabled(false);
        buttonColumn7.setEnabled(false);
    }
    
    /***
     * if game is reset, the buttons need to work again
     */
    private void enableButtons(){
        buttonColumn1.setEnabled(true);
        buttonColumn2.setEnabled(true);
        buttonColumn3.setEnabled(true);
        buttonColumn4.setEnabled(true);
        buttonColumn5.setEnabled(true);
        buttonColumn6.setEnabled(true);
        buttonColumn7.setEnabled(true);
    }

    /***
     * places the token in selected place based on button choice
     * @param column 
     */
    private void placingTokens(int column){
        game.putToken(column);
        switch(game.getTurn()){
            case 1:
                lblTurn.setText("Red Turn");
                lblTurn.setForeground(new java.awt.Color(255, 0, 0));
                break;
            case 2:
                lblTurn.setText("Blue Turn");
                lblTurn.setForeground(new java.awt.Color(0, 0, 255));
                break;
        }
        displayBoard();
        boolean test = game.findLineOfFour();
        
        //if game is win, displays the winners name and updates the scoreboards
        if (test == true) {
            switch(game.getTurn()){
            case 1:
                lblTurn.setText("Blue Won");
                lblTurn.setForeground(new java.awt.Color(0, 0, 255));
                disableButtons();
                game.blueWonGames++;
                game.blueWonCurrent++;
                game.saveScores();
                lblBlueWinsCurrentNumber.setText("" + game.blueWonGames);
                lblRedWinsCurrentNumber.setText("" + game.redWonGames);
                lblRedWinsAll.setText("" + game.newRedScore);
                lblBlueWinsAll.setText("" + game.newBlueScore);
                break;
            case 2:
                lblTurn.setText("Red Won");
                lblTurn.setForeground(new java.awt.Color(255, 0, 0));
                disableButtons();
                game.redWonGames++;
                game.redWonCurrent++;
                game.saveScores();
                lblBlueWinsCurrentNumber.setText("" + game.blueWonGames);
                lblRedWinsCurrentNumber.setText("" + game.redWonGames);
                lblRedWinsAll.setText("" + game.newRedScore);
                lblBlueWinsAll.setText("" + game.newBlueScore);
                break;
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        lblTitle = new javax.swing.JLabel();
        txt5_0 = new javax.swing.JTextField();
        txt4_0 = new javax.swing.JTextField();
        txt3_0 = new javax.swing.JTextField();
        txt2_0 = new javax.swing.JTextField();
        txt1_0 = new javax.swing.JTextField();
        txt0_0 = new javax.swing.JTextField();
        txt5_1 = new javax.swing.JTextField();
        txt4_1 = new javax.swing.JTextField();
        txt3_1 = new javax.swing.JTextField();
        txt2_1 = new javax.swing.JTextField();
        txt1_1 = new javax.swing.JTextField();
        txt0_1 = new javax.swing.JTextField();
        txt5_2 = new javax.swing.JTextField();
        txt4_2 = new javax.swing.JTextField();
        txt3_2 = new javax.swing.JTextField();
        txt2_2 = new javax.swing.JTextField();
        txt1_2 = new javax.swing.JTextField();
        txt0_2 = new javax.swing.JTextField();
        txt5_3 = new javax.swing.JTextField();
        txt4_3 = new javax.swing.JTextField();
        txt3_3 = new javax.swing.JTextField();
        txt2_3 = new javax.swing.JTextField();
        txt1_3 = new javax.swing.JTextField();
        txt0_3 = new javax.swing.JTextField();
        txt5_4 = new javax.swing.JTextField();
        txt4_4 = new javax.swing.JTextField();
        txt3_4 = new javax.swing.JTextField();
        txt2_4 = new javax.swing.JTextField();
        txt1_4 = new javax.swing.JTextField();
        txt0_4 = new javax.swing.JTextField();
        txt5_5 = new javax.swing.JTextField();
        txt4_5 = new javax.swing.JTextField();
        txt3_5 = new javax.swing.JTextField();
        txt2_5 = new javax.swing.JTextField();
        txt1_5 = new javax.swing.JTextField();
        txt0_5 = new javax.swing.JTextField();
        txt5_6 = new javax.swing.JTextField();
        txt4_6 = new javax.swing.JTextField();
        txt3_6 = new javax.swing.JTextField();
        txt2_6 = new javax.swing.JTextField();
        txt1_6 = new javax.swing.JTextField();
        txt0_6 = new javax.swing.JTextField();
        buttonRestart = new javax.swing.JButton();
        buttonSaveState = new javax.swing.JButton();
        buttonLoad = new javax.swing.JButton();
        lblTurn = new javax.swing.JLabel();
        lblCurrentSessionTitle = new javax.swing.JLabel();
        lblBlueWinsCurrent = new javax.swing.JLabel();
        lblBlueWinsCurrentNumber = new javax.swing.JLabel();
        lblLossesCurrent = new javax.swing.JLabel();
        lblRedWinsCurrentNumber = new javax.swing.JLabel();
        lblAllSessionsTitle = new javax.swing.JLabel();
        lblRedWinsAll = new javax.swing.JLabel();
        lblBlueWinsAll = new javax.swing.JLabel();
        lblWinsAll = new javax.swing.JLabel();
        lblLossesAll = new javax.swing.JLabel();
        buttonColumn1 = new javax.swing.JButton();
        buttonColumn2 = new javax.swing.JButton();
        buttonColumn3 = new javax.swing.JButton();
        buttonColumn4 = new javax.swing.JButton();
        buttonColumn5 = new javax.swing.JButton();
        buttonColumn6 = new javax.swing.JButton();
        buttonColumn7 = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTitle.setText("CONNECT 4");

        txt0_0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt0_0.setDoubleBuffered(true);

        txt4_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4_3ActionPerformed(evt);
            }
        });

        buttonRestart.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonRestart.setText("Restart");
        buttonRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestartActionPerformed(evt);
            }
        });

        buttonSaveState.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonSaveState.setText("Save");
        buttonSaveState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveStateActionPerformed(evt);
            }
        });

        buttonLoad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonLoad.setText("Load");
        buttonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoadActionPerformed(evt);
            }
        });

        lblTurn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTurn.setText("Player's Turn");
        lblTurn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblCurrentSessionTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCurrentSessionTitle.setText("Current Session:");

        lblBlueWinsCurrent.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblBlueWinsCurrent.setText("Blue Wins:");

        lblBlueWinsCurrentNumber.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblBlueWinsCurrentNumber.setText("0");

        lblLossesCurrent.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLossesCurrent.setText("Red Wins:");

        lblRedWinsCurrentNumber.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRedWinsCurrentNumber.setText("0");

        lblAllSessionsTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAllSessionsTitle.setText("All Sessions:");

        lblRedWinsAll.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblRedWinsAll.setText("0");

        lblBlueWinsAll.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblBlueWinsAll.setText("0");

        lblWinsAll.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblWinsAll.setText("Blue Wins:");

        lblLossesAll.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLossesAll.setText("Red Wins:");

        buttonColumn1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonColumn1.setText("1");
        buttonColumn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColumn1ActionPerformed(evt);
            }
        });

        buttonColumn2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonColumn2.setText("2");
        buttonColumn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColumn2ActionPerformed(evt);
            }
        });

        buttonColumn3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonColumn3.setText("3");
        buttonColumn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColumn3ActionPerformed(evt);
            }
        });

        buttonColumn4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonColumn4.setText("4");
        buttonColumn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColumn4ActionPerformed(evt);
            }
        });

        buttonColumn5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonColumn5.setText("5");
        buttonColumn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColumn5ActionPerformed(evt);
            }
        });

        buttonColumn6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonColumn6.setText("6");
        buttonColumn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColumn6ActionPerformed(evt);
            }
        });

        buttonColumn7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonColumn7.setText("7");
        buttonColumn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColumn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonColumn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt3_0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt4_0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt5_0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCurrentSessionTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLossesCurrent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRedWinsCurrentNumber))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBlueWinsCurrent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBlueWinsCurrentNumber))
                            .addComponent(lblAllSessionsTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWinsAll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBlueWinsAll))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLossesAll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRedWinsAll)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTurn))
                        .addGap(18, 18, 18)
                        .addComponent(txt5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonSaveState, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonColumn2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buttonColumn3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buttonColumn4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buttonColumn5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buttonColumn6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buttonColumn7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt0_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt0_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt0_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt0_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonColumn1)
                    .addComponent(buttonColumn7)
                    .addComponent(buttonColumn6)
                    .addComponent(buttonColumn5)
                    .addComponent(buttonColumn4)
                    .addComponent(buttonColumn3)
                    .addComponent(buttonColumn2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt0_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt0_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt0_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt0_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3_0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4_0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt5_0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCurrentSessionTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBlueWinsCurrent)
                            .addComponent(lblBlueWinsCurrentNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLossesCurrent)
                            .addComponent(lblRedWinsCurrentNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAllSessionsTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWinsAll)
                            .addComponent(lblBlueWinsAll))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLossesAll)
                            .addComponent(lblRedWinsAll)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonSaveState, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTurn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt4_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4_3ActionPerformed

    private void buttonSaveStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveStateActionPerformed
        game.saveGame();
    }//GEN-LAST:event_buttonSaveStateActionPerformed

    private void buttonColumn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColumn1ActionPerformed
        placingTokens(0);
    }//GEN-LAST:event_buttonColumn1ActionPerformed

    private void buttonColumn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColumn2ActionPerformed
        placingTokens(1);
    }//GEN-LAST:event_buttonColumn2ActionPerformed

    private void buttonColumn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColumn3ActionPerformed
        placingTokens(2);
    }//GEN-LAST:event_buttonColumn3ActionPerformed

    private void buttonColumn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColumn4ActionPerformed
        placingTokens(3);
    }//GEN-LAST:event_buttonColumn4ActionPerformed

    private void buttonColumn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColumn5ActionPerformed
        placingTokens(4);
    }//GEN-LAST:event_buttonColumn5ActionPerformed

    private void buttonColumn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColumn6ActionPerformed
        placingTokens(5);
    }//GEN-LAST:event_buttonColumn6ActionPerformed

    private void buttonColumn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColumn7ActionPerformed
        placingTokens(6);
    }//GEN-LAST:event_buttonColumn7ActionPerformed

    /***
     * restart game button
     * @param evt 
     */
    private void buttonRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestartActionPerformed
        game.cleanBoard();
        displayBoard();
        lblTurn.setText("Red Turn");
        lblTurn.setForeground(new java.awt.Color(255, 0, 0));
        enableButtons();
    }//GEN-LAST:event_buttonRestartActionPerformed

    /***
     * loads a save state
     * @param evt 
     */
    private void buttonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoadActionPerformed
        game.loadGame();
        switch(game.getTurn()){
            case 1:
                lblTurn.setText("Red Turn");
                lblTurn.setForeground(new java.awt.Color(255, 0, 0));
                break;
            case 2:
                lblTurn.setText("Blue Turn");
                lblTurn.setForeground(new java.awt.Color(0, 0, 255));
                break;
        }
        displayBoard();
        enableButtons();
    }//GEN-LAST:event_buttonLoadActionPerformed

    
    /***
     * updates the playing field display
     */
    private void displayBoard(){
        
        javax.swing.JTextField[][] textFields = new javax.swing.JTextField[6][7];
        textFields[0][0] = txt0_0;
        textFields[0][1] = txt0_1;
        textFields[0][2] = txt0_2;
        textFields[0][3] = txt0_3;
        textFields[0][4] = txt0_4;
        textFields[0][5] = txt0_5;
        textFields[0][6] = txt0_6;

        textFields[1][0] = txt1_0;
        textFields[1][1] = txt1_1;
        textFields[1][2] = txt1_2;
        textFields[1][3] = txt1_3;
        textFields[1][4] = txt1_4;
        textFields[1][5] = txt1_5;
        textFields[1][6] = txt1_6;
        
        textFields[2][0] = txt2_0;
        textFields[2][1] = txt2_1;
        textFields[2][2] = txt2_2;
        textFields[2][3] = txt2_3;
        textFields[2][4] = txt2_4;
        textFields[2][5] = txt2_5;
        textFields[2][6] = txt2_6;
        
        textFields[3][0] = txt3_0;
        textFields[3][1] = txt3_1;
        textFields[3][2] = txt3_2;
        textFields[3][3] = txt3_3;
        textFields[3][4] = txt3_4;
        textFields[3][5] = txt3_5;
        textFields[3][6] = txt3_6;
        
        textFields[4][0] = txt4_0;
        textFields[4][1] = txt4_1;
        textFields[4][2] = txt4_2;
        textFields[4][3] = txt4_3;
        textFields[4][4] = txt4_4;
        textFields[4][5] = txt4_5;
        textFields[4][6] = txt4_6;
        
        textFields[5][0] = txt5_0;
        textFields[5][1] = txt5_1;
        textFields[5][2] = txt5_2;
        textFields[5][3] = txt5_3;
        textFields[5][4] = txt5_4;
        textFields[5][5] = txt5_5;
        textFields[5][6] = txt5_6;
        
        
        int board[][] = game.board;
        for(int row = 0; row < 6; row++){
            for(int column = 0; column < 7; column++){
                switch(board[row][column]){
                    case 1:
                        textFields[row][column].setBackground(new java.awt.Color(255, 0, 0));
                        break;
                    case 2:
                        textFields[row][column].setBackground(new java.awt.Color(0, 0, 255));
                        break;
                    case 0:
                        textFields[row][column].setBackground(new java.awt.Color(255, 255, 255));
                        break;
                }        
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConnectFour().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonColumn1;
    private javax.swing.JButton buttonColumn2;
    private javax.swing.JButton buttonColumn3;
    private javax.swing.JButton buttonColumn4;
    private javax.swing.JButton buttonColumn5;
    private javax.swing.JButton buttonColumn6;
    private javax.swing.JButton buttonColumn7;
    private javax.swing.JButton buttonLoad;
    private javax.swing.JButton buttonRestart;
    private javax.swing.JButton buttonSaveState;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblAllSessionsTitle;
    private javax.swing.JLabel lblBlueWinsAll;
    private javax.swing.JLabel lblBlueWinsCurrent;
    private javax.swing.JLabel lblBlueWinsCurrentNumber;
    private javax.swing.JLabel lblCurrentSessionTitle;
    private javax.swing.JLabel lblLossesAll;
    private javax.swing.JLabel lblLossesCurrent;
    private javax.swing.JLabel lblRedWinsAll;
    private javax.swing.JLabel lblRedWinsCurrentNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTurn;
    private javax.swing.JLabel lblWinsAll;
    private javax.swing.JTextField txt0_0;
    private javax.swing.JTextField txt0_1;
    private javax.swing.JTextField txt0_2;
    private javax.swing.JTextField txt0_3;
    private javax.swing.JTextField txt0_4;
    private javax.swing.JTextField txt0_5;
    private javax.swing.JTextField txt0_6;
    private javax.swing.JTextField txt1_0;
    private javax.swing.JTextField txt1_1;
    private javax.swing.JTextField txt1_2;
    private javax.swing.JTextField txt1_3;
    private javax.swing.JTextField txt1_4;
    private javax.swing.JTextField txt1_5;
    private javax.swing.JTextField txt1_6;
    private javax.swing.JTextField txt2_0;
    private javax.swing.JTextField txt2_1;
    private javax.swing.JTextField txt2_2;
    private javax.swing.JTextField txt2_3;
    private javax.swing.JTextField txt2_4;
    private javax.swing.JTextField txt2_5;
    private javax.swing.JTextField txt2_6;
    private javax.swing.JTextField txt3_0;
    private javax.swing.JTextField txt3_1;
    private javax.swing.JTextField txt3_2;
    private javax.swing.JTextField txt3_3;
    private javax.swing.JTextField txt3_4;
    private javax.swing.JTextField txt3_5;
    private javax.swing.JTextField txt3_6;
    private javax.swing.JTextField txt4_0;
    private javax.swing.JTextField txt4_1;
    private javax.swing.JTextField txt4_2;
    private javax.swing.JTextField txt4_3;
    private javax.swing.JTextField txt4_4;
    private javax.swing.JTextField txt4_5;
    private javax.swing.JTextField txt4_6;
    private javax.swing.JTextField txt5_0;
    private javax.swing.JTextField txt5_1;
    private javax.swing.JTextField txt5_2;
    private javax.swing.JTextField txt5_3;
    private javax.swing.JTextField txt5_4;
    private javax.swing.JTextField txt5_5;
    private javax.swing.JTextField txt5_6;
    // End of variables declaration//GEN-END:variables
}
