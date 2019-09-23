import java.util.Scanner;
import java.lang.Math;

public class ConsoleAdventureGame {

    public static void main(String[] args) {

        wantToPlay();
        String playerName;


    }

//    this asks the player if they are ready at the beggining

    public static void wantToPlay(){
        Scanner input = new Scanner(System.in);
        System.out.println("Are you ready to start your Canadian adventure, Eh? Y/N");
        String answer = input.nextLine();

//        while (answer.equalsIgnoreCase("n"))
        if(answer.equalsIgnoreCase("n")){
            System.out.println("Soory to hear that.");
        } else if (answer.equalsIgnoreCase("y")){
            System.out.println("Awesome");
        } else {
            System.out.println("I don't know what that means. Try again please.");
            wantToPlay();
        }
    }

    public static String whatIsYourName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Would you enter your name please?");
       String playerName = input.nextLine();

        return playerName;
    }

}
