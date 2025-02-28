package RPG;

import java.util.Scanner;
import java.util.Random;

public class TextBasedRPG {
    public static Scanner scan = new Scanner(System.in);
    public static Random random = new Random();
    //determines the amount of items you can carry
    public static int maxItems = 5;
    //this is your actual inventory
    public static String[] inventory = new String[maxItems];




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
        if (choiceOrb.equalsIgnoreCase("a"))
        {
            redOrb();
        }
    }

    public static void intro()
    {
        typewriter("Our story begins here...");
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
        System.out.println("What is your name?");
        String name = scan.nextLine();
        typewriter("That cat is YOU, "+name+", now you must choose your destiny from either taking the side of the cat god with the blue orb, or the dog devil of the red.");

        //use typewriter( ) to print out the intro setup for your story.

        //1. tell us the lore of your world
        //2. tell us who our character is
        //3. let us input in a name for our character
        //4. give us a quest
        //5. it should end with a choice/decision

    }

    public static void blueOrb() {
        //enter code here
    }

    public static void redOrb() {
        //enter code here
    }

    public static void typewriter(String text) {
        int i;
        for (i = 0; i < text.length(); i++) {
            System.out.printf("%c", text.charAt(i));
            try {
                Thread.sleep(75);//0.5s pause between characters
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("");
    }







    //file ends on next line
}