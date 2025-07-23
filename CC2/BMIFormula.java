import java.util.Scanner;
public class BMIFormula {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many BMI to input: ");
        int howMany = input.nextInt(); 

        double weight = 0;
        double height = 0;
        int underweight = 0, normalWeight = 0, overweight = 0, obese = 0;
    
        for (int i = 1; i <= howMany; i++ ){
            System.out.println("\nBMI Input #" + i + ": ");
        
            while (true) {
                System.out.print("Input weight here in kg: ");
                if (input.hasNextDouble()) {
                    weight = input.nextDouble();

                    System.out.print("Input height here in meters: ");
                    if (input.hasNextDouble()) {
                        height = input.nextDouble();

                        if (weight > 0 && height > 0) {
                            break;
                        } else {
                            System.out.println("Invalid Input! Weight and height must be greater than 0.\n");
                        }
                    } else {
                        System.out.println("Invalid height input! Try again.\n");
                        input.next(); // discard non-double
                    }
                } else {
                    System.out.println("Invalid weight input! Try again.\n");
                    input.next(); // discard non-double
                }
            }

            double BMI = weight / Math.pow(height, 2); 
            System.out.printf("Your BMI is: %.2f\n", BMI);

            if (BMI < 18.5) {
                System.out.println("Classification: Underweight");
                underweight++;
            } else if (BMI >= 18.5 && BMI < 25) {
                System.out.println("Classification: Normal weight");
                normalWeight++;
            } else if (BMI >= 25 && BMI < 30) {
                System.out.println("Classification: Overweight");
                overweight++;
            } else {
                System.out.println("Classification: Obese");
                obese++;
            }        
        } 
        
        System.out.println("\n--- SUMMARY ---");
        System.out.println("Underweight: " + underweight);
        System.out.println("Normal Weight: " + normalWeight);
        System.out.println("Overweight: " + overweight);
        System.out.println("Obese: " + obese);
        
        input.close();
    }
}


/*while (true) {
    System.out.print("Input weight here in kg: ");
    if (input.hasNextDouble()) {
        weight = input.nextDouble();

        System.out.print("Input height here in meters: ");
        if (input.hasNextDouble()) {
            height = input.nextDouble();

            if (weight > 0 && height > 0) break;
            else System.out.println("Invalid Input! Weight and height must be greater than 0.\n");
        } else {
            System.out.println("Invalid height input! Try again.\n");
            input.next(); // discard non-double
        }
    } else {
        System.out.println("Invalid weight input! Try again.\n");
        input.next(); // discard non-double
    }
}*/