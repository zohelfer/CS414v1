/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Contollers.MenuItem;

/**
 *
 * @author zacc
 */
public class ProductDesc extends javax.swing.JFrame {

    /**
     * Creates new form ProductDesc
     */
    private MainMenu menu;
    
    public ProductDesc(MenuItem item) {
        initComponents();
        //this.menu = mm;
        this.setPizzaNameLabel(item.getName());
        this.setPriceLabel(String.format( "%.2f",item.getPrice()));
//        if(menu.ManagerMode)
//        {
//            editButton.setVisible(true);
//        }
//        else
//        {
//            editButton.setVisible(false);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
//        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        picture = new javax.swing.JLabel();
        pizzaNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        qtyComboBox = new javax.swing.JComboBox();
        orderButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));
        setResizable(false);

//        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, picture, org.jdesktop.beansbinding.ELProperty.create("${icon}"), picture, org.jdesktop.beansbinding.BeanProperty.create("icon"));
//        bindingGroup.addBinding(binding);

        pizzaNameLabel.setText("PIZZA NAME");

        jLabel2.setText("Description:");

        descTextArea.setEditable(false);
        descTextArea.setColumns(20);
        descTextArea.setRows(5);
        descTextArea.setText("Look at that Pizza!");
        jScrollPane1.setViewportView(descTextArea);

        jLabel3.setText("QTY");

        qtyComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        qtyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyComboBoxActionPerformed(evt);
            }
        });

        orderButton.setText("Add To Order");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Total Price:");

        priceLabel.setText(String.format( "%.2f", Price));
        priceLabel.setToolTipText("");

        editButton.setText("Edit...");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pizzaNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qtyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(priceLabel)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(orderButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(picture)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pizzaNameLabel)
                    .addComponent(editButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(qtyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(priceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderButton)
                .addContainerGap())
        );

//        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        // TODO add your handling code here:
        String item = "";
        item += pizzaNameLabel.getText();
        item += "   ";
        item += qtyComboBox.getSelectedItem();
        item += "   ";
        item += priceLabel.getText();
        menu.addOrder(item);
        menu.updatePrice(Double.parseDouble(priceLabel.getText()), true);
        this.setVisible(false);
    }//GEN-LAST:event_orderButtonActionPerformed

    private void qtyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyComboBoxActionPerformed
        // TODO add your handling code here:
        double qty = Double.parseDouble(qtyComboBox.getSelectedItem().toString());
        double total = qty*Price;
        priceLabel.setText(String.format( "%.2f", total));
    }//GEN-LAST:event_qtyComboBoxActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
//        // TODO add your handling code here:
//        editDescUI edUI = new editDescUI();
//        edUI.setDescTextArea(this.descTextArea.getText());
//        edUI.setPriceTextField(this.priceLabel.getText());
//        edUI.setNameTextField(this.pizzaNameLabel.getText());
//        edUI.setVisible(true);
        
        
    }//GEN-LAST:event_editButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    private double Price = 15.95;

    public void setDescTextArea(String descTextArea) {
        this.descTextArea.setText(descTextArea);
    }

    public void setPizzaNameLabel(String pizzaNameLabel) {
        this.pizzaNameLabel.setText(pizzaNameLabel);
    }

    public void setPriceLabel(String priceLabel) {
        this.Price = Double.parseDouble(priceLabel);
        this.priceLabel.setText(String.format( "%.2f", Price));
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descTextArea;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orderButton;
    private javax.swing.JLabel picture;
    private javax.swing.JLabel pizzaNameLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JComboBox qtyComboBox;
//    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

