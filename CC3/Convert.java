package CC3;
import java.util.*;
public class Convert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Converter converter = new Converter();
        int choice;
        do {
            System.out.println("\nChoose the conversion unit:");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1. Kilometers to Miles");
            System.out.println("2. Miles to Kilometers");
            System.out.println("3. Celcius to Fahrenheit");
            System.out.println("4. Fahrenheit to Celcius");
            System.out.println("5. US Dollars to Philippine Peso");
            System.out.println("6. Philippine Peso to US Dollars");
            System.out.println("7. To exit.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("\nEnter Choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nInput Kilometer: "); 
                    converter.setKilometer(input.nextDouble());
                    System.out.println("Miles: " + converter.convertKilometerToMiles()); break;
                case 2:
                    System.out.print("\nInput Miles: ");
                    converter.setMiles(input.nextDouble());
                    System.out.println("Kilometer: " + converter.convertMilesToKilometer()); break;
                case 3:
                    System.out.print("\nInput Celcius: "); 
                    converter.setCelcius(input.nextDouble());
                    System.out.println("Fahrenheit: " + converter.convertCelciusToFahrenheit()); break;
                case 4:
                    System.out.print("\nInput Fahrenheit: "); 
                    converter.setFahrenheit(input.nextDouble());
                    System.out.println("Celcius: " + converter.convertFahrenheitToCelcius()); break;
                case 5:
                    System.out.print("\nInput US Dollars: ");
                    converter.setUSDollars(input.nextDouble());
                    System.out.println("Philippine Peso: P" + converter.convertUSDollarsToPhilippinePeso()); break; 
                case 6:
                    System.out.print("\nInput Philippine Peso: ");
                    converter.setPhilippinePeso(input.nextDouble());
                    System.out.println("US Dollars: $" + converter.convertPhilippinePesoToUSDollars());
                case 7:
                    System.out.println("\nExiting!"); break;
                default:
                    System.out.println("\nInvalid choice! Try again."); break;
            }
        } while (choice != 7);
          input.close();    
    }              
}


class Converter{
    private double kilometer;
    private double miles;
    private double celcius;
    private double fahrenheit;
    private double usDollars;
    private double philippinePeso;

    public double getKilometer(){
        return kilometer;
    }

    public void setKilometer(double kilometer) {
        this.kilometer = kilometer;
    }

    public double getMiles() {
        return miles;
    }
    public void setMiles(double miles) {
        this.miles = miles;
    }
    
    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius){
        this.celcius = celcius;
    }

    public double getFahrenheit(){
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit){
        this.fahrenheit = fahrenheit;
    }

    public double getUSDollars() {
        return usDollars;
    }

    public void setUSDollars(double usDollars){
        this.usDollars = usDollars;
    }

    public double getPhilippinePeso() {
        return philippinePeso;
    }

    public void setPhilippinePeso(double philippinePeso){
        this.philippinePeso = philippinePeso;
    }

    public double convertKilometerToMiles(){
        return kilometer * 0.621371;
    }

    public double convertMilesToKilometer() {
        return miles / 1.60934;
    }

    public double convertCelciusToFahrenheit(){
        return (celcius * 9/5) + 32;
    }

    public double convertFahrenheitToCelcius() {
        return (fahrenheit - 32) * 5/9;
    }

    public double convertUSDollarsToPhilippinePeso(){
        return usDollars * 56.21;
    }

    public double convertPhilippinePesoToUSDollars() {
        return philippinePeso / 56.21;
    }
 }