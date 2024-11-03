package entidade;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Patins> patinsDisponiveis = new ArrayList<>();;
    private ArrayList<Aluguel> alugueis = new ArrayList<>();;
    
    public ArrayList<Patins> getPatinsDisponiveis() {
        return patinsDisponiveis;
    }
    
    public boolean verificaDisponibilidade(int numeroCalcado) {
        for (Patins patins : patinsDisponiveis) {
            if (patins.getNumeroCalcado() == numeroCalcado && patins.getEstado().equals("disponível")) {
                return true;
            }
        }
        return false;
    }
    
    public void registraInicioAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }
    
    public void registraEncerramentoAluguel(Aluguel aluguel) {
        alugueis.remove(aluguel);
    }
    
    public Relatorio geraRelatorioCaixa() {
        Relatorio relatorio = new Relatorio();
        float total = 0;
        
        for (Aluguel aluguel : alugueis) {
            total += aluguel.getValorTotal();
        }
        
        relatorio.setTotalRecebido(total);
        return relatorio;
    }
}
