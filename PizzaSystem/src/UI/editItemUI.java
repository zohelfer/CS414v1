/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Contollers.ItemType;
import Contollers.MenuController;
import Contollers.MenuItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;

/**
 *
 * @author zacc
 */
public class editItemUI extends javax.swing.JFrame {

    /**
     * Creates new form editItemUI
     */
    private DefaultListModel pizzas = new DefaultListModel();
    private DefaultListModel drinks = new DefaultListModel();
    private DefaultListModel specials = new DefaultListModel();
    private DefaultListModel coupons = new DefaultListModel();
    private MainMenu menu;

    public editItemUI(MainMenu mm) {
        initComponents();
        menu = mm;
        for (MenuItem m : MenuController.getInstance().loadMenu()) {
            if(m.getType().equals(ItemType.PIZZA))
                pizzas.addElement(m.getName());
            else if (m.getType().equals(ItemType.DRINK))
                drinks.addElement(m.getName());
            else if (m.getType().equals(ItemType.SPECIAL))
                specials.addElement(m.getName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        saveButton = new javax.swing.JButton();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        pizzaPanel = new javax.swing.JPanel();
        addPizzaButton = new javax.swing.JButton();
        removePizzaButton = new javax.swing.JButton();
        editPizzaButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pizzaList = new JList(pizzas);
        drinkPanel = new javax.swing.JPanel();
        addDrinkButton = new javax.swing.JButton();
        removeDrinkButton = new javax.swing.JButton();
        editDrinkButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        drinkList = new JList(drinks);
        specialsPanel = new javax.swing.JPanel();
        addSpecialButton = new javax.swing.JButton();
        removeSpecialButton = new javax.swing.JButton();
        editSpecialButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        SpecialList = new JList(specials);
        couponsPanel = new javax.swing.JPanel();
        addCouponButton = new javax.swing.JButton();
        removeCouponButton = new javax.swing.JButton();
        editCouponButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        couponList = new JList(coupons);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        addPizzaButton.setText("Add");
        addPizzaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPizzaButtonActionPerformed(evt);
            }
        });

