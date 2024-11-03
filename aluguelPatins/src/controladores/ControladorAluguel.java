package controladores;

import entidade.Aluguel;
import java.util.ArrayList;

public class ControladorAluguel {
    private ArrayList<Aluguel> alugueis;
    
    public ControladorAluguel() {
        alugueis = new ArrayList<>();
    }
    
    public void registraAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }
    
    public void encerraAluguel(Aluguel aluguel) {
        alugueis.remove(aluguel);
    }
}
