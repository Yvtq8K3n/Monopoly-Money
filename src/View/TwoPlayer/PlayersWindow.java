/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.TwoPlayer;

import Model.AppManager;
import View.AddMoney;
import View.Dice;
import View.ProprietiesBuy;
import View.RemoveMoney;
import View.ShowPropriety;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Carlos Gomez
 */
public class PlayersWindow extends javax.swing.JDialog {
    private java.awt.Frame parent;
    private float rentPlayer1;
    private float rentPlayer2;
    /**
     * Creates new form PlayersWindow
     */
    public PlayersWindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent=parent;
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CurrentMoneyPlayer1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CurrentMoneyPlayer2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        player2nameTwo = new javax.swing.JLabel();
        player1nameTwo = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        togglePlayer1 = new javax.swing.JToggleButton();
        togglePlayer2 = new javax.swing.JToggleButton();
        JailCountPLayer1 = new javax.swing.JButton();
        JailCountPLayer2 = new javax.swing.JButton();
        txtMoneyRentPlayer1 = new javax.swing.JTextField();
        txtMoneyRentPlayer2 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Current Money:");

        CurrentMoneyPlayer1.setEditable(false);

        jLabel2.setText("Current Money:");

        CurrentMoneyPlayer2.setEditable(false);

        jButton1.setText("Add Money");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add Money");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Remove Money");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Remove Money");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Finish");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Pay");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Pay");
        jButton7.setToolTipText("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Luck");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Community Box");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel3.setText("Jail:");

        jLabel4.setText("Jail:");

        togglePlayer1.setText("No jail free");
        togglePlayer1.setActionCommand("");
        togglePlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togglePlayer1ActionPerformed(evt);
            }
        });

        togglePlayer2.setText("No jail free");
        togglePlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togglePlayer2ActionPerformed(evt);
            }
        });

        JailCountPLayer1.setText("0");
        JailCountPLayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JailCountPLayer1ActionPerformed(evt);
            }
        });

        JailCountPLayer2.setText("0");
        JailCountPLayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JailCountPLayer2ActionPerformed(evt);
            }
        });

        txtMoneyRentPlayer1.setEditable(false);

        txtMoneyRentPlayer2.setEditable(false);

        jButton10.setText("Roll Dice");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Buy Propriety");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Buy Propriety");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Proprieties");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Proprieties");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 197, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton10)
                                        .addGap(78, 78, 78))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton9)))
                                .addGap(193, 193, 193)
                                .addComponent(jButton5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CurrentMoneyPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(togglePlayer2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JailCountPLayer2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(86, 86, 86)))
                                .addComponent(txtMoneyRentPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(player2nameTwo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(player1nameTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CurrentMoneyPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMoneyRentPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(togglePlayer1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JailCountPLayer1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(player1nameTwo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2nameTwo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CurrentMoneyPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMoneyRentPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(CurrentMoneyPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMoneyRentPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(togglePlayer1)
                    .addComponent(JailCountPLayer1)
                    .addComponent(jLabel4)
                    .addComponent(togglePlayer2)
                    .addComponent(JailCountPLayer2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton10))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddMoney addMoney = new AddMoney(parent,true,1,this,2);
        addMoney.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AddMoney addMoney = new AddMoney(parent,true,2,this,2);
        addMoney.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        RemoveMoney removeMoney = new RemoveMoney(parent,true,1,this,2);
        removeMoney.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        RemoveMoney removeMoney = new RemoveMoney(parent,true,2,this,2);
        removeMoney.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        PaymentWindow paymentWindow = new PaymentWindow(parent, true,1,this);
        paymentWindow.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        PaymentWindow paymentWindow = new PaymentWindow(parent, true,2,this);
        paymentWindow.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        showLuck();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        showCommunityBox();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void togglePlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togglePlayer1ActionPerformed
        if(togglePlayer1.getText().equals("Jail free")){
           togglePlayer1.setText("No jail free"); 
        }else{
            togglePlayer1.setText("Jail free");
        }
    }//GEN-LAST:event_togglePlayer1ActionPerformed

    private void togglePlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togglePlayer2ActionPerformed
       if(togglePlayer2.getText().equals("Jail free")){
           togglePlayer2.setText("No jail free"); 
        }else{
            togglePlayer2.setText("Jail free");
        }
    }//GEN-LAST:event_togglePlayer2ActionPerformed

    private void JailCountPLayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JailCountPLayer1ActionPerformed
        String text = JailCountPLayer1.getText();
        
        switch(text){
            case "0":
                JailCountPLayer1.setText("1");
            break;
            case "1":
                JailCountPLayer1.setText("2");
            break;
            case "2":
                JailCountPLayer1.setText("3");
            break;
            case "3":
                JailCountPLayer1.setText("0");
            break;
        }
    }//GEN-LAST:event_JailCountPLayer1ActionPerformed

    private void JailCountPLayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JailCountPLayer2ActionPerformed
       String text = JailCountPLayer2.getText();
        
        switch(text){
            case "0":
                JailCountPLayer2.setText("1");
            break;
            case "1":
                JailCountPLayer2.setText("2");
            break;
            case "2":
                JailCountPLayer2.setText("3");
            break;
            case "3":
                JailCountPLayer2.setText("0");
            break;
        }
    }//GEN-LAST:event_JailCountPLayer2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       Dice dice = new Dice(parent, true);
       dice.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ProprietiesBuy buy = new ProprietiesBuy(parent, true, 0,this);
        buy.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        ProprietiesBuy buy = new ProprietiesBuy(parent, true, 1,this);
        buy.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        ShowPropriety show = new ShowPropriety(parent, true,0,this);
        show.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        ShowPropriety show = new ShowPropriety(parent, true,1,this);
        show.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    /**
     * @param args the command line arguments
     */
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CurrentMoneyPlayer1;
    private javax.swing.JTextField CurrentMoneyPlayer2;
    private javax.swing.JButton JailCountPLayer1;
    private javax.swing.JButton JailCountPLayer2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel player1nameTwo;
    private javax.swing.JLabel player2nameTwo;
    private javax.swing.JToggleButton togglePlayer1;
    private javax.swing.JToggleButton togglePlayer2;
    private javax.swing.JTextField txtMoneyRentPlayer1;
    private javax.swing.JTextField txtMoneyRentPlayer2;
    // End of variables declaration//GEN-END:variables

    private void init() {
        player1nameTwo.setText(AppManager.INSTANCE.getPlayers(0).getName());
        player2nameTwo.setText(AppManager.INSTANCE.getPlayers(1).getName());
        setCurrentMoneyPLayer1();
        setCurrentMoneyPLayer2();
        
        rentPlayer1 = 0;
        rentPlayer2 = 0;
        txtMoneyRentPlayer1.setText(String.valueOf(rentPlayer1));
        txtMoneyRentPlayer2.setText(String.valueOf(rentPlayer2));
    }
    
    public void setCurrentMoneyPLayer1(){
        float million = AppManager.INSTANCE.getPlayers(0).getMoney()/ 1000000;
        
        if(million >=1){
            CurrentMoneyPlayer1.setText(String.format("%.2fM", AppManager.INSTANCE.getPlayers(0).getMoney()/ 1000000.0));
        }else{
            CurrentMoneyPlayer1.setText(String.format("%.2fK", AppManager.INSTANCE.getPlayers(0).getMoney()/ 1000.0));
        }
    }
    
    public void setCurrentMoneyPLayer2(){
        float million = AppManager.INSTANCE.getPlayers(1).getMoney()/ 1000000;
        
        if(million >=1){
            CurrentMoneyPlayer2.setText(String.format("%.2fM", AppManager.INSTANCE.getPlayers(1).getMoney()/ 1000000.0));
        }else{
            CurrentMoneyPlayer2.setText(String.format("%.2fK", AppManager.INSTANCE.getPlayers(1).getMoney()/ 1000.0));
        }
    }

    private void showLuck() {
        String luck = AppManager.INSTANCE.getRandomLuck();
        JOptionPane.showMessageDialog(this, luck);
    }

    private void showCommunityBox() {
        String communityBox = AppManager.INSTANCE.getRandomCommunityBox();
        JOptionPane.showMessageDialog(this, communityBox);
    }

    

    void setRentMoney(int player,float quantity) {
        switch(player){
            case 1:
                rentPlayer1 = rentPlayer1 + quantity;
                setRentMoneyPlayer1();
            break;
            case 2:
                rentPlayer2 = rentPlayer2 + quantity;
                setRentMoneyPlayer2();
            break;
        }
    }

    private void setRentMoneyPlayer1() {
        float million = rentPlayer1/ 1000000;
        
        if(million >=1){
            txtMoneyRentPlayer1.setText(String.format("%.2fM", rentPlayer1/ 1000000.0));
        }else{
            txtMoneyRentPlayer1.setText(String.format("%.2fK", rentPlayer1/ 1000.0));
        }
    }

    private void setRentMoneyPlayer2() {
        float million = rentPlayer2/ 1000000;
        
        if(million >=1){
            txtMoneyRentPlayer2.setText(String.format("%.2fM", rentPlayer2/ 1000000.0));
        }else{
            txtMoneyRentPlayer2.setText(String.format("%.2fK", rentPlayer2/ 1000.0));
        }
    }
    
    
}
