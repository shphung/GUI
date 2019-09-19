/*********************************************************************
* 
*   File: Menu.java
*   Author: Steven Phung & Alex Vargas
*   Class: CS 2450.01 - Programming Graphical User Interfaces
*
*   Assignment: Point and Click Game v.1.1
*   Date last modified: 9/9/2019
*
*   Purpose: This class will generate a menu with appropriate buttons
* 
*********************************************************************/
package cs2450project;

public class Menu extends javax.swing.JFrame {
    
    //Constructor
    public Menu() {
        initComponents();
        this.setResizable(false);
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campfireIcon = new javax.swing.JLabel();
        creditsButton = new javax.swing.JButton();
        highscoreButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        menuLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(11, 28, 71));

        campfireIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2450project/resources/menuicon.gif"))); // NOI18N

        creditsButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        creditsButton.setText("Credits");
        creditsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsButtonActionPerformed(evt);
            }
        });

        highscoreButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        highscoreButton.setText("Highscores");
        highscoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highscoreButtonActionPerformed(evt);
            }
        });

        playButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        playButton.setText("Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        menuLabel.setFont(new java.awt.Font("RaysHand", 0, 48)); // NOI18N
        menuLabel.setForeground(new java.awt.Color(255, 153, 51));
        menuLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuLabel.setText("Main Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campfireIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creditsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(highscoreButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(highscoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(creditsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(campfireIcon)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Method: playButtonActionPerformed()
    //Purpose: Once play is clicked, the HangMan class is called so the
    //game can be played. The current menu's resources is then cleared.
    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        new HangMan();
        this.dispose();
    }//GEN-LAST:event_playButtonActionPerformed

    //Method: highscoreButtonActionPerformed()
    //Purpose: Once highscore is clicked, the Highscore class is called so the highscore
    //page will be displayed. The current menu's resources is then cleared.
    private void highscoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highscoreButtonActionPerformed
        new Highscores();
        this.dispose();
    }//GEN-LAST:event_highscoreButtonActionPerformed

    //Method: creditsButtonActionPerformed()
    //Purpose: Once credits is clicked, the Credits class is called so the credits
    //page will be displayed. The current menu's resources is then cleared.
    private void creditsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsButtonActionPerformed
        new Credits();
        this.dispose();
    }//GEN-LAST:event_creditsButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel campfireIcon;
    private javax.swing.JButton creditsButton;
    private javax.swing.JButton highscoreButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JButton playButton;
    // End of variables declaration//GEN-END:variables
}
