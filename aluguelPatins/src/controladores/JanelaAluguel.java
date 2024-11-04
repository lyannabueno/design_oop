package controladores;

import java.text.ParseException;
import javax.swing.DefaultCellEditor;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import entidade.Sistema;
import entidade.Patins;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JanelaAluguel extends javax.swing.JFrame {

    private Sistema sistema;
    
    public JanelaAluguel(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        configurarMascaras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonConfirmar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePatinsAluguel = new javax.swing.JTable();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(buttonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
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
            int idPatins = (int) tablePatinsAluguel.getValueAt(linhaSelecionada, 0);

            if (!sistema.patinsCadastrados(idPatins)) {
                JOptionPane.showMessageDialog(this, "ID de Patins não encontrado no sistema.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Patins patins = sistema.getPatinsById(idPatins);
            if (patins == null || patins.getEstado().equalsIgnoreCase("indisponível")) {
                JOptionPane.showMessageDialog(this, "Patins ID " + idPatins + " não está disponível para aluguel.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int numeroCalcado = (int) tablePatinsAluguel.getValueAt(linhaSelecionada, 1);
            String estado = (String) tablePatinsAluguel.getValueAt(linhaSelecionada, 2);
            String cpfCliente = (String) tablePatinsAluguel.getValueAt(linhaSelecionada, 3);
            String telefoneCliente = (String) tablePatinsAluguel.getValueAt(linhaSelecionada, 4);
            String pagamento = (String) tablePatinsAluguel.getValueAt(linhaSelecionada, 5);
            float valorTotal = (float) tablePatinsAluguel.getValueAt(linhaSelecionada, 6);
            
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

            tablePatinsAluguel.setValueAt(true, linhaSelecionada, 0); // define um valor que indica que a linha foi confirmada
            tablePatinsAluguel.repaint(); // atualiza a tabela
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um patins para alugar.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonConfirmarActionPerformed

    private void configurarMascaras() {
        try {
            MaskFormatter cpfMask = new MaskFormatter("###.###.###-##");
            MaskFormatter telefoneMask = new MaskFormatter("(##) #####-####");

            tablePatinsAluguel.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(new JFormattedTextField(cpfMask)));
            tablePatinsAluguel.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(new JFormattedTextField(telefoneMask)));
        } catch (ParseException e) { // exceção para caso a máscara seja aplicada de forma errada
            e.printStackTrace(); // mostra o caminho de execução do programa no momento em que a exceção ocorreu, ajudando a identificar onde o erro aconteceu no código
        }
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablePatinsAluguel;
    // End of variables declaration//GEN-END:variables
}
