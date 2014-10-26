/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Contollers.MenuController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Set;
import Contollers.MenuItem;
import Contollers.OrderController;


/**
 *
 * @author ydubale
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    private DefaultListModel order;
    public boolean ManagerMode = false;
    public MainMenu() {
        order = new DefaultListModel();
        initComponents();
        managerEditButton.setVisible(false);
    }
    
    public MainMenu(boolean Manager) {
        order = new DefaultListModel();
        initComponents();
        ManagerMode = Manager;
        managerEditButton.setVisible(Manager);
    }

    private ArrayList<MenuItem> convert(Set<MenuItem> m)
    {
        ArrayList<MenuItem> output = new ArrayList<MenuItem>();
        for (MenuItem MI : m)
        {
            output.add(MI);
        }
        return output;
    }

    ArrayList<JButton> pizzaButtonList = new ArrayList<JButton>();
    private JButton createPizzaButton(String buttonName){
        JButton button = new JButton(buttonName);
        button.setPreferredSize(new Dimension(100,100));
        pizzaButtonList.add(button);
        button.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                        int i = pizzaButtonList.indexOf(event.getSource());
                        ProductDesc PD = new ProductDesc(convert(MenuController.getInstance().loadMenu()).get(i));
                        PD.setVisible(true);
                    }
                }
        );
        return button;
    }

    ArrayList<JButton> drinkButtonList = new ArrayList<JButton>();
    private JButton createDrinkButton(String buttonName){
        JButton button = new JButton(buttonName);
        button.setPreferredSize(new Dimension(100,50));
        drinkButtonList.add(button);
        button.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                        int i = drinkButtonList.indexOf(event.getSource());
                        ProductDesc PD = new ProductDesc(new MenuItem("",1.0,true));
                      //  PD.setPizzaNameLabel(drinkButtonList.get(i).getText());
                        PD.setVisible(true);
                    }
                }
        );
        return button;
    }

    ArrayList<JButton> specialButtonList = new ArrayList<JButton>();
    private JButton createSpecialButton(String buttonName){
        JButton button = new JButton(buttonName);
        button.setPreferredSize(new Dimension(100,50));
        specialButtonList.add(button);
        button.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                        int i = specialButtonList.indexOf(event.getSource());
                        ProductDesc PD = new ProductDesc(new MenuItem("",1.0,true));
                       // PD.setPizzaNameLabel(specialButtonList.get(i).getText());
                        PD.setVisible(true);
                    }
                }
        );
        return button;
    }
    
    public void ManagerMode(boolean manager)
    {
        managerEditButton.setVisible(manager);
    }


    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel5 = new javax.swing.JPanel();
        welcomeLabel = new java.awt.Label();
        label1 = new java.awt.Label();
        pizzaPanel = new javax.swing.JPanel();
        drinkPanel = new javax.swing.JPanel();
        orderPanel = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        totalPriceLabel = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderList = new JList(order);
        specialPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        submitOrderButton = new javax.swing.JButton();
        cancelOrderButton = new javax.swing.JButton();
        removeItemButton = new javax.swing.JButton();
        managerEditButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 50, 0, 0));
        setMinimumSize(new java.awt.Dimension(750, 750));
        setPreferredSize(new java.awt.Dimension(750, 750));
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout(50, 50));

        jPanel5.setPreferredSize(new java.awt.Dimension(750, 770));

        welcomeLabel.setText("Welcome, GUEST");

        label1.setEnabled(false);
        label1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        label1.setText("OUR PIZZA SYSTEM");

        pizzaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Pizzas"));
        pizzaPanel.setVerifyInputWhenFocusTarget(false);

        for (Contollers.MenuItem m : MenuController.getInstance().loadMenu())
        {
            String test = m.getName();
            createPizzaButton(test);
        }

       // javax.swing.GroupLayout pizzaPanelLayout = new javax.swing.GroupLayout(pizzaPanel);
        pizzaPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        pizzaPanel.setPreferredSize(new Dimension(350,50));
        JPanel pizzaGrid = new javax.swing.JPanel();
        pizzaGrid.setLayout(new GridLayout(3,4));
        for(JButton pizza : pizzaButtonList)
        {
            pizzaGrid.add(pizza);
        }
        pizzaPanel.add(pizzaGrid);


        drinkPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Drinks"));

        drinkPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        drinkPanel.setPreferredSize(new Dimension(350,50));
        JPanel drinkGrid = new javax.swing.JPanel();
        drinkGrid.setLayout(new GridLayout(2,3));
        for(JButton drink : drinkButtonList)
        {
            drinkGrid.add(drink);
        }

        drinkPanel.add(drinkGrid);

        orderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Order"));

        label2.setText("Total");

        totalPriceLabel.setAlignment(java.awt.Label.RIGHT);
        totalPriceLabel.setName(""); // NOI18N
        totalPriceLabel.setText("$0.00");

        orderList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        orderList.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                orderListComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(orderList);

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(totalPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        specialPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Special Items"));

        specialPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        specialPanel.setPreferredSize(new Dimension(350,50));
        JPanel specialGrid = new javax.swing.JPanel();
        specialGrid.setLayout(new GridLayout(2,3));
        for(JButton special : specialButtonList)
        {
            specialGrid.add(special);
        }
        specialPanel.add(drinkGrid);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );

        submitOrderButton.setText("Submit Order");
        submitOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitOrderButtonActionPerformed(evt);
            }
        });

        cancelOrderButton.setText("Cancel Order");
        cancelOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderButtonActionPerformed(evt);
            }
        });

        removeItemButton.setText("Remove Item");
        removeItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemButtonActionPerformed(evt);
            }
        });

        managerEditButton.setText("EDIT");
        managerEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerEditButtonActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(managerEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(specialPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(pizzaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(drinkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(welcomeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                                        .addComponent(removeItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cancelOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(orderPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(submitOrderButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(managerEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(orderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelOrderButton)
                                        .addComponent(removeItemButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(submitOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(pizzaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(drinkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(specialPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        label1.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
    }

    private void removeItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemButtonActionPerformed
        // TODO add your handling code here:
        int removeID = orderList.getSelectedIndex();
        if (removeID > -1)
        {

        }
    }//GEN-LAST:event_removeItemButtonActionPerformed

    private void cancelOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderButtonActionPerformed
        // TODO add your handling code here:

        DefaultListModel orderModel = (DefaultListModel) orderList.getModel();
        orderModel.removeAllElements();

        totalPriceLabel.setText("$0.00");
    }//GEN-LAST:event_cancelOrderButtonActionPerformed

    private void orderListComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_orderListComponentAdded
        // TODO add your handling code here

    }//GEN-LAST:event_orderListComponentAdded

    private void managerEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerEditButtonActionPerformed
        // TODO add your handling code here:
        editItemUI editUI = new editItemUI();
        editUI.setVisible(true);
    }//GEN-LAST:event_managerEditButtonActionPerformed

    private void submitOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitOrderButtonActionPerformed
        // TODO add your handling code here:
        couponUI coupon = new couponUI();
        coupon.setVisible(true);
    }//GEN-LAST:event_submitOrderButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        LoginUI lUI = new LoginUI(this);
        lUI.setVisible(true);
    }//GEN-LAST:event_loginButtonActionPerformed

    public void addOrder(String order) {
        this.order.addElement(order);
        
    }
    
    public void updatePrice (double price, boolean add)
    {
        double current = Double.parseDouble(totalPriceLabel.getText().substring(1));
        double total = 0.0;
        if(add)
        {
            total = current + price;
        }
        else
        {
            total = current - price;
        }
        totalPriceLabel.setText(String.format( "$%.2f", total));
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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelOrderButton;
    private javax.swing.JPanel drinkPanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton managerEditButton;
    private javax.swing.JList orderList;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JPanel pizzaPanel;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JPanel specialPanel;
    private javax.swing.JButton submitOrderButton;
    private java.awt.Label totalPriceLabel;
    private java.awt.Label welcomeLabel;
    // End of variables declaration//GEN-END:variables

}
