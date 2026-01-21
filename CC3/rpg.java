package CC3;
import  java.util.*;

public class rpg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String tryAgain;
        do{
            System.out.print("Enter your character's name: ");
            String name = input.nextLine();

            System.out.print("Choose your job (Warrior, Mage, Assassin, Archer): ");
            String job = input.nextLine();

            Character player = new Character(name, job);
            player.setStatsForJob();

            System.out.println("\nWelcome to the game " + name + "!");
            System.out.println("Job: " + player.job);
            System.out.println("Health: " + player.health);
            System.out.println("Damage: " + player.damage);
            System.out.println("Speed: " + player.speed);
            System.out.println("Level: " + player.level);


            Enemy[] enemies = {
                new Enemy("Monster 1", 50, 9, 5, 50),
                new Enemy("Monster 2", 80, 10, 3, 80),
                new Enemy("Monster 3", 120, 15, 2, 120),
                new Enemy("Monster 4", 150, 20, 1, 150),
                new Enemy("THE BOSS", 200, 25, 1, 200)
            };

            for (Enemy currentEnemy : enemies) {
                System.out.println("\n-------------------");
                System.out.println(currentEnemy.name + " appeared!");
                System.out.println("HP: " + currentEnemy.health);
                System.out.println("Damage: " + currentEnemy.damage);
                System.out.println("Speed: " + currentEnemy.speed);

                while (player.health > 0 && currentEnemy.health > 0) { //checks if both are still alive
                    System.out.println("\nChoose your action:");
                    System.out.println("1. Normal Attack");
                    System.out.println("2. Strong Attack");
                    System.out.println("3. Quick Attack");
                    System.out.println("4. Special Attack");
                    System.out.print("\nEnter choice (1-4): ");
                    int choice = input.nextInt();

                    int playerDamage = 0; // for debugging - track damage dealt by player which starts at 0
                    switch (choice) {
                        case 1:
                            playerDamage = player.attack();
                            System.out.println(player.name + " uses Normal Attack!"); break;
                        case 2:
                            playerDamage = player.attack2();
                            System.out.println(player.name + " uses Strong Attack!"); break;
                        case 3:
                            playerDamage = player.attack3();
                            System.out.println(player.name + " uses Quick Attack!"); break;
                        case 4:
                            playerDamage = player.attack4();
                            System.out.println(player.name + " uses Special Attack!"); break;
                        default:
                            System.out.println("Invalid choice! Using Normal Attack by default.");
                            playerDamage = player.attack();            
                    }        

                        if (player.speed >= currentEnemy.speed) { //if player is faster
                            System.out.println(player.name + " attacks first!");
                            currentEnemy.health -= playerDamage; //calculates damage from player attack
                            System.out.println(currentEnemy.name + " health is now: " + currentEnemy.health);

                            if(currentEnemy.health > 0) { //if enemy is still alive

                                int enemyDamage;
                                if (currentEnemy.name.equalsIgnoreCase("THE BOSS")) {
                                    enemyDamage = currentEnemy.attack2(); // i wanted to name the boss' attack
                                    System.out.println(currentEnemy.name + " uses S M A S H and deals " + enemyDamage + " damage!");
                                } else {
                                    enemyDamage = currentEnemy.attack(); // Normal enemies use BASH
                                    System.out.println(currentEnemy.name + " uses BASH and deals " + enemyDamage + " damage!");
                                }

                                player.health -= enemyDamage; //calculates damage from enemy attack
                                System.out.println(player.name + " health is now: " + player.health);
                            }
                        } else {
                            System.out.println(currentEnemy.name + " attacks first!"); //if enemy is faster

                                int enemyDamage;
                                if (currentEnemy.name.equalsIgnoreCase("THE BOSS")) {
                                    enemyDamage = currentEnemy.attack2(); 
                                    System.out.println(currentEnemy.name + " uses S M A S H and deals " + enemyDamage + " damage!");
                                } else {
                                    enemyDamage = currentEnemy.attack(); 
                                    System.out.println(currentEnemy.name + " uses BASH and deals " + enemyDamage + " damage!");
                                }

                            player.health -= enemyDamage; 
                            System.out.println(player.name + " health is now: " + player.health);

                            if(player.health > 0) { //if player is still alive
                                currentEnemy.health -= playerDamage; 
                                System.out.println(currentEnemy.name + " health is now: " + currentEnemy.health);
                        }
                    }
                }
                
                
                System.out.println("\n----Battle ended----");
                if (player.health <= 0) {//if player is defeated
                    System.out.println(player.name + " has been defeated. Game Over.");
                    break;
                } else {//if player wins
                    System.out.println(currentEnemy.name + " has been defeated!");
                    player.gainExp(currentEnemy.expReward);
                    System.out.println(player.name + " gained " + currentEnemy.expReward + " EXP.");
                    System.out.println(player.name + "'s current EXP: " + player.exp + ", Level: " + player.level);
                }    
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            tryAgain = input.next();

        } while (tryAgain.equalsIgnoreCase("yes"));
          System.out.println("Thanks for playing!");
          input.close();//closes scanner
        
    }//main
}//class rpg

class Character {
    String name;
    String job;
    int maxHealth; // for player to heal fully after level up
    int health;
    int damage;
    int speed;
    int exp;
    int level;

    public Character(String name, String job) {
        this.name = name;
        this.job = job;
        this.level = 1;
        this.exp = 0;
    }

    public void setStatsForJob() {
     

        if (job.equalsIgnoreCase("Warrior")) {
            maxHealth = 100;
            health = maxHealth; 
            damage = 20;
            speed = 5;
        } else if (job.equalsIgnoreCase("Mage")) {
            maxHealth = 60;
            health = maxHealth;
            damage = 25;
            speed = 7;
        } else if (job.equalsIgnoreCase("Assassin")) {
            maxHealth = 70;
            health = maxHealth;
            damage = 15;
            speed = 10;
        } else if (job.equalsIgnoreCase("Archer")) {
            maxHealth = 80;
            health = maxHealth;
            damage = 25;
            speed = 8;
        } else {
            System.out.println("Invalid job chosen.");
        }
    }

    public void gainExp(int amount) { 
        exp += amount;
        checkLevelUp();
    }

    private void checkLevelUp() {//level up system
        int expScale = level * 50;

        if (exp >= expScale) {
            level++;
            exp -= expScale;

            maxHealth += 10;
            health = maxHealth;
            damage += 3;
            speed += 1;
            System.out.println("\n~~~Level up!~~~ Your HP is now " + maxHealth + ", Damage is now " + damage + ", Speed is now " + speed + ".");
        }
    }

    public int attack() { //normal attack
        return damage;
    }

    public int attack2() { //stronger attack
        return damage + 5;
    }

    public int attack3() { //quick but lower damage
        return damage - 3;
    }

    public int attack4() { //special attack
        return damage + 10;
    }
}

class Enemy {
    String name;
    int health;
    int damage;
    int speed;
    int expReward;

    public Enemy(String name, int health, int damage, int speed, int expReward) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.speed = speed;
        this.expReward = expReward;
    }

    public int attack() { 
        return damage;
    }

    public int attack2() {
        return damage + 10;
    }
}