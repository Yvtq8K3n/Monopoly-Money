/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Carlos Gomez
 */
public class Dice extends javax.swing.JDialog {

    /**
     * Creates new form Dice
     */
    public Dice(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        dice_1 = new javax.swing.JLabel();
        dice_2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Roll");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Finish");
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
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(dice_1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(dice_2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dice_2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dice_1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Random rd=new Random();
        int random=0;
        random=rd.nextInt(6)+1;
        ImageIcon icon;
                
        switch(random){
            case 1:
               icon = new ImageIcon("images/dice_1.jpg"); 
                dice_1.setIcon(icon);
                break;
            case 2:
                icon = new ImageIcon("images/dice_2.jpg"); 
                dice_1.setIcon(icon);
                break;
            case 3:
                icon = new ImageIcon("images/dice_3.jpg"); 
                dice_1.setIcon(icon);
                break;
            case 4:
                icon = new ImageIcon("images/dice_4.jpg"); 
                dice_1.setIcon(icon);
                break;
            case 5:
                icon = new ImageIcon("images/dice_5.jpg"); 
                dice_1.setIcon(icon);
                break;
            case 6:
                icon = new ImageIcon("images/dice_6.jpg"); 
                dice_1.setIcon(icon);
                break;
        }
        
        random=rd.nextInt(6)+1;
        switch(random){
            case 1:
                icon = new ImageIcon("images/dice_1.jpg");
                dice_2.setIcon(icon);
                break;
            case 2:
                icon = new ImageIcon("images/dice_2.jpg");
                dice_2.setIcon(icon);
                break;
            case 3:
                icon = new ImageIcon("images/dice_3.jpg");
                dice_2.setIcon(icon);
                break;
            case 4:
                icon = new ImageIcon("images/dice_4.jpg");
                dice_2.setIcon(icon);
                break;
            case 5:
                icon = new ImageIcon("images/dice_5.jpg");
                dice_2.setIcon(icon);
                break;
            case 6:
                icon = new ImageIcon("images/dice_6.jpg");
                dice_2.setIcon(icon);
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dice_1;
    private javax.swing.JLabel dice_2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
