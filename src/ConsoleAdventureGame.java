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
            System.out.println("Somehow you got stuck in Canada without your passport, Eh? To get back to the states you gotta avoid a bunch of hosers, Eh?");
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
        System.out.println("This moose looks upset with you.");
        int actiion = getInteger(1, 3);
        if (actiion == 1){
            System.out.format("You take one of the bags of milk that litter the Canadian countryside and huck it at the moose. It takes 10 damage. \nThe moose is unhappy about this so he bites you kinda hard. You take 15 damage.\n");
            enemyHealth -= 10;
            currentHealth -= 15;
            if(currentHealth <= 0){
                System.out.println("DACANADACANADACANADACANADACANADACANADACANADACANADACANADACANADACANAD\n" +
                        "ACANADACANADACAN                                   NADACANADACANADA\n" +
                        "CANADACANADACANA                 A                 ADACANADACANADAC\n" +
                        "ANADACANADACANAD                ADA                DACANADACANADACA\n" +
                        "NADACANADACANADA           AC  ADACA  DA           ACANADACANADACAN\n" +
                        "ADACANADACANADAC            ANADACANADA            CANADACANADACANA\n" +
                        "DACANADACANADACA        DA   ADACANADA   AD        ANADACANADACANAD\n" +
                        "ACANADACANADACAN    ANADACAN  ACANADA  NADACANA    NADACANADACANADA\n" +
                        "CANADACANADACANA     ADACANADACANADACANADACANA     ADACANADACANADAC\n" +
                        "ANADACANADACANAD   NADACANADACANADACANADACANADAC   DACANADACANADACA\n" +
                        "NADACANADACANADA      CANADACANADACANADACANAD      ACANADACANADACAN\n" +
                        "ADACANADACANADAC         DACANADACANADACAN         CANADACANADACANA\n" +
                        "DACANADACANADACA           ANADACANADACA           ANADACANADACANAD\n" +
                        "ACANADACANADACAN         CANADACANADACANAD         NADACANADACANADA\n" +
                        "CANADACANADACANA                 A                 ADACANADACANADAC\n" +
                        "ANADACANADACANAD                 D                 DACANADACANADACA\n" +
                        "NADACANADACANADA                 A                 ACANADACANADACAN\n" +
                        "ADACANADACANADAC                                   CANADACANADACANA\n" +
                        "DACANADACANADACANADACANADACANADACANADACANADACANADACANADACANADACANAD\n");
                System.out.println("Justin Trudeau swoops from the sky with angel wings. He picks you up from the ground and soars to the nearest hospital where you receive free health care. Game Over, Eh?");
            } else if(enemyHealth > 0) {
                mooseFight(playerName, maxHealth, currentHealth, syrupCount, enemyHealth);
            } else {
                System.out.println("  |* * * * * * * * * * OOOOOOOOOOOOOOOOOOOOOOOOO|\n" +
                        "  | * * * * * * * * *  :::::::::::::::::::::::::|\n" +
                        "  |* * * * * * * * * * OOOOOOOOOOOOOOOOOOOOOOOOO|\n" +
                        "  | * * * * * * * * *  :::::::::::::::::::::::::|\n" +
                        "  |* * * * * * * * * * OOOOOOOOOOOOOOOOOOOOOOOOO|\n" +
                        "  | * * * * * * * * *  ::::::::::::::::::::;::::|\n" +
                        "  |* * * * * * * * * * OOOOOOOOOOOOOOOOOOOOOOOOO|\n" +
                        "  |:::::::::::::::::::::::::::::::::::::::::::::|\n" +
                        "  |OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|\n" +
                        "  |:::::::::::::::::::::::::::::::::::::::::::::|\n" +
                        "  |OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|\n" +
                        "  |:::::::::::::::::::::::::::::::::::::::::::::|\n" +
                        "  |OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|\n");
                System.out.println("You slay the moose with a combination of freedom and Muricanness. You flee all the way back to the states and dip some fries in ketchup.");
            }
        } else if (actiion == 2 && syrupCount > 0){
            System.out.format("You grab one of the bottles of Maple Syrup that all visitors are given upon arrival in Canada.\nYou feel the blessing of the queen and gain 30 health.\n");
            if (currentHealth + 30 > maxHealth) {
                syrupCount -= 1;
                currentHealth = maxHealth;
                mooseFight(playerName, maxHealth, currentHealth, syrupCount, enemyHealth);
            } else {
                syrupCount -= 1;
                currentHealth += 30;
                mooseFight(playerName, maxHealth, currentHealth, syrupCount, enemyHealth);
            }
        } else if(actiion == 2 && syrupCount == 0) {
            System.out.println("I'm really soory but you're out of Maple Syrup, Eh?");
            mooseFight(playerName, maxHealth, currentHealth, syrupCount, enemyHealth);
        } else if (actiion == 3){
            System.out.println("DACANADACANADACANADACANADACANADACANADACANADACANADACANADACANADACANAD\n" +
                    "ACANADACANADACAN                                   NADACANADACANADA\n" +
                    "CANADACANADACANA                 A                 ADACANADACANADAC\n" +
                    "ANADACANADACANAD                ADA                DACANADACANADACA\n" +
                    "NADACANADACANADA           AC  ADACA  DA           ACANADACANADACAN\n" +
                    "ADACANADACANADAC            ANADACANADA            CANADACANADACANA\n" +
                    "DACANADACANADACA        DA   ADACANADA   AD        ANADACANADACANAD\n" +
                    "ACANADACANADACAN    ANADACAN  ACANADA  NADACANA    NADACANADACANADA\n" +
                    "CANADACANADACANA     ADACANADACANADACANADACANA     ADACANADACANADAC\n" +
                    "ANADACANADACANAD   NADACANADACANADACANADACANADAC   DACANADACANADACA\n" +
                    "NADACANADACANADA      CANADACANADACANADACANAD      ACANADACANADACAN\n" +
                    "ADACANADACANADAC         DACANADACANADACAN         CANADACANADACANA\n" +
                    "DACANADACANADACA           ANADACANADACA           ANADACANADACANAD\n" +
                    "ACANADACANADACAN         CANADACANADACANAD         NADACANADACANADA\n" +
                    "CANADACANADACANA                 A                 ADACANADACANADAC\n" +
                    "ANADACANADACANAD                 D                 DACANADACANADACA\n" +
                    "NADACANADACANADA                 A                 ACANADACANADACAN\n" +
                    "ADACANADACANADAC                                   CANADACANADACANA\n" +
                    "DACANADACANADACANADACANADACANADACANADACANADACANADACANADACANADACANAD\n");
            System.out.format("Avoiding confrontation is the true Canadian way. You leave the fight and take up permanent residence in Nova Scotia.\nThis is actually really nice, Eh? You apologise to everyone for becoming Canadian.");
        }
    }

    public static int getInteger(int min, int max){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInput;
        if(input.hasNextInt()){
            userInput = input.nextInt();
        } else {
            System.out.println("Soory bud. That's an invalid input. Try again, Eh?");
            return getInteger(min, max);
        }
        if (userInput < min || userInput > max){
            System.out.println("Soory bud. That's an invalid range. Try again, Eh?");
            return getInteger(min, max);
        }else {
            return userInput;
        }

    }

}