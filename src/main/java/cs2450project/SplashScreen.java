/**********************************************************************
*
*   File: SplashScreen.java
*   Author: Steven Phung & Alex Vargas
*   Class: CS 2450.01 - Programming Graphical User Interfaces
*
*   Assignment: Point and Click Game v.1.1
*   Date last modified: 9/9/2019
*
*   Purpose: This class will generate a splash screen with custom font
* 
**********************************************************************/
package cs2450project;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

public class SplashScreen extends javax.swing.JFrame {
    
    Font raysHand;
    
    //Constructor    
    public SplashScreen() {
        try {
            raysHand = Font.createFont(Font.TRUETYPE_FONT, Main.class.getResourceAsStream("/cs2450project/resources/RaysHand.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, Main.class.getResourceAsStream("/cs2450project/resources/RaysHand.ttf")));
        } catch (IOException | FontFormatException e) {}
        initComponents();
        this.setResizable(false);
        this.setVisible(true);
        limitRunTime();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameName = new javax.swing.JLabel();
        className = new javax.swing.JLabel();
        teamName = new javax.swing.JLabel();
        imageGif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        gameName.setFont(new java.awt.Font("RaysHand", 0, 26)); // NOI18N
        gameName.setForeground(new java.awt.Color(255, 153, 51));
        gameName.setText("Point & Click Games");
        getContentPane().add(gameName);
        gameName.setBounds(180, 130, 240, 40);

        className.setFont(new java.awt.Font("RaysHand", 0, 40)); // NOI18N
        className.setForeground(new java.awt.Color(255, 153, 51));
        className.setText("CS2450");
        getContentPane().add(className);
        className.setBounds(200, 90, 150, 50);

        teamName.setFont(new java.awt.Font("RaysHand", 0, 24)); // NOI18N
        teamName.setForeground(new java.awt.Color(255, 153, 51));
        teamName.setText("Team: //temporary fix");
        getContentPane().add(teamName);
        teamName.setBounds(170, 170, 250, 37);

        imageGif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cs2450project/resources/splashgif.gif"))); // NOI18N
        getContentPane().add(imageGif);
        imageGif.setBounds(0, 0, 600, 400);

        getAccessibleContext().setAccessibleName("frame1");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Method: limitRunTime()
    //Purpose: Method allows splash screen to run for only 3 seconds before calling menu
    private void limitRunTime() {
        try { Thread.sleep(3000); } catch(InterruptedException e) {}
        new Menu();
        this.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel className;
    private javax.swing.JLabel gameName;
    private javax.swing.JLabel imageGif;
    private javax.swing.JLabel teamName;
    // End of variables declaration//GEN-END:variables
}