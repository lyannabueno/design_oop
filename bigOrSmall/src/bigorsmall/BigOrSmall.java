package bigorsmall;

import java.util.Scanner;

public class BigOrSmall {

    public static final int NUMBER_COUNT = 4;
    
    public static void main(String[] args) {
        int numbers[] = new int[NUMBER_COUNT];
        int largest, smallest;
        int sum;
        float average;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the 1st number: ");
        numbers[0] = input.nextInt();
        
        largest = numbers[0];
        smallest = numbers[0];
        sum = numbers[0];
        
        // initializing with the first entered number
        
        for (int i = 1; i < NUMBER_COUNT; i++) {
            System.out.print("Enter the " + (i + 1) + "th number: ");
            numbers[i] = input.nextInt();
            
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            
            sum += numbers[i];
        }
        
        average = sum / NUMBER_COUNT;
        
        System.out.printf("\nThe largest number entered is %d\n\n", largest);
        System.out.printf("The smallest number entered is %d\n\n", smallest);
        System.out.printf("The average of the numbers is %.2f\n\n", average);
    }
    
}
