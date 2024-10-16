package mercadolivre.entidade;

import java.sql.Time;
import java.util.Date;
import java.util.ArrayList;

public class Venda {
    private int id, idCliente;
    private Date data;
    private Time hora;
    private Cliente cliente;
    
    private ArrayList<ItemVenda> itens;
    
    public Venda() {
        itens = new ArrayList<>();
    }
     
    public int obterId() {
        return id;
    }
    
    public void alterarId(int id) {
        this.id = id;
    }
    
    
    public Time obterHora() {
        return hora;
    }
    
    public void alterarHora(Time hora) {
        this.hora = hora;
    }
    
    
    public Date obterData() {
        return data;
    }
    
    public void alterarData(Date data) {
        this.data = data;
    }
    
    
    public int obterIdCliente() {
        return idCliente;
    }
    
    
    public Cliente obterCliente() {
        return cliente;
    }
    
    public void alterarCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    public void incluirItem(ItemVenda itemVenda) {
        this.itens.add(itemVenda);
    }
    
}
