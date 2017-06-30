package Labs; /**
 * Created by michelhayman on 6/29/17.
 */

import java.util.Scanner;


public class dice5 {

    // can add code here

    private static Scanner scan = new Scanner(System.in);

    private static String choice = " ";
    private static int numberSides;
    private static int roll1;
    private static int roll2;


    public static void main(String[] args) {

        System.out.println("How many sides should each die have? "); // asking user how many sides a die has
        numberSides = scan.nextInt(); // user input

        rolledDie(); // calling this method

    }

    public static void rolledDie() {

        System.out.println("Please roll the dice. "); // asking user to roll dice


        while (choice.equalsIgnoreCase("y")) ;

        for (int i = 0; i < 2; i++) { // for loop for the random dice output


            roll1 = (int) (Math.random() * numberSides + 1); // roll one -random
            roll2 = (int) (Math.random() * numberSides + 1); // roll two -random


            System.out.println(" Roll 1 : " + roll1); // roll one output
            System.out.println(" Roll 2 : " + roll2); // roll two output


            System.out.println("Do you want to roll again? (y/n)"); // asking user to roll again
            choice = scan.next();
            System.out.println();

        }

        {

            System.out.println("bye!"); // if user presses n - leaves
        }
    }

}
// code can go here


