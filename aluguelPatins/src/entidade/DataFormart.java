package entidade;

import java.text.ParseException;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.text.MaskFormatter;

public class DataFormart {
    public static void configurarMascaras(JTable tablePatinsAluguel) {
        try {
            MaskFormatter cpfMask = new MaskFormatter("###.###.###-##");
            MaskFormatter telefoneMask = new MaskFormatter("(##) #####-####");

            tablePatinsAluguel.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(new JFormattedTextField(cpfMask)));
            tablePatinsAluguel.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(new JFormattedTextField(telefoneMask)));
        } catch (ParseException e) { // exceção para caso a máscara seja aplicada de forma errada
            e.printStackTrace(); // mostra o caminho de execução do programa no momento em que a exceção ocorreu, ajudando a identificar onde o erro aconteceu no código
        }
    }
    
    public static void configurarPagamento(JTable tablePatinsAluguel) {
        JComboBox<String> pagamentoComboBox = new JComboBox<>();
        pagamentoComboBox.addItem("crédito");
        pagamentoComboBox.addItem("débito");
        pagamentoComboBox.addItem("pix");
        pagamentoComboBox.addItem("boleto");
        tablePatinsAluguel.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(pagamentoComboBox));
    }
    
    public static void configurarEstado(JTable tablePatinsAluguel) {
        JComboBox<String> estadoComboBox = new JComboBox<>();
        estadoComboBox.addItem("disponível");
        estadoComboBox.addItem("indisponível");
        estadoComboBox.addItem("danificado");
        tablePatinsAluguel.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(estadoComboBox));
    }
}
