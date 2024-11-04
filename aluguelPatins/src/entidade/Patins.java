package entidade;

public class Patins {
    private int idPatins, numeroCalcado, quantidade;
    private String estado;
    private float valorTotal;
    
    public Patins(int idPatins, String estado, int numeroCalcado, int quantidade, float valorTotal) {
        this.idPatins = idPatins;
        this.estado = estado;
        this.numeroCalcado = numeroCalcado;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }
    
    public int getIdPatins() {
        return idPatins;
    }
    
    public void seIdPatins(int idPatins) {
        this.idPatins = idPatins;
    }
    
    public int getNumeroCalcado() {
        return numeroCalcado;
    }
    
    public void setNumeroCalcado(int numeroCalcado) {
        this.numeroCalcado = numeroCalcado;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public float getValorTotal() {
        return valorTotal;
    }
    
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
 }