        removePizzaButton.setText("Remove");
        removePizzaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePizzaButtonActionPerformed(evt);
            }
        });

        editPizzaButton.setText("Edit");
        editPizzaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPizzaButtonActionPerformed(evt);
            }
        });

        pizzaList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(pizzaList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pizzaPanelLayout = new javax.swing.GroupLayout(pizzaPanel);
        pizzaPanel.setLayout(pizzaPanelLayout);
        pizzaPanelLayout.setHorizontalGroup(
                pizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pizzaPanelLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(addPizzaButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(removePizzaButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editPizzaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pizzaPanelLayout.setVerticalGroup(
                pizzaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pizzaPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addPizzaButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removePizzaButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editPizzaButton)
                                .addContainerGap(300, Short.MAX_VALUE))
                        .addGroup(pizzaPanelLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTabbedPane5.addTab("Pizzas", pizzaPanel);

        addDrinkButton.setText("Add");
        addDrinkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrinkButtonActionPerformed(evt);
            }
        });

        removeDrinkButton.setText("Remove");
        removeDrinkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDrinkButtonActionPerformed(evt);
            }
        });

        editDrinkButton.setText("Edit");
        editDrinkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDrinkButtonActionPerformed(evt);
            }
        });

        drinkList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(drinkList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5)
        );

        javax.swing.GroupLayout drinkPanelLayout = new javax.swing.GroupLayout(drinkPanel);
        drinkPanel.setLayout(drinkPanelLayout);
        drinkPanelLayout.setHorizontalGroup(
                drinkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(drinkPanelLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(drinkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(addDrinkButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(removeDrinkButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editDrinkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        drinkPanelLayout.setVerticalGroup(
                drinkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(drinkPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addDrinkButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeDrinkButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editDrinkButton)
                                .addContainerGap(300, Short.MAX_VALUE))
                        .addGroup(drinkPanelLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTabbedPane5.addTab("Drinks", drinkPanel);

        addSpecialButton.setText("Add");
        addSpecialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSpecialButtonActionPerformed(evt);
            }
        });

        removeSpecialButton.setText("Remove");
        removeSpecialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSpecialButtonActionPerformed(evt);
            }
        });

        editSpecialButton.setText("Edit");
        editSpecialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSpecialButtonActionPerformed(evt);
            }
        });

        SpecialList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(SpecialList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane6)
        );

        javax.swing.GroupLayout specialsPanelLayout = new javax.swing.GroupLayout(specialsPanel);
        specialsPanel.setLayout(specialsPanelLayout);
        specialsPanelLayout.setHorizontalGroup(
                specialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(specialsPanelLayout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(specialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(addSpecialButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(removeSpecialButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editSpecialButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        specialsPanelLayout.setVerticalGroup(
                specialsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(specialsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addSpecialButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeSpecialButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editSpecialButton)
                                .addContainerGap(300, Short.MAX_VALUE))
                        .addGroup(specialsPanelLayout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTabbedPane5.addTab("Specials", specialsPanel);

        addCouponButton.setText("Add");
        addCouponButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCouponButtonActionPerformed(evt);
            }
        });

        removeCouponButton.setText("Remove");
        removeCouponButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCouponButtonActionPerformed(evt);
            }
        });

        editCouponButton.setText("Edit");
        editCouponButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCouponButtonActionPerformed(evt);
            }
        });

        couponList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane7.setViewportView(couponList);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane7)
        );

        javax.swing.GroupLayout couponsPanelLayout = new javax.swing.GroupLayout(couponsPanel);
        couponsPanel.setLayout(couponsPanelLayout);
        couponsPanelLayout.setHorizontalGroup(
                couponsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(couponsPanelLayout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(couponsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(addCouponButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(removeCouponButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(editCouponButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        couponsPanelLayout.setVerticalGroup(
                couponsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(couponsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addCouponButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeCouponButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editCouponButton)
                                .addContainerGap(300, Short.MAX_VALUE))
                        .addGroup(couponsPanelLayout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTabbedPane5.addTab("Coupons", couponsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    public void updateLists() {
        pizzas.clear();
        drinks.clear();
        specials.clear();

        for (MenuItem m : MenuController.getInstance().loadMenu()) {
            if(m.getType().equals(ItemType.PIZZA))
                pizzas.addElement(m.getName());
            else if (m.getType().equals(ItemType.DRINK))
                drinks.addElement(m.getName());
            else if (m.getType().equals(ItemType.SPECIAL))
                specials.addElement(m.getName());
        }
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        MenuController.getInstance().saveMenu();
        menu.UpdateUI();
        this.dispose();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void addPizzaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPizzaButtonActionPerformed
        // TODO add your handling code here:
        new editDescUI(new MenuItem("",0.00,ItemType.PIZZA),this).setVisible(true);
    }//GEN-LAST:event_addPizzaButtonActionPerformed

    private void removePizzaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePizzaButtonActionPerformed
        // TODO add your handling code here:
        int size = MenuController.getInstance().loadMenu().size();
        MenuItem[] conv = new MenuItem[size];
        MenuController.getInstance().loadMenu().toArray(conv);
        MenuItem sel = conv[pizzaList.getSelectedIndex()];
        MenuController.getInstance().removeItem(sel.getName(), sel.getPrice(), sel.getType());
        updateLists();
    }//GEN-LAST:event_removePizzaButtonActionPerformed

    private void editPizzaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPizzaButtonActionPerformed
        // TODO add your handling code here:
        int size = MenuController.getInstance().loadMenu().size();
        MenuItem[] conv = new MenuItem[size];
        MenuController.getInstance().loadMenu().toArray(conv);
        MenuItem sel = conv[pizzaList.getSelectedIndex()];
        editDescUI edit = new editDescUI(sel, this);
        edit.setVisible(true);

    }//GEN-LAST:event_editPizzaButtonActionPerformed

    private void addDrinkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrinkButtonActionPerformed
        // TODO add your handling code here:
        new editDescUI(new MenuItem("",0.00,ItemType.DRINK),this).setVisible(true);
    }//GEN-LAST:event_addDrinkButtonActionPerformed

    private void removeDrinkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDrinkButtonActionPerformed
        // TODO add your handling code here:
        int size = MenuController.getInstance().loadMenu().size();
        MenuItem[] conv = new MenuItem[size];
        MenuController.getInstance().loadMenu().toArray(conv);
        MenuItem sel = conv[drinkList.getSelectedIndex()];
        MenuController.getInstance().removeItem(sel.getName(), sel.getPrice(), sel.getType());
        updateLists();
    }//GEN-LAST:event_removeDrinkButtonActionPerformed

    private void editDrinkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDrinkButtonActionPerformed
        // TODO add your handling code here:
        int size = MenuController.getInstance().loadMenu().size();
        MenuItem[] conv = new MenuItem[size];
        MenuController.getInstance().loadMenu().toArray(conv);
        MenuItem sel = conv[drinkList.getSelectedIndex()];
        editDescUI edit = new editDescUI(sel, this);
        edit.setVisible(true);
    }//GEN-LAST:event_editDrinkButtonActionPerformed

    private void addSpecialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSpecialButtonActionPerformed
        // TODO add your handling code here:
        new editDescUI(new MenuItem("",0.00,ItemType.SPECIAL),this).setVisible(true);
    }//GEN-LAST:event_addSpecialButtonActionPerformed

    private void removeSpecialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSpecialButtonActionPerformed
        // TODO add your handling code here:
        int size = MenuController.getInstance().loadMenu().size();
        MenuItem[] conv = new MenuItem[size];
        MenuController.getInstance().loadMenu().toArray(conv);
        MenuItem sel = conv[SpecialList.getSelectedIndex()];
        MenuController.getInstance().removeItem(sel.getName(), sel.getPrice(), sel.getType());
        updateLists();
    }//GEN-LAST:event_removeSpecialButtonActionPerformed

    private void editSpecialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSpecialButtonActionPerformed
        // TODO add your handling code here:
        int size = MenuController.getInstance().loadMenu().size();
        MenuItem[] conv = new MenuItem[size];
        MenuController.getInstance().loadMenu().toArray(conv);
        MenuItem sel = conv[SpecialList.getSelectedIndex()];
        editDescUI edit = new editDescUI(sel, this);
        edit.setVisible(true);
    }//GEN-LAST:event_editSpecialButtonActionPerformed

    private void addCouponButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCouponButtonActionPerformed
        // TODO add your handling code here:
        new editCouponUI().setVisible(true);
    }//GEN-LAST:event_addCouponButtonActionPerformed

    private void removeCouponButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCouponButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_removeCouponButtonActionPerformed

    private void editCouponButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCouponButtonActionPerformed
        // TODO add your handling code here:
        new editCouponUI().setVisible(true);
    }//GEN-LAST:event_editCouponButtonActionPerformed

    // Variables declaration - do not modify
    private javax.swing.JList SpecialList;
    private javax.swing.JButton addCouponButton;
    private javax.swing.JButton addDrinkButton;
    private javax.swing.JButton addPizzaButton;
    private javax.swing.JButton addSpecialButton;
    private javax.swing.JList couponList;
    private javax.swing.JPanel couponsPanel;
    private javax.swing.JList drinkList;
    private javax.swing.JPanel drinkPanel;
    private javax.swing.JButton editCouponButton;
    private javax.swing.JButton editDrinkButton;
    private javax.swing.JButton editPizzaButton;
    private javax.swing.JButton editSpecialButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JList pizzaList;
    private javax.swing.JPanel pizzaPanel;
    private javax.swing.JButton removeCouponButton;
    private javax.swing.JButton removeDrinkButton;
    private javax.swing.JButton removePizzaButton;
    private javax.swing.JButton removeSpecialButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel specialsPanel;
// End of variables declaration

}
