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

    public boolean patinsCadastrados(int idPatins) {
        return patinsDisponiveis.stream().anyMatch(p -> p.getIdPatins() == idPatins);
    }
    
    public Patins getPatinsById(int idPatins) {
        for (Patins patins : this.patinsDisponiveis) { // considerando que 'patinsDisponiveis' é a lista de patins disponíveis
            if (patins.getIdPatins() == idPatins) {
                return patins;
            }
        }
        return null;
    }
}
