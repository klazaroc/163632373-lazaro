import java.util.*;
public class Lab7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
        System.out.print("Enter password: ");
        String userPassword = input.nextLine();

            if (userPassword.length() >= 8 && 
                userPassword.matches(".*[a-z].*") &&
                userPassword.matches(".*[A-Z].*") &&
                userPassword.matches(".*[0-9].*")) {
                System.out.println("Your password is valid!\n");
                break;
            } else {
                System.out.println("Passwowrd must contain atleast 8 characters, including one uppercase letter and one number. Try again!\n");
            }
        } input.close();  
    }
}
