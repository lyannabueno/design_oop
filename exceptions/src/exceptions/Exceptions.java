package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int resultado;
        boolean continua = true;
        
        do{
            try {
                System.out.print("Digite o primeiro numero: ");
                numero1 = scanner.nextInt();
                System.out.print("Digite o segundo numero: ");
                numero2 = scanner.nextInt();
                resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
                continua = false;
            } catch (InputMismatchException excecao) {
                System.err.println(excecao.getMessage()); // mensagem de erro técnica
                scanner.nextLine(); // limpa a entrada inválida do scanner e permitir que o usuário insira outro valor corretamente
                System.out.println("Informe apenas numeros inteiros"); // mensagem de erro amigável
            } catch (ArithmeticException excecao) {
                System.err.println(excecao.getMessage());
                System.out.println("Zero não é um denominador válido");
            }
        } while (continua);
    }
    
}
