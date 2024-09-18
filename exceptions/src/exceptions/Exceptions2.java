package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions2 {

    private static int divide(int number1, int number2) throws ArithmeticException {
        return number1 / number2;
    }

    // an alternative way to handle exceptions is to propagate it out of a method implicitly or explicitly
    // making the use of try...catch block unnecessary

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;
        int result;
        boolean keepGoing = true;

        do {
            try {
                System.out.println("Enter the first number: ");
                number1 = scanner.nextInt();

                System.out.println("Enter the second number: ");
                number2 = scanner.nextInt();

                result = divide(number1, number2);
                keepGoing = false;
            } catch (InputMismatchException exception) {
                System.err.println(exception.getMessage());
                scanner.nextLine();
                System.out.println("Please enter only integer numbers");
            } catch (ArithmeticException exception) {
                System.err.println(exception.getMessage());
                System.out.println("Zero is not a valid denominator");
            }
        } while (keepGoing);
    }
}
