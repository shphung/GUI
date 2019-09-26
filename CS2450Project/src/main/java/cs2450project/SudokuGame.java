/*********************************************************************
* 
*   File: SudokuGame.java
*   Author: Steven Phung & Alex Vargas
*   Class: CS 2450.01 - Programming Graphical User Interfaces
*
*   Assignment: Point and Click Game v.1.2
*   Date last modified: 9/25/2019
*
*   Purpose: This class generates a fixed game of sudoku and
*           handles all the logic.
*
*********************************************************************/
package cs2450project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public class SudokuGame extends javax.swing.JFrame {
    
    private int gameScore, overallScore;
    
    //Constructor
    public SudokuGame(int score) {
        initComponents();
        initVariables(score);
        currentDateAndTime();
        bindKeys();
        this.setResizable(false);
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        gameName = new javax.swing.JLabel();
        currentDateAndTime = new javax.swing.JTextField();
        sudokuPanel = new javax.swing.JPanel();
        box1 = new javax.swing.JPanel();
        cell1 = new javax.swing.JPanel();
        cell2 = new javax.swing.JPanel();
        cell3 = new javax.swing.JPanel();
        cell4 = new javax.swing.JPanel();
        cell5 = new javax.swing.JPanel();
        cell6 = new javax.swing.JPanel();
        cell7 = new javax.swing.JPanel();
        cell8 = new javax.swing.JPanel();
        cell9 = new javax.swing.JPanel();
        box2 = new javax.swing.JPanel();
        cell10 = new javax.swing.JPanel();
        cell11 = new javax.swing.JPanel();
        cell12 = new javax.swing.JPanel();
        cell13 = new javax.swing.JPanel();
        cell14 = new javax.swing.JPanel();
        cell15 = new javax.swing.JPanel();
        cell16 = new javax.swing.JPanel();
        cell17 = new javax.swing.JPanel();
        cell18 = new javax.swing.JPanel();
        box3 = new javax.swing.JPanel();
        cell19 = new javax.swing.JPanel();
        cell20 = new javax.swing.JPanel();
        cell21 = new javax.swing.JPanel();
        cell22 = new javax.swing.JPanel();
        cell23 = new javax.swing.JPanel();
        cell24 = new javax.swing.JPanel();
        cell25 = new javax.swing.JPanel();
        cell26 = new javax.swing.JPanel();
        cell27 = new javax.swing.JPanel();
        box4 = new javax.swing.JPanel();
        cell28 = new javax.swing.JPanel();
        cell29 = new javax.swing.JPanel();
        cell30 = new javax.swing.JPanel();
        cell31 = new javax.swing.JPanel();
        cell32 = new javax.swing.JPanel();
        cell33 = new javax.swing.JPanel();
        cell34 = new javax.swing.JPanel();
        cell35 = new javax.swing.JPanel();
        cell36 = new javax.swing.JPanel();
        box5 = new javax.swing.JPanel();
        cell37 = new javax.swing.JPanel();
        cell38 = new javax.swing.JPanel();
        cell39 = new javax.swing.JPanel();
        cell40 = new javax.swing.JPanel();
        cell41 = new javax.swing.JPanel();
        cell42 = new javax.swing.JPanel();
        cell43 = new javax.swing.JPanel();
        cell44 = new javax.swing.JPanel();
        cell45 = new javax.swing.JPanel();
        box6 = new javax.swing.JPanel();
        cell46 = new javax.swing.JPanel();
        cell47 = new javax.swing.JPanel();
        cell48 = new javax.swing.JPanel();
        cell49 = new javax.swing.JPanel();
        cell50 = new javax.swing.JPanel();
        cell51 = new javax.swing.JPanel();
        cell52 = new javax.swing.JPanel();
        cell53 = new javax.swing.JPanel();
        cell54 = new javax.swing.JPanel();
        box7 = new javax.swing.JPanel();
        cell55 = new javax.swing.JPanel();
        cell56 = new javax.swing.JPanel();
        cell57 = new javax.swing.JPanel();
        cell58 = new javax.swing.JPanel();
        cell59 = new javax.swing.JPanel();
        cell60 = new javax.swing.JPanel();
        cell61 = new javax.swing.JPanel();
        cell62 = new javax.swing.JPanel();
        cell63 = new javax.swing.JPanel();
        box8 = new javax.swing.JPanel();
        cell64 = new javax.swing.JPanel();
        cell65 = new javax.swing.JPanel();
        cell66 = new javax.swing.JPanel();
        cell67 = new javax.swing.JPanel();
        cell68 = new javax.swing.JPanel();
        cell69 = new javax.swing.JPanel();
        cell70 = new javax.swing.JPanel();
        cell71 = new javax.swing.JPanel();
        cell72 = new javax.swing.JPanel();
        box9 = new javax.swing.JPanel();
        cell73 = new javax.swing.JPanel();
        cell74 = new javax.swing.JPanel();
        cell75 = new javax.swing.JPanel();
        cell76 = new javax.swing.JPanel();
        cell77 = new javax.swing.JPanel();
        cell78 = new javax.swing.JPanel();
        cell79 = new javax.swing.JPanel();
        cell80 = new javax.swing.JPanel();
        cell81 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));

        mainPanel.setBackground(new java.awt.Color(11, 28, 71));
        mainPanel.setMaximumSize(new java.awt.Dimension(600, 400));
        mainPanel.setMinimumSize(new java.awt.Dimension(600, 400));

        gameName.setFont(new java.awt.Font("RaysHand", 0, 24)); // NOI18N
        gameName.setForeground(new java.awt.Color(255, 153, 51));
        gameName.setText("Sudoku");

        currentDateAndTime.setText(" yyyy/mm/dd hh:mm:ss ");

        sudokuPanel.setBackground(new java.awt.Color(255, 255, 255));
        sudokuPanel.setMaximumSize(new java.awt.Dimension(360, 360));
        sudokuPanel.setMinimumSize(new java.awt.Dimension(360, 360));
        sudokuPanel.setPreferredSize(new java.awt.Dimension(360, 360));
        sudokuPanel.setLayout(new java.awt.GridBagLayout());

        box1.setMaximumSize(new java.awt.Dimension(120, 120));
        box1.setMinimumSize(new java.awt.Dimension(120, 120));
        box1.setLayout(new java.awt.GridBagLayout());

        cell1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell1.setMaximumSize(new java.awt.Dimension(40, 40));
        cell1.setMinimumSize(new java.awt.Dimension(40, 40));
        cell1.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell1Layout = new javax.swing.GroupLayout(cell1);
        cell1.setLayout(cell1Layout);
        cell1Layout.setHorizontalGroup(
            cell1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell1Layout.setVerticalGroup(
            cell1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box1.add(cell1, new java.awt.GridBagConstraints());

        cell2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell2.setMaximumSize(new java.awt.Dimension(40, 40));
        cell2.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell2Layout = new javax.swing.GroupLayout(cell2);
        cell2.setLayout(cell2Layout);
        cell2Layout.setHorizontalGroup(
            cell2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell2Layout.setVerticalGroup(
            cell2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box1.add(cell2, new java.awt.GridBagConstraints());

        cell3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell3.setMaximumSize(new java.awt.Dimension(40, 40));
        cell3.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell3Layout = new javax.swing.GroupLayout(cell3);
        cell3.setLayout(cell3Layout);
        cell3Layout.setHorizontalGroup(
            cell3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell3Layout.setVerticalGroup(
            cell3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box1.add(cell3, new java.awt.GridBagConstraints());

        cell4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell4.setMaximumSize(new java.awt.Dimension(40, 40));
        cell4.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell4Layout = new javax.swing.GroupLayout(cell4);
        cell4.setLayout(cell4Layout);
        cell4Layout.setHorizontalGroup(
            cell4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell4Layout.setVerticalGroup(
            cell4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box1.add(cell4, gridBagConstraints);

        cell5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell5.setMaximumSize(new java.awt.Dimension(40, 40));
        cell5.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell5Layout = new javax.swing.GroupLayout(cell5);
        cell5.setLayout(cell5Layout);
        cell5Layout.setHorizontalGroup(
            cell5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell5Layout.setVerticalGroup(
            cell5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box1.add(cell5, gridBagConstraints);

        cell6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell6.setMaximumSize(new java.awt.Dimension(40, 40));
        cell6.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell6Layout = new javax.swing.GroupLayout(cell6);
        cell6.setLayout(cell6Layout);
        cell6Layout.setHorizontalGroup(
            cell6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell6Layout.setVerticalGroup(
            cell6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box1.add(cell6, gridBagConstraints);

        cell7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell7.setMaximumSize(new java.awt.Dimension(40, 40));
        cell7.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell7Layout = new javax.swing.GroupLayout(cell7);
        cell7.setLayout(cell7Layout);
        cell7Layout.setHorizontalGroup(
            cell7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell7Layout.setVerticalGroup(
            cell7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box1.add(cell7, gridBagConstraints);

        cell8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell8.setMaximumSize(new java.awt.Dimension(40, 40));
        cell8.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell8Layout = new javax.swing.GroupLayout(cell8);
        cell8.setLayout(cell8Layout);
        cell8Layout.setHorizontalGroup(
            cell8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell8Layout.setVerticalGroup(
            cell8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box1.add(cell8, gridBagConstraints);

        cell9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell9.setMaximumSize(new java.awt.Dimension(40, 40));
        cell9.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell9Layout = new javax.swing.GroupLayout(cell9);
        cell9.setLayout(cell9Layout);
        cell9Layout.setHorizontalGroup(
            cell9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell9Layout.setVerticalGroup(
            cell9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box1.add(cell9, gridBagConstraints);

        sudokuPanel.add(box1, new java.awt.GridBagConstraints());

        box2.setMaximumSize(new java.awt.Dimension(120, 120));
        box2.setMinimumSize(new java.awt.Dimension(120, 120));
        box2.setLayout(new java.awt.GridBagLayout());

        cell10.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell10.setMaximumSize(new java.awt.Dimension(40, 40));
        cell10.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell10Layout = new javax.swing.GroupLayout(cell10);
        cell10.setLayout(cell10Layout);
        cell10Layout.setHorizontalGroup(
            cell10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell10Layout.setVerticalGroup(
            cell10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box2.add(cell10, new java.awt.GridBagConstraints());

        cell11.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell11.setMaximumSize(new java.awt.Dimension(40, 40));
        cell11.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell11Layout = new javax.swing.GroupLayout(cell11);
        cell11.setLayout(cell11Layout);
        cell11Layout.setHorizontalGroup(
            cell11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell11Layout.setVerticalGroup(
            cell11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box2.add(cell11, new java.awt.GridBagConstraints());

        cell12.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell12.setMaximumSize(new java.awt.Dimension(40, 40));
        cell12.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell12Layout = new javax.swing.GroupLayout(cell12);
        cell12.setLayout(cell12Layout);
        cell12Layout.setHorizontalGroup(
            cell12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell12Layout.setVerticalGroup(
            cell12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box2.add(cell12, new java.awt.GridBagConstraints());

        cell13.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell13.setMaximumSize(new java.awt.Dimension(40, 40));
        cell13.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell13Layout = new javax.swing.GroupLayout(cell13);
        cell13.setLayout(cell13Layout);
        cell13Layout.setHorizontalGroup(
            cell13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell13Layout.setVerticalGroup(
            cell13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box2.add(cell13, gridBagConstraints);

        cell14.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell14.setMaximumSize(new java.awt.Dimension(40, 40));
        cell14.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell14Layout = new javax.swing.GroupLayout(cell14);
        cell14.setLayout(cell14Layout);
        cell14Layout.setHorizontalGroup(
            cell14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell14Layout.setVerticalGroup(
            cell14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box2.add(cell14, gridBagConstraints);

        cell15.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell15.setMaximumSize(new java.awt.Dimension(40, 40));
        cell15.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell15Layout = new javax.swing.GroupLayout(cell15);
        cell15.setLayout(cell15Layout);
        cell15Layout.setHorizontalGroup(
            cell15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell15Layout.setVerticalGroup(
            cell15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box2.add(cell15, gridBagConstraints);

        cell16.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell16.setMaximumSize(new java.awt.Dimension(40, 40));
        cell16.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell16Layout = new javax.swing.GroupLayout(cell16);
        cell16.setLayout(cell16Layout);
        cell16Layout.setHorizontalGroup(
            cell16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell16Layout.setVerticalGroup(
            cell16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box2.add(cell16, gridBagConstraints);

        cell17.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell17.setMaximumSize(new java.awt.Dimension(40, 40));
        cell17.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell17Layout = new javax.swing.GroupLayout(cell17);
        cell17.setLayout(cell17Layout);
        cell17Layout.setHorizontalGroup(
            cell17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell17Layout.setVerticalGroup(
            cell17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box2.add(cell17, gridBagConstraints);

        cell18.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell18.setMaximumSize(new java.awt.Dimension(40, 40));
        cell18.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell18Layout = new javax.swing.GroupLayout(cell18);
        cell18.setLayout(cell18Layout);
        cell18Layout.setHorizontalGroup(
            cell18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell18Layout.setVerticalGroup(
            cell18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box2.add(cell18, gridBagConstraints);

        sudokuPanel.add(box2, new java.awt.GridBagConstraints());

        box3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        box3.setMaximumSize(new java.awt.Dimension(120, 120));
        box3.setMinimumSize(new java.awt.Dimension(120, 120));
        box3.setLayout(new java.awt.GridBagLayout());

        cell19.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell19.setMaximumSize(new java.awt.Dimension(40, 40));
        cell19.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell19Layout = new javax.swing.GroupLayout(cell19);
        cell19.setLayout(cell19Layout);
        cell19Layout.setHorizontalGroup(
            cell19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell19Layout.setVerticalGroup(
            cell19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box3.add(cell19, new java.awt.GridBagConstraints());

        cell20.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell20.setMaximumSize(new java.awt.Dimension(40, 40));
        cell20.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell20Layout = new javax.swing.GroupLayout(cell20);
        cell20.setLayout(cell20Layout);
        cell20Layout.setHorizontalGroup(
            cell20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell20Layout.setVerticalGroup(
            cell20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box3.add(cell20, new java.awt.GridBagConstraints());

        cell21.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell21.setMaximumSize(new java.awt.Dimension(40, 40));
        cell21.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell21Layout = new javax.swing.GroupLayout(cell21);
        cell21.setLayout(cell21Layout);
        cell21Layout.setHorizontalGroup(
            cell21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell21Layout.setVerticalGroup(
            cell21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box3.add(cell21, new java.awt.GridBagConstraints());

        cell22.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell22.setMaximumSize(new java.awt.Dimension(40, 40));
        cell22.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell22Layout = new javax.swing.GroupLayout(cell22);
        cell22.setLayout(cell22Layout);
        cell22Layout.setHorizontalGroup(
            cell22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell22Layout.setVerticalGroup(
            cell22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box3.add(cell22, gridBagConstraints);

        cell23.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell23.setMaximumSize(new java.awt.Dimension(40, 40));
        cell23.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell23Layout = new javax.swing.GroupLayout(cell23);
        cell23.setLayout(cell23Layout);
        cell23Layout.setHorizontalGroup(
            cell23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell23Layout.setVerticalGroup(
            cell23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box3.add(cell23, gridBagConstraints);

        cell24.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell24.setMaximumSize(new java.awt.Dimension(40, 40));
        cell24.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell24Layout = new javax.swing.GroupLayout(cell24);
        cell24.setLayout(cell24Layout);
        cell24Layout.setHorizontalGroup(
            cell24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell24Layout.setVerticalGroup(
            cell24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box3.add(cell24, gridBagConstraints);

        cell25.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell25.setMaximumSize(new java.awt.Dimension(40, 40));
        cell25.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell25Layout = new javax.swing.GroupLayout(cell25);
        cell25.setLayout(cell25Layout);
        cell25Layout.setHorizontalGroup(
            cell25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell25Layout.setVerticalGroup(
            cell25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box3.add(cell25, gridBagConstraints);

        cell26.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell26.setMaximumSize(new java.awt.Dimension(40, 40));
        cell26.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell26Layout = new javax.swing.GroupLayout(cell26);
        cell26.setLayout(cell26Layout);
        cell26Layout.setHorizontalGroup(
            cell26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell26Layout.setVerticalGroup(
            cell26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box3.add(cell26, gridBagConstraints);

        cell27.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell27.setMaximumSize(new java.awt.Dimension(40, 40));
        cell27.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell27Layout = new javax.swing.GroupLayout(cell27);
        cell27.setLayout(cell27Layout);
        cell27Layout.setHorizontalGroup(
            cell27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell27Layout.setVerticalGroup(
            cell27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box3.add(cell27, gridBagConstraints);

        sudokuPanel.add(box3, new java.awt.GridBagConstraints());

        box4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        box4.setMaximumSize(new java.awt.Dimension(120, 120));
        box4.setMinimumSize(new java.awt.Dimension(120, 120));
        box4.setLayout(new java.awt.GridBagLayout());

        cell28.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell28.setMaximumSize(new java.awt.Dimension(40, 40));
        cell28.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell28Layout = new javax.swing.GroupLayout(cell28);
        cell28.setLayout(cell28Layout);
        cell28Layout.setHorizontalGroup(
            cell28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell28Layout.setVerticalGroup(
            cell28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box4.add(cell28, new java.awt.GridBagConstraints());

        cell29.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell29.setMaximumSize(new java.awt.Dimension(40, 40));
        cell29.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell29Layout = new javax.swing.GroupLayout(cell29);
        cell29.setLayout(cell29Layout);
        cell29Layout.setHorizontalGroup(
            cell29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell29Layout.setVerticalGroup(
            cell29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box4.add(cell29, new java.awt.GridBagConstraints());

        cell30.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell30.setMaximumSize(new java.awt.Dimension(40, 40));
        cell30.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell30Layout = new javax.swing.GroupLayout(cell30);
        cell30.setLayout(cell30Layout);
        cell30Layout.setHorizontalGroup(
            cell30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell30Layout.setVerticalGroup(
            cell30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box4.add(cell30, new java.awt.GridBagConstraints());

        cell31.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell31.setMaximumSize(new java.awt.Dimension(40, 40));
        cell31.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell31Layout = new javax.swing.GroupLayout(cell31);
        cell31.setLayout(cell31Layout);
        cell31Layout.setHorizontalGroup(
            cell31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell31Layout.setVerticalGroup(
            cell31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box4.add(cell31, gridBagConstraints);

        cell32.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell32.setMaximumSize(new java.awt.Dimension(40, 40));
        cell32.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell32Layout = new javax.swing.GroupLayout(cell32);
        cell32.setLayout(cell32Layout);
        cell32Layout.setHorizontalGroup(
            cell32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell32Layout.setVerticalGroup(
            cell32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box4.add(cell32, gridBagConstraints);

        cell33.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell33.setMaximumSize(new java.awt.Dimension(40, 40));
        cell33.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell33Layout = new javax.swing.GroupLayout(cell33);
        cell33.setLayout(cell33Layout);
        cell33Layout.setHorizontalGroup(
            cell33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell33Layout.setVerticalGroup(
            cell33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box4.add(cell33, gridBagConstraints);

        cell34.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell34.setMaximumSize(new java.awt.Dimension(40, 40));
        cell34.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell34Layout = new javax.swing.GroupLayout(cell34);
        cell34.setLayout(cell34Layout);
        cell34Layout.setHorizontalGroup(
            cell34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell34Layout.setVerticalGroup(
            cell34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box4.add(cell34, gridBagConstraints);

        cell35.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell35.setMaximumSize(new java.awt.Dimension(40, 40));
        cell35.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell35Layout = new javax.swing.GroupLayout(cell35);
        cell35.setLayout(cell35Layout);
        cell35Layout.setHorizontalGroup(
            cell35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell35Layout.setVerticalGroup(
            cell35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box4.add(cell35, gridBagConstraints);

        cell36.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell36.setMaximumSize(new java.awt.Dimension(40, 40));
        cell36.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell36Layout = new javax.swing.GroupLayout(cell36);
        cell36.setLayout(cell36Layout);
        cell36Layout.setHorizontalGroup(
            cell36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell36Layout.setVerticalGroup(
            cell36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box4.add(cell36, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        sudokuPanel.add(box4, gridBagConstraints);

        box5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        box5.setMaximumSize(new java.awt.Dimension(120, 120));
        box5.setMinimumSize(new java.awt.Dimension(120, 120));
        box5.setLayout(new java.awt.GridBagLayout());

        cell37.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell37.setMaximumSize(new java.awt.Dimension(40, 40));
        cell37.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell37Layout = new javax.swing.GroupLayout(cell37);
        cell37.setLayout(cell37Layout);
        cell37Layout.setHorizontalGroup(
            cell37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell37Layout.setVerticalGroup(
            cell37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box5.add(cell37, new java.awt.GridBagConstraints());

        cell38.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell38.setMaximumSize(new java.awt.Dimension(40, 40));
        cell38.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell38Layout = new javax.swing.GroupLayout(cell38);
        cell38.setLayout(cell38Layout);
        cell38Layout.setHorizontalGroup(
            cell38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell38Layout.setVerticalGroup(
            cell38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box5.add(cell38, new java.awt.GridBagConstraints());

        cell39.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell39.setMaximumSize(new java.awt.Dimension(40, 40));
        cell39.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell39Layout = new javax.swing.GroupLayout(cell39);
        cell39.setLayout(cell39Layout);
        cell39Layout.setHorizontalGroup(
            cell39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell39Layout.setVerticalGroup(
            cell39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box5.add(cell39, new java.awt.GridBagConstraints());

        cell40.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell40.setMaximumSize(new java.awt.Dimension(40, 40));
        cell40.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell40Layout = new javax.swing.GroupLayout(cell40);
        cell40.setLayout(cell40Layout);
        cell40Layout.setHorizontalGroup(
            cell40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell40Layout.setVerticalGroup(
            cell40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box5.add(cell40, gridBagConstraints);

        cell41.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell41.setMaximumSize(new java.awt.Dimension(40, 40));
        cell41.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell41Layout = new javax.swing.GroupLayout(cell41);
        cell41.setLayout(cell41Layout);
        cell41Layout.setHorizontalGroup(
            cell41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell41Layout.setVerticalGroup(
            cell41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box5.add(cell41, gridBagConstraints);

        cell42.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell42.setMaximumSize(new java.awt.Dimension(40, 40));
        cell42.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell42Layout = new javax.swing.GroupLayout(cell42);
        cell42.setLayout(cell42Layout);
        cell42Layout.setHorizontalGroup(
            cell42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell42Layout.setVerticalGroup(
            cell42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box5.add(cell42, gridBagConstraints);

        cell43.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell43.setMaximumSize(new java.awt.Dimension(40, 40));
        cell43.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell43Layout = new javax.swing.GroupLayout(cell43);
        cell43.setLayout(cell43Layout);
        cell43Layout.setHorizontalGroup(
            cell43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell43Layout.setVerticalGroup(
            cell43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box5.add(cell43, gridBagConstraints);

        cell44.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell44.setMaximumSize(new java.awt.Dimension(40, 40));
        cell44.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell44Layout = new javax.swing.GroupLayout(cell44);
        cell44.setLayout(cell44Layout);
        cell44Layout.setHorizontalGroup(
            cell44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell44Layout.setVerticalGroup(
            cell44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box5.add(cell44, gridBagConstraints);

        cell45.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell45.setMaximumSize(new java.awt.Dimension(40, 40));
        cell45.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell45Layout = new javax.swing.GroupLayout(cell45);
        cell45.setLayout(cell45Layout);
        cell45Layout.setHorizontalGroup(
            cell45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell45Layout.setVerticalGroup(
            cell45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box5.add(cell45, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        sudokuPanel.add(box5, gridBagConstraints);

        box6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        box6.setMaximumSize(new java.awt.Dimension(120, 120));
        box6.setMinimumSize(new java.awt.Dimension(120, 120));
        box6.setLayout(new java.awt.GridBagLayout());

        cell46.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell46.setMaximumSize(new java.awt.Dimension(40, 40));
        cell46.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell46Layout = new javax.swing.GroupLayout(cell46);
        cell46.setLayout(cell46Layout);
        cell46Layout.setHorizontalGroup(
            cell46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell46Layout.setVerticalGroup(
            cell46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box6.add(cell46, new java.awt.GridBagConstraints());

        cell47.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell47.setMaximumSize(new java.awt.Dimension(40, 40));
        cell47.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell47Layout = new javax.swing.GroupLayout(cell47);
        cell47.setLayout(cell47Layout);
        cell47Layout.setHorizontalGroup(
            cell47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell47Layout.setVerticalGroup(
            cell47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box6.add(cell47, new java.awt.GridBagConstraints());

        cell48.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell48.setMaximumSize(new java.awt.Dimension(40, 40));
        cell48.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell48Layout = new javax.swing.GroupLayout(cell48);
        cell48.setLayout(cell48Layout);
        cell48Layout.setHorizontalGroup(
            cell48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell48Layout.setVerticalGroup(
            cell48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box6.add(cell48, new java.awt.GridBagConstraints());

        cell49.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell49.setMaximumSize(new java.awt.Dimension(40, 40));
        cell49.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell49Layout = new javax.swing.GroupLayout(cell49);
        cell49.setLayout(cell49Layout);
        cell49Layout.setHorizontalGroup(
            cell49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell49Layout.setVerticalGroup(
            cell49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box6.add(cell49, gridBagConstraints);

        cell50.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell50.setMaximumSize(new java.awt.Dimension(40, 40));
        cell50.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell50Layout = new javax.swing.GroupLayout(cell50);
        cell50.setLayout(cell50Layout);
        cell50Layout.setHorizontalGroup(
            cell50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell50Layout.setVerticalGroup(
            cell50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box6.add(cell50, gridBagConstraints);

        cell51.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell51.setMaximumSize(new java.awt.Dimension(40, 40));
        cell51.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell51Layout = new javax.swing.GroupLayout(cell51);
        cell51.setLayout(cell51Layout);
        cell51Layout.setHorizontalGroup(
            cell51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell51Layout.setVerticalGroup(
            cell51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box6.add(cell51, gridBagConstraints);

        cell52.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell52.setMaximumSize(new java.awt.Dimension(40, 40));
        cell52.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell52Layout = new javax.swing.GroupLayout(cell52);
        cell52.setLayout(cell52Layout);
        cell52Layout.setHorizontalGroup(
            cell52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell52Layout.setVerticalGroup(
            cell52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box6.add(cell52, gridBagConstraints);

        cell53.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell53.setMaximumSize(new java.awt.Dimension(40, 40));
        cell53.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell53Layout = new javax.swing.GroupLayout(cell53);
        cell53.setLayout(cell53Layout);
        cell53Layout.setHorizontalGroup(
            cell53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell53Layout.setVerticalGroup(
            cell53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box6.add(cell53, gridBagConstraints);

        cell54.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell54.setMaximumSize(new java.awt.Dimension(40, 40));
        cell54.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell54Layout = new javax.swing.GroupLayout(cell54);
        cell54.setLayout(cell54Layout);
        cell54Layout.setHorizontalGroup(
            cell54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell54Layout.setVerticalGroup(
            cell54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box6.add(cell54, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        sudokuPanel.add(box6, gridBagConstraints);

        box7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        box7.setMaximumSize(new java.awt.Dimension(120, 120));
        box7.setMinimumSize(new java.awt.Dimension(120, 120));
        box7.setLayout(new java.awt.GridBagLayout());

        cell55.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell55.setMaximumSize(new java.awt.Dimension(40, 40));
        cell55.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell55Layout = new javax.swing.GroupLayout(cell55);
        cell55.setLayout(cell55Layout);
        cell55Layout.setHorizontalGroup(
            cell55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell55Layout.setVerticalGroup(
            cell55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box7.add(cell55, new java.awt.GridBagConstraints());

        cell56.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell56.setMaximumSize(new java.awt.Dimension(40, 40));
        cell56.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell56Layout = new javax.swing.GroupLayout(cell56);
        cell56.setLayout(cell56Layout);
        cell56Layout.setHorizontalGroup(
            cell56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell56Layout.setVerticalGroup(
            cell56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box7.add(cell56, new java.awt.GridBagConstraints());

        cell57.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell57.setMaximumSize(new java.awt.Dimension(40, 40));
        cell57.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell57Layout = new javax.swing.GroupLayout(cell57);
        cell57.setLayout(cell57Layout);
        cell57Layout.setHorizontalGroup(
            cell57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell57Layout.setVerticalGroup(
            cell57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box7.add(cell57, new java.awt.GridBagConstraints());

        cell58.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell58.setMaximumSize(new java.awt.Dimension(40, 40));
        cell58.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell58Layout = new javax.swing.GroupLayout(cell58);
        cell58.setLayout(cell58Layout);
        cell58Layout.setHorizontalGroup(
            cell58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell58Layout.setVerticalGroup(
            cell58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box7.add(cell58, gridBagConstraints);

        cell59.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell59.setMaximumSize(new java.awt.Dimension(40, 40));
        cell59.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell59Layout = new javax.swing.GroupLayout(cell59);
        cell59.setLayout(cell59Layout);
        cell59Layout.setHorizontalGroup(
            cell59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell59Layout.setVerticalGroup(
            cell59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box7.add(cell59, gridBagConstraints);

        cell60.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell60.setMaximumSize(new java.awt.Dimension(40, 40));
        cell60.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell60Layout = new javax.swing.GroupLayout(cell60);
        cell60.setLayout(cell60Layout);
        cell60Layout.setHorizontalGroup(
            cell60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell60Layout.setVerticalGroup(
            cell60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box7.add(cell60, gridBagConstraints);

        cell61.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell61.setMaximumSize(new java.awt.Dimension(40, 40));
        cell61.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell61Layout = new javax.swing.GroupLayout(cell61);
        cell61.setLayout(cell61Layout);
        cell61Layout.setHorizontalGroup(
            cell61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell61Layout.setVerticalGroup(
            cell61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box7.add(cell61, gridBagConstraints);

        cell62.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell62.setMaximumSize(new java.awt.Dimension(40, 40));
        cell62.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell62Layout = new javax.swing.GroupLayout(cell62);
        cell62.setLayout(cell62Layout);
        cell62Layout.setHorizontalGroup(
            cell62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell62Layout.setVerticalGroup(
            cell62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box7.add(cell62, gridBagConstraints);

        cell63.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell63.setMaximumSize(new java.awt.Dimension(40, 40));
        cell63.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell63Layout = new javax.swing.GroupLayout(cell63);
        cell63.setLayout(cell63Layout);
        cell63Layout.setHorizontalGroup(
            cell63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell63Layout.setVerticalGroup(
            cell63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box7.add(cell63, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        sudokuPanel.add(box7, gridBagConstraints);

        box8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        box8.setMaximumSize(new java.awt.Dimension(120, 120));
        box8.setMinimumSize(new java.awt.Dimension(120, 120));
        box8.setLayout(new java.awt.GridBagLayout());

        cell64.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell64.setMaximumSize(new java.awt.Dimension(40, 40));
        cell64.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell64Layout = new javax.swing.GroupLayout(cell64);
        cell64.setLayout(cell64Layout);
        cell64Layout.setHorizontalGroup(
            cell64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell64Layout.setVerticalGroup(
            cell64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box8.add(cell64, new java.awt.GridBagConstraints());

        cell65.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell65.setMaximumSize(new java.awt.Dimension(40, 40));
        cell65.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell65Layout = new javax.swing.GroupLayout(cell65);
        cell65.setLayout(cell65Layout);
        cell65Layout.setHorizontalGroup(
            cell65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell65Layout.setVerticalGroup(
            cell65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box8.add(cell65, new java.awt.GridBagConstraints());

        cell66.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell66.setMaximumSize(new java.awt.Dimension(40, 40));
        cell66.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell66Layout = new javax.swing.GroupLayout(cell66);
        cell66.setLayout(cell66Layout);
        cell66Layout.setHorizontalGroup(
            cell66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell66Layout.setVerticalGroup(
            cell66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box8.add(cell66, new java.awt.GridBagConstraints());

        cell67.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell67.setMaximumSize(new java.awt.Dimension(40, 40));
        cell67.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell67Layout = new javax.swing.GroupLayout(cell67);
        cell67.setLayout(cell67Layout);
        cell67Layout.setHorizontalGroup(
            cell67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell67Layout.setVerticalGroup(
            cell67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box8.add(cell67, gridBagConstraints);

        cell68.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell68.setMaximumSize(new java.awt.Dimension(40, 40));
        cell68.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell68Layout = new javax.swing.GroupLayout(cell68);
        cell68.setLayout(cell68Layout);
        cell68Layout.setHorizontalGroup(
            cell68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell68Layout.setVerticalGroup(
            cell68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box8.add(cell68, gridBagConstraints);

        cell69.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell69.setMaximumSize(new java.awt.Dimension(40, 40));
        cell69.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell69Layout = new javax.swing.GroupLayout(cell69);
        cell69.setLayout(cell69Layout);
        cell69Layout.setHorizontalGroup(
            cell69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell69Layout.setVerticalGroup(
            cell69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box8.add(cell69, gridBagConstraints);

        cell70.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell70.setMaximumSize(new java.awt.Dimension(40, 40));
        cell70.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell70Layout = new javax.swing.GroupLayout(cell70);
        cell70.setLayout(cell70Layout);
        cell70Layout.setHorizontalGroup(
            cell70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell70Layout.setVerticalGroup(
            cell70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box8.add(cell70, gridBagConstraints);

        cell71.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell71.setMaximumSize(new java.awt.Dimension(40, 40));
        cell71.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell71Layout = new javax.swing.GroupLayout(cell71);
        cell71.setLayout(cell71Layout);
        cell71Layout.setHorizontalGroup(
            cell71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell71Layout.setVerticalGroup(
            cell71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box8.add(cell71, gridBagConstraints);

        cell72.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        cell72.setMaximumSize(new java.awt.Dimension(40, 40));
        cell72.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell72Layout = new javax.swing.GroupLayout(cell72);
        cell72.setLayout(cell72Layout);
        cell72Layout.setHorizontalGroup(
            cell72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell72Layout.setVerticalGroup(
            cell72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box8.add(cell72, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        sudokuPanel.add(box8, gridBagConstraints);

        box9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        box9.setMaximumSize(new java.awt.Dimension(120, 120));
        box9.setMinimumSize(new java.awt.Dimension(120, 120));
        box9.setLayout(new java.awt.GridBagLayout());

        cell73.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell73.setMaximumSize(new java.awt.Dimension(40, 40));
        cell73.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell73Layout = new javax.swing.GroupLayout(cell73);
        cell73.setLayout(cell73Layout);
        cell73Layout.setHorizontalGroup(
            cell73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell73Layout.setVerticalGroup(
            cell73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box9.add(cell73, new java.awt.GridBagConstraints());

        cell74.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell74.setMaximumSize(new java.awt.Dimension(40, 40));
        cell74.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell74Layout = new javax.swing.GroupLayout(cell74);
        cell74.setLayout(cell74Layout);
        cell74Layout.setHorizontalGroup(
            cell74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell74Layout.setVerticalGroup(
            cell74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box9.add(cell74, new java.awt.GridBagConstraints());

        cell75.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell75.setMaximumSize(new java.awt.Dimension(40, 40));
        cell75.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell75Layout = new javax.swing.GroupLayout(cell75);
        cell75.setLayout(cell75Layout);
        cell75Layout.setHorizontalGroup(
            cell75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell75Layout.setVerticalGroup(
            cell75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        box9.add(cell75, new java.awt.GridBagConstraints());

        cell76.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell76.setMaximumSize(new java.awt.Dimension(40, 40));
        cell76.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell76Layout = new javax.swing.GroupLayout(cell76);
        cell76.setLayout(cell76Layout);
        cell76Layout.setHorizontalGroup(
            cell76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell76Layout.setVerticalGroup(
            cell76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        box9.add(cell76, gridBagConstraints);

        cell77.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell77.setMaximumSize(new java.awt.Dimension(40, 40));
        cell77.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell77Layout = new javax.swing.GroupLayout(cell77);
        cell77.setLayout(cell77Layout);
        cell77Layout.setHorizontalGroup(
            cell77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell77Layout.setVerticalGroup(
            cell77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        box9.add(cell77, gridBagConstraints);

        cell78.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell78.setMaximumSize(new java.awt.Dimension(40, 40));
        cell78.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell78Layout = new javax.swing.GroupLayout(cell78);
        cell78.setLayout(cell78Layout);
        cell78Layout.setHorizontalGroup(
            cell78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell78Layout.setVerticalGroup(
            cell78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        box9.add(cell78, gridBagConstraints);

        cell79.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell79.setMaximumSize(new java.awt.Dimension(40, 40));
        cell79.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell79Layout = new javax.swing.GroupLayout(cell79);
        cell79.setLayout(cell79Layout);
        cell79Layout.setHorizontalGroup(
            cell79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell79Layout.setVerticalGroup(
            cell79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        box9.add(cell79, gridBagConstraints);

        cell80.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell80.setMaximumSize(new java.awt.Dimension(40, 40));
        cell80.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell80Layout = new javax.swing.GroupLayout(cell80);
        cell80.setLayout(cell80Layout);
        cell80Layout.setHorizontalGroup(
            cell80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell80Layout.setVerticalGroup(
            cell80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        box9.add(cell80, gridBagConstraints);

        cell81.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        cell81.setMaximumSize(new java.awt.Dimension(40, 40));
        cell81.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout cell81Layout = new javax.swing.GroupLayout(cell81);
        cell81.setLayout(cell81Layout);
        cell81Layout.setHorizontalGroup(
            cell81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        cell81Layout.setVerticalGroup(
            cell81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        box9.add(cell81, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        sudokuPanel.add(box9, gridBagConstraints);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(sudokuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentDateAndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentDateAndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(sudokuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initVariables(int score) {
        gameScore = 540;
        overallScore = score;
    }
    
    //Method: currentDateAndTime()
    //Purpose: Creates a thread that runs and displays current date and time.
    //Repeated every second.
    private void currentDateAndTime() {
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" dd/mm/yyyy hh:mm:ss ");
                LocalDateTime now = LocalDateTime.now();
                currentDateAndTime.setText(dtf.format(now));
            }
        });
        timer.setInitialDelay(0);
        timer.start();
    }
    
    //Method: bindKeys()
    //Purpose: Binds Escape key to exit program and F1 to show info
    private void bindKeys() {
        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
            KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "EXIT");
        rootPane.getActionMap().put("EXIT", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
            KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "popUpDisplay");
        rootPane.getActionMap().put("popUpDisplay", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Names & Bronco #s:\n"
                        + "Steven Phung 010433202\n"
                        + "Alex Vargas 011633258\n"
                        + "Team Name: //temporary fix\n"
                        + "Term: Fall Semester 2019");
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel box1;
    private javax.swing.JPanel box2;
    private javax.swing.JPanel box3;
    private javax.swing.JPanel box4;
    private javax.swing.JPanel box5;
    private javax.swing.JPanel box6;
    private javax.swing.JPanel box7;
    private javax.swing.JPanel box8;
    private javax.swing.JPanel box9;
    private javax.swing.JPanel cell1;
    private javax.swing.JPanel cell10;
    private javax.swing.JPanel cell11;
    private javax.swing.JPanel cell12;
    private javax.swing.JPanel cell13;
    private javax.swing.JPanel cell14;
    private javax.swing.JPanel cell15;
    private javax.swing.JPanel cell16;
    private javax.swing.JPanel cell17;
    private javax.swing.JPanel cell18;
    private javax.swing.JPanel cell19;
    private javax.swing.JPanel cell2;
    private javax.swing.JPanel cell20;
    private javax.swing.JPanel cell21;
    private javax.swing.JPanel cell22;
    private javax.swing.JPanel cell23;
    private javax.swing.JPanel cell24;
    private javax.swing.JPanel cell25;
    private javax.swing.JPanel cell26;
    private javax.swing.JPanel cell27;
    private javax.swing.JPanel cell28;
    private javax.swing.JPanel cell29;
    private javax.swing.JPanel cell3;
    private javax.swing.JPanel cell30;
    private javax.swing.JPanel cell31;
    private javax.swing.JPanel cell32;
    private javax.swing.JPanel cell33;
    private javax.swing.JPanel cell34;
    private javax.swing.JPanel cell35;
    private javax.swing.JPanel cell36;
    private javax.swing.JPanel cell37;
    private javax.swing.JPanel cell38;
    private javax.swing.JPanel cell39;
    private javax.swing.JPanel cell4;
    private javax.swing.JPanel cell40;
    private javax.swing.JPanel cell41;
    private javax.swing.JPanel cell42;
    private javax.swing.JPanel cell43;
    private javax.swing.JPanel cell44;
    private javax.swing.JPanel cell45;
    private javax.swing.JPanel cell46;
    private javax.swing.JPanel cell47;
    private javax.swing.JPanel cell48;
    private javax.swing.JPanel cell49;
    private javax.swing.JPanel cell5;
    private javax.swing.JPanel cell50;
    private javax.swing.JPanel cell51;
    private javax.swing.JPanel cell52;
    private javax.swing.JPanel cell53;
    private javax.swing.JPanel cell54;
    private javax.swing.JPanel cell55;
    private javax.swing.JPanel cell56;
    private javax.swing.JPanel cell57;
    private javax.swing.JPanel cell58;
    private javax.swing.JPanel cell59;
    private javax.swing.JPanel cell6;
    private javax.swing.JPanel cell60;
    private javax.swing.JPanel cell61;
    private javax.swing.JPanel cell62;
    private javax.swing.JPanel cell63;
    private javax.swing.JPanel cell64;
    private javax.swing.JPanel cell65;
    private javax.swing.JPanel cell66;
    private javax.swing.JPanel cell67;
    private javax.swing.JPanel cell68;
    private javax.swing.JPanel cell69;
    private javax.swing.JPanel cell7;
    private javax.swing.JPanel cell70;
    private javax.swing.JPanel cell71;
    private javax.swing.JPanel cell72;
    private javax.swing.JPanel cell73;
    private javax.swing.JPanel cell74;
    private javax.swing.JPanel cell75;
    private javax.swing.JPanel cell76;
    private javax.swing.JPanel cell77;
    private javax.swing.JPanel cell78;
    private javax.swing.JPanel cell79;
    private javax.swing.JPanel cell8;
    private javax.swing.JPanel cell80;
    private javax.swing.JPanel cell81;
    private javax.swing.JPanel cell9;
    private javax.swing.JTextField currentDateAndTime;
    private javax.swing.JLabel gameName;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel sudokuPanel;
    // End of variables declaration//GEN-END:variables
}
