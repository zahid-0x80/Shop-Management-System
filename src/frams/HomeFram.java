package frams;


public class HomeFram extends javax.swing.JFrame {

    /**
     * Creates new form homeFrame
     */
    public HomeFram() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buyproductsButton1 = new javax.swing.JButton();
        addnewproductButton = new javax.swing.JButton();
        viewshopinformationButton = new javax.swing.JButton();
        viewthetotalsaleButton = new javax.swing.JButton();
        seeorderstatusButton = new javax.swing.JButton();
        homepageButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Home page");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        buyproductsButton1.setText("Buy Product");
        buyproductsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyproductsButton1ActionPerformed(evt);
            }
        });

        addnewproductButton.setText("Add New Product");
        addnewproductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewproductButtonActionPerformed(evt);
            }
        });

        viewshopinformationButton.setText("Shop Information");
        viewshopinformationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewshopinformationButtonActionPerformed(evt);
            }
        });

        viewthetotalsaleButton.setText("Total Sale");
        viewthetotalsaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewthetotalsaleButtonActionPerformed(evt);
            }
        });

        seeorderstatusButton.setText("Order Status");
        seeorderstatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeorderstatusButtonActionPerformed(evt);
            }
        });

        homepageButton.setText("Exit");
        homepageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homepageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buyproductsButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(addnewproductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(seeorderstatusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewthetotalsaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(viewshopinformationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(33, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(homepageButton)
                                .addGap(89, 89, 89))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buyproductsButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addnewproductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewthetotalsaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewshopinformationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seeorderstatusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homepageButton))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewthetotalsaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewthetotalsaleButtonActionPerformed
        // TODO add your handling code here:
        
        ViewSaleFram frame=new ViewSaleFram();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewthetotalsaleButtonActionPerformed

    private void buyproductsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyproductsButton1ActionPerformed
        // TODO add your handling code here:
        BuyProductFram frame=new BuyProductFram();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_buyproductsButton1ActionPerformed

    private void viewshopinformationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewshopinformationButtonActionPerformed
        // TODO add your handling code here:
          ShopInformaitonFram frame=new ShopInformaitonFram();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewshopinformationButtonActionPerformed

    private void seeorderstatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeorderstatusButtonActionPerformed
        // TODO add your handling code here:
          OrderStatusFram frame=new OrderStatusFram();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_seeorderstatusButtonActionPerformed

    private void addnewproductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewproductButtonActionPerformed
        // TODO add your handling code here:
        AddProductFram fram=new AddProductFram();
        fram.setVisible(true);
        dispose();
    }//GEN-LAST:event_addnewproductButtonActionPerformed

    private void homepageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homepageButtonActionPerformed
        // TODO add your handling code here:
       dispose();
    }//GEN-LAST:event_homepageButtonActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnewproductButton;
    private javax.swing.JButton buyproductsButton1;
    private javax.swing.JButton homepageButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton seeorderstatusButton;
    private javax.swing.JButton viewshopinformationButton;
    private javax.swing.JButton viewthetotalsaleButton;
    // End of variables declaration//GEN-END:variables
}
