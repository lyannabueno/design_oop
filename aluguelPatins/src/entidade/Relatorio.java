package entidade;

public class Relatorio {
    private float totalRecebido;
    
    public float getTotalRecebido() {
        return totalRecebido;
    }

    public void setTotalRecebido(float totalRecebido) {
        this.totalRecebido = totalRecebido;
    }
    
    public void verificarRelatorio() {
        if (totalRecebido > 0) {
            System.out.println("O relatório foi verificado: Total recebido é positivo.");
        } else if (totalRecebido == 0) {
            System.out.println("O relatório foi verificado: Nenhum valor foi recebido.");
        } else {
            System.out.println("Aviso: O relatório apresenta um valor total negativo.");
        }
    }
    
    public void enviarRelatorio() {
        System.out.println("Relatório gerado: Total recebido = " + totalRecebido);
    }
}
