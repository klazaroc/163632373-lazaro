import java.util.Scanner;
public class GradesInput2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many grades do you want to input: ");
        int gradeinputlimit = input.nextInt();
        System.out.println(" ");

        int gradeAtotal = 0, gradeBtotal = 0, gradeCtotal = 0, gradeDtotal = 0, gradeFtotal = 0; 
        
        for (int i = 1; i <= gradeinputlimit; i++){
            System.out.print("Enter grade #" + i + ": ");
            int gradeinput = input.nextInt();

            while (gradeinput < 0 || gradeinput > 100) {
                System.out.println("Invalid! Grade must be 0-100. Try again.\n");
                System.out.print("Enter grade #" + i + ": ");
                gradeinput = input.nextInt();
            }


                if (gradeinput >= 90 ) {
                    System.out.println("Grade A\n");
                    gradeAtotal++;
                } else if (gradeinput >= 80) {
                    System.out.println("Grade B\n");
                    gradeBtotal++;
                } else if (gradeinput >= 70) {
                    System.out.println("Grade C\n");
                    gradeCtotal++;
                } else if (gradeinput >= 60) {
                    System.out.println("Grade D\n");
                    gradeDtotal++;
                } else {
                    System.out.println("Grade F\n");
                    gradeFtotal++;
                }
                
            

        }

        System.out.println("Summary:");
        System.out.println("A: " + gradeAtotal);
        System.out.println("B: " + gradeBtotal);
        System.out.println("C: " + gradeCtotal);
        System.out.println("D: " + gradeDtotal);
        System.out.println("F: " + gradeFtotal);
        
        input.close();
  }      
}

