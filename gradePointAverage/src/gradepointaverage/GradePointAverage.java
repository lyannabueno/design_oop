package gradepointaverage;

import java.util.Scanner;

public class GradePointAverage {

    public static final int SCHOOL_DAYS = 200;

    public static void main(String[] args) {
        float finalGrade;
        int absences;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the student's final grade: ");
        finalGrade = input.nextFloat();
        
        System.out.print("\nHow many absences did the student have? ");
        absences = input.nextInt();

        
        if (finalGrade >= 7 && absences <= SCHOOL_DAYS * 0.25) {
            System.out.print("\nPASSED!\n");
        } else {
            System.out.print("\nFAILED!\n");
        }
    }
    
}
