package entidade;

public class Pessoa {
    private int id, numeroCalcado;
    private String nome;
    
    public int getId() { 
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() { 
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getNumeroCalcado() { 
        return numeroCalcado;
    }
    
    public void setNumeroCalcado(int numeroCalcado) {
        this.numeroCalcado = numeroCalcado;
    }
}
