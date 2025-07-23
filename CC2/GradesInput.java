import java.util.Scanner;
public class GradesInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many grades do you want to input: ");
        int gradeinputlimit = input.nextInt();
        System.out.println(" ");
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeF = 0;
        int pass = 0;
        int fail = 0;
        

        for (int i = 1; i <= gradeinputlimit; i++) {
            System.out.print("Input grade #" + i + ": ");
            int gradeInput = input.nextInt();
            
            if (gradeInput < 0 || gradeInput > 100) {
                System.out.println("Invalid Grade! Try again.\n");
                i--;
            } else if (gradeInput >= 90) {
                System.out.println("Grade A\n");
                gradeA++;
                pass++;
            } else if (gradeInput >= 80){
                System.out.println("Grade B\n");
                gradeB++;
                pass++;
            } else if (gradeInput >= 70) {
                System.out.println("Grade C\n");
                gradeC++;
                pass++;
            } else if (gradeInput >= 60) {
                System.out.println("Grade D\n");
                gradeD++;
                fail++;
            } else {
                System.out.println("Grade F\n");
                gradeF++;
                fail++;
            }
        } 
             double percentA = (gradeA / (double) gradeinputlimit) * 100;
             double percentB = (gradeB / (double) gradeinputlimit) * 100;
             double percentC = (gradeC / (double) gradeinputlimit) * 100;
             double percentD = (gradeD / (double) gradeinputlimit) * 100;
             double percentF = (gradeF / (double) gradeinputlimit) * 100;
             double percentpass = (pass / (double) gradeinputlimit) * 100;
             double percentfail = (fail / (double) gradeinputlimit) * 100;

        System.out.println("Grade Summary:");
        System.out.println("A: " + gradeA + " (" + percentA + "%)");    
        System.out.println("B: " + gradeB + " (" + percentB + "%)");    
        System.out.println("C: " + gradeC + " (" + percentC + "%)");    
        System.out.println("D: " + gradeD + " (" + percentD + "%)");    
        System.out.println("F: " + gradeF + " (" + percentF + "%)"); 
        System.out.println(" ");
        System.out.println("Passed: " + pass + " (" + percentpass + "%)");
        System.out.println("Failed: " + fail + " (" + percentfail + "%)");

        input.close();
    
  }        
}

