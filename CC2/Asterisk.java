import java.util.Scanner;
public class Asterisk {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.print("Input a number: ");
        int howmany = input.nextInt();
        System.out.println("");

        for (int row = 1; row <= howmany; row++){

            for (int column = 1; column <= row; column++) {
                 System.out.print(column);
            }
           System.out.println();
        }
        input.close();
        } 
    }        


