package suppliersandclients;

public class ActionClientsButton {
    protected String nome, email;
    protected int telefone, cpf;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    public int getTelefone() {
        return telefone;
    }
    
    
    public void setCPF(int cpf) {
        this.cpf = cpf;
    }
    
    public int getCPF() {
        return cpf;
    }
}
