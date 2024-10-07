package suppliersandclients;

import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class RegisterSuppliers extends javax.swing.JFrame {

    public RegisterSuppliers() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        closeButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        checkButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "Telefone", "CNPJ", "Inscrição Estadual", "Inscrição Municipal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        closeButton.setText("Fechar");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        editButton.setText("Alterar");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        addButton.setText("Incluir");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        delButton.setText("Excluir");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        checkButton.setText("Consultar");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 128, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        if (table.getSelectedRow() != -1) {
            DefaultTableModel tableSuppliers = (DefaultTableModel) table.getModel();
            tableSuppliers.removeRow(table.getSelectedRow()); 

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para excluir!");
        }
    }//GEN-LAST:event_delButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (table.getSelectedRow() != -1) {
            ActionSuppliersButton selectedSupplier = new ActionSuppliersButton();
            selectedSupplier.setNome(table.getValueAt(table.getSelectedRow(), 0).toString());
            selectedSupplier.setEmail(table.getValueAt(table.getSelectedRow(), 1).toString());
            selectedSupplier.setTelefone(table.getValueAt(table.getSelectedRow(), 2).toString());
            selectedSupplier.setCNPJ(table.getValueAt(table.getSelectedRow(), 3).toString());
            selectedSupplier.setInscricaoEstadual(table.getValueAt(table.getSelectedRow(), 4).toString());
            selectedSupplier.setInscricaoMunicipal(table.getValueAt(table.getSelectedRow(), 5).toString());
            
            Frame parent = (Frame) SwingUtilities.getWindowAncestor(this);
            DataSuppliers dataSuppliers = new DataSuppliers(parent, true);
            dataSuppliers.exportarComponentes(selectedSupplier);
            dataSuppliers.setLocationRelativeTo(null);
            dataSuppliers.setVisible(true);
            
            ActionSuppliersButton updatedSupplier = dataSuppliers.getSupplierData();
            
            if (updatedSupplier != null) {
                table.setValueAt(updatedSupplier.getNome(), table.getSelectedRow(), 0);
                table.setValueAt(updatedSupplier.getEmail(), table.getSelectedRow(), 1);
                table.setValueAt(updatedSupplier.getTelefone(), table.getSelectedRow(), 2);
                table.setValueAt(updatedSupplier.getCNPJ(), table.getSelectedRow(), 3);
                table.setValueAt(updatedSupplier.getInscricaoEstadual(), table.getSelectedRow(), 4);
                table.setValueAt(updatedSupplier.getInscricaoMunicipal(), table.getSelectedRow(), 5);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para alterar.");
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Frame parent = (Frame) SwingUtilities.getWindowAncestor(this);
        DataSuppliers dataSuppliers = new DataSuppliers(parent, true);
        
        dataSuppliers.setLocationRelativeTo(null);
        dataSuppliers.setVisible(true);
        
        ActionSuppliersButton newSuppliers = dataSuppliers.getSupplierData();
        
        if (newSuppliers != null) {
            DefaultTableModel tableSuppliers = (DefaultTableModel) table.getModel();
            Object[] dados = {
                newSuppliers.getNome(), 
                newSuppliers.getEmail(), 
                newSuppliers.getTelefone(), 
                newSuppliers.getCNPJ(),
                newSuppliers.getInscricaoEstadual(),
                newSuppliers.getInscricaoMunicipal()
            };
            tableSuppliers.addRow(dados);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        if (table.getSelectedRow() != -1) {
            ActionSuppliersButton selectedSupplier = new ActionSuppliersButton();
            selectedSupplier.setNome(table.getValueAt(table.getSelectedRow(), 0).toString());
            selectedSupplier.setEmail(table.getValueAt(table.getSelectedRow(), 1).toString());
            selectedSupplier.setTelefone(table.getValueAt(table.getSelectedRow(), 2).toString());
            selectedSupplier.setCNPJ(table.getValueAt(table.getSelectedRow(), 3).toString());
            selectedSupplier.setInscricaoEstadual(table.getValueAt(table.getSelectedRow(), 4).toString());
            selectedSupplier.setInscricaoMunicipal(table.getValueAt(table.getSelectedRow(), 5).toString());
            
            Frame parent = (Frame) SwingUtilities.getWindowAncestor(this);
            DataSuppliers dataSuppliers = new DataSuppliers(parent, true);
            dataSuppliers.exportarComponentesSomenteLeitura(selectedSupplier); 
            dataSuppliers.setLocationRelativeTo(null);
            dataSuppliers.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para consultar.");
        }
    }//GEN-LAST:event_checkButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (evt.getClickCount() == 2 && table.getSelectedRow() != -1) {
            ActionSuppliersButton selectedSupplier = new ActionSuppliersButton();
            selectedSupplier.setNome(table.getValueAt(table.getSelectedRow(), 0).toString());
            selectedSupplier.setEmail(table.getValueAt(table.getSelectedRow(), 1).toString());
            selectedSupplier.setTelefone(table.getValueAt(table.getSelectedRow(), 2).toString());
            selectedSupplier.setCNPJ(table.getValueAt(table.getSelectedRow(), 3).toString());
            selectedSupplier.setInscricaoEstadual(table.getValueAt(table.getSelectedRow(), 4).toString());
            selectedSupplier.setInscricaoMunicipal(table.getValueAt(table.getSelectedRow(), 5).toString());

            Frame parent = (Frame) SwingUtilities.getWindowAncestor(this);
            DataSuppliers dataSuppliers = new DataSuppliers(parent, true);
            dataSuppliers.exportarComponentesSomenteLeitura(selectedSupplier); 
            dataSuppliers.setLocationRelativeTo(null);
            dataSuppliers.setVisible(true);
        }
    }//GEN-LAST:event_tableMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterSuppliers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton checkButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton delButton;
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
