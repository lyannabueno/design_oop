package controladores;

import entidade.Aluguel;
import java.util.ArrayList;
import java.util.List;

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
    
    public List<Aluguel> getAlugueis() {
        return new ArrayList<>(alugueis); // retorna uma nova lista para evitar modificações externas
    }
}
