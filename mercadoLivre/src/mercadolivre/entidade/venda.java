package mercadolivre.entidade;

import java.sql.Time;
import java.util.Date;

public class venda {
    private int id, idCliente;
    private Date data;
    private Time hora;
    
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
    
    public int idCliente() {
        return idCliente;
    }
    
    public void alterarCliente(Date data) {
        this.data = data;
    }
}
