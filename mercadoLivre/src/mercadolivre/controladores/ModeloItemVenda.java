package mercadolivre.controladores;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import mercadolivre.entidade.ItemVenda;

public class ModeloItemVenda extends AbstractTableModel {
    private ArrayList<ItemVenda> itens;
    
    public ModeloItemVenda() {
        itens = new ArrayList<>();
    }
    
    private static final int COLUNA_NUMERO = 0;
    private static final int COLUNA_IDPRODUTO = 1;
    private static final int COLUNA_QUANTIDADE = 2;
    private static final int COLUNA_PRECO = 3;
    private static final int COLUNA_TOTAL = 4;
    private String[] colunas = new String[]{"Número", "IdProduto", "Quantidade", "Preço", "Total"};

    @Override
    public int getColumnCount(){
        return colunas.length;
    }

    @Override
    public int getRowCount(){
        return itens.size();
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
        ItemVenda itemVenda = itens.get(row);
        switch(col){
            case COLUNA_NUMERO:
                return itemVenda.obterNumero();
            case COLUNA_IDPRODUTO:
                return itemVenda.obterIdProduto();
            case COLUNA_QUANTIDADE:
                return itemVenda.obterQuantidade();
            case COLUNA_PRECO:
                return itemVenda.obterPreco();
            case COLUNA_TOTAL:
                return itemVenda.obterTotal();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int row, int column){
    ItemVenda itemVenda = itens.get(row);

    switch(column){
        case COLUNA_NUMERO:
            itemVenda.alterarNumero(Integer.parseInt(aValue.toString()));
            break;
        case COLUNA_IDPRODUTO:
            itemVenda.alterarProduto(aValue.toString());
            break;
        case COLUNA_QUANTIDADE:
            itemVenda.alterarQuantidade(Integer.parseInt(aValue.toString()));
            break;
        case COLUNA_PRECO:
            itemVenda.alterarPreco(Float.parseFloat(aValue.toString()));
            break;
        }
    }
}
