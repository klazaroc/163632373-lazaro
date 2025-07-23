import java.util.Scanner;
public class PracticeWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.print("Input a starting number: ");
        int usernumbers = input.nextInt(); //limit
        int counter = 1;
        int sum = 0;
        String evenNumbers = "";
       
                            //limit
        while (counter <= usernumbers) {
            if (counter % 2 == 0) {
                evenNumbers += counter + " ";
                sum += counter;
                
            }
            counter++;  
        }
        System.out.println("");
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Sum of even numbers: " + sum);
       input.close();
    }
    
}
