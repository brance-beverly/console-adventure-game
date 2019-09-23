import java.util.Scanner;
import java.lang.Math;

public class ConsoleAdventureGame {

    public static void main(String[] args) {

        wantToPlay();

    }

    public static void wantToPlay(){
        Scanner input = new Scanner(System.in);
        System.out.println("Are you ready to start your Canadian adventure, Eh? Y/N");
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("n")){
            System.out.println("Soory to hear that.");
        } else if (answer.equalsIgnoreCase("y")){
            System.out.println("Oh boy.");
        } else {
            System.out.println("I don't know what that means. Try again please.");
            wantToPlay();
        }
    }

}
