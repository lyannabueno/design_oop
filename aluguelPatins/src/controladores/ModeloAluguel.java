package controladores;

import entidade.Aluguel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloAluguel extends AbstractTableModel {
    private ArrayList<Aluguel> alugueis;
    
    public ModeloAluguel() {
        alugueis = new ArrayList<>();
    }
    
    private static final int COLUNA_IDPATINS = 0;
    private static final int COLUNA_NUMEROCALCADO = 1;
    private static final int COLUNA_IDCLIENTE = 2;
    private static final int COLUNA_FORMAPAGAMENTO = 3;
    private static final int COLUNA_ESTADO = 4;
    
    private String[] colunas = new String[]{"IdPatins", "NumeroCalcado", "IdCliente", "FormaPagamento", "Estado"};

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
                return aluguel.getEscolhaPatins();
            case COLUNA_NUMEROCALCADO:
                return aluguel.getEscolhaPatins();
            case COLUNA_IDCLIENTE:
                return aluguel.getIdCliente();
            case COLUNA_FORMAPAGAMENTO:
                return aluguel.getFormaPagamento();
            case COLUNA_ESTADO:
                return aluguel.getEstado();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int row, int column){
        Aluguel aluguel = alugueis.get(row);
        Aluguel aluguelNovo = (Aluguel)aValue;

        switch(column){
            case COLUNA_IDPATINS:
                aluguel.setEscolhaPatins(aluguelNovo.getEscolhaPatins());           
            case COLUNA_NUMEROCALCADO:
                aluguel.setEscolhaPatins(aluguelNovo.getEscolhaPatins());            
            case COLUNA_IDCLIENTE:
                aluguel.setIdCliente(aluguelNovo.getIdCliente());            
            case COLUNA_FORMAPAGAMENTO:
                aluguel.setFormaPagamento(aluguelNovo.getFormaPagamento());            
            case COLUNA_ESTADO:
                aluguel.setEstado(aluguelNovo.getEstado());            
        }
    }
}
