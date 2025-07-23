import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.print("Input a number here: ");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println("The number is Even!");
        } else {
            System.out.println("The number is Odd!");
        } 
        
        if (number < 0) {
            System.out.println("The number is Negative!");
        } else if (number == 0) {
            System.out.print("Zero");
        } else {
            System.out.println("The number is Positive!");
        } System.out.println("");

        input.close();
    }
}
