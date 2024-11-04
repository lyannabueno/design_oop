package entidade;

public class Cliente extends Pessoa {
    private String cpf, telefone;
    
    public Cliente(String cpf, String telefone) {
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public String getCPF() {
        return cpf;
    }
    
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}