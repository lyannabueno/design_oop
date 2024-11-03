package aluguelpatins;

import controladores.JanelaInicial;
import entidade.Atendente;
import entidade.Patins;
import entidade.Sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controladores.JanelaPrincipal;
import java.util.InputMismatchException;

public class AluguelPatins {

    public static void main(String[] args) {
        JanelaInicial dialog = new JanelaInicial(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        
        Sistema sistema = new Sistema();
        Atendente atendente = new Atendente();
        
        String inputIdPatins; // tratada como string, porque o usuário pode digitar o id ou a palavra 'sair'
        int idPatins, numeroCalcado, quantidade;
        String estado;
        
        Scanner entrada = new Scanner(System.in);
        List<Integer> idsCadastrados = new ArrayList<>(); // lista para armazenar os IDs cadastrados
        
        System.out.println("Bem-vindo ao sistema de aluguel de patins!");

        while (true) {
            try {
                System.out.println("\nDigite os dados do novo patins ou 'sair' para encerrar:");

                System.out.print("\nID do Patins: ");
                inputIdPatins = entrada.next();

                if (inputIdPatins.equalsIgnoreCase("sair")) { // compara uma string sem fazer diferenciação de maiúsculo e minúsculo
                    break;
                } 

                try {
                    idPatins = Integer.parseInt(inputIdPatins);
                    
                    if (idsCadastrados.contains(idPatins)) {
                        System.out.print("\nID já cadastrado... gostaria de EDITAR ou REGISTRAR um novo? ");
                        String opcaoIdPatins = entrada.next().toLowerCase();
                        
                        if (opcaoIdPatins.equals("editar")) {
                            Patins patinsParaEditar = encontrarPatinsPorId(sistema, idPatins);
                            if (patinsParaEditar != null) {
                                editarPatins(entrada, patinsParaEditar);
                                System.out.println("\nPatins atualizado com sucesso!\n");
                            } else {
                                System.out.println("\nErro: Patins com ID " + idPatins + " não encontrado.\n");
                            }
                            continue;
                        } else if (opcaoIdPatins.equals("novo")) {
                            System.out.println("\nInforme um novo ID.\n");
                            continue;
                        } else {
                            System.out.println("\nOpção inválida. Por favor, digite 'editar' ou 'novo'.\n");
                            continue;
                        }
                    } else {
                        idsCadastrados.add(idPatins);
                    }
                    
                } catch (NumberFormatException e) { // verificação de erro para caso a string não esteja no formato apropriado
                    System.out.println("\nID inválido. Por favor, digite um número inteiro.");
                    continue;
                }

                numeroCalcado = solicitarNumeroCalçado(entrada);
                estado = solicitarEstado(entrada);
                quantidade = solicitarQuantidade(entrada, estado);

                if (quantidade > 0) {
                    atendente.registrarPatins(idPatins, numeroCalcado, estado, sistema, quantidade);
                    System.out.println("\nPatins registrado com sucesso!");
                } else {
                    System.out.println("\nA quantidade deve ser maior que zero.\n");
                    continue;
                }

                exibirPatinsDisponiveis(sistema);
            } catch (Exception e) {
                System.out.println("\nOcorreu um erro inesperado: " + e.getMessage());
            }
        }

        System.out.println("\nEncerrando o sistema de registro de patins.");
        entrada.close();
        
        JanelaPrincipal janela = new JanelaPrincipal();
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    private static Patins encontrarPatinsPorId(Sistema sistema, int idPatins) {
        for (Patins patins : sistema.getPatinsDisponiveis()) { // encontra o patins pelo ID no sistema
            if (patins.getIdPatins() == idPatins) {
                return patins;
            }
        }
        return null;
    }

    private static void editarPatins(Scanner entrada, Patins patinsParaEditar) {
        int numeroCalcado = solicitarNumeroCalçado(entrada);
        String estado = solicitarEstado(entrada);
        int quantidade = solicitarQuantidade(entrada, estado);

        patinsParaEditar.setNumeroCalcado(numeroCalcado);
        patinsParaEditar.setEstado(estado);
        patinsParaEditar.setQuantidade(quantidade);
    }

    private static int solicitarNumeroCalçado(Scanner entrada) {
        int numeroCalcado;
        
        while (true) {
            try {
                System.out.print("Número do Calçado: ");
                numeroCalcado = entrada.nextInt();
                return numeroCalcado;
            } catch (InputMismatchException e) {
                System.out.println("\nNúmero do calçado inválido. Por favor, digite um número inteiro.\n");
                entrada.nextLine();
            }
        }
    }

    private static String solicitarEstado(Scanner entrada) {
        String estado;
        while (true) {
            System.out.print("Estado (disponível/indisponível/danificado): ");
            estado = entrada.next();
            if (estado.equalsIgnoreCase("disponível") || estado.equalsIgnoreCase("indisponível") || estado.equalsIgnoreCase("danificado")) {
                return estado;
            } else {
                System.out.println("\nEntrada inválida. Por favor, insira 'disponível', 'indisponível' ou 'danificado'.\n");
            }
        }
    }

    private static int solicitarQuantidade(Scanner entrada, String estado) {
        int quantidade;
        
        while (true) {
            try {
                System.out.print("Quantidade: ");
                quantidade = entrada.nextInt();
                
                if (quantidade <= 0 && estado.equalsIgnoreCase("disponível")) {
                    System.out.println("\nSe o estado do patins é DISPONÍVEL, sua quantidade não pode ser menor ou igual a 0!\n");
                } else if (quantidade > 0 && estado.equalsIgnoreCase("indisponível")) {
                    System.out.println("\nSe o estado do patins é INDISPONÍVEL, sua quantidade não pode ser maior que 0!\n");
                } else {
                    return quantidade;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nQuantidade inválida. Por favor, digite um número inteiro.\n");
                entrada.nextLine();
            }
        }
    }

    private static void exibirPatinsDisponiveis(Sistema sistema) {
        System.out.println("\nPatins disponíveis:");
        for (Patins patins : sistema.getPatinsDisponiveis()) {
            System.out.println("\nID: " + patins.getIdPatins() + ", Número: " + patins.getNumeroCalcado() + ", Estado: " + patins.getEstado() + ", Quantidade: " + patins.getQuantidade());
        }
    }
}
