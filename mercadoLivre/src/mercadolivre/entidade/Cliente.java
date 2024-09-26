package mercadolivre.entidade;

public class Cliente extends Pessoa{
    private String cpf;
    
    public String obterCpf() {
        return cpf;
    }
    
    public void alterarCpf(String cpf) {
        this.cpf = cpf;
    }
}
