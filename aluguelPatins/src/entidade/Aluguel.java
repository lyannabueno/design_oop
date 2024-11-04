package entidade;

import java.util.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Aluguel {
    private int idAluguel;
    private Time horaInicio, horaFim;
    private Date dataInicio, dataFim;
    private Cliente idCliete;
    private Patins escolhaPatins;
    private float valorTotal;
    private String formaPagamento, estado;
    
    private ArrayList<Patins> patins;
    
    public Aluguel() {
        patins = new ArrayList<>();
    }
    
    public int getIdAluguel() {
        return idAluguel;
    }
    
    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }
    
    public Time getHoraInicio() {
        return horaInicio;
    }
    
    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }
    
    public Time getHoraFim() {
        return horaFim;
    }
    
    public void setHoraFim(Time horaFim) {
        this.horaFim = horaFim;
    }
    
    public Date getDataInicio() {
        return dataInicio;
    }
    
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    public Date getDataFim() {
        return dataFim;
    }
    
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    
    public Cliente getIdCliente() {
        return idCliete;
    }
    
    public void setIdCliente(Cliente idCliente) {
        this.idCliete = idCliente;
    }
    
    public Patins getEscolhaPatins() {
        return escolhaPatins;
    }
    
    public void setEscolhaPatins(Patins escolhaPatins) {
        this.escolhaPatins = escolhaPatins;
    }
    
    public float getValorTotal() {
        return valorTotal;
    }
    
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public String getFormaPagamento() {
        return formaPagamento;
    }
            
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    public String getEstado() {
        return estado;
    }
            
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
