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
        jLabel3 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        inputCNPJ = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        inputTelefone = new javax.swing.JTextField();
        delButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        checkButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputInscricaoMunicipal = new javax.swing.JTextField();
        inputInscricaoEstadual = new javax.swing.JTextField();

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

        jLabel3.setText("Telefone:");

        jLabel4.setText("CNPJ:");

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

        jLabel1.setText("Nome:");

        checkButton.setText("Consultar");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Email:");

        jLabel5.setText("Inscrição Estadual:");

        jLabel6.setText("Inscrição Municipal:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(inputCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(inputInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(inputInscricaoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(18, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputInscricaoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        if (table.getSelectedRow() != -1) {
            DefaultTableModel tableClients = (DefaultTableModel) table.getModel();
            tableClients.removeRow((table.getSelectedRow()));
            
            inputNome.setText("");
            inputEmail.setText("");
            inputTelefone.setText("");
            inputCNPJ.setText("");
            inputInscricaoEstadual.setText("");
            inputInscricaoMunicipal.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir!");
        }
    }//GEN-LAST:event_delButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (table.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um produto para alterar!");
        } else if (inputNome.getText().isEmpty() || inputEmail.getText().isEmpty() || inputTelefone.getText().isEmpty() || inputCNPJ.getText().isEmpty() || inputInscricaoEstadual.getText().isEmpty() || inputInscricaoMunicipal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de alterá-los!");
        } else {
            String telefoneSemFormatacao = inputTelefone.getText().replaceAll("[^0-9]", "");
            String cnpjSemFormatacao = inputCNPJ.getText().replaceAll("[^0-9]", "");
            String inscricaoEstadualSemFormatacao = inputInscricaoEstadual.getText().replaceAll("[^0-9]", "");
            String inscricaoMunicipalSemFormatacao = inputInscricaoMunicipal.getText().replaceAll("[^0-9]", "");
            
            if (telefoneSemFormatacao.length() != 11 || cnpjSemFormatacao.length() != 14 || inscricaoEstadualSemFormatacao.length() != 9 || inscricaoMunicipalSemFormatacao.length() != 8) {
                JOptionPane.showMessageDialog(null, "Telefone, CNPJ, Inscrição Estadual ou Inscrição Municipal com tamanho inválido!");
            } else {
                String telefoneFormatado = DataFormatting.formatPhoneNumber(telefoneSemFormatacao);
                String cnpjFormatado = DataFormatting.formatCNPJ(cnpjSemFormatacao);
                String inscricaoEstadualFormatado = DataFormatting.formatInscricaoEstadual(inscricaoEstadualSemFormatacao);
                String inscricaoMunicipalFormatado = DataFormatting.formatInscricaoMunicipal(inscricaoMunicipalSemFormatacao);

                table.setValueAt(inputNome.getText(), table.getSelectedRow(), 0);
                table.setValueAt(inputEmail.getText(), table.getSelectedRow(), 1);
                table.setValueAt(telefoneFormatado, table.getSelectedRow(), 2);
                table.setValueAt(cnpjFormatado, table.getSelectedRow(), 3);
                table.setValueAt(inscricaoEstadualFormatado, table.getSelectedRow(), 4);
                table.setValueAt(inscricaoMunicipalFormatado, table.getSelectedRow(), 5);

                inputNome.setText("");
                inputEmail.setText("");
                inputTelefone.setText("");
                inputCNPJ.setText("");
                inputInscricaoEstadual.setText("");
                inputInscricaoMunicipal.setText("");
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (inputNome.getText().isEmpty() || inputEmail.getText().isEmpty() || inputTelefone.getText().isEmpty() || inputCNPJ.getText().isEmpty() || inputInscricaoEstadual.getText().isEmpty() || inputInscricaoMunicipal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de cadastrá-los!");
        } else {
            String telefoneSemFormatacao = inputTelefone.getText().replaceAll("[^0-9]", "");
            String cnpjSemFormatacao = inputCNPJ.getText().replaceAll("[^0-9]", "");
            String inscricaoEstadualSemFormatacao = inputInscricaoEstadual.getText().replaceAll("[^0-9]", "");
            String inscricaoMunicipalSemFormatacao = inputInscricaoMunicipal.getText().replaceAll("[^0-9]", "");
            
            if (telefoneSemFormatacao.length() != 11 || cnpjSemFormatacao.length() != 14 || inscricaoEstadualSemFormatacao.length() != 9 || inscricaoMunicipalSemFormatacao.length() != 8) {
                JOptionPane.showMessageDialog(null, "Telefone, CNPJ, Inscrição Estadual ou Inscrição Municipal com tamanho inválido!");
            } else {
                String telefoneFormatado = DataFormatting.formatPhoneNumber(telefoneSemFormatacao);
                String cnpjFormatado = DataFormatting.formatCNPJ(cnpjSemFormatacao);
                String inscricaoEstadualFormatado = DataFormatting.formatInscricaoEstadual(inscricaoEstadualSemFormatacao);
                String inscricaoMunicipalFormatado = DataFormatting.formatInscricaoMunicipal(inscricaoMunicipalSemFormatacao);

                DefaultTableModel tableClients = (DefaultTableModel) table.getModel();
                Object[] dados = {inputNome.getText(), inputEmail.getText(), telefoneFormatado, cnpjFormatado, inscricaoEstadualFormatado, inscricaoMunicipalFormatado};
                tableClients.addRow(dados);

                inputNome.setText("");
                inputEmail.setText("");
                inputTelefone.setText("");
                inputCNPJ.setText("");
                inputInscricaoEstadual.setText("");
                inputInscricaoMunicipal.setText("");
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        if (table.getSelectedRow() != -1) {
            Frame parent = (Frame) SwingUtilities.getWindowAncestor(table);
            DataSuppliers dataSuppliers = new DataSuppliers(parent, true);

            ActionSuppliersButton actionSuppliersButton = new ActionSuppliersButton();
            actionSuppliersButton.setNome(inputNome.getText());
            actionSuppliersButton.setEmail(inputEmail.getText());

            String telefoneSemFormatacao = inputTelefone.getText().replaceAll("[^0-9]", "");
            String cnpjSemFormatacao = inputCNPJ.getText().replaceAll("[^0-9]", "");
            String inscricaoEstadualSemFormatacao = inputInscricaoEstadual.getText().replaceAll("[^0-9]", "");
            String inscricaoMunicipalSemFormatacao = inputInscricaoMunicipal.getText().replaceAll("[^0-9]", "");
            
            if (telefoneSemFormatacao.length() != 11 || cnpjSemFormatacao.length() != 14 || inscricaoEstadualSemFormatacao.length() != 9 || inscricaoMunicipalSemFormatacao.length() != 8) {
                JOptionPane.showMessageDialog(null, "Telefone ou CPF com tamanho inválido!");
            } else {
                String telefoneFormatado = DataFormatting.formatPhoneNumber(telefoneSemFormatacao);
                String cnpjFormatado = DataFormatting.formatCNPJ(cnpjSemFormatacao);
                String inscricaoEstadualFormatado = DataFormatting.formatInscricaoEstadual(inscricaoEstadualSemFormatacao);
                String inscricaoMunicipalFormatado = DataFormatting.formatInscricaoMunicipal(inscricaoMunicipalSemFormatacao);

                actionSuppliersButton.setTelefone(telefoneFormatado);
                actionSuppliersButton.setCNPJ(cnpjFormatado);
                actionSuppliersButton.setInscricaoEstadual(inscricaoEstadualFormatado);
                actionSuppliersButton.setInscricaoMunicipal(inscricaoMunicipalFormatado);


                dataSuppliers.setLocationRelativeTo(null);
                dataSuppliers.exportarComponentes(actionSuppliersButton);
                dataSuppliers.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha na tabela para consultar.");
        }
    }//GEN-LAST:event_checkButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (table.getSelectedRow() != -1) {
            inputNome.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
            inputEmail.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
            inputTelefone.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
            inputCNPJ.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
            inputInscricaoEstadual.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
            inputInscricaoMunicipal.setText(table.getValueAt(table.getSelectedRow(), 5).toString());
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
    private javax.swing.JTextField inputCNPJ;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputInscricaoEstadual;
    private javax.swing.JTextField inputInscricaoMunicipal;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
