/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Contollers.MenuItem;
import Contollers.OrderController;

import javax.swing.*;

/**
 *
 * @author zacc
 */


public class paymentUI extends javax.swing.JFrame {

    private boolean payWithCard = true;
    private DefaultListModel order;
    private MainMenu menu;

    public paymentUI(MainMenu mm) {
        this.menu = mm;
        this.order = new DefaultListModel();
        initComponents();
        if(menu.getCustomer() != null)
        {
          this.nameTextField.setText(menu.getCustomer().getName());
          this.phoneTextField.setText(menu.getCustomer().getPhone());
          this.addressTextField.setText(menu.getCustomer().getAddress());
          this.emailTextField.setText(menu.getCustomer().getEmail());
        }
        for(MenuItem m: OrderController.getInstance().getOrderItems().keySet())
        {
            Double Price = OrderController.getInstance().getOrderItems().get(m) * m.getPrice();
            String orderItem = "   ";
            orderItem += m.getName();
            orderItem += "   ";
            orderItem += OrderController.getInstance().getOrderItems().get(m);
            orderItem += "   ";
            orderItem += Price;
            order.addElement(orderItem);
        }
        totalPriceLabel.setText(String.format( "$%.2f", OrderController.getInstance().getOrderTotal()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        orderInfoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameErrorLabel = new javax.swing.JLabel();
        phoneErrorLabel = new javax.swing.JLabel();
        emailErrorLabel = new javax.swing.JLabel();
        addressErrorLabel = new javax.swing.JLabel();
        payInfoPanel = new javax.swing.JPanel();
        ct1RadioButton = new javax.swing.JRadioButton();
        ct1RadioButton.setSelected(true);
        ct1RadioButton.setEnabled(payWithCard);
        ct2RadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cardTextField = new javax.swing.JTextField();
        cardErrorLabel = new javax.swing.JLabel();
        payCardRadioButton = new javax.swing.JRadioButton();
        payCashRadioButton = new javax.swing.JRadioButton();
        errorMessageLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderList = new JList(order);
        jLabel7 = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));
        setResizable(false);

        backButton.setText("Go Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        orderInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Order Information"));

        jLabel1.setText("Name:");

        jLabel2.setText("Phone:");

        jLabel3.setText("Email:");

        jLabel4.setText("Address:");

        nameErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        nameErrorLabel.setVisible(false);
        nameErrorLabel.setText("*");

        phoneErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        phoneErrorLabel.setVisible(false);
        phoneErrorLabel.setText("*");

        emailErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        emailErrorLabel.setVisible(false);
        emailErrorLabel.setText("*");

        addressErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        addressErrorLabel.setVisible(false);
        addressErrorLabel.setText("*");

        javax.swing.GroupLayout orderInfoPanelLayout = new javax.swing.GroupLayout(orderInfoPanel);
        orderInfoPanel.setLayout(orderInfoPanelLayout);
        orderInfoPanelLayout.setHorizontalGroup(
            orderInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameErrorLabel)
                    .addComponent(phoneErrorLabel)
                    .addComponent(emailErrorLabel)
                    .addComponent(addressErrorLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        orderInfoPanelLayout.setVerticalGroup(
            orderInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderInfoPanelLayout.createSequentialGroup()
                .addGroup(orderInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameErrorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(orderInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneErrorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailErrorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orderInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressErrorLabel)))
        );

        payInfoPanel.setEnabled(payWithCard);
        payInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Payment Information"));

