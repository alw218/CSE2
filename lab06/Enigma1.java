//Amber Wallace
//10/6/2014
//lab06-Enigma1

/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1 {
    public static void main(String[] arg) {
        double percent;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for the percent (0, 1,...99)- ");
        if (input.hasNextDouble()) { //check for acceptable input
            double x = input.nextDouble();
            if (x < 0 || x > 99) { //check for value within range
                System.out.println("You did not enter an acceptable value.");
            }
            else {
                System.out.println("You entered " + x + "%");
                //print out the proportion remaining for select percentages
                if (100 - x == 93) //when the user enters 7
                    System.out.println("The proportion remaining is " + 0.93);
                else if (100 - x == 59) //when the user enters 41
                    System.out.println("The proportion remaining is " + 0.59);
                else if (100 - x == 86) //when the user enters 14
                    System.out.println("The proportion remaining is " + 0.86);
                else if (100 - x == 67) //when the user enters 33
                    System.out.println("The proportion remaining is " + 0.67);
                else if (100 - x == 40) //when the user enters 60
                    System.out.println("The proportion remaining is " + 0.40);
            }
        }
        else {
            System.out.println("You did not enter an acceptable value.");
        }
    }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *  comparing values, use 100-x==proportion*100 for better results
 * ensure double is entered before trying to store it in x
 * make sure double is within range before using it
 * 
 */

