package mercadolivre.entidade;

public class ItemVenda {
    private int numero, idProduto, quantidade;
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
        return quantidade;
    }
    
    public void alterarQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
    
    public void alterarProduto() {
        
}
