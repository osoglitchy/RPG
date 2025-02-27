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
    }

    public static void intro()
    {
        typewriter("Our story begins here...");

        //use typewriter( ) to print out the intro setup for your story.

        //1. tell us the lore of your world
        //2. tell us who our character is
        //3. let us input in a name for our character
        //4. give us a quest
        //5. it should end with a choice/decision
        //6. s
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