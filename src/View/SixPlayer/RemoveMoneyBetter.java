/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.SixPlayer;

import Model.AppManager;
import Model.Player;
import View.FivePlayer.PlayersWindowFive;
import View.FourPlayer.PlayersWindowFour;
import View.ThreePlayer.PlayersWindowThree;
import View.TwoPlayer.PlayersWindow;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Gomez
 */
public class RemoveMoneyBetter extends javax.swing.JDialog {
    private PlayersWindow window;
    private PlayersWindowThree windowThree;
    private PlayersWindowFour windowFour;
    private PlayersWindowFive windowFive;
    private PlayersWindowSix windowSix;
    private int playerNumber;
    private Player player;
    /**
     * Creates new form RemoveMoneyBetter
     */
    public RemoveMoneyBetter(java.awt.Frame parent, boolean modal,int playerNumber,PlayersWindowSix windowSix) {
        super(parent, modal);
        initComponents();
        this.windowSix = windowSix;
        this.playerNumber = playerNumber;
        this.player = AppManager.INSTANCE.getPlayers(playerNumber-1);
        init();
    }
    
    public RemoveMoneyBetter(java.awt.Frame parent, boolean modal,int playerNumber,PlayersWindowFive windowFive) {
        super(parent, modal);
        initComponents();
        this.windowFive = windowFive;
        this.playerNumber = playerNumber;
        this.player = AppManager.INSTANCE.getPlayers(playerNumber-1);
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

        lblName = new javax.swing.JLabel();
        txtMoney = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblName.setText("jLabel1");

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName)
                .addGap(18, 18, 18)
                .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        closeWindow();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String insertMoney = txtMoney.getText();
        if(insertMoney.isEmpty()){
            showError(5);
        }else{
            if(!insertMoney.contains("M")&& !insertMoney.contains("K")){
                showError(6);
            }else{
                 float money;
                 if(insertMoney.contains("M")){
                    money = Float.parseFloat(insertMoney.split("M")[0])* 1000000;
                    float actualMoney = player.getMoney() - money;
                    
                    if(actualMoney < 0){
                        showError(4);
                    }else{
                        player.setMoney(actualMoney);
                        verifyWindowToUpdate();
                        closeWindow();
                    }
                 }else{
                     money = Float.parseFloat(insertMoney.split("K")[0])*1000;
                     float actualMoney = player.getMoney() - money;
                    
                    if(actualMoney < 0){
                        showError(4);
                    }else{
                        player.setMoney(actualMoney);
                        verifyWindowToUpdate();
                        closeWindow();
                    }
                 }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtMoney;
    // End of variables declaration//GEN-END:variables

    private void init() {
            lblName.setText(player.getName());
        }

        private void closeWindow() {
            this.dispose();
        }
        
        private void verifyWindowToUpdate() {
        if(window == null){
            if(windowThree != null){
                 windowThree.setCurrentMoneyPLayer1();
                 windowThree.setCurrentMoneyPLayer2();
                 windowThree.setCurrentMoneyPLayer3();
            } else if(windowFour != null){
                //janela four
                windowFour.setCurrentMoneyPLayer1();
                windowFour.setCurrentMoneyPLayer2();
                windowFour.setCurrentMoneyPLayer3();
                windowFour.setCurrentMoneyPLayer4();
               }else if(windowSix != null){
                   windowSix.setAllCurrentMoney();
               }else{
                   windowFive.setAllCurrentMoney();
               }
            }else{
                window.setCurrentMoneyPLayer1();
                window.setCurrentMoneyPLayer2();
            }
    }

        private void showError(int erro) {
            String message;
            switch(erro){
                case 1:
                    //Number format 
                    message ="Please insert a number";
                    JOptionPane.showMessageDialog(this, message);
                break;
                case 2:
                    //all exception
                    message ="Please insert a number";
                    JOptionPane.showMessageDialog(this, message);
                break;
                case 3:
                    //Invalid money
                    message ="Money must be positive";
                    JOptionPane.showMessageDialog(this, message);
                break;
                case 4:
                    //Invalid money
                    message ="Player can't have negative money";
                    JOptionPane.showMessageDialog(this, message);
                break;
                case 5:
                    //Invalid money
                    message ="Please insert a quantity";
                    JOptionPane.showMessageDialog(this, message);
                break;
                case 6:
                    //Invalid money
                    message ="Please insert a quantity with million(M) ou milliar(K)";
                    JOptionPane.showMessageDialog(this, message);
                break;
            } 
        }

    }
