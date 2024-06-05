
package com.mycompany.casestudyjava;

import javax.swing.DefaultListModel;
import java.util.HashMap;
import java.util.Map;

public class OrderPage4 extends javax.swing.JFrame {

     private DefaultListModel<String> listModel;
     private Map<String, Integer> clickCounts;
     
    public OrderPage4(DefaultListModel<String> listModel) { // Step 2: Constructor to receive listModel
        this.listModel = listModel; // Step 3: Initialize listModel
        initComponents(); // Initialize components
        jList1.setModel(listModel);
        
        clickCounts = new HashMap<>();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Beverages = new javax.swing.JButton();
        SnacksDesserts = new javax.swing.JButton();
        JapaneseCuisine = new javax.swing.JButton();
        BurgersPizza = new javax.swing.JButton();
        Chickens = new javax.swing.JButton();
        FilipinoCuisine = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        EditOrder = new javax.swing.JButton();
        Proceed = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1242, 765));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("MENU");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(110, 210, 90, 30);

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\PLPASIG\\OneDrive\\Pictures\\fsfsfsf\\test2.png")); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel22);
        jLabel22.setBounds(900, 640, 50, 50);

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\PLPASIG\\OneDrive\\Pictures\\fsfsfsf\\test2.png")); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21);
        jLabel21.setBounds(670, 640, 50, 50);

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\PLPASIG\\OneDrive\\Pictures\\fsfsfsf\\test2.png")); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20);
        jLabel20.setBounds(410, 640, 50, 50);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("₱ 60.00");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(760, 640, 80, 50);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("₱ 150.00");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(510, 640, 80, 50);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("₱ 80.00");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(290, 640, 80, 50);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("TEMPURA");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(760, 600, 200, 40);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("RAMEN");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(510, 600, 200, 40);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("TOFU");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(290, 600, 250, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\PLPASIG\\OneDrive\\Pictures\\fsfsfsf\\tofu.png")); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(260, 440, 230, 160);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\PLPASIG\\OneDrive\\Pictures\\fsfsfsf\\test.png")); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(870, 300, 50, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\PLPASIG\\OneDrive\\Pictures\\fsfsfsf\\test.png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(520, 300, 50, 50);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("₱ 180.00");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(680, 300, 80, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("₱ 270.00");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 300, 80, 50);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("UDON");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(680, 250, 300, 60);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("SUSHI");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 250, 300, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\PLPASIG\\OneDrive\\Pictures\\fsfsfsf\\tag.png")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, -30, 260, 180);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\PLPASIG\\OneDrive\\Pictures\\fsfsfsf\\udon.png")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(650, 20, 300, 250);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\PLPASIG\\OneDrive\\Pictures\\fsfsfsf\\sushi.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 20, 330, 260);

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\PLPASIG\\OneDrive\\Pictures\\fsfsfsf\\tempura.png")); // NOI18N
        jPanel1.add(jLabel26);
        jLabel26.setBounds(730, 430, 260, 160);

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\PLPASIG\\OneDrive\\Pictures\\fsfsfsf\\ramen.png")); // NOI18N
        jPanel1.add(jLabel27);
        jLabel27.setBounds(490, 430, 260, 160);

        Beverages.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Beverages.setText("Beverages");
        Beverages.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Beverages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeveragesActionPerformed(evt);
            }
        });
        jPanel1.add(Beverages);
        Beverages.setBounds(50, 510, 200, 40);

        SnacksDesserts.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SnacksDesserts.setText("Snacks/Desserts");
        SnacksDesserts.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SnacksDesserts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnacksDessertsActionPerformed(evt);
            }
        });
        jPanel1.add(SnacksDesserts);
        SnacksDesserts.setBounds(50, 460, 200, 40);

        JapaneseCuisine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JapaneseCuisine.setText("Japanese Cuisine");
        JapaneseCuisine.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JapaneseCuisine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JapaneseCuisineActionPerformed(evt);
            }
        });
        jPanel1.add(JapaneseCuisine);
        JapaneseCuisine.setBounds(50, 310, 200, 40);

        BurgersPizza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BurgersPizza.setText("Burgers/Pizzas");
        BurgersPizza.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BurgersPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurgersPizzaActionPerformed(evt);
            }
        });
        jPanel1.add(BurgersPizza);
        BurgersPizza.setBounds(50, 410, 200, 40);

        Chickens.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Chickens.setText("Chickens");
        Chickens.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Chickens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickensActionPerformed(evt);
            }
        });
        jPanel1.add(Chickens);
        Chickens.setBounds(50, 360, 200, 40);

        FilipinoCuisine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FilipinoCuisine.setText("Filipino Cuisine");
        FilipinoCuisine.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FilipinoCuisine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilipinoCuisineActionPerformed(evt);
            }
        });
        jPanel1.add(FilipinoCuisine);
        FilipinoCuisine.setBounds(50, 260, 200, 40);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("MY ORDER");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(1030, 30, 150, 40);

        jList1.setBorder(new javax.swing.border.MatteBorder(null));
        jList1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(1000, 80, 190, 370);

        EditOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditOrder.setText("EDIT ORDER");
        jPanel1.add(EditOrder);
        EditOrder.setBounds(1000, 470, 190, 40);

        Proceed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Proceed.setText("PROCEED");
        jPanel1.add(Proceed);
        Proceed.setBounds(1000, 520, 190, 40);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("PPB Food Corp.");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(50, 40, 210, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PLPASIG\\OneDrive\\Pictures\\a.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1230, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1242, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JapaneseCuisineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JapaneseCuisineActionPerformed
    }//GEN-LAST:event_JapaneseCuisineActionPerformed

    private void BurgersPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurgersPizzaActionPerformed
        new OrderPage3(listModel).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BurgersPizzaActionPerformed

    private void ChickensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChickensActionPerformed
        new OrderPage2(listModel).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChickensActionPerformed

    private void FilipinoCuisineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilipinoCuisineActionPerformed
        new OrderPage(listModel).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FilipinoCuisineActionPerformed

    private void SnacksDessertsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnacksDessertsActionPerformed
        new OrderPage5(listModel).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SnacksDessertsActionPerformed

    private void BeveragesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeveragesActionPerformed
        new OrderPage6(listModel).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BeveragesActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        String item = "Sushi";
        int count = clickCounts.getOrDefault(item, 0) + 1; // Increment click count
        clickCounts.put(item, count); // Update click count in HashMap

        // Check if item already exists in listModel
    boolean itemExists = false;
    for (int i = 0; i < listModel.size(); i++) {
        if (listModel.get(i).startsWith(item)) {
            // Update existing item with new count
            listModel.set(i, item + " : " + count + " pcs");
            itemExists = true;
            break;
        }
    }

    // If item does not exist in listModel, add it
    if (!itemExists) {
        listModel.addElement(item + " : " + count + " pcs");
    }  
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        String item = "Udon";
        int count = clickCounts.getOrDefault(item, 0) + 1; // Increment click count
        clickCounts.put(item, count); // Update click count in HashMap

        // Check if item already exists in listModel
    boolean itemExists = false;
    for (int i = 0; i < listModel.size(); i++) {
        if (listModel.get(i).startsWith(item)) {
            // Update existing item with new count
            listModel.set(i, item + " : " + count + " pcs");
            itemExists = true;
            break;
        }
    }

    // If item does not exist in listModel, add it
    if (!itemExists) {
        listModel.addElement(item + " : " + count + " pcs");
    }  
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        String item = "Tofu";
        int count = clickCounts.getOrDefault(item, 0) + 1; // Increment click count
        clickCounts.put(item, count); // Update click count in HashMap

        // Check if item already exists in listModel
    boolean itemExists = false;
    for (int i = 0; i < listModel.size(); i++) {
        if (listModel.get(i).startsWith(item)) {
            // Update existing item with new count
            listModel.set(i, item + " : " + count + " pcs");
            itemExists = true;
            break;
        }
    }

    // If item does not exist in listModel, add it
    if (!itemExists) {
        listModel.addElement(item + " : " + count + " pcs");
    }  
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        String item = "Ramen";
        int count = clickCounts.getOrDefault(item, 0) + 1; // Increment click count
        clickCounts.put(item, count); // Update click count in HashMap

        // Check if item already exists in listModel
    boolean itemExists = false;
    for (int i = 0; i < listModel.size(); i++) {
        if (listModel.get(i).startsWith(item)) {
            // Update existing item with new count
            listModel.set(i, item + " : " + count + " pcs");
            itemExists = true;
            break;
        }
    }

    // If item does not exist in listModel, add it
    if (!itemExists) {
        listModel.addElement(item + " : " + count + " pcs");
    }  
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        String item = "Tempura";
        int count = clickCounts.getOrDefault(item, 0) + 1; // Increment click count
        clickCounts.put(item, count); // Update click count in HashMap

        // Check if item already exists in listModel
    boolean itemExists = false;
    for (int i = 0; i < listModel.size(); i++) {
        if (listModel.get(i).startsWith(item)) {
            // Update existing item with new count
            listModel.set(i, item + " : " + count + " pcs");
            itemExists = true;
            break;
        }
    }

    // If item does not exist in listModel, add it
    if (!itemExists) {
        listModel.addElement(item + " : " + count + " pcs");
    }  
    }//GEN-LAST:event_jLabel22MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderPage4(new DefaultListModel<>()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Beverages;
    private javax.swing.JButton BurgersPizza;
    private javax.swing.JButton Chickens;
    private javax.swing.JButton EditOrder;
    private javax.swing.JButton FilipinoCuisine;
    private javax.swing.JButton JapaneseCuisine;
    private javax.swing.JButton Proceed;
    private javax.swing.JButton SnacksDesserts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
