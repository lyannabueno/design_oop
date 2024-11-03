package entidade;

public class Cliente extends Pessoa {
    private String cpf;
    
    public String getCPF() {
        return cpf;
    }
    
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
}