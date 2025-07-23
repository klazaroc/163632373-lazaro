import java.util.Scanner;
public class SumCountOddEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.print("Input a starting number: ");
        int StartNumber = input.nextInt();
        System.out.print("Input a ending number: ");
        int EndNumber = input.nextInt();
        System.out.println("");

         String range = "";
         int evenSum = 0;
         int oddSum = 0;
         int countEven = 0;
         int countOdd = 0;
         
        for (int i = StartNumber; i <= EndNumber; i++){
            range += i + " ";
            
            if (i % 2 == 0) {
                evenSum += i;
                countEven++;
            } else {
                oddSum += i;
                countOdd++;
            }
        } 

        System.out.println("");
        System.out.println("Numbers in range: " + range);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Count of even numbers: " + countEven);
        System.out.println("Count of odd numbers: " + countOdd);

    
        input.close();
    } 
}        


