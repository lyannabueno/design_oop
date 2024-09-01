package salarytax;

import java.util.Scanner;

public class SalaryTax {

    public static final int QUANTITY_SALARY = 10;
    
    public static void main(String[] args) {
        float salary[] = new float[QUANTITY_SALARY];
        double tax15, tax25, tax35;
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < QUANTITY_SALARY; i++) {
            System.out.print("Enter the salary of person " + (i + 1) + ": ");
            salary[i] = input.nextFloat();
            
            if (salary[i] <= 1000) {
                System.out.println("\nWith a salary of $" + salary[i] + " you are exempt from tax!\n");
            } else if (salary[i] <= 2000) {
                tax15 = salary[i] * 0.15;
                System.out.println("\nWith a salary of $" + salary[i] + " you need to pay $" + tax15 + " in taxes!\n");
            } else if (salary[i] <= 3000) {
                tax25 = salary[i] * 0.25;
                System.out.println("\nWith a salary of $" + salary[i] + " you need to pay $" + tax25 + " in taxes!\n");
            } else {
                tax35 = salary[i] * 0.35;
                System.out.println("\nWith a salary of $" + salary[i] + " you need to pay $" + tax35 + " in taxes!\n");
            }
        }
    }  
}
