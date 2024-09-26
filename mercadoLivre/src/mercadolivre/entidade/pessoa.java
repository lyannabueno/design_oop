package mercadolivre.entidade;

public class pessoa {
    private int id;
    private String nome;
    
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
}
