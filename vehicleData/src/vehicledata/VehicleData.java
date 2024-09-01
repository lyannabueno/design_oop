package vehicledata;

import java.util.Scanner;

public class VehicleData {

    public static void main(String[] args) {
        ReturnVehicleData vehicle = new ReturnVehicleData();
        // variável que faz referência ao objeto anterior = nova instância e seu método construtor
        String placa;
        int ano;
        float preco;
        
        Scanner entrada = new Scanner(System.in);
        
        do {    
            System.out.print("Digite a placa do seu carro: ");
            placa = entrada.next();
            
            if (placa.length() != 7) {
                System.out.println("\nQuantidade de caracteres inválidos!\n\nTente novamente!\n");
            }
            
        } while(placa.length() > 7);
        
        vehicle.alterarPlaca(placa.toUpperCase());
        
        do {
            System.out.print("Digite o ano do seu carro: ");
            ano = entrada.nextInt();
            
            if (String.valueOf(ano).length() != 4) {
                System.out.println("\nO ano deve ter 4 dígitos!\n");
            }
        } while(String.valueOf(ano).length() != 4);
        
        vehicle.alterarAno(ano);
        
        System.out.print("Digite o preço do seu carro: ");
        preco = entrada.nextFloat();
        vehicle.alterarPreco(preco);
        
        System.out.println("\nAs informações sobre seu carro são:\n\nPLACA: "+vehicle.obterPlaca()+" | ANO: "+vehicle.obterAno()+" | PREÇO: "+vehicle.obterPreco()+"\n");
    }
    
}
