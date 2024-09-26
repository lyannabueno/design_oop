package mercadolivre.entidade;

public class ItemVenda {
    private int numero, idProduto, quantidadeEstoque;
    private float preco, total;
    private Produto produto;
    
    public int obterNumero() {
        return numero;
    }
    
    public void alterarNumero(int numero) {
        this.numero = numero;
    }
    
    
    public int obterIdProduto() {
        return idProduto;
    }
    
    
    public int obterQuantidade() {
        return quantidadeEstoque;
    }
    
    public void alterarQuantidade(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    
    public float obterPreco() {
        return preco;
    }
    
    public void alterarPreco(float preco) {
        this.preco = preco;
    }
    
    
    public float obterTotal() {
        return total;
    }
    
    
    public Produto obterProduto() {
        return produto;
    }
    
    public void alterarProduto(Produto produto) {
        this.produto = produto;
    }
}
