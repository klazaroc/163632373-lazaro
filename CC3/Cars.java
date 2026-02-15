package CC3;

public class Cars {
    public static void main(String[] args) {
        Car normalCar = new Car("Mistubishi", Car.CarType.SEDAN);
        SportsCar sportsCar = new SportsCar("Ferrari", Car.CarType.SEDAN);

        System.out.println("");
        normalCar.displayDetails();
        normalCar.accelerate(30);

        System.out.println("");

        sportsCar.displayDetails();
        System.out.println("Sports car started using turbo boost!");
        sportsCar.TurboBoost(30);
    }
}

class Car {
    private String brand;
    private int speed;
    private CarType type;

    public static final int MAX_SPEED = 200;

    public Car(String brand, CarType type) {
        this.brand = brand;
        this.speed = 0;
        this.type = type;
    }

    enum CarType {
        SEDAN, SUV, TRUCK
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Current speed: " + speed + " km/h");
        System.out.println("Type: " + type);
    }

    protected void accelerate(int amount) {
        if (speed + amount <= MAX_SPEED) {
            speed += amount;
        } else {
            speed = MAX_SPEED;
        }
        System.out.println(brand + " started to increase speed to " + speed + " km/h");
    }
}

class SportsCar extends Car {
    public SportsCar(String brand, CarType type) {
        super(brand, type);
    }

    
    protected void TurboBoost(int amount) {
        super.accelerate(amount * 2); // Sports cars accelerate faster
    }
}

