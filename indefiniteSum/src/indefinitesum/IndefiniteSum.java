package indefinitesum;

import java.util.Scanner;

public class IndefiniteSum {

    public static void main(String[] args) {
        int totalQuantity, sum = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many numbers do you want to enter? ");
        totalQuantity = input.nextInt();
        
        System.out.println("");
        
        int[] numArray = new int[totalQuantity];
        
        for (int i = 0; i < totalQuantity; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numArray[i] = input.nextInt();
            sum += numArray[i];
        }
        
        System.out.printf("\nThe numbers entered are: ");
        for (int i = 0; i < totalQuantity; i++) {
            System.out.print(numArray[i]);
            if (i < totalQuantity - 1) {
                System.out.print(", ");
            }
        }
        
        System.out.println("\nTheir sum is: " + sum + "\n");

    }
    
}
