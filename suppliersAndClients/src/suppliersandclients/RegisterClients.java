package suppliersandclients;

import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class RegisterClients extends javax.swing.JFrame {

    public RegisterClients() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        editButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        checkButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "Telefone", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
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

        closeButton.setText("Fechar");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        if (table.getSelectedRow() != -1) {
            DefaultTableModel tableClients = (DefaultTableModel) table.getModel();
            tableClients.removeRow(table.getSelectedRow()); 

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para excluir!");
        }     
    }//GEN-LAST:event_delButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Frame parent = (Frame) SwingUtilities.getWindowAncestor(this);
        DataClients dataClients = new DataClients(parent, true);
        
        dataClients.setLocationRelativeTo(null);
        dataClients.setVisible(true);
        
        ActionClientsButton newClient = dataClients.getClientData();
        
        if (newClient != null) {
            DefaultTableModel tableClients = (DefaultTableModel) table.getModel();
            Object[] dados = {
                newClient.getNome(), 
                newClient.getEmail(), 
                newClient.getTelefone(), 
                newClient.getCPF()
            };
            tableClients.addRow(dados);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (evt.getClickCount() == 2 && table.getSelectedRow() != -1) {
            ActionClientsButton selectedClient = new ActionClientsButton();
            selectedClient.setNome(table.getValueAt(table.getSelectedRow(), 0).toString());
            selectedClient.setEmail(table.getValueAt(table.getSelectedRow(), 1).toString());
            selectedClient.setTelefone(table.getValueAt(table.getSelectedRow(), 2).toString());
            selectedClient.setCPF(table.getValueAt(table.getSelectedRow(), 3).toString());

            Frame parent = (Frame) SwingUtilities.getWindowAncestor(this);
            DataClients dataClients = new DataClients(parent, true);
            dataClients.exportarComponentesSomenteLeitura(selectedClient);
            dataClients.setLocationRelativeTo(null);
            dataClients.setVisible(true);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (table.getSelectedRow() != -1) {
            ActionClientsButton selectedClient = new ActionClientsButton();
            selectedClient.setNome(table.getValueAt(table.getSelectedRow(), 0).toString());
            selectedClient.setEmail(table.getValueAt(table.getSelectedRow(), 1).toString());
            selectedClient.setTelefone(table.getValueAt(table.getSelectedRow(), 2).toString());
            selectedClient.setCPF(table.getValueAt(table.getSelectedRow(), 3).toString());
            
            Frame parent = (Frame) SwingUtilities.getWindowAncestor(this);
            DataClients dataClients = new DataClients(parent, true);
            dataClients.exportarComponentes(selectedClient);
            dataClients.setLocationRelativeTo(null);
            dataClients.setVisible(true);
            
            ActionClientsButton updatedClient = dataClients.getClientData();
            
            if (updatedClient != null) {
                table.setValueAt(updatedClient.getNome(), table.getSelectedRow(), 0);
                table.setValueAt(updatedClient.getEmail(), table.getSelectedRow(), 1);
                table.setValueAt(updatedClient.getTelefone(), table.getSelectedRow(), 2);
                table.setValueAt(updatedClient.getCPF(), table.getSelectedRow(), 3);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para alterar.");
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose(); // fecha apenas a janela atual
    }//GEN-LAST:event_closeButtonActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        if (table.getSelectedRow() != -1) {
            ActionClientsButton selectedClient = new ActionClientsButton();
            selectedClient.setNome(table.getValueAt(table.getSelectedRow(), 0).toString());
            selectedClient.setEmail(table.getValueAt(table.getSelectedRow(), 1).toString());
            selectedClient.setTelefone(table.getValueAt(table.getSelectedRow(), 2).toString());
            selectedClient.setCPF(table.getValueAt(table.getSelectedRow(), 3).toString());
            
            Frame parent = (Frame) SwingUtilities.getWindowAncestor(this);
            DataClients dataClients = new DataClients(parent, true);
            dataClients.exportarComponentesSomenteLeitura(selectedClient); 
            dataClients.setLocationRelativeTo(null);
            dataClients.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para consultar.");
        }
    }//GEN-LAST:event_checkButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterClients().setVisible(true);
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
