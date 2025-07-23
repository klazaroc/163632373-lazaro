package LabActs;
import java.util.Scanner;
public class LazaroKeanu_LabAct3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("How many items: ");
        int itemLimit = input.nextInt(); //asks how many items and stores it in itemLimit
     
        double subtotal = 0, //variables
               discount = 0,
               discountPercent = 5,
               salesTaxPercent = 12,
               salesTax = 0,
               finalTotal = 0;


        for (int i = 1; i <= itemLimit; i++){ //loops to keep asking how many items and limits depending on the user input
            System.out.print("\nEnter the price of item #" + i + ": "); //asks for a price stores in price
            int price = input.nextInt();

            System.out.print("Enter quantity of item #" + i + ": ");// asks for quantity stores in quantity
            int quantity = input.nextInt();
            

            double computeSubtotal = (price * quantity);
            subtotal += computeSubtotal; //adds the total of the result in computeSubtotal and stores it in subtotal

            discount = subtotal * (discountPercent / 100); //getting the dicount the /100 pushes the decimal becomes 0.05

            double computeSalesTax = subtotal - discount;  
            salesTax = computeSalesTax * (salesTaxPercent / 100);  // getting the 12% of the total - discount

            finalTotal = computeSalesTax + salesTax;
        }
        
        System.out.print("\n-------------------------------");
        System.out.printf("\nSubtotal \t: PHP %.2f \n" , subtotal); // prints the subtotal %.2f makes it so it displays only 2 decimal
        System.out.printf("Discount \t: PHP %.2f \n", discount);
        System.out.printf("Sales Tax \t: PHP %.2f \n", salesTax);
        System.out.printf("Final Total \t: PHP %.2f \n", finalTotal);
        System.out.print("-------------------------------\n");

        input.close(); //closes input to prevent leaks
    }

}