        ct1RadioButton.setText("VISA");
        ct1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct1RadioButtonActionPerformed(evt);
            }
        });

        ct2RadioButton.setEnabled(payWithCard);
        ct2RadioButton.setText("Discover");
        ct2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct2RadioButtonActionPerformed(evt);
            }
        });

        jLabel5.setEnabled(payWithCard);
        jLabel5.setText("Card Type:");

        jLabel6.setEnabled(payWithCard);
        jLabel6.setText("Card Number:");

        cardTextField.setEnabled(payWithCard);

        cardErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        cardErrorLabel.setVisible(false);
        cardErrorLabel.setText("*");

        javax.swing.GroupLayout payInfoPanelLayout = new javax.swing.GroupLayout(payInfoPanel);
        payInfoPanel.setLayout(payInfoPanelLayout);
        payInfoPanelLayout.setHorizontalGroup(
            payInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(payInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(payInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(payInfoPanelLayout.createSequentialGroup()
                        .addGroup(payInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(payInfoPanelLayout.createSequentialGroup()
                                .addComponent(ct1RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ct2RadioButton))
                            .addGroup(payInfoPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardErrorLabel)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        payInfoPanelLayout.setVerticalGroup(
            payInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payInfoPanelLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ct1RadioButton)
                    .addComponent(ct2RadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cardErrorLabel))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        payCardRadioButton.setSelected(true);
        payCardRadioButton.setText("Pay With Card");
        payCardRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payCardRadioButtonActionPerformed(evt);
            }
        });

        payCashRadioButton.setText("Pay With Cash");
        payCashRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payCashRadioButtonActionPerformed(evt);
            }
        });

        errorMessageLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorMessageLabel.setVisible(false);
        errorMessageLabel.setText("Error!: Please provide the information with a *");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Order"));

        orderList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(orderList);

        jLabel7.setText("Total:");

        totalPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        totalPriceLabel.setText("$0.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(totalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(totalPriceLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(payInfoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderInfoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(payCardRadioButton)
                                .addGap(16, 16, 16)
                                .addComponent(payCashRadioButton))
                            .addComponent(errorMessageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backButton)
                        .addGap(23, 23, 23)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submitButton)
                            .addComponent(backButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orderInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(payCardRadioButton)
                            .addComponent(payCashRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(payInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(errorMessageLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        boolean error = false;
        
        if(nameTextField.getText().equals(""))
        {
           nameErrorLabel.setVisible(true);
           error = true;
        }
        else
        {
            nameErrorLabel.setVisible(false);
        }
        
        if(phoneTextField.getText().equals(""))
        {
           phoneErrorLabel.setVisible(true);
           error = true;
        }
        else
        {
            phoneErrorLabel.setVisible(false);
        }
        
        if(emailTextField.getText().equals(""))
        {
           emailErrorLabel.setVisible(true);
           error = true;
        }
        else
        {
            emailErrorLabel.setVisible(false);
        }
        
        if(addressTextField.getText().equals(""))
        {
           addressErrorLabel.setVisible(true);
           error = true;
        }
        else
        {
            addressErrorLabel.setVisible(false);
        }
        
        if (payCardRadioButton.isSelected())
        {
            if(cardTextField.getText().equals(""))
            {
               cardErrorLabel.setVisible(true);
               error = true;
            }
            else
            {
                cardErrorLabel.setVisible(false);
            }   
        }
        
        if(error)
        {
            errorMessageLabel.setVisible(true);
        }
        else
        {
            errorMessageLabel.setVisible(false);
            OrderController.getInstance().submitOrder();
            JOptionPane.showMessageDialog(null, "Success! Your order will be ready soon!");
            this.dispose();
            menu.dispose();
            new MainMenu().setVisible(true);
        }
            
    }//GEN-LAST:event_submitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed


    private void updatePaymentView (boolean payWithCard)
    {
        payInfoPanel.setEnabled(payWithCard);
        ct1RadioButton.setEnabled(payWithCard);
        ct2RadioButton.setEnabled(payWithCard);
        jLabel5.setEnabled(payWithCard);
        jLabel6.setEnabled(payWithCard);
        cardTextField.setEnabled(payWithCard);
        
    }
    
    private void payCardRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payCardRadioButtonActionPerformed
        // TODO add your handling code here:
        payCashRadioButton.setSelected(false);
        payWithCard = true;
        updatePaymentView(payWithCard);
    }//GEN-LAST:event_payCardRadioButtonActionPerformed

    private void payCashRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payCashRadioButtonActionPerformed
        // TODO add your handling code here:
        payCardRadioButton.setSelected(false);
        payWithCard = false;
        updatePaymentView(payWithCard);
        
    }//GEN-LAST:event_payCashRadioButtonActionPerformed

    private void ct1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct1RadioButtonActionPerformed
        // TODO add your handling code here:
        ct2RadioButton.setSelected(false);
    }//GEN-LAST:event_ct1RadioButtonActionPerformed

    private void ct2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct2RadioButtonActionPerformed
        // TODO add your handling code here:
        ct1RadioButton.setSelected(false);
    }//GEN-LAST:event_ct2RadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressErrorLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cardErrorLabel;
    private javax.swing.JTextField cardTextField;
    private javax.swing.JRadioButton ct1RadioButton;
    private javax.swing.JRadioButton ct2RadioButton;
    private javax.swing.JLabel emailErrorLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel errorMessageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameErrorLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPanel orderInfoPanel;
    private javax.swing.JList orderList;
    private javax.swing.JRadioButton payCardRadioButton;
    private javax.swing.JRadioButton payCashRadioButton;
    private javax.swing.JPanel payInfoPanel;
    private javax.swing.JLabel phoneErrorLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
