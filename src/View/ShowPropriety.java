/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.AppManager;
import Model.Player;
import Model.Propriety;
import Propriety.AeroportCard;
import Propriety.ProprietyCard;
import Propriety.InternetService;
import Propriety.PhoneService;
import View.FourPlayer.PlayersWindowFour;
import View.ThreePlayer.PaymentWindowThree;
import View.ThreePlayer.PlayersWindowThree;
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
    private PlayersWindowThree windowThree;
    private PlayersWindowFour windowFour;
    private int position;
    private float money;
    /**
     * Creates new form ShowPropriety
     */
    public ShowPropriety(java.awt.Frame parent, boolean modal,int position,PlayersWindow window) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        this.position=position;
        this.player = AppManager.INSTANCE.getPlayers(position);
        this.window = window;
        init();
    }
    
    public ShowPropriety(java.awt.Frame parent, boolean modal,int position,PlayersWindowThree window) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        this.position=position;
        this.player = AppManager.INSTANCE.getPlayers(position);
        this.windowThree = window;
        init();
    }
    
    public ShowPropriety(java.awt.Frame parent, boolean modal,int position,PlayersWindowFour windowFour) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        this.position=position;
        this.player = AppManager.INSTANCE.getPlayers(position);
        this.windowFour = windowFour;
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
        lblhouse = new javax.swing.JLabel();
        txtNumberOfHouse = new javax.swing.JTextField();
        lblHotel = new javax.swing.JLabel();
        txtHotel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        btnMortagage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMortgage = new javax.swing.JTextField();

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

        lblhouse.setText("Number of house:");

        txtNumberOfHouse.setEditable(false);

        lblHotel.setText("Hotel");

        txtHotel.setEditable(false);

        jLabel4.setText("Price:");

        txtPrice.setEditable(false);

        jButton5.setText("Pay");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnMortagage.setText("mortgage");
        btnMortagage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMortagageActionPerformed(evt);
            }
        });

        jLabel2.setText("Mortgage:");

        txtMortgage.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbProprieties, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMortagage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblhouse)
                                    .addComponent(lblHotel)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrice)
                                    .addComponent(txtHotel)
                                    .addComponent(txtMortgage)
                                    .addComponent(txtNumberOfHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblhouse)
                        .addComponent(txtNumberOfHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHotel)
                    .addComponent(txtHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMortagage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMortgage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(4, 4, 4)
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
        setHotel();
        setNumberOfHouse();
        setPrice();
    }//GEN-LAST:event_cbProprietiesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Propriety propriety = null;
        if(name.contains("Aeroporto")){
            for(Propriety p:AppManager.INSTANCE.getProprieties()){
                if(p.getName().equals(name)){
                    propriety=p;
                    AeroportCard card = new AeroportCard(parent,true,propriety);
                    card.setVisible(true);
                }
            }
        }else if(name.contains("Internet")){
            for(Propriety p:AppManager.INSTANCE.getProprieties()){
                if(p.getName().equals(name)){
                    propriety=p;
                    InternetService card = new InternetService(parent,true,propriety);
                    card.setVisible(true);
                }
            }
        }else if(name.contains("Telemóveis")){
            for(Propriety p:AppManager.INSTANCE.getProprieties()){
                if(p.getName().equals(name)){
                    propriety=p;
                    PhoneService card = new PhoneService(parent,true,propriety);
                    card.setVisible(true);
                }
            }
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
                       setHotel();
                       setNumberOfHouse();
                       setPrice();
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
                                /*for(Propriety p1:player.getProprieties()){
                                    if(p1.getColor().equals("Castanho")){
                                        if(!p1.getName().equals(name)){
                                            
                                        }
                                    }
                                }*/
                                propriety.setNumberOfHouse(propriety.getNumberOfHouse()+1);
                                player.setMoney(valor - propriety.getBuildHouse());
                                
                                if(window == null){
                                    if(windowThree != null){
                                         windowThree.setCurrentMoneyPLayer1();
                                         windowThree.setCurrentMoneyPLayer2();
                                          windowThree.setCurrentMoneyPLayer3();
                                    } else{
                                        //janela four
                                    }
                                 }else{
                                     window.setCurrentMoneyPLayer1();
                                     window.setCurrentMoneyPLayer2();
                                 }
                               
                                setNumberOfHouse();
                                setPrice();
                            }
                        }
                    }else{
                        showError(2);
                    }
                }else if(color.equals("Azul Escuro")){
                    for(Propriety p1:player.getProprieties()){
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
                                
                                if(window == null){
                                    if(windowThree != null){
                                         windowThree.setCurrentMoneyPLayer1();
                                         windowThree.setCurrentMoneyPLayer2();
                                          windowThree.setCurrentMoneyPLayer3();
                                    } else{
                                        //janela four
                                    }
                                 }else{
                                     window.setCurrentMoneyPLayer1();
                                     window.setCurrentMoneyPLayer2();
                                 }
                                setNumberOfHouse();
                                setPrice();
                            }
                            
                        }
                        
                    }else{
                        showError(2);
                    }
                    
                }else if(color.equals("Branco")){
                    showError(3);
                }else{
                    //all propriety
                    for(Propriety p1:player.getProprieties()){
                        if(!p1.getColor().equals("Azul Escuro")){
                            if(!p1.getColor().equals("Castanho")){
                                if(!p1.getColor().equals("Branco")){
                                    if(p1.getColor().equals(color)){
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                    
                    if(count == 3){
                        for(Propriety propriety1:AppManager.INSTANCE.getProprieties()){
                            if(propriety1.getName().equals(name)){
                                if(propriety1.getNumberOfHouse()!= 4){
                                    float valor = player.getMoney();
                            
                                    if(valor<propriety1.getBuildHouse()){
                                        showError(5);
                                    }else{
                                        propriety1.setNumberOfHouse(propriety1.getNumberOfHouse()+1);
                                        player.setMoney(valor - propriety1.getBuildHouse());
                                        
                                        if(window == null){
                                            if(windowThree != null){
                                                 windowThree.setCurrentMoneyPLayer1();
                                                 windowThree.setCurrentMoneyPLayer2();
                                                  windowThree.setCurrentMoneyPLayer3();
                                            } else{
                                                //janela four
                                            }
                                         }else{
                                             window.setCurrentMoneyPLayer1();
                                             window.setCurrentMoneyPLayer2();
                                         }
                                        setNumberOfHouse();
                                        setPrice();
                                    }
                                }else{
                                    showError(4);
                                }
                            }
                        }
                    }else{
                        showError(2);
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         Float price = money;
         
        if(window == null){
            if(windowThree != null){
                 //janela tres
                PaymentPropriety payment = new PaymentPropriety(parent, true,windowThree,price,player);
                payment.setVisible(true);
            } else{
                //janela four
                PaymentPropriety payment = new PaymentPropriety(parent, true,windowFour,price,player);
                payment.setVisible(true);
            }
         }else{
             //janela dois
           
            Propriety propriety;
            Player player2;

             for(Propriety p1:AppManager.INSTANCE.getProprieties()){
                 if(p1.getName().equals(name)){
                     propriety = p1;
                 }
             }

              if(position == 0){
                  player2 = AppManager.INSTANCE.getPlayers(1);
              }else{
                   player2 = AppManager.INSTANCE.getPlayers(0);
              }

             if(player.getMoney()< price){
                 showError(7);
             }else{
                float payPrice = player.getMoney() + price;
                player.setMoney(payPrice);
                float money = player2.getMoney();
                player2.setMoney(money - price);
                window.setCurrentMoneyPLayer1();
                window.setCurrentMoneyPLayer2();

                closeWindow();
             }
         }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnMortagageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMortagageActionPerformed
        Propriety propriety = null;
        String color = null;
        int count = 0;
        int countHouse=0;
        for(Propriety p:AppManager.INSTANCE.getProprieties()){
                if(p.getName().equals(name)){
                    propriety = p;
                    color = p.getColor();
                    break;
                }
            }
        
        if(btnMortagage.getText().equals("Mortgage")){
            //hipotecar
            for(Propriety p:player.getProprieties()){
                if(p.getColor().equals(color)){
                    count ++;
                    if(p.getNumberOfHouse()>0){
                        countHouse++;
                    }
                }
            }
            
            switch(color){
                case "Branco":
                    propriety.setIsMortgage(true);
                    player.setMoney(player.getMoney() + propriety.getMortgage());
                    txtMortgage.setText("Yes");
                    btnMortagage.setText("Unpotify");
                    break;
                case "Castanho":
                    if(count == 2){
                        if(countHouse >0 ){
                            showError(8);
                        }else{
                            propriety.setIsMortgage(true);
                            player.setMoney(player.getMoney() + propriety.getMortgage());
                            txtMortgage.setText("Yes");
                             btnMortagage.setText("Unpotify");
                        }
                    }else{
                        propriety.setIsMortgage(true);
                        player.setMoney(player.getMoney() + propriety.getMortgage());
                        txtMortgage.setText("Yes");
                         btnMortagage.setText("Unpotify");
                    }
                    break;
                case "Azul Escuro":
                    if(count == 2){
                        if(countHouse >0 ){
                            showError(8);
                        }else{
                            propriety.setIsMortgage(true);
                            player.setMoney(player.getMoney() + propriety.getMortgage());
                            txtMortgage.setText("Yes");
                             btnMortagage.setText("Unpotify");
                        }
                    }else{
                        propriety.setIsMortgage(true);
                        player.setMoney(player.getMoney() + propriety.getMortgage());
                        txtMortgage.setText("Yes");
                         btnMortagage.setText("Unpotify");
                    }
                    break;
                default:
                    if(count == 3){
                        if(countHouse >0 ){
                            showError(8);
                        }else{
                            propriety.setIsMortgage(true);
                            player.setMoney(player.getMoney() + propriety.getMortgage());
                            txtMortgage.setText("Yes");
                             btnMortagage.setText("Unpotify");
                        }
                    }else{
                        propriety.setIsMortgage(true);
                        player.setMoney(player.getMoney() + propriety.getMortgage());
                        txtMortgage.setText("Yes");
                        btnMortagage.setText("Unpotify");
                    }
                break;
            }
            
        }else{
            //desipotecar
            float tenPor =  (float) (0.1 * propriety.getMortgage());
            float desipotecar = propriety.getMortgage()+ tenPor;
            
            if(player.getMoney()<desipotecar){
                showError(7);
            }else{
                player.setMoney(player.getMoney() - desipotecar);
                propriety.setIsMortgage(false);
                txtMortgage.setText("No");
                btnMortagage.setText("Mortgage");
            }
        }
        
        if(window == null){
            if(windowThree != null){
                 //janela tres
                windowThree.setCurrentMoneyPLayer1();
                windowThree.setCurrentMoneyPLayer2();
                windowThree.setCurrentMoneyPLayer3();


            } else{
                //janela four
                windowFour.setCurrentMoneyPLayer1();
                windowFour.setCurrentMoneyPLayer2();
                windowFour.setCurrentMoneyPLayer3();
                windowFour.setCurrentMoneyPLayer4();
                
            }
         }else{
            //janela dois
            window.setCurrentMoneyPLayer1();
            window.setCurrentMoneyPLayer2();
        }
    }//GEN-LAST:event_btnMortagageActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMortagage;
    private javax.swing.JComboBox cbProprieties;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblHotel;
    private javax.swing.JLabel lblhouse;
    private javax.swing.JTextField txtHotel;
    private javax.swing.JTextField txtMortgage;
    private javax.swing.JTextField txtNumberOfHouse;
    private javax.swing.JTextField txtPrice;
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
        setHotel();
        setNumberOfHouse();
        setPrice();
        
        if(p.isIsMortgage()){
            btnMortagage.setText("Unpotify");
            txtMortgage.setText("Yes");
        }else{
            btnMortagage.setText("Mortgage");
             txtMortgage.setText("No");
        }
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
                message ="Already have 4 house";
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
            case 7:
                message ="Player "+player.getName()+" dont have money";
                JOptionPane.showMessageDialog(this, message);
            break;
            case 8:
                message ="Can't mortgage because the propriety have house(s)";
                JOptionPane.showMessageDialog(this, message);
            break;
        } 
    }
    
    private void setNumberOfHouse(){
        for(Propriety p1:AppManager.INSTANCE.getProprieties()){
            if(p1.getName().equals(name)){
                txtNumberOfHouse.setText(String.valueOf(p1.getNumberOfHouse()));
            }
        }
    }
    
    private void setHotel(){
        for(Propriety p1:AppManager.INSTANCE.getProprieties()){
            if(p1.getName().equals(name)){
                if(p1.isHasHotel()){
                    txtHotel.setText("Yes");
                }else{
                    txtHotel.setText("No");
                }
                
            }
        }
    }

   private void setPrice() {
       String color = null;
        Propriety propriety = null;
        int count=0,countHouses = 0,countAeroporto =0,countServices=0;
       
       for(Propriety p:AppManager.INSTANCE.getProprieties()){
            if(p.getName().equals(name)){
                propriety = p;
                color=p.getColor();
            }
        }
       
       for(Propriety p:player.getProprieties()){
           if(p.getColor().equals(color)){
               count++;
               if(p.getNumberOfHouse() > 0 || p.isHasHotel()){
                   countHouses ++;
               }
           }
       }
       
       switch(color){
            case "Castanho":
                if(count == 2){
                     if(countHouses == 0){
                         if(propriety.isHasHotel()){
                             showMillion(propriety.getHotelRental());
                         }else{
                             showMillion(propriety.getRental()*2);
                         }
                     }else{
                         switch(propriety.getNumberOfHouse()){
                            case 0: 
                                if(propriety.isHasHotel()){
                                    showMillion(propriety.getHotelRental());
                                }else{
                                    if(countHouses > 0){
                                        showMillion(propriety.getRental());
                                    }else{
                                       showMillion(propriety.getRental()*2); 
                                    }
                                }
                                
                            break;
                            case 1:
                                showMillion(propriety.getOneHouseRental());
                            break;
                            case 2:
                                showMillion(propriety.getTwoHouseRental());
                            break;
                            case 3:
                                showMillion(propriety.getThreeHouseRental());
                            break;
                            case 4:
                                showMillion(propriety.getFourHouseRental());
                            break;
                         }
                     }
                }else{
                    showMillion(propriety.getRental());
                }
            break;
            case "Branco":
                
                for(Propriety p:player.getProprieties()){
                    if(p.getName().contains("Aeroporto")){
                        countAeroporto++;
                    }else{
                        countServices++;
                    }
                }
                
                switch(countAeroporto){
                    case 1:
                        showMillion(propriety.getRental());
                    break;
                    case 2:
                        showMillion(propriety.getOneHouseRental());
                    break;
                    case 3:
                         showMillion(propriety.getTwoHouseRental());
                    break;
                    case 4:
                         showMillion(propriety.getThreeHouseRental());
                    break;
                }
                
                if(countServices == 1){
                    txtPrice.setText(propriety.getRental() +"x dice");
                }else{
                    txtPrice.setText(propriety.getOneHouseRental()+"x dice");
                }
            break;
            case "Azul Escuro":
                if(count == 2){
                     if(countHouses == 0){
                         if(propriety.isHasHotel()){
                             showMillion(propriety.getHotelRental());
                         }else{
                             showMillion(propriety.getRental()*2);
                         }
                     }else{
                         switch(propriety.getNumberOfHouse()){
                            case 0: 
                                if(propriety.isHasHotel()){
                                    showMillion(propriety.getHotelRental());
                                }else{
                                    if(countHouses > 0){
                                        showMillion(propriety.getRental());
                                    }else{
                                       showMillion(propriety.getRental()*2); 
                                    }
                                }
                                
                            break;
                            case 1:
                                showMillion(propriety.getOneHouseRental());
                            break;
                            case 2:
                                showMillion(propriety.getTwoHouseRental());
                            break;
                            case 3:
                                showMillion(propriety.getThreeHouseRental());
                            break;
                            case 4:
                                showMillion(propriety.getFourHouseRental());
                            break;
                         }
                     }
                }else{
                    showMillion(propriety.getRental());
                }
            break;
            default:
                if(count == 3){
                     if(countHouses == 0){
                         if(propriety.isHasHotel()){
                             showMillion(propriety.getHotelRental());
                         }else{
                             showMillion(propriety.getRental()*2);
                         }
                     }else{
                         switch(propriety.getNumberOfHouse()){
                            case 0: 
                                if(propriety.isHasHotel()){
                                    showMillion(propriety.getHotelRental());
                                }else{
                                    if(countHouses > 0){
                                        showMillion(propriety.getRental());
                                    }else{
                                       showMillion(propriety.getRental()*2); 
                                    }
                                }
                                
                            break;
                            case 1:
                                showMillion(propriety.getOneHouseRental());
                            break;
                            case 2:
                                showMillion(propriety.getTwoHouseRental());
                            break;
                            case 3:
                                showMillion(propriety.getThreeHouseRental());
                            break;
                            case 4:
                                showMillion(propriety.getFourHouseRental());
                            break;
                         }
                     }
                }else{
                    showMillion(propriety.getRental());
                }
            break;
       }
   }
   
   private void showMillion(float money){
       float million = money/ 1000000;
       this.money = money;
        
        if(million >=1){
            txtPrice.setText(String.format("%.2fM", money/ 1000000.0));
        }else{
            txtPrice.setText(String.format("%.2fK", money/ 1000.0));
        }
   }
}
