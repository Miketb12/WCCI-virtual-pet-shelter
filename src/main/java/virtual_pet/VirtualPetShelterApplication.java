package virtual_pet;

import java.util.Scanner;

public class VirtualPetShelterApplication {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        VirtualPet cookie = new VirtualPet("Cookie", "Zoomies advocate", 50, 50, 20);
        VirtualPet mickey = new VirtualPet("Mickey", "Fastest turtle on the east coast", 50, 50, 20);
        VirtualPet cloe = new VirtualPet("Cloe", "More of a human than her owners", 50, 50, 20);
        VirtualPet peanut = new VirtualPet("Peanut", "He loves to fly around the home", 50, 50, 20);

        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(cookie);
        shelter.addPet(mickey);
        shelter.addPet(cloe);
        shelter.addPet(peanut);

        do {
            System.out.println("This is the status of your pets!");
            System.out.println();
            shelter.showAllPets();
            System.out.println();

            System.out.println("What would you like to do next?");
            System.out.println("1)Feed the pets ");
            System.out.println("2)Water the pets ");
            System.out.println("3)Play with a pet");
            System.out.println("4)Adopt a pet");
            System.out.println("5)Admit a pet");
            System.out.println("6)Quit ");
            System.out.println();
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("You feed all the pets!");
                    System.out.println();
                    shelter.feedPets();
                    break;
                case 2:
                    System.out.println("You gave water to all the pets!");
                    System.out.println();
                    shelter.waterPets();
                    break;
                case 3:
                    System.out.println("Please choose a pet to play with");
                    System.out.println();
                    shelter.showNameAndDesc();
                    String playName;
                    playName = input.nextLine();
                    shelter.playWithPet(playName);
                    break;
                case 4:
                    System.out.println("Choose who you want to adopt");
                    System.out.println();
                    shelter.showNameAndDesc();
                    String adName;
                    adName = input.nextLine();
                    System.out.println();
                    shelter.adoptPet(adName);
                    break;
                case 5:
                    System.out.println("Please enter a name and description for the pet");
                    String name;
                    name = input.nextLine();
                    System.out.println("Please enter a brief description of the pet");
                    String desc;
                    desc = input.nextLine();
                    System.out.println();
                    VirtualPet x = new VirtualPet(name, desc);
                    shelter.addPet(x);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println(" wondered off chasing his own tail!");
                    System.out.println();
            }
            shelter.tick();
        } while (choice != 0);

        input.close();
    }
}
