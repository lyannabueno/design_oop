package mercadolivre.entidade;

public class Produto {
    private int id, quantidadeEstoque;
    private String nome, unidade;
    private float preco;
    private ItemVenda itemVenda;
    
    public int obterId() {
        return id;
    }
    
    public void alterarId(int id) {
        this.id = id;
    }
    
    
    public String obterNome() {
        return nome;
    }
    
    public void alterarNome(String nome) {
        this.nome = nome;
    }
    
    
    public String obterUnidade() {
        return unidade;
    }
    
    public void alterarUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    
    public int obterQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    
    public void alterarQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    
    public float obterPreco() {
        return preco;
    }
    
    public void alterarPreco(float preco) {
        this.preco = preco;
    }
}
