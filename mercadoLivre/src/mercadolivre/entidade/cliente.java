package mercadolivre.entidade;

public class cliente extends pessoa{
    private String cpf;
    
    public String obterCpf() {
        return cpf;
    }
    
    public void alterarCpf(String cpf) {
        this.cpf = cpf;
    }
}
