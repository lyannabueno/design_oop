package controladores;

import entidade.Aluguel;
import entidade.Cliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloAluguel extends AbstractTableModel {
    private ArrayList<Aluguel> alugueis;
    
    public ModeloAluguel() {
        alugueis = new ArrayList<>();
    }
    
    private static final int COLUNA_IDPATINS = 0;
    private static final int COLUNA_NUMEROCALCADO = 1;
    private static final int COLUNA_ESTADO = 2;
    private static final int COLUNA_CPF = 3;
    private static final int COLUNA_TELEFONE = 4;
    private static final int COLUNA_FORMAPAGAMENTO = 5;
    private static final int COLUNA_VALORTOTAL = 6;
    
    private String[] colunas = new String[]{"IdPatins", "NumeroCalcado", "Estado", "CPF", "Telefone", "FormaPagamento", "ValorTotal"};

    @Override
    public int getColumnCount(){
        return colunas.length;
    }

    @Override
    public int getRowCount(){
        return alugueis.size();
    }

    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }

    @Override
    public Object getValueAt(int row, int col){
        Aluguel aluguel = alugueis.get(row);
        switch(col){
            case COLUNA_IDPATINS:
                return aluguel.getEscolhaPatins().getIdPatins();
            case COLUNA_NUMEROCALCADO:
                return aluguel.getEscolhaPatins().getNumeroCalcado();
            case COLUNA_ESTADO:
                return aluguel.getEstado();
            case COLUNA_CPF:
                return aluguel.getIdCliente().getCPF();
            case COLUNA_TELEFONE:
                return aluguel.getIdCliente().getTelefone();
            case COLUNA_FORMAPAGAMENTO:
                return aluguel.getFormaPagamento();
            case COLUNA_VALORTOTAL:
                return aluguel.getValorTotal();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int row, int column){
        if (aValue instanceof Aluguel) {

            Aluguel aluguel = alugueis.get(row);
            Aluguel aluguelNovo = (Aluguel)aValue;

            switch (column) {
                case COLUNA_IDPATINS:
                    aluguel.setEscolhaPatins(aluguelNovo.getEscolhaPatins());
                    break;
                case COLUNA_NUMEROCALCADO:
                    if (aluguel.getEscolhaPatins() != null) {
                        aluguel.getEscolhaPatins().setNumeroCalcado(aluguelNovo.getEscolhaPatins().getNumeroCalcado());
                    }
                    break;
                case COLUNA_ESTADO:
                    aluguel.setEstado(aluguelNovo.getEstado());
                    break;
                case COLUNA_CPF:
                    Cliente clienteNovo = aluguelNovo.getIdCliente();
                    if (clienteNovo != null) {
                        aluguel.setIdCliente(clienteNovo);
                    }
                    break;
                case COLUNA_TELEFONE:
                    if (aluguel.getIdCliente() != null) {
                        aluguel.getIdCliente().setTelefone(aluguelNovo.getIdCliente().getTelefone());
                    }
                    break;
                case COLUNA_FORMAPAGAMENTO:
                    aluguel.setFormaPagamento(aluguelNovo.getFormaPagamento());
                    break;
                case COLUNA_VALORTOTAL:
                    aluguel.setValorTotal(aluguelNovo.getValorTotal());
                    break;
            }
            fireTableCellUpdated(row, column);
        }
    }
}
