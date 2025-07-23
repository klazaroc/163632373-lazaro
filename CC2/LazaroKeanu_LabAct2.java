import java.util.Scanner;
public class LazaroKeanu_LabAct2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input length: ");
        int length = input.nextInt(); // stores values in the variable
        System.out.print("Input width: ");
        int width = input.nextInt();

        int area = length * width; //computation for area
        int perimeter  = 2 * (length + width); // computatiion for perimter

        System.out.println("\nLength: " + length); //displays the output
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter " + perimeter);

        input.close();
    }

    
}
