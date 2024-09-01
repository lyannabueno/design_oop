package vehicledata;

public class ReturnVehicleData {
    private String placa;
    private int ano;
    private float preco;
    
    public String obterPlaca() {
        return placa;
    }
    
    public int obterAno() {
        return ano;
    }
    
    public float obterPreco() {
        return preco;
    }
    
    public void alterarPlaca(String placa) {
        this.placa = placa;
    }
    
    public void alterarAno(int ano) {
        this.ano = ano;
    }
    
    public void alterarPreco(float preco) {
        this.preco = preco;
    }
}
