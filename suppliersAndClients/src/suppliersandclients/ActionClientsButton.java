package suppliersandclients;

public class ActionClientsButton {
    protected String nome, email, telefone;
    private String cpf;
    
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
    
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCPF() {
        return cpf;
    }
}
