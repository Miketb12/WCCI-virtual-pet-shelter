package virtual_pet;

public class VirtualPet {

    // Variables
    private String name;

    private int energy;

    private int hunger;

    private int happiness;

    private int health;

    // Getters
    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHunger() {
        return hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHealth() {
        return health;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Constructors
    public VirtualPet(String name, int energy, int hunger, int happiness, int health) {
        this.name = name;
        this.energy = energy;
        this.hunger = hunger;
        this.happiness = happiness;
        this.health = health;
    }

    // Functions

    public void feed() {
        hunger -= 10;
        happiness += 5;
    }

    public void goForWalk() {
        hunger += 10;
        happiness += 15;
        energy -= 20;
    }

    public void sleep() {
        energy += 60;
    }

    public void goToVet() {
        hunger = 50;
        happiness = 50;
        energy = 50;
        health = 100;
    }

    public boolean isSick() {
        if (hunger >= 70 && energy <= 30) {
            System.out.println(this.name + " is sick!");
            return true;
        }
        return false;
    }

    public void tick() {
        hunger -= 10;
        energy -= 10;
        happiness -= 10;
        if (isSick()) {
        }
    }
}
