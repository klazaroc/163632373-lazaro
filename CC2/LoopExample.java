import java.util.Scanner;
public class LoopExample {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.print("Input a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a number greater than 0!");
        } else {
            for(int i = 1; i <= number; i++){
                System.out.println(i);
            }
        }
       
        
        System.out.println("");
        input.close();
    }
    
}
