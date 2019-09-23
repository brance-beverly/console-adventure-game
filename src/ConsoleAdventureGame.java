import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;

public class ConsoleAdventureGame {

    public static void main(String[] args) {

        boolean readyToPlay = wantToPlay();
        String playerName = "";

        if(readyToPlay){
            playerName = whatIsYourName();
        }

        System.out.format("You trudge through a light July snow when all of a sudden a moose appears out of nowhere. Oh geez. This isn't good. What do you do?\n1. Attack\n2. Drink Maple Syrup\n3. Run away\n");

        mooseFight(playerName, 50, 50, 3, 50);

    }


//    this asks the player if they are ready at the beggining

    public static boolean wantToPlay(){
        Scanner input = new Scanner(System.in);
        System.out.println("Are you ready to start your Canadian adventure, Eh? Y/N");
        String answer = input.nextLine();

//        while (answer.equalsIgnoreCase("n"))
        if(answer.equalsIgnoreCase("n")){
            System.out.println("Soory to hear that.");
            wantToPlay();
        } else if (!answer.equalsIgnoreCase("n") && !answer.equalsIgnoreCase("y")){
            System.out.println("I don't know what that means. Try again please.");
            wantToPlay();
        } else {
            System.out.println("Somehow you got stuck in Canada without your passport, Eh. To get back to the states you gotta avoid a bunch of hosers, Eh.");
        }

        return true;
    }

    public static String whatIsYourName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Would you enter your name please?");
        String playerName = input.nextLine();
        if(playerName.length() >= 10) {
            System.out.println("Soory bud. That name is too long, Eh? Please try again.");
            whatIsYourName();
        } else {
            System.out.printf("Real glad to meet you %s\n", playerName);
        }

        return playerName;
    }

    public static void display(String playerName, int maxHealth, int currentHealth, int syrupCount, String enemyName, int enemyHealth, int enemyMax, int attackDamage){

        System.out.format("============================================\n%-10s HP: %d/%d Maple Syrup Count: %d\n============================================\n", playerName, currentHealth, maxHealth, syrupCount);
        System.out.format("============================================\n%-10s HP: %d/%d Attack damage: %d\n============================================\n", enemyName, enemyHealth, enemyMax, attackDamage);

    }

    public static void mooseFight(String playerName, int maxHealth, int currentHealth, int syrupCount, int enemyHealth) {
        display(playerName, maxHealth, currentHealth, syrupCount, "Moose", enemyHealth, 50, 15);

    }

}
