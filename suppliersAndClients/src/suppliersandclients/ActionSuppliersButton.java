package suppliersandclients;

public class ActionSuppliersButton extends ActionClientsButton {
    protected String cnpj, inscricaoEstadual, inscricaoMunicipal;
    
    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getCNPJ() {
        return cnpj;
    }
    
    
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    
    
    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }
    
    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }
}
