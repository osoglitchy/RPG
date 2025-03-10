package RPG;

import java.util.Scanner;
import java.util.Random;

public class TextBasedRPG {
    public static Scanner scan = new Scanner(System.in);
    public static Random random = new Random();
    //setup player
    public static Character mainPlayer = new Character("Player", 20);
    public static  Character shopKeeper = new Character("Shop Keeper", 9999999);

    public static final String RESET = "\033[0m"; // Text Reset
    public static final String RED = "\033[0;31m"; // RED
    public static final String GREEN = "\033[0;32m"; // GREEN
    public static final String YELLOW = "\033[0;33m"; // YELLOW
    public static final String BLUE = "\033[0;34m"; // BLUE

    public static void main(String[] args)
    {
        while (mainPlayer.curHP >= 0) {
            System.out.println("Welcome to our RPG game!");
            System.out.println("Press ENTER to begin...");
            scan.nextLine();
            intro();
            System.out.println();
            System.out.println("Which orb do you pick?...");
            typewriter(RED + "ERROR! - The dog route does not exsist!" + RESET);
            System.out.println("A. Blue Orb");
            //System.out.println("B. Red Orb");
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
     end("Insufficient Health!");
    }

    public static void intro()
    {
        typewriter("Our story begins here...");
        System.out.println("_____________________________________");

        typewriter(YELLOW + "You wake up inside the great Green National Park, which you read from one of the signs sitting around. Two orbs appears in front of you." + RESET);
        typewriter(YELLOW + "Before examining the two orbs, you look around at the surrounding Futuristic look of the surrounding skyscrapers bordering the National Park Scenery." + RESET);
        System.out.println();
        typewriter("The world you reside in is one of controlled chaos that keeps it in its order, held there by the powerful cat god and the opposer dog devil.");
        typewriter("The cat god and the dog devil have always been at odds bringing both creation and destruction within your world.");
        typewriter("The cat god has acted as the yang while the dog devil remained the yin.");
        typewriter("And occasionally within their bouts across the vast endless universe, they gave power to champions of their race to aid in the never ending fight between the two of them.");
        typewriter("But here today the selection of champions happened again after hundreds of years passed from past to today.");
        typewriter("It seemed this was their final bout for who would truly overcome who, but a freak accident happened within the time space.");
        typewriter("With selection of heroes for each of their sides, one of the cats had been bestowed with the power of both the cat god and the dog devil before them.");

        typewriter("In this game, you will have a lot of different stats which can give you different strengths.");
        displayStats();

        System.out.println(" ");
        System.out.println("_____________________________________");
        System.out.println("What is your name?");
        System.out.println("_____________________________________");
        mainPlayer.Name = scan.nextLine();
        typewriter("\nThat cat is YOU, "+mainPlayer.Name+", now you must choose your destiny from either taking the side of the cat god with the blue orb, or the dog devil of the red.");
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void displayStats() {
        System.out.println("_____________________________________");
        typewriter("Here are your current Stats:");
        System.out.println("_____________________________________");
        typewriter(GREEN + "Name: " + mainPlayer.Name + RESET);
        typewriter(GREEN + "Coins: " + mainPlayer.Money + RESET);
        typewriter(GREEN + "Health Points: " + mainPlayer.curHP + "/" + mainPlayer.maxHp + RESET);
        typewriter(GREEN + "Magic Points: " + mainPlayer.curMP + "/" + mainPlayer.maxMp + RESET);
        typewriter(GREEN + "Attack Points: " + mainPlayer.curAP + "/" + mainPlayer.maxAp + RESET);
        typewriter(GREEN + "Defense Points: " + mainPlayer.curDP + "/" + mainPlayer.maxDp + RESET);
        typewriter(GREEN + "Altruism Aura: " + mainPlayer.curAt + "/" + mainPlayer.maxAt + RESET);
        typewriter(GREEN + "Devilish Aura: " + mainPlayer.curDv + "/" + mainPlayer.maxDv + RESET);

    }
    public static void blueOrb() {
        //Cat
        typewriter("You have chosen to join the Cats in the city, Citty Crawl");
        typewriter("You are magically transported to a Fork in the road!");
        System.out.println("_____________________________________");
        cat_fork();
    }

    public static void cat_fork() {
        System.out.println(" ");
        System.out.println("_____________________________________");
        System.out.println(" ");
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
        }else if (choice.equalsIgnoreCase("B")) {
            System.out.println("_____________________________________");
            typewriter("You have gone down the road to the Group of Cats!");
            typewriter("As you get close to the group of Cats, you claim you are the hero of the Cats. The Group of Cats hiss at you in disbelief and challenge you to a fight.");
            typewriter("You deny being false, you must pass the Charisma Check in order to prove yourself!");
            System.out.println("_____________________________________");
            typewriter("Press ENTER to roll for your aura! Your chances start at 500 and for each item or bonus you have gotten will improve your chances!");
            scan.nextLine();
            typewriter("Rolling...");

            int rolmax = 500;
            if (mainPlayer.Inventory[1] != null) {
                rolmax -= 150;
                typewriter(BLUE + "You have items in your inventory. Your chances increase!" + RESET);

            }
            if (mainPlayer.Inventory[2] != null) {
                rolmax -= 100;
                typewriter(BLUE + "You have items in your inventory. Your chances increase!" + RESET);
            }
            if (mainPlayer.Inventory[3] != null) {
                rolmax -= 50;
                typewriter(BLUE + "You have items in your inventory. Your chances increase!" + RESET);
            }
            if (mainPlayer.curHP == mainPlayer.maxHp) {
                rolmax -= 50;
                typewriter(BLUE + "You your Health is maxed out and you are in best shape. Your chances increase!" + RESET);
            }
            if (mainPlayer.Money >= 100) {
                rolmax = 0;
                typewriter(BLUE + "You have earned more than enough cash to buy off the cats! Your chance is now 100%!" + RESET);

            }
            typewriter(BLUE + "After adding up your bonuses, you must get a " + rolmax + " or higher to gain the Cats' trust!" + RESET);

            int roll = new Random().nextInt(0, 500);
            typewriter("You tested your luck and your Charisma is " + roll);
            System.out.println(GREEN + "You tested your luck and you rolled a " + roll + " and you needed a " + rolmax + " or higher!" +  RESET);

            if (roll >= rolmax) {
                gain_followers(4);
                System.out.println("_____________________________________");
                typewriter("You have successfully beat the game! This would've been the option to continue the story in gaining followers and gaining power, but that's all for now...");
            }
            else {
                typewriter("You didn't pass the Charisma Check...");
                typewriter("The cats attack and you can barely fight back.");
                typewriter("");
                typewriter(BLUE + "You lose 30 Health!" + RESET);
                mainPlayer.curHP -= 30;
                if (mainPlayer.curHP < 0) {
                    return;
                }
                typewriter(GREEN + "Your health is now " + mainPlayer.curHP + "/" + mainPlayer.maxHp + RESET);
                typewriter(BLUE + "Try your luck in Crafty Crafts at the Fountain or buy some items in the shop to increase your chances!" + RESET);

                typewriter("You escaped out, back to the fork in the road... Come back when you have better stats!");
                System.out.println("_____________________________________");
                //end("group of angry cats");
                cat_fork();
            }
        }
        else if (choice.equalsIgnoreCase("C")) {
            System.out.println("_____________________________________");
            typewriter("You have gone down the road to the Crafty Crafts City!");
            typewriter("Travelling...");
            typewriter("                                                 ");
            //Thread.sleep(2000);//0.5s pause between characters
            typewriter("You have arrived at the City and there is a fountain.");
            typewriter("On a sign it says throw 1 Coin in and test your luck.");
            fountain();
        }
        else {
            typewriter(RED + "Sorry that's not an option!" + RESET);
            System.out.println(" ");
            cat_fork();
        }
    }

    public static void fountain() {
        typewriter("You think deeply about what you should do.");
        System.out.println(" ");
        System.out.println("_____________________________________");
        System.out.println("Will you throw 1 coin into the fountain?");
        System.out.println("A | Spend 1 Coin");
        System.out.println("B | Return to Citty Crawl");
        String choice = scan.nextLine();
        if (choice.equalsIgnoreCase("A")) {
            if (mainPlayer.Money >= 1) {
                mainPlayer.Money -= 1;
                typewriter("You take a coin out of your pouch and toss into the fountain.");
                typewriter("The fountain Swirls and splashes...");
                typewriter("                                                 ");
                int reward = new Random().nextInt(0,201);
                if (reward >= 200) {
                    mainPlayer.Money += 1000;
                    typewriter(BLUE + "YOU GOT THE JACKPOT.\n1000 Coins have been added to your Pouch." + RESET);
                } else if (reward >= 150) {
                    typewriter(BLUE + "Your pouch suddenly is full.\n30 Coins have been added to your Pouch." + RESET);
                    mainPlayer.Money += 30;

                } else if (reward >= 100) {
                    typewriter(BLUE + "Your pouch starts to swell a small amount.\n15 Coins have been added to your Pouch." + RESET);
                    mainPlayer.Money += 15;
                } else {
                    typewriter(BLUE + "You look at your pouch expecting something to happen..." + RESET);
                }

                typewriter(GREEN + "Your pouch now holds " + mainPlayer.Money + " Coins!" + RESET);
                System.out.println("_____________________________________");
                typewriter("Your focus returns to the fountain again.");
                fountain();
            }
            else {
                System.out.println("Sorry, you don't have enough Coins!");
                fountain();
            }
        } else if (choice.equalsIgnoreCase("B")) {
            typewriter("You turn around and head back to Citty Crawl.");
            cat_fork();
        } else {
            typewriter(RED + "Sorry that's not an option!" + RESET);
            fountain();
        }
    }

    public static void cat_shop() {
        System.out.println("_____________________________________");
        typewriter("Shopkeeper: Here are our items:");
        System.out.println("A | Catnip (HP+) - 10 Coins");
        System.out.println("B | Fish Scale Armor (DP+) - 20 Coins");
        System.out.println("C | Metal Claws (AP+) - 15 Coins");
        System.out.println(" ");
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
        }else if (choice.equalsIgnoreCase("b")) {
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
        } else if (choice.equalsIgnoreCase("c")) {
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
        } else if (choice.equalsIgnoreCase("Z")) {
            typewriter("You bid the Shop Keeper farewell and exit, the bell ringing behind you.");
            typewriter("Your Inventory now consists of:");
            for (int i = 0; i < mainPlayer.Inventory.length; i++) {
                System.out.println(mainPlayer.Inventory[i]);
            }
            System.out.println("_____________________________________");
            typewriter("Your back at the fork in the road!");
            cat_fork();
        } else {
            typewriter(RED + "Sorry that's not an option!" + RESET);
            cat_shop();
        }
    }
    public static void gain_followers(int followers) {
      int amount_joined = new Random().nextInt(1,8);
        mainPlayer.influenced += followers;
        mainPlayer.curAt += 5;
        if (mainPlayer.curAt > mainPlayer.maxAt) {
            mainPlayer.curAt = mainPlayer.maxAt;
        }
        typewriter(GREEN + "You have gained " + followers + " Followers to your cause and 5 Altruism Aura" + RESET);
        typewriter(BLUE + "You now have " + mainPlayer.influenced + " followers and " + mainPlayer.curAt + " Altruism Aura" + RESET);

        System.out.println("_____________________________________");
        System.out.println(" ");
        typewriter( " ");

    }
    public static void redOrb() {
        //Dog
        System.out.println(" ");
        System.out.println("_____________________________________");
        System.out.println(" ");
        typewriter("You have chosen to join the Dogs in ");

    }

    public static void dog_fork() {

    }

    public static void typewriter(String text) {
        int i;
        for (i = 0; i < text.length(); i++) {
            System.out.printf("%c", text.charAt(i));
            try {
                Thread.sleep(20);//0.5s pause between characters
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(" ");
    }

    public static void end(String Reason) {
        System.out.println(" ");
        System.out.println("_____________________________________");
        System.out.println(" ");
        typewriter(RED + "You have lost the game to " + Reason + "!" + RESET);
        typewriter("Thanks for Playing!");
    }





    //file ends on next line
}