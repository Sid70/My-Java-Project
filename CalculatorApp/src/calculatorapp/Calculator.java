/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculatorapp;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Siddhanta
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Del = new javax.swing.JButton();
        BtnPercentage = new javax.swing.JButton();
        BtnDiv = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        BtnMul = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        BtnMinus = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        BtnPlus = new javax.swing.JButton();
        Calculate = new javax.swing.JButton();
        Display = new javax.swing.JTextField();
        BtnBracket = new javax.swing.JButton();
        BtnBracket1 = new javax.swing.JButton();

        jButton5.setText("jButton1");

        jButton7.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        setForeground(java.awt.Color.lightGray);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(100, 98, 88));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Del.setBackground(new java.awt.Color(255, 128, 0));
        Del.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Del.setForeground(new java.awt.Color(255, 255, 255));
        Del.setText("DEL");
        Del.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });

        BtnPercentage.setBackground(new java.awt.Color(226, 224, 224));
        BtnPercentage.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        BtnPercentage.setForeground(new java.awt.Color(255, 128, 0));
        BtnPercentage.setText("%");
        BtnPercentage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPercentageActionPerformed(evt);
            }
        });

        BtnDiv.setBackground(new java.awt.Color(226, 224, 224));
        BtnDiv.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        BtnDiv.setForeground(new java.awt.Color(255, 128, 0));
        BtnDiv.setText("/");
        BtnDiv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivActionPerformed(evt);
            }
        });

        Btn9.setBackground(new java.awt.Color(226, 224, 224));
        Btn9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn9.setForeground(new java.awt.Color(10, 80, 47));
        Btn9.setText("9");
        Btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(255, 128, 0));
        ClearButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(255, 255, 255));
        ClearButton.setText("AC");
        ClearButton.setActionCommand("");
        ClearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        Btn8.setBackground(new java.awt.Color(226, 224, 224));
        Btn8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn8.setText("8");
        Btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn7.setBackground(new java.awt.Color(226, 224, 224));
        Btn7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn7.setText("7");
        Btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn6.setBackground(new java.awt.Color(226, 224, 224));
        Btn6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn6.setText("6");
        Btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        BtnMul.setBackground(new java.awt.Color(226, 224, 224));
        BtnMul.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        BtnMul.setForeground(new java.awt.Color(255, 128, 0));
        BtnMul.setText("*");
        BtnMul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMulActionPerformed(evt);
            }
        });

        Btn4.setBackground(new java.awt.Color(226, 224, 224));
        Btn4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn4.setText("4");
        Btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        BtnMinus.setBackground(new java.awt.Color(226, 224, 224));
        BtnMinus.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        BtnMinus.setForeground(new java.awt.Color(255, 128, 0));
        BtnMinus.setText("-");
        BtnMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMinusActionPerformed(evt);
            }
        });

        Btn5.setBackground(new java.awt.Color(226, 224, 224));
        Btn5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn5.setText("5");
        Btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn3.setBackground(new java.awt.Color(226, 224, 224));
        Btn3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn3.setText("3");
        Btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn2.setBackground(new java.awt.Color(226, 224, 224));
        Btn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn2.setText("2");
        Btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn1.setBackground(new java.awt.Color(226, 224, 224));
        Btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn1.setText("1");
        Btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn0.setBackground(new java.awt.Color(226, 224, 224));
        Btn0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Btn0.setText("0");
        Btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });

        BtnPlus.setBackground(new java.awt.Color(226, 224, 224));
        BtnPlus.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        BtnPlus.setForeground(new java.awt.Color(255, 128, 0));
        BtnPlus.setText("+");
        BtnPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlusActionPerformed(evt);
            }
        });

        Calculate.setBackground(new java.awt.Color(255, 128, 0));
        Calculate.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Calculate.setForeground(new java.awt.Color(255, 255, 255));
        Calculate.setText("=");
        Calculate.setActionCommand("");
        Calculate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        Display.setEditable(false);
        Display.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        Display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        BtnBracket.setBackground(new java.awt.Color(255, 128, 0));
        BtnBracket.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        BtnBracket.setForeground(new java.awt.Color(255, 255, 255));
        BtnBracket.setText("(");
        BtnBracket.setActionCommand("("); // NOI18N
        BtnBracket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBracketActionPerformed(evt);
            }
        });

        BtnBracket1.setBackground(new java.awt.Color(255, 128, 0));
        BtnBracket1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        BtnBracket1.setForeground(new java.awt.Color(255, 255, 255));
        BtnBracket1.setText(" )");
        BtnBracket1.setActionCommand(")"); // NOI18N
        BtnBracket1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBracket1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBracket1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Display)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Del, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBracket1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(BtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Del, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBracket, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBracket1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 207, 107, 192);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        Display.setText(txt);
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_Btn9ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_Btn0ActionPerformed

    private void BtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlusActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_BtnPlusActionPerformed

    private void BtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_BtnDivActionPerformed

    private void BtnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMulActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_BtnMulActionPerformed

    private void BtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMinusActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_BtnMinusActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_Btn5ActionPerformed

    private void BtnPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPercentageActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_BtnPercentageActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        // TODO add your handling code here:
        String expression = Display.getText();

        try {
            Stack<Float> operandStack = new Stack<>();
            Stack<Character> operatorStack;
            operatorStack = new Stack<>();

            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);

                if (Character.isDigit(c)) {
                    StringBuilder operand = new StringBuilder();
                    while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                        operand.append(expression.charAt(i));
                        i++;
                    }
                    i--; // Decrement i to account for the next iteration of the loop

                    operandStack.push(Float.parseFloat(operand.toString()));
                } else if (c == '(') {
                    operatorStack.push(c);
                } else if (c == ')') {
                    while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                        float operand2 = operandStack.pop();
                        float operand1 = operandStack.pop();
                        char operator = operatorStack.pop();
                        float result = performOperation(operand1, operand2, operator);
                        operandStack.push(result);
                    }
                    operatorStack.pop(); // Pop the '(' from the operator stack
                } else if (isOperator(c)) {
                    while (!operatorStack.isEmpty() && getPrecedence(c) <= getPrecedence(operatorStack.peek())) {
                        float operand2 = operandStack.pop();
                        float operand1 = operandStack.pop();
                        char operator = operatorStack.pop();
                        float result = performOperation(operand1, operand2, operator);
                        operandStack.push(result);
                    }
                    operatorStack.push(c);
                }
            }

            while (!operatorStack.isEmpty()) {
                float operand2 = operandStack.pop();
                float operand1 = operandStack.pop();
                char operator = operatorStack.pop();
                float result = performOperation(operand1, operand2, operator);
                operandStack.push(result);
            }

            float ans = operandStack.pop();
            Display.setText(String.valueOf(ans));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jPanel1, "Please Enter a Valid Expression.");
        }


    }//GEN-LAST:event_CalculateActionPerformed

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
        // TODO add your handling code here:

        String txt = Display.getText();
        String text = txt.substring(0, txt.length() - 1);
        Display.setText(text);
    }//GEN-LAST:event_DelActionPerformed

    private void BtnBracketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBracketActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_BtnBracketActionPerformed

    private void BtnBracket1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBracket1ActionPerformed
        // TODO add your handling code here:
        String txt = evt.getActionCommand();
        String temp = Display.getText() + txt;
        Display.setText(temp);
    }//GEN-LAST:event_BtnBracket1ActionPerformed

    // UserDefiend Methods *********************************************************
    // isOperator() Method
    private static boolean isOperator(char op) {
        return (op == '+' || op == '-' || op == '*' || op == '/' || op == '%');
    }

    // precedence(char) Method
    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            default:
                return 0;
        }
    }

    // PerformOperation method
    private static float performOperation(float operand1, float operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            case '%':
                return operand1 % operand2;
            default:
                return 0;
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
            java.util.logging.Logger.getLogger(Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnBracket;
    private javax.swing.JButton BtnBracket1;
    private javax.swing.JButton BtnDiv;
    private javax.swing.JButton BtnMinus;
    private javax.swing.JButton BtnMul;
    private javax.swing.JButton BtnPercentage;
    private javax.swing.JButton BtnPlus;
    private javax.swing.JButton Calculate;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton Del;
    private javax.swing.JTextField Display;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
