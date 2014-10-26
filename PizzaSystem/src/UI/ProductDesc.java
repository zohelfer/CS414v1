/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Contollers.ItemType;
import Contollers.MenuItem;
import Contollers.OrderController;
import TempPackage.Order;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author zacc
 */
public class ProductDesc extends javax.swing.JFrame {

    /**
     * Creates new form ProductDesc
     */
    private MainMenu menu;
    private MenuItem item;
    private double Price;
    
    public ProductDesc(MainMenu mm,MenuItem item) {
        this.menu = mm;
        this.item = item;
        initComponents();
        this.setPizzaNameLabel(item.getName());
        this.setPriceLabel(String.format( "%.2f",item.getPrice()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        picture = new javax.swing.JLabel();
        pizzaNameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        qtyComboBox = new javax.swing.JComboBox();
        orderButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));
        setResizable(false);

        pizzaNameLabel.setText("PIZZA NAME");

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

        BufferedImage itemPicture = null;
        String filepath = "";
        if(item.getTypeString().equals(ItemType.PIZZA))
        {
            filepath = "images/pizza-icon.png";
        }
        else if (item.getType().equals(ItemType.DRINK))
        {
            filepath = "images/soft-drinks.png";
        }
        else if (item.getType().equals(ItemType.SPECIAL))
        {
            filepath = "images/pizza-icon.png";
        }

        try {
            itemPicture = ImageIO.read(new File(filepath));
        } catch (IOException e) {
            System.err.println("Can not find file");
        }
        if (itemPicture != null) {
            picture = new JLabel(new ImageIcon(itemPicture));
        }

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
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(pizzaNameLabel)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(qtyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(66, 66, 66)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(priceLabel))
                                                        .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(241, 241, 241)
                                                .addComponent(orderButton)))
                                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(picture)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pizzaNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(qtyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(priceLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(orderButton)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < Integer.parseInt(qtyComboBox.getSelectedItem().toString()); i++)
        {
            OrderController.getInstance().addToOrder(item.getName(),item.getPrice(),item.getType());
        }
        menu.UpdateOrder();
        this.setVisible(false);
    }//GEN-LAST:event_orderButtonActionPerformed

    private void qtyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyComboBoxActionPerformed
        // TODO add your handling code here:
        double qty = Double.parseDouble(qtyComboBox.getSelectedItem().toString());
        double total = qty*Price;
        priceLabel.setText(String.format( "%.2f", total));
    }//GEN-LAST:event_qtyComboBoxActionPerformed



    public void setPizzaNameLabel(String pizzaNameLabel) {
        this.pizzaNameLabel.setText(pizzaNameLabel);
    }

    public void setPriceLabel(String priceLabel) {
        this.Price = Double.parseDouble(priceLabel);
        this.priceLabel.setText(String.format( "%.2f", Price));
    }



    // Variables declaration - do not modify
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton orderButton;
    private javax.swing.JLabel picture;
    private javax.swing.JLabel pizzaNameLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JComboBox qtyComboBox;
    // End of variables declaration
}

