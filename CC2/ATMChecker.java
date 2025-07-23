import java.util.Scanner;
public class ATMChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.print("Input the balance here: ");
        int balance = input.nextInt();
        System.out.print("Input the amount to withdraw: ");
        int withdrawAmount = input.nextInt();
        System.out.println("");

        if (withdrawAmount <= 0 ){
            System.out.println("Invalid amount. Please enter a value greater than 0.");
            System.out.println("");
        } else if (withdrawAmount > balance){
            System.out.println("Insufficient balance.");
            System.out.println("");
        } else {
            int newBalance = balance-withdrawAmount;
            System.out.println("");
            System.out.println("Current balance: " + balance);
            System.out.println("Amount withdrawn: " + withdrawAmount);
            System.out.println("Withdraw successful! Remaining balance: " + newBalance);
            System.out.println("");
        }
        input.close();

    } 
}
