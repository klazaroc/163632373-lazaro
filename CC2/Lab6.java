package LabActs;
import java.util.*;
public class Lab6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the total number of students: ");
        int totalStudents = input.nextInt();
        System.out.println("");
        input.nextLine();

        int present = 0, absent = 0;

        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Is student " + i + " present? (Y/N): ");
            String isPresent = input.nextLine();

            if (isPresent.equalsIgnoreCase("y")) {
                present++;
            }
                else if (isPresent.equalsIgnoreCase("n")) {
                    absent++;
                }
        }

        System.out.println("\nTotal present: " + present);
        System.out.println("Total absent: " + absent);
        System.out.println("");
        input.close();
    }
}
