package RPG;

import java.util.Scanner;
import java.util.Random;

public class TextBasedRPG {
    public static Scanner scan = new Scanner(System.in);
    public static Random random = new Random();
    //setup player
    public static Character mainPlayer = new Character("Player", 20);
    public static  Character shopKeeper = new Character("Shop Keeper", 9999999);
    public static void main(String[] args)
    {
        System.out.println("Welcome to our RPG game!");
        System.out.println("Press ENTER to begin...");
        scan.nextLine();
        intro();
        System.out.println();
        System.out.println("Which orb do you pick?...");
        System.out.println("A. Blue Orb");
        System.out.println("B. Red Orb");
        String choiceOrb = scan.nextLine();
        if (choiceOrb.equalsIgnoreCase("a"))
        {
            blueOrb();
        }
        else if (choiceOrb.equalsIgnoreCase("b"))
        {
            redOrb();
        }
        else {
            System.out.println("Error. Try again.");
            System.out.println("A. Blue Orb");
            System.out.println("B. Red Orb");
            choiceOrb = scan.nextLine();
        }
    }

    public static void intro()
    {
        typewriter("Our story begins here...");
        System.out.println("_____________________________________");

        typewriter("You are currently within the great big national Greens Park staring off at the orbs in front of you.");
        typewriter("Looking around the world you can see the vast futurism of the world as people walk around with robotic body parts and flying cars are abundant in this grand place.");
        System.out.println();
        typewriter("The world you reside in is one of controlled chaos that keeps it in its order, held there by the powerful cat god and the opposer dog devil.");
        typewriter("The cat god and the dog devil have always been at odds bringing both creation and destruction within your world.");
        typewriter("The cat god has acted as the yang while the dog devil remained the yin.");
        typewriter("And occasionally within their bouts across the vast endless universe, they gave power to champions of their race to aid in the never ending fight between the two of them.");
        typewriter("But here today the selection of champions happened again after hundreds of years passed from past to today.");
        typewriter("It seemed this was their final bout for who would truly overcome who, but a freak accident happened within the time space.");
        typewriter("With selection of heroes for each of their sides, one of the cats had been bestowed with the power of both the cat god and the dog devil before them.");
        System.out.println("");
        System.out.println("_____________________________________");
        System.out.println("What is your name?");
        System.out.println("_____________________________________");
        mainPlayer.Name = scan.nextLine();
        typewriter("\nThat cat is YOU, "+mainPlayer.Name+", now you must choose your destiny from either taking the side of the cat god with the blue orb, or the dog devil of the red.");
    }

    public static void blueOrb() {
        //Cat
        typewriter("You have chosen to join the Cats in Citty Crawl");
        typewriter("You are magically transported to a Fork in the road!");
        System.out.println("_____________________________________");
        cat_fork();
    }

    public static void cat_fork() {
        System.out.println("");
        System.out.println("_____________________________________");
        System.out.println("");
        typewriter("There a fork in the road, and you must choose a direction!");
        System.out.println("_____________________________________");
        typewriter("Which direction would you like to go?");
        System.out.println("A | Shop (Items)");
        System.out.println("B | Cats (Aura Check)");
        System.out.println("C | Crafty Crafts");

        String choice = scan.nextLine();
        if (choice.equalsIgnoreCase("A")) {
            System.out.println("_____________________________________");
            typewriter("You have gone down the road to the Shop");
            typewriter("You have arrived at the Shop!");
            System.out.println(" ");
            System.out.println("As you enter the bell rings as the door opens.");
            typewriter("Shopkeeper: Welcome to the shop!");
            typewriter("Shopkeeper: Take your pick at any of our fine items!");
            cat_shop();


        }
        if (choice.equalsIgnoreCase("B")) {
            System.out.println("_____________________________________");
            typewriter("You have gone down the road to the Group of Cats!");
            typewriter("You have arrived at the Group and you must pass the Aura Check!");
        }
        if (choice.equalsIgnoreCase("C")) {
            System.out.println("_____________________________________");
            typewriter("You have gone down the road to the Crafty Crafts Shop!");
            typewriter("You have arrived at the Group and you must pass the Aura Check!");
        }
    }

    public static void cat_shop() {


        System.out.println("_____________________________________");
        typewriter("Shopkeeper: Here are our items:");
        System.out.println("A | Catnip (HP+) - 10 Coins");
        System.out.println("B | Fish Scale Armor (DP+) - 20 Coins");
        System.out.println("C | Metal Claws (AP+) - 15 Coins");
        System.out.println("");
        System.out.println("Z | Exit Store");
        typewriter("You have " + mainPlayer.Money + " Coins, what would you like to buy?");
        String choice = scan.nextLine();
        if (choice.equalsIgnoreCase("a")) {
            if (mainPlayer.Money >= 10) {
                for (int i = 0; i < mainPlayer.Inventory.length; i++) {
                    if (mainPlayer.Inventory[i] == null) {
                        mainPlayer.Inventory[i] = "Catnip";
                        mainPlayer.Money -= 10;
                        break;
                    }
                }
                typewriter("Shopkeeper: Here is your catnip!");
                typewriter("Shopkeeper: Would you like to purchase anything else?");
                cat_shop();
            }
            else {
                typewriter("Shopkeeper: I'm sorry, you don't have enough money to buy Cat-Nip, would you like anything else?");
                cat_shop();
            }
        }
        if (choice.equalsIgnoreCase("b")) {
            if (mainPlayer.Money >= 20) {
                for (int i = 0; i < mainPlayer.Inventory.length; i++) {
                    if (mainPlayer.Inventory[i] == null) {
                        mainPlayer.Inventory[i] = "Fish Scale Armor";
                        mainPlayer.Money -= 20;
                        break;
                    }
                }
                typewriter("Shopkeeper: Here is your Fish Scale Armor!");
                typewriter("Shopkeeper: Would you like to purchase anything else?");
                cat_shop();
            }
            else {
                typewriter("Shopkeeper: I'm sorry, you don't have enough money to buy Fish Scale Armor, would you like anything else?");
                cat_shop();
            }
        }
        if (choice.equalsIgnoreCase("c")) {
            if (mainPlayer.Money >= 15) {
                for (int i = 0; i < mainPlayer.Inventory.length; i++) {
                    if (mainPlayer.Inventory[i] == null) {
                        mainPlayer.Inventory[i] = "Metal Claws";
                        mainPlayer.Money -= 15;
                        break;
                    }
                }
                typewriter("Shopkeeper: Here is your Metal Claws!");
                typewriter("Shopkeeper: Would you like to purchase anything else?");
                cat_shop();
            }
            else {
                typewriter("Shopkeeper: I'm sorry, you don't have enough money to buy Metal Claws, would you like anything else?");
                cat_shop();
            }
        }
        if (choice.equalsIgnoreCase("Z")) {
            typewriter("You bid the Shop Keeper farewell and exit, the bell ringing behind you.");
            typewriter("Your Inventory now consists of:");
            for (int i = 0; i < mainPlayer.Inventory.length; i++) {
                System.out.println(mainPlayer.Inventory[i]);
            }
            System.out.println("_____________________________________");
            typewriter("Your back at the fork in the road!");
            cat_fork();
        }
    }
    public static void redOrb() {
        //Dog
        System.out.println("");
        System.out.println("_____________________________________");
        System.out.println("");
        typewriter("You have chosen to join the Dogs in ");

    }

    public static void typewriter(String text) {
        int i;
        for (i = 0; i < text.length(); i++) {
            System.out.printf("%c", text.charAt(i));
            try {
                Thread.sleep(30);//0.5s pause between characters
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("");
    }







    //file ends on next line
}