package suppliersandclients;

public class PrincipalWindow extends javax.swing.JFrame {

    public PrincipalWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerSuppliers = new javax.swing.JButton();
        registerClients = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registerSuppliers.setText("Fornecedores");
        registerSuppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerSuppliersMouseClicked(evt);
            }
        });
        registerSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerSuppliersActionPerformed(evt);
            }
        });

        registerClients.setText("Clientes");
        registerClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerClientsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerClients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerSuppliers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(registerSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(registerClients, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerSuppliersActionPerformed
        RegisterSuppliers registerSuppliers = new RegisterSuppliers();
        registerSuppliers.setLocationRelativeTo(null);
        registerSuppliers.setVisible(true);
    }//GEN-LAST:event_registerSuppliersActionPerformed

    private void registerClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerClientsActionPerformed
        RegisterClients registerClients = new RegisterClients();
        registerClients.setLocationRelativeTo(null);
        registerClients.setVisible(true);
    }//GEN-LAST:event_registerClientsActionPerformed

    private void registerSuppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerSuppliersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_registerSuppliersMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton registerClients;
    private javax.swing.JButton registerSuppliers;
    // End of variables declaration//GEN-END:variables
}
