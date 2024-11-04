package entidade;

public class Atendente {
    private String nome;
    private int idAtendente;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdAtendente() {
        return idAtendente;
    }
    
    public void setIdAtendente(int idAtendente) {
        this.idAtendente = idAtendente;
    }
    
    public Patins consultaDisponibilidade(int numeroCalcado, Sistema sistema) {
        for (Patins patins : sistema.getPatinsDisponiveis()) {
            if (patins.getNumeroCalcado() == numeroCalcado && patins.getEstado().equals("disponível") && patins.getQuantidade() > 0) {
                return patins;
            }
        }
        return null;
    }
    
    public void registrarPatins(int idPatins, int numeroCalcado, String estado, int quantidade, float valorTotal, Sistema sistema) {
        boolean found = false;
        
        for (Patins patins : sistema.getPatinsDisponiveis()) {
            if (patins.getIdPatins() == idPatins) {
                patins.setEstado(estado);
                patins.setQuantidade(patins.getQuantidade() + quantidade); // atualiza a quantidade
                found = true;
                break;
            }
        }
        
        if (!found) {
            Patins novoPatins = new Patins(idPatins, estado, numeroCalcado, quantidade, valorTotal);
            sistema.getPatinsDisponiveis().add(novoPatins);
        }
    }
}
