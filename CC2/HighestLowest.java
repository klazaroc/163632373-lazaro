import java.util.Scanner;
public class HighestLowest {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);

         int highest = Integer.MIN_VALUE;
         int lowest = Integer.MAX_VALUE;
         int sum = 0;
         
         
        for (int i = 1; i <= 5; i++){
            System.out.print("Input a number "+ i + ": " );
            int usernumbers = input.nextInt();
            sum = sum + usernumbers;
            
            if (usernumbers > highest) {
                highest = usernumbers;
            } 
            if (usernumbers < lowest) {
                lowest = usernumbers;
            }   
        } 

        double average  = (double) sum / 5;

        System.out.println("");
        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);
        System.out.println("Average: " + average);

        
        input.close();
    } 
}        


