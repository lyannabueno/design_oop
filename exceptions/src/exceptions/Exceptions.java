package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1;
        int number2;
        int result;
        boolean keepGoing = true;
        
        // when an exception is not caught with a try...catch block, it is caught by the JVM
        
        do {
            try {
                System.out.print("Enter the first number: ");
                number1 = scanner.nextInt();
                System.out.print("Enter the second number: ");
                number2 = scanner.nextInt();
                result = number1 / number2;
                System.out.println("Result: " + result);
                keepGoing = false;
            } catch (InputMismatchException exception) {
                System.err.println(exception.getMessage()); // technical error message
                scanner.nextLine(); // clears the invalid input from the scanner and allows the user to enter a valid value
                System.out.println("Please enter only integer numbers"); // user-friendly error message
            } catch (ArithmeticException exception) {
                System.err.println(exception.getMessage());
                System.out.println("Zero is not a valid denominator");
            }
        } while (keepGoing);
    }
    
}
