package mercadolivre.controladores;

import java.util.ArrayList;
import mercadolivre.entidade.Produto;

public class ControladorProduto {
    ArrayList<Produto> produtos;
    
    public ControladorProduto() {
        produtos = new ArrayList<>();  // construtor para inicializar o Produto
    }
    
    public Produto localizar(int id) {
        for (Produto produto : produtos)  { // for each (tipo do elemento elemento : coleção)
            if (produto.obterId() == id) {
                return produto;
            }
        }
        
        return null;
    }
}
