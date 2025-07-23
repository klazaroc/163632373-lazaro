package LabActs;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] temperature = {};
        int days = 7;
        

        System.out.print("How many cities: ");
        int cities = input.nextInt();

        temperature = new double[cities][days];

        for (int i = 0; i < cities; i++) {
            System.out.println("\nCity #" + (i+1));
            for (int y = 0; y < days; y++) {
                System.out.print("Enter temperature Day " + (y+1 + ": "));
                temperature[i][y] = input.nextDouble();
            }
        }
        
        
        double total = 0;
        for (int i = 0; i < cities; i++) {
            for (int y = 0; y < days; y++) {
                total += temperature[i][y];
            }
            double average = total / days;
            System.out.println("Average temperature for City #" + (i+1) + ": " + average);    
        }
        
        
        
    input.close();    
    }
}
