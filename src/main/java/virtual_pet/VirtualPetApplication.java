package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        // Interact with a VirtualPet object in this method
        int choice, playCount = 0;
        String petName;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of your new virtual pet! ");
        petName = input.nextLine();
        System.out.println();

        VirtualPet cookie = new VirtualPet(petName, 100, 50, 50, 100);
        System.out.println(cookie.getName() + ", our daunting four legged buddy!");

        do {
            if (playCount == 3) {
                System.out.println("A day full of adventures pass by for " + petName + "!");
                cookie.tick();
                playCount = 0;
            }

            System.out.println("Health: " + cookie.getHealth());
            System.out.println("Energy: " + cookie.getEnergy());
            System.out.println("Hunger: " + cookie.getHunger());
            System.out.println("Happiness: " + cookie.getHappiness());
            System.out.println();

            System.out.println("What would you like to do?");
            System.out.println("1)Feed " + cookie.getName());
            System.out.println("2)Go for a walk ");
            System.out.println("3)Sleep");
            System.out.println("4)Take " + cookie.getName() + " to the vet");
            System.out.println("5)Exit");
            System.out.println();
            choice = input.nextInt();
            input.nextLine();

            playCount++;

            switch (choice) {
                case 1:
                    System.out.println("You fed " + petName + "!");
                    System.out.println();
                    cookie.feed();
                    break;
                case 2:
                    System.out.println(petName + " enjoyed seeing his friends at the park!");
                    System.out.println();
                    cookie.goForWalk();
                    break;
                case 3:
                    System.out.println(petName + " took a nap");
                    System.out.println();
                    cookie.sleep();
                    break;
                case 4:
                    System.out.println("You took your best friend to the vet to get better!");
                    System.out.println();
                    cookie.goToVet();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println(cookie.getName() + " wondered off chasing his own tail!");
                    System.out.println();
            }
        } while (choice != 0);

        input.close();

    }

}
