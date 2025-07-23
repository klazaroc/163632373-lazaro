import java.util.Scanner;
public class SumOddEven {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);

         int evenSum = 0;
         int oddSum = 0;
         
        for (int i = 1; i <= 5; i++){
            System.out.print("Input a number "+ i + ": " );
            int numbers = input.nextInt();

            if (numbers % 2 == 0){
              evenSum += numbers;

            } else {
               oddSum += numbers;
            }
        }   

        System.out.println("");
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        input.close();
    } 
}        


