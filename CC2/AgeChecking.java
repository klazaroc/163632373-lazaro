import java.util.Scanner;
public class AgeChecking {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.print("How many ages will you input: ");
        int ageinputlimit = input.nextInt();

        int childrenTotal = 0, teensTotal = 0, adultsTotal = 0, seniorsTotal = 0;

        for (int i = 1; i <= ageinputlimit; i++) {
        System.out.println("");
        System.out.print("Input age #" + i + ": ");
        int ageinput = input.nextInt(); 

            if(ageinput < 0){
                System.out.println("Try again!");
                i--;
            } else if (ageinput <= 12) {
                System.out.println("Category: Child");
                childrenTotal++;
            } else if (ageinput <= 17) {
                System.out.println("Category: Teen");
                teensTotal++;
            } else if (ageinput <= 64) {
                System.out.println("Category: Adult");
                adultsTotal++;
            } else {
                System.out.println("Category: Senior");
                seniorsTotal++;
            }
       
        }
        
            double childrenAverage = (childrenTotal / (double) ageinputlimit) * 100;
            double teensAverage = (teensTotal / (double) ageinputlimit) * 100;
            double adultsAverage = (adultsTotal / (double) ageinputlimit) * 100;
            double seniorsAverage = (seniorsTotal / (double) ageinputlimit) * 100;

        System.out.println("");
        System.out.println("Summary:");
        System.out.printf("Children: %d (%.1f%%)\n", childrenTotal, childrenAverage);
        System.out.printf("Teenagers: %d (%.1f%%)\n", teensTotal, teensAverage);
        System.out.printf("Adults: %d (%.1f%%)\n", adultsTotal, adultsAverage);
        System.out.printf("Seniors: %d (%.1f%%)\n", seniorsTotal, seniorsAverage);
        input.close();
    }   
    
}
