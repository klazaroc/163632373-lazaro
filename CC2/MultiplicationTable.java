import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.print("Input a number: ");
        int number = input.nextInt();
        System.out.println("Mutliplication Table: ");

        if (number <= 0) {
            System.out.println("Please enter a number greater than 0!");
        } else {
            for(int i = 1; i <= 10; i++){
                int result = number*i;
                System.out.println(number + " x " + i + " = " +  result);
            }
        }
       
        
        System.out.println("");
        input.close();
    }
    
}
