/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.AppManager;
import Model.Player;
import Model.Propriety;
import Propriety.ProprietyCard;
import View.TwoPlayer.PlayersWindow;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Gomez
 */
public class ShowPropriety extends javax.swing.JDialog {
    private java.awt.Frame parent;
    private Player player;
    private String name;
    private PlayersWindow window;
    /**
     * Creates new form ShowPropriety
     */
    public ShowPropriety(java.awt.Frame parent, boolean modal,int position,PlayersWindow window) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        this.player = AppManager.INSTANCE.getPlayers(position);
        this.window = window;
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
        cbProprieties = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Propriety:");

        cbProprieties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProprietiesActionPerformed(evt);
            }
        });

        jButton1.setText("Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buy House");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Buy Hotel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Finish");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbProprieties, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbProprieties, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        closeWindow();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cbProprietiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProprietiesActionPerformed
        Propriety p = (Propriety) cbProprieties.getSelectedItem();
        name = p.getName();
    }//GEN-LAST:event_cbProprietiesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Propriety propriety = null;
        if(name.contains("Aeroporto")){
            //TODO
        }else if(name.contains("Internet")){
            //TODO
        }else if(name.contains("Telemóveis")){
            //TODO
        }else{
            for(Propriety p:AppManager.INSTANCE.getProprieties()){
                if(p.getName().equals(name)){
                    propriety=p;
                    ProprietyCard card = new ProprietyCard(parent,true,propriety);
                    card.setVisible(true);
                }
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for(Propriety p:AppManager.INSTANCE.getProprieties()){
            if(p.getName().equals(name)){
                if(p.getNumberOfHouse()<4){
                    showError(1);
                    break;
                }else{
                    float valor = player.getMoney();
                    
                    if(valor<p.getBuildHotel()){
                        showError(6);
                    }else{
                       p.setNumberOfHouse(0);
                       p.setHasHotel(true);
                       player.setMoney(valor-p.getBuildHotel());
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int count=0;
        Propriety propriety = null;
        for(Propriety p:AppManager.INSTANCE.getProprieties()){
            if(p.getName().equals(name)){
                propriety=p;
                String color = p.getColor();
                
                if(color.equals("Castanho")){
                    for(Propriety p1:player.getProprieties()){
                        if(p1.getColor().equals("Castanho")){
                            count++;
                        }
                    }
                   
                    if(count ==2){
                        //Can buy house
                        if(p.getNumberOfHouse()== 4){
                            showError(4);
                        }else{
                            float valor = player.getMoney();
                            
                            if(valor<propriety.getBuildHouse()){
                                showError(5);
                            }else{
                                propriety.setNumberOfHouse(propriety.getNumberOfHouse()+1);
                                player.setMoney(valor - propriety.getBuildHouse());
                                window.setCurrentMoneyPLayer1();
                                window.setCurrentMoneyPLayer2();
                            }
                        }
                    }else{
                        showError(2);
                    }
                }else if(color.equals("Azul Escuro")){
                    for(Propriety p1:AppManager.INSTANCE.getProprieties()){
                        if(p1.getColor().equals("Azul Escuro")){
                            count++;
                        }
                    }
                    
                    if(count ==2){
                        //Can buy house
                        if(p.getNumberOfHouse()== 4){
                            showError(4);
                        }else{
                            float valor = player.getMoney();
                            
                            if(valor<propriety.getBuildHouse()){
                                showError(5);
                            }else{
                                propriety.setNumberOfHouse(propriety.getNumberOfHouse()+1);
                                player.setMoney(valor - propriety.getBuildHouse());
                                window.setCurrentMoneyPLayer1();
                                window.setCurrentMoneyPLayer2();
                            }
                            
                        }
                        
                    }else{
                        showError(2);
                    }
                    
                }else if(color.equals("Branco")){
                    showError(3);
                }else{
                    
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbProprieties;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void closeWindow() {
        this.dispose();
    }

    private void init() {
        LinkedList<Propriety> listAux = new LinkedList<Propriety>();
        
        for(Propriety p:player.getProprieties()){
            listAux.add(p);
        }
        cbProprieties.setModel(new DefaultComboBoxModel(listAux.toArray()));
        Propriety p = (Propriety) cbProprieties.getSelectedItem();
        name = p.getName();
    }

    private void showError(int erro) {
        String message;
        switch(erro){
            case 1:
                message ="You need to have 4 house to buy a hotel";
                JOptionPane.showMessageDialog(this, message);
            break;
            case 2:
                message ="you must have all propriety of the same color to buy house";
                JOptionPane.showMessageDialog(this, message);
            break;
            case 3:
                message ="Can't buy house there";
                JOptionPane.showMessageDialog(this, message);
            break;
            case 4:
                message ="Alerady have 4 house";
                JOptionPane.showMessageDialog(this, message);
            break;
            case 5:
                message ="Player "+player.getName()+" dont have money to buy a house";
                JOptionPane.showMessageDialog(this, message);
            break;
            case 6:
                message ="Player "+player.getName()+" dont have money to buy a hotel";
                JOptionPane.showMessageDialog(this, message);
            break;
        } 
    }
}
