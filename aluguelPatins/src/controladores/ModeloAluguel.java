package controladores;

import entidade.Aluguel;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloAluguel extends AbstractTableModel {
    private ArrayList<Aluguel> alugueis;
    
    public ModeloAluguel() {
        alugueis = new ArrayList<>();
    }
    
    private static final int COLUNA_IDALUGUEL = 0;
    private static final int COLUNA_DATAINICIO = 1;
    private static final int COLUNA_DATAFIM = 2;
    private static final int COLUNA_IDCLIENTE = 3;
    private static final int COLUNA_FORMAPAGAMENTO = 4;
    private static final int COLUNA_ESTADO = 5;
    private static final int COLUNA_IDPATINS = 6;
    
    private String[] colunas = new String[]{"IdAluguel", "DataInicio", "DataFim", "IdCliente", "FormaPagamento", "Estado", "IdPatins"};

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
            case COLUNA_IDALUGUEL:
                return aluguel.getIdAluguel();
            case COLUNA_DATAINICIO:
                return aluguel.getDataInicio();
            case COLUNA_DATAFIM:
                return aluguel.getDataFim();
            case COLUNA_IDCLIENTE:
                return aluguel.getIdCliente();
            case COLUNA_FORMAPAGAMENTO:
                return aluguel.getFormaPagamento();
            case COLUNA_ESTADO:
                return aluguel.getEstado();
            case COLUNA_IDPATINS:
                return aluguel.getEscolhaPatins();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int row, int column){
        Aluguel aluguel = alugueis.get(row);
        Aluguel aluguelNovo = (Aluguel)aValue;

        switch(column){
            case COLUNA_IDALUGUEL:
                aluguel.setIdAluguel(aluguelNovo.getIdAluguel());
            case COLUNA_DATAINICIO:
                aluguel.setDataInicio(aluguelNovo.getDataInicio());            
            case COLUNA_DATAFIM:
                aluguel.setDataFim(aluguelNovo.getDataFim());            
            case COLUNA_IDCLIENTE:
                aluguel.setIdCliente(aluguelNovo.getIdCliente());            
            case COLUNA_FORMAPAGAMENTO:
                aluguel.setFormaPagamento(aluguelNovo.getFormaPagamento());            
            case COLUNA_ESTADO:
                aluguel.setEstado(aluguelNovo.getEstado());            
            case COLUNA_IDPATINS:
                aluguel.setEscolhaPatins(aluguelNovo.getEscolhaPatins());            

        }
    }
}
