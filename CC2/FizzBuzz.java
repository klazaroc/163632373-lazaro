import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.print("Input a number: ");
        int limit = input.nextInt();

        for (int i = 1; i <= limit; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
        input.close();
    }

}
