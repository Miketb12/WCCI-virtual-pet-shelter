package virtual_pet;

import java.util.ArrayList;
import java.util.List;

public class VirtualPetShelter {

    // Collections
    List<VirtualPet> shelter = new ArrayList<VirtualPet>();

    // Methods
    public void addPet(VirtualPet pet) {
        shelter.add(pet);
    }

    public void showAllPets() {
        System.out.println("Name\tHunger\tThirst\tBoredom");
        System.out.println("-------------------------------");
        for (int i = 0; i < shelter.size(); i++) {
            System.out.println(
                    shelter.get(i).getName() + "\t|" + shelter.get(i).getHunger() + "\t|" + shelter.get(i).getThirst()
                            + "\t|" + shelter.get(i).getBoredom());
        }
    }

    public void feedPets() {
        for (int i = 0; i < shelter.size(); i++) {
            shelter.get(i).feed();
        }
    }

    public void waterPets() {
        for (int i = 0; i < shelter.size(); i++) {
            shelter.get(i).water();
        }
    }

    public void playWithPet(String name) {
        for (int i = 0; i < shelter.size(); i++) {
            if (shelter.get(i).getName().indexOf(name) == 0) {
                shelter.get(i).play();
            }
        }
    }

    public void adoptPet(String name) {
        for (int i = 0; i < shelter.size(); i++) {
            if (shelter.get(i).getName().indexOf(name) == 0) {
                shelter.remove(i);
            }
        }
    }

    public void showNameAndDesc() {
        System.out.println("Name\tDescription");
        System.out.println("-------------------");
        for (int i = 0; i < shelter.size(); i++) {
            System.out.println(
                    shelter.get(i).getName() + "\t|" + shelter.get(i).getDesc());
        }
    }

    public void tick() {
        for (int i = 0; i < shelter.size(); i++) {
            shelter.get(i).tick();
        }
    }

}
