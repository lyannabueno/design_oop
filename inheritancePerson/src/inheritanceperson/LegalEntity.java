package inheritanceperson;

public class LegalEntity extends Person {
    private String cnpj;
    
    public String getCNPJ() {
        return cnpj;
    }
    
    public void updateCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
}
