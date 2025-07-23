import java.util.Scanner;
public class SimpleGradingSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.print("Input grade here: ");
        int grade = input.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade!");
        }else if (grade >= 90) {
            System.out.println("Your grade is A");
            System.out.println("Excellent work!");
        } else if (grade >= 80) {
            System.out.println("Your grade is B");
            System.out.println("Good job!");
        } else if (grade >= 70) {
            System.out.println("Your grade is C");
            System.out.println("Fair effort.");
        } else if (grade >= 60) {
            System.out.println("Your grade is D");
            System.out.println("Needs improvement.");
        } else if (grade >= 0) {
            System.out.println("Your grade is F");
            System.out.println("Failed. Try harder.");
        }

        System.out.println("");
        input.close();
    }
}
