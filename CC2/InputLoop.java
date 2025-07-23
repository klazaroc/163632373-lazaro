import java.util.Scanner;
public class InputLoop {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);

        int zero = 0;
        int positive = 0;
        int negative = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("");
            System.out.print("Input a number "+ i + ": " );
            int numbers = input.nextInt();
            

            if (numbers == 0) {
                zero++;
         }  else if (numbers < 0) {
                negative++;
                
         }  else {
                positive++;
                
         }
           
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);

        input.close();
    } 
}        


