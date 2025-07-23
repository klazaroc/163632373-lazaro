import java.util.Scanner;
public class GradesPercentage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeF = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Input grade #" + i + ": ");
            int gradeInput = input.nextInt();
            
            if (gradeInput < 0 || gradeInput > 100) {
                System.out.println("Invalid Grade! Try again.\n");
                i--;
            } else if (gradeInput >= 90) {
                System.out.println("Grade A\n");
                gradeA++;
            } else if (gradeInput >= 80){
                System.out.println("Grade B\n");
                gradeB++;
            } else if (gradeInput >= 70) {
                System.out.println("Grade C\n");
                gradeC++;
            } else if (gradeInput >= 60) {
                System.out.println("Grade D\n");
                gradeD++;
            } else {
                System.out.println("Grade F\n");
                gradeF++;
            }
        }
        System.out.println("Grade Summary:");
        System.out.println("A: " + gradeA);    
        System.out.println("B: " + gradeB);    
        System.out.println("C: " + gradeC);    
        System.out.println("D: " + gradeD);    
        System.out.println("F: " + gradeF);    
        input.close();
    
  }        
}

