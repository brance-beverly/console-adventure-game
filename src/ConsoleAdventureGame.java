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

        System.out.println(playerName);

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

        return playerName;
    }

    public static void display(String playerName, int maxHealth, int currentHealth, int syrupCount){

        System.out.println(playerName);
        System.out.println("Health: " + currentHealth/50);
        System.out.println("Maple Syrup: ");
        System.out.println("Run, Eh?");

    }

}
