package mercadolivre.controladores;

import java.util.ArrayList;
import mercadolivre.entidade.Venda;

public class ControladorVenda {
    ArrayList<Venda> vendas;
    
    public ControladorVenda() {
        vendas = new ArrayList<>();
    }
    
    public void incluir(Venda venda) {
        this.vendas.add(venda);
    }
}
