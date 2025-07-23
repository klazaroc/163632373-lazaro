import java.util.Scanner;
public class GradeEvaluator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input grade here from 0 to 100: ");
        int grade = input.nextInt();

        if (grade >= 97 && grade <= 100) {
            System.out.println("Perfect score!");
        } else if (grade >= 90) {
            System.out.println("Excellent!");
        } else if (grade >= 80) {
            System.out.println("Great Job!");
        } else if (grade >= 75) {
            System.out.println("Passed!");
        } else if (grade >= 0){
            System.out.println("Failed!");
        }
        
        else {
            System.out.println("Invalid grade. Please enter value from 0 to 100.");
        }
        input.close();
    }
    
}
