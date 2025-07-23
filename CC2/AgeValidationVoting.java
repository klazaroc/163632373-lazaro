import java.util.Scanner;
public class AgeValidationVoting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int notEligible = 0, eligibleAdult = 0, eligibleSenior = 0;

    System.out.print("How many people to check age: ");
    int howMany = input.nextInt();
    
    for (int i = 1; i <= howMany; i++) {
        System.out.print("Enter age #" + i + ": ");
        int age = input.nextInt();
        

        while (true) {  //checks if valid or not, ask until we get valid number
            System.out.print("Enter age #" + i + ": ");
            if (input.hasNextInt()){ //checks if input is a number
                age = input.nextInt(); // if yes stores it here

                if (age >= 0  || age <= 130) break; //checks if the stored value  is valid, break; breaks the checking loop and continues 
                else System.out.println("Invalid age! Try again.\n");
            }
             else { //catches everything else aka letters
                System.out.println("Invalid input! Please enter a number. \n");
                input.next(); // discard non int
            }
            
        }

        if (age < 18) {
            System.out.println("Not Eligible!\n");
            notEligible++;

        } else if (age <= 64) {
            System.out.println("Eligible: Adult Voter\n");
            eligibleAdult++;
        } else {
            System.out.println("Eligible: Senior voter\n");
            eligibleSenior++;
        }
    }

    System.out.println("\n--- Voting Summary ---");
    System.out.println("Number of ineligible people: " + notEligible);
    System.out.println("Number of adult voters: " + eligibleAdult);
    System.out.println("Number of senior voters: " + eligibleSenior);

        input.close();
  }      
}

