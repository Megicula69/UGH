
package ordersystem;

import javax.swing.*;

public class RestaurantBillingSystemGUI extends JFrame {

     private Menu menu;
    
    public RestaurantBillingSystemGUI(Menu menu) {
        this.menu = menu;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Beverages = new javax.swing.JButton();
        Proceed = new javax.swing.JButton();
        EditOrder = new javax.swing.JButton();
        Desserts = new javax.swing.JButton();
        ItalianCuisine = new javax.swing.JButton();
        JapaneseCuisine = new javax.swing.JButton();
        ChineseCuisine = new javax.swing.JButton();
        Appetizer = new javax.swing.JButton();
        FilipinoCuisine = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("MENU");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(110, 210, 90, 30);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("MY ORDER");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(1030, 30, 150, 40);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("PPB Food Corp.");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(50, 40, 210, 30);

        jList1.setBorder(new javax.swing.border.MatteBorder(null));
        jList1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(1000, 80, 190, 370);

        Beverages.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Beverages.setText("Beverages");
        Beverages.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Beverages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeveragesActionPerformed(evt);
            }
        });
        jPanel1.add(Beverages);
        Beverages.setBounds(50, 540, 200, 40);

        Proceed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Proceed.setText("PROCEED");
        jPanel1.add(Proceed);
        Proceed.setBounds(1000, 520, 190, 40);

        EditOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditOrder.setText("EDIT ORDER");
        EditOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditOrderActionPerformed(evt);
            }
        });
        jPanel1.add(EditOrder);
        EditOrder.setBounds(1000, 470, 190, 40);

        Desserts.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Desserts.setText("Desserts");
        Desserts.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Desserts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DessertsActionPerformed(evt);
            }
        });
        jPanel1.add(Desserts);
        Desserts.setBounds(50, 490, 200, 40);

        ItalianCuisine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ItalianCuisine.setText("Italian Cuisine");
        ItalianCuisine.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ItalianCuisine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItalianCuisineActionPerformed(evt);
            }
        });
        jPanel1.add(ItalianCuisine);
        ItalianCuisine.setBounds(50, 440, 200, 40);

        JapaneseCuisine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JapaneseCuisine.setText("Japanese Cuisine");
        JapaneseCuisine.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JapaneseCuisine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JapaneseCuisineActionPerformed(evt);
            }
        });
        jPanel1.add(JapaneseCuisine);
        JapaneseCuisine.setBounds(50, 340, 200, 40);

        ChineseCuisine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ChineseCuisine.setText("Chinese Cuisine");
        ChineseCuisine.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ChineseCuisine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChineseCuisineActionPerformed(evt);
            }
        });
        jPanel1.add(ChineseCuisine);
        ChineseCuisine.setBounds(50, 390, 200, 40);

        Appetizer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Appetizer.setText("Appetizer");
        Appetizer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Appetizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppetizerActionPerformed(evt);
            }
        });
        jPanel1.add(Appetizer);
        Appetizer.setBounds(50, 240, 200, 40);

        FilipinoCuisine.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FilipinoCuisine.setText("Filipino Cuisine");
        FilipinoCuisine.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FilipinoCuisine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilipinoCuisineActionPerformed(evt);
            }
        });
        jPanel1.add(FilipinoCuisine);
        FilipinoCuisine.setBounds(50, 290, 200, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PLPASIG\\OneDrive\\Pictures\\a.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1230, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void openCategoryFrame(String category) {
    CategoryMenuFrame categoryFrame = new CategoryMenuFrame(category, menu);
    categoryFrame.setVisible(true);
}
    
    private void EditOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditOrderActionPerformed

    }//GEN-LAST:event_EditOrderActionPerformed

    private void DessertsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DessertsActionPerformed
       openCategoryFrame("Desserts");
    }//GEN-LAST:event_DessertsActionPerformed

    private void ItalianCuisineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItalianCuisineActionPerformed
        openCategoryFrame("Italian");
    }//GEN-LAST:event_ItalianCuisineActionPerformed

    private void JapaneseCuisineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JapaneseCuisineActionPerformed
       openCategoryFrame("Japanese");
    }//GEN-LAST:event_JapaneseCuisineActionPerformed

    private void ChineseCuisineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChineseCuisineActionPerformed
        openCategoryFrame("Chinese");
    }//GEN-LAST:event_ChineseCuisineActionPerformed

    private void AppetizerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppetizerActionPerformed
        openCategoryFrame("Appetizers");
    }//GEN-LAST:event_AppetizerActionPerformed

    private void FilipinoCuisineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilipinoCuisineActionPerformed
        openCategoryFrame("Filipino");
    }//GEN-LAST:event_FilipinoCuisineActionPerformed

    private void BeveragesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeveragesActionPerformed
        openCategoryFrame("Beverages");
    }//GEN-LAST:event_BeveragesActionPerformed

       public static void main(String args[]) {
            Menu menu = new Menu();
        SwingUtilities.invokeLater(() -> {
            new RestaurantBillingSystemGUI(menu).setVisible(true);
        });

    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Appetizer;
    private javax.swing.JButton Beverages;
    private javax.swing.JButton ChineseCuisine;
    private javax.swing.JButton Desserts;
    private javax.swing.JButton EditOrder;
    private javax.swing.JButton FilipinoCuisine;
    private javax.swing.JButton ItalianCuisine;
    private javax.swing.JButton JapaneseCuisine;
    private javax.swing.JButton Proceed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
