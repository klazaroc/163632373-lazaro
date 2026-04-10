package CC3;
import java.util.*;

abstract class Animal {
    public abstract void makeSound();

    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow moos.");
    }
}

class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The bird chirps.");
    }
}

class Fish extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The fish goes ...");
    }
}

public class InheritanceandAbstraction {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Cow(),
            new Bird(),
            new Fish()
        };

        while (true) {
            System.out.print("\nEnter your choice (dog/cat/cow/bird/fish) or exit: ");
            String choice = input.nextLine().toLowerCase();
           
            if (choice.equals("exit")) {
                break;
            }

            Animal selectedAnimal = null;

            switch (choice) {
                case "dog":
                    selectedAnimal = new Dog();
                    break;
                case "cat":
                    selectedAnimal = new Cat();
                    break;
                case "cow":
                    selectedAnimal = new Cow();
                    break;
                case "bird":
                    selectedAnimal = new Bird();
                    break;
                case "fish":
                    selectedAnimal = new Fish();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            if (selectedAnimal != null) {
                selectedAnimal.makeSound();
                selectedAnimal.eat();
            }
        }

        input.close();
    }
}