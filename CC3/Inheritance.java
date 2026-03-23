package CC3;
public class Inheritance {
    public static void main(String[] args) {
        Mammal dog = new Mammal(49.9, 38.5,"black", 4, true);
        System.out.println("\nDog's Height: " + dog.height);
        System.out.println("Dog's Weight: " + dog.weight);
        System.out.println("Dog's Hair Color: " + dog.hairColor);
        System.out.println("Dog's No. of Legs: " + dog.noOfLegs);
        System.out.println("Can the dog swim: " + dog.canSwim);
        System.out.println("");

        Carnivore lion = new Carnivore(69, 420,"golden", 4, false, "idk what genum is xd, google says a lion is a panthera");
        System.out.println("Lion's Height: " + lion.height);
        System.out.println("Lion's Weight: " + lion.weight);
        System.out.println("Lion's Hair Color: " + lion.hairColor);
        System.out.println("Lion's No. of Legs: " + lion.noOfLegs);
        System.out.println("Can the lion swim: " + lion.canSwim);
        System.out.println("Lion's Genus: " + lion.genum);
        System.out.println("");
    }
}

class Animal {
    protected double height;
    protected double weight;

    public Animal(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
}

class Mammal extends Animal{
    protected String hairColor;
    protected int noOfLegs;
    protected boolean canSwim;

    public Mammal(double height, double weight,String hairColor, int noOfLegs, boolean canSwim){
        super(height, weight);
        this.hairColor = hairColor;
        this.noOfLegs = noOfLegs;
        this.canSwim = canSwim;
    }
}

class Carnivore extends Mammal {
    protected String genum;

    public Carnivore(double height, double weight, String hairColor, int noOfLegs, boolean canSwim , String genum) {
        super(height, weight, hairColor, noOfLegs, canSwim);
        this.genum = genum;
    }
}