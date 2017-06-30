package Labs; /**
 * Created by michelhayman on 6/29/17.
 */

import java.util.Scanner;


public class dice5 {

    // can add code here

    private static Scanner scan = new Scanner(System.in);

    private static String choice = "y";

    private static int roll1;
    private static int roll2;
    private static int userInput = 0;


    public static void main(String[] args) {
int numberSides; // declaring here

        System.out.println("How many sides should each die have? "); // asking user how many sides a die has
        numberSides = scan.nextInt(); // user input

        rolledDie(numberSides); // calling this method - numberSides connects nSides from RolledDice

    }

    public static void rolledDie(int nSides) { // int nSides = numberSides from main

        while (choice.equalsIgnoreCase("y")) {

            System.out.println("How many times do you want to roll the dice? "); // asking user how many times they want to roll the die
            userInput = scan.nextInt();


            for (int i = 0; i < userInput; i++) { // for loop for the random dice output


                roll1 = (int) (Math.random() * nSides + 1); // roll one -random **nSides is numberSides from main

                System.out.println("Rolls: " + roll1); // roll one output

            }
            System.out.println("Do you want to roll again? (y/n)"); // asking user to roll again
            choice = scan.next();
            System.out.println();
        }

        if (choice.equalsIgnoreCase("n")) {
            System.out.println("bye!"); // if user presses n - leaves
        }


    }
}



