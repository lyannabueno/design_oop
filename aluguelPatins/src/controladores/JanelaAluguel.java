package controladores;

import entidade.DataFormart;
import javax.swing.JOptionPane;

import entidade.Sistema;
import entidade.Patins;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

// métodos importados para salvar as infromações como CPF e telefone digitadas na tabela
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

public class JanelaAluguel extends javax.swing.JFrame {

    private Sistema sistema;
    private DefaultTableModel tableModel;
    private List<Integer> linhasConfirmadas;
    
    public JanelaAluguel(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        tableModel = (DefaultTableModel) tablePatinsAluguel.getModel();
        linhasConfirmadas = new ArrayList<>();
        tablePatinsAluguel = new JTable();
        DataFormart.configurarMascaras(tablePatinsAluguel);
        DataFormart.configurarEstado(tablePatinsAluguel);
        DataFormart.configurarPagamento(tablePatinsAluguel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonConfirmar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePatinsAluguel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonConfirmar.setText("Confirmar");
        buttonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        tablePatinsAluguel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Patins", "Calçado", "Estado", "CPF Cliente", "Telefone", "Pagamento", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablePatinsAluguel);

        jLabel1.setText("Obs: antes de confirmar o aluguel, clique na linha novamente");

        jLabel2.setText("Obs: para guardar as informações do aluguel na hora da devolução, deixe essa janela aberta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmarActionPerformed
        int linhaSelecionada = tablePatinsAluguel.getSelectedRow();

        if (linhaSelecionada != -1) {
            if (!linhasConfirmadas.contains(linhaSelecionada)) {

                int idPatins = (int) tableModel.getValueAt(linhaSelecionada, 0);

                if (!sistema.patinsCadastrados(idPatins)) {
                    JOptionPane.showMessageDialog(this, "ID de Patins não encontrado no sistema.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Patins patins = sistema.getPatinsById(idPatins);
                if (patins == null || patins.getEstado().equalsIgnoreCase("indisponível")) {
                    JOptionPane.showMessageDialog(this, "Patins ID " + idPatins + " não está disponível para aluguel.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int numeroCalcado = (int) tableModel.getValueAt(linhaSelecionada, 1);
                String estado = (String) tableModel.getValueAt(linhaSelecionada, 2);
                String cpfCliente = (String) tableModel.getValueAt(linhaSelecionada, 3);
                String telefoneCliente = (String) tableModel.getValueAt(linhaSelecionada, 4);
                String pagamento = (String) tableModel.getValueAt(linhaSelecionada, 5);
                float valorTotal = (float) tableModel.getValueAt(linhaSelecionada, 6);

                if (numeroCalcado != patins.getNumeroCalcado()) {
                    JOptionPane.showMessageDialog(this, "Número do calçado informado não corresponde ao registrado no sistema.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (Float.compare(valorTotal, patins.getValorTotal()) != 0) {
                    JOptionPane.showMessageDialog(this, "Valor total informado não corresponde ao registrado no sistema.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!estado.equalsIgnoreCase(patins.getEstado())) {
                    JOptionPane.showMessageDialog(this, "Estado do patins informado não corresponde ao estado registrado no sistema.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                JOptionPane.showMessageDialog(this, "Aluguel confirmado para o Patins ID: " + idPatins, "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                                
                DefaultTableModel modeloAntigo = (DefaultTableModel) tablePatinsAluguel.getModel();
                int rowCount = modeloAntigo.getRowCount();
                int columnCount = modeloAntigo.getColumnCount();

                // armazena os dados atuais
                Object[][] data = new Object[rowCount][columnCount];
                for (int i = 0; i < rowCount; i++) {
                    for (int j = 0; j < columnCount; j++) {
                        data[i][j] = modeloAntigo.getValueAt(i, j);
                    }
                }
                
                String[] columnNames = { "ID", "Número", "Estado", "CPF", "Telefone", "Pagamento", "Valor" };
                
                DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return !linhasConfirmadas.contains(row);  // torna a linha não editável se estiver confirmada
                    }
                };
                
                tablePatinsAluguel.setModel(tableModel);

                linhasConfirmadas.add(linhaSelecionada);
                
                salvarDadosEmArquivo(idPatins, numeroCalcado, estado, cpfCliente, telefoneCliente, valorTotal);

                tableModel.addRow(new Object[tableModel.getColumnCount()]); // adiciona uma linha vazia após cada registro
            } else {
                JOptionPane.showMessageDialog(this, "Esta linha já foi confirmada. Selecione outra linha para alugar.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonConfirmarActionPerformed
  
    public String salvarDadosEmArquivo(int idPatins, int numeroCalcado, String estado, String cpfCliente, String telefoneCliente, float valorTotal) {
        FileWriter fw = null;
        
        try {
            fw = new FileWriter("AluguelClientes.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("ID: " + idPatins);
            pw.println("Número Calçado: " + numeroCalcado);
            pw.println("Estado: " + estado);
            pw.println("CPF: " + cpfCliente);
            pw.println("Telefone: " + telefoneCliente);
            pw.println("Valor total: " + valorTotal);
            pw.flush(); // envia os dados
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(JanelaAluguel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(JanelaAluguel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return null; 
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sistema sistema = new Sistema();
                new JanelaAluguel(sistema).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablePatinsAluguel;
    // End of variables declaration//GEN-END:variables
}
