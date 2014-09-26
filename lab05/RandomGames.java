//Amber Wallace
//9/25/2014
//lab05-RandomGames
/*Write a program that uses the Scanner class to obtain from the user
one of three choices for a game of chance: (1) Roulette; (2) Craps; or (3) Picking a
card from a deck of playing cards. The user should enter one of the Strings “R” , “r”,
“C”, “c”, “P”, “p”. If the string is not of length one, an error message should be
displayed. If the string has any other character than ‘R’, ‘r’, ‘C’, ‘c’, ‘P’, or ‘p’ an error
message should be displayed. If the user enters “R” or “r” then the program will print
the results of a play at Roulette, one of the numbers 0, 00, 1, 2, …, 36 (the roulette
wheel has 18 red numbers, 1, 3, …, 35, 18 black numbers, 2,4,...,36, and a blue 0
and a blue 00)*/

//import Scanner
import java.util.Scanner;
//create class
public class RandomGames{
    //create main method
    public static void main(String[] args){
        //create scanner
        Scanner input=new Scanner(System.in);
        //get user input
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        //check input
        if(input.hasNext()){
            //check for letter
            String letter=input.next();
            if(letter.equals("R") || letter.equals("r")){
                //roulettee
                //get random number
                int rand=(int)(Math.random()*38);
                //change 37 to 00
                if(rand==37){
                    //print 00
                    System.out.println("Roulette: 00");
                    return;
                }
                else{
                    //print number
                    System.out.println("Roulette: "+rand);
                    return;
                }
                
            }
            else if(letter.equals("C") || letter.equals("c")){
                //Craps
                //program not finished message
                System.out.println("This game is not yet ready :'(");
                return;
            }
            else if(letter.equals("P") || letter.equals("p")){
                //Pick a card
                //program not finished message
                System.out.println("This feature has not been implemented yet.");
                return;
            }
            else{
                //not an acceptable letter
                System.out.println("This is not a game option.");
                return;
            }
        }
        else{
            //no input
            System.out.println("You must pick a game to continue.");
            return;
        }
    }
}