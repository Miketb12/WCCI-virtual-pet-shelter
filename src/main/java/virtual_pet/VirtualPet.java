package virtual_pet;

public class VirtualPet {

    // Variables
    private String name;

    private String desc;

    private int thirst;

    private int hunger;

    private int boredom;

    // Getters
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getThirst() {
        return thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public int getBoredom() {
        return boredom;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    // Constructors
    /*
     * public VirtualPet(String name, int thirst, int hunger, int boredom) {
     * this.name = name;
     * this.thirst = thirst;
     * this.hunger = hunger;
     * this.boredom = boredom;
     * }
     */

    public VirtualPet(String name, String desc, int thirst, int hunger, int boredom) {
        this.name = name;
        this.desc = desc;
        this.thirst = thirst;
        this.hunger = hunger;
        this.boredom = boredom;
    }

    public VirtualPet(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public VirtualPet(String name) {
        this.name = name;
    }

    // Functions

    public void water() {
        thirst -= 15;
    }

    public void play() {
        this.boredom -= 10;
    }

    public void feed() {
        hunger -= 10;
    }

    public void tick() {
        hunger += 5;
        thirst += 7;
        boredom += 9;
        if (hunger <= 0) {
            hunger = 0;
        } else if (hunger >= 100) {
            hunger = 100;
        }
        if (this.boredom <= 0) {
            this.boredom = 0;
        } else if (this.boredom >= 100) {
            this.boredom = 100;
        }
        if (thirst <= 0) {
            thirst = 0;
        } else if (thirst >= 100) {
            thirst = 100;
        }
    }
}
