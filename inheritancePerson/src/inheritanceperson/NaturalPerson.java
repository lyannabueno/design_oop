package inheritanceperson;

public class NaturalPerson extends Person {
    private String cpf;
    
    public String getCPF() {
        return cpf;
    }
    
    public void updateCPF(String cpf) {
        this.cpf = cpf;
    }
}
