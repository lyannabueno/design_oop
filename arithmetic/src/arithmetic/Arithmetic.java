package arithmetic;

import java.util.Scanner;

public class Arithmetic {

    static Scanner input = new Scanner(System.in);
    
    static int num1, num2, option;
    static int add, subtract, multiply, divide;
    // these are static because they need to be accessed by multiple methods within the class

    public static void getNumbers() {
        System.out.print("\nEnter the 1st number: ");
        num1 = input.nextInt();
        
        System.out.print("\nEnter the 2nd number: ");
        num2 = input.nextInt();
    }
    
    public static void getArithmeticOption() {
        System.out.print("\n[1] ADD\n[2] SUBTRACT\n[3] MULTIPLY\n[4] DIVIDE\n[5] CHANGE NUMBERS\n[6] EXIT\n\nWhich arithmetic operation would you like to perform? ");
        option = input.nextInt();
    }
    
    public static void performArithmetic() {         
        while (option != 6) {
            getArithmeticOption();
            
            switch (option) {
                case 1 -> {
                    add = num1 + num2;
                    System.out.printf("\nThe result of the addition is %d\n", add);
                }

                case 2 -> {
                    if (num1 > num2) {
                        subtract = num1 - num2;
                        System.out.printf("\nThe result of the subtraction is %d\n", subtract);
                    } else {
                        subtract = num2 - num1;
                        System.out.printf("\nThe result of the subtraction is %d\n", subtract);
                    }
                }

                case 3 -> {
                    multiply = num1 * num2;
                    System.out.printf("\nThe result of the multiplication is %d\n", multiply);
                }

                case 4 -> {
                    if (num1 > num2) {
                        divide = num1 / num2;
                        System.out.printf("\nThe result of the division is %d\n", divide);
                    } else if (num1 == 0 || num2 == 0) {
                        System.out.println("\nThe result of the division is 0\n");
                    } else {
                        divide = num2 / num1;
                        System.out.printf("\nThe result of the division is %d\n", divide);
                    }
                }
                
                case 5 -> {
                    getNumbers();
                }
                
                case 6 -> {
                    System.out.print("\nProgram terminated!\n");
                    return;
                }

                default -> System.out.print("\nInvalid option!");
            }
        }
    }
    
    public static void main(String[] args) {
        getNumbers();
        performArithmetic();
    }
    
}