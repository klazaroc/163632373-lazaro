import java.util.*;
public class LabAct4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price = 0, total = 0;
        

        while (true) {
            System.out.println("1. Burger \t - PHP 100");
            System.out.println("2. Fries \t - PHP 50");
            System.out.println("3. Soda \t - PHP 30");
            System.out.println("4. Ice Cream \t - PHP 45");
            System.out.println("5. Exit.");

            System.out.print("Enter the menu number of your choice: ");
            int menuChoice = input.nextInt();

            switch (menuChoice) {
            case 1:
                System.out.println("You ordered Burger!");
                System.out.print("Enter the quantity: ");
                int burgerQuantity = input.nextInt();
                price = 100;
                total += price * burgerQuantity;
                System.out.println("Total amount: " + total + " PHP \n");
                System.exit(0);
                break;
            
            case 2:
                System.out.println("You ordered Fries!");
                System.out.print("Enter the quantity: ");
                int friesQuantity = input.nextInt();
                price = 50;
                total += price * friesQuantity;
                System.out.println("Total amount: " + total + " PHP \n");
                System.exit(0);
                break;
            
            case 3:
                System.out.println("You ordered Soda!");
                System.out.print("Enter the quantity: ");
                int sodaQuantity = input.nextInt();
                price = 30;
                total += price * sodaQuantity;
                System.out.println("Total amount: " + total + " PHP \n");
                System.exit(0);
                break;
        
            case 4:
                System.out.println("You ordered Ice Cream!");
                System.out.print("Enter the quantity: ");
                int iceCreamQuantity = input.nextInt();
                price = 45;
                total += price * iceCreamQuantity;
                System.out.println("Total amount: " + total + " PHP \n");
                System.exit(0);
                break;
            
            case 5:
                System.out.println("Come again!");
                input.close();
                return;
        
            default:
                System.out.println("Invalid choice! Try again. \n");
                break;
            }
        }
    }

}
