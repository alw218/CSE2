//Amber Wallace
//9/26/2014
//hw05-BurgerKing
/*prompts the user to enter a choice of a burger, a soda, or fries. 
Then the program prompts the users for details of their choices*/

//import scanner
import java.util.Scanner;
//create class
public class BurgerKing{
    //create main method
    public static void main(String[] args){
        //create new scanner
        Scanner input=new Scanner(System.in);
        //get user input
        System.out.print("Enter a letter to indicate a choice of\n   Burger (B or b)\n   Soda (S or s)\n   Fries (F or f) - ");
        //cycle through letter options
        switch(input.next()){
            case "B":
            case "b":
                //burger
                //ask for more info
                System.out.print("Enter A or a for \"all the fixins\"\nC or c for cheese\nN or n for none of the above- ");
                //get input
                switch(input.next()){
                    case "A":
                    case "a":
                        //all the fixins
                        System.out.println("You ordered a burger with all the fixins.");
                        break;
                    case "C":
                    case "c":
                        //cheese
                        System.out.println("You ordered a burger with cheese.");
                        break;
                    case "N":
                    case "n":
                        //none of the above
                        System.out.println("You ordered a plain burger.");
                        break;
                    default:
                        //wrong input
                        System.out.println("You did not pick a possible option.");
                        break;
                }
                break;
            case "S":
            case "s":
                //soda
                //ask for more info
                System.out.print("Do you want Pepsi (p or P),\n Coke (c or C), \nSprite (s or S) \nor Mountain Dew (M or m)- ");
                //check for info
                switch(input.next()){
                    case "P":
                    case "p":
                        //pepsi
                        System.out.println("You ordered a Pepsi.");
                        break;
                    case "C":
                    case "c":
                        //coke
                        System.out.println("You ordered a Coke.");
                        break;
                    case "S":
                    case "s":
                        //Sprite
                        System.out.println("You ordered a Sprite.");
                        break;
                    case "M":
                    case "m":
                        //Mountain dew
                        System.out.println("You ordered a Mountain Dew.");
                        break;
                    default:
                        //wrong input
                        System.out.println("You did not pick a possible option.");
                        break;
                }
                break;
            case "F":
            case "f":
                //fries
                //ask for more info
                System.out.print("Do you want a large or small order of fries (l,L,s, or S)- ");
                //check for info
                switch(input.next()){
                    case "L":
                    case "l":
                        //large
                        System.out.println("You ordered a large order of fries.");
                        break;
                    case "S":
                    case "s":
                        //small
                        System.out.println("You ordered a small order of fries.");
                        break;
                    default:
                        //wrong input
                        System.out.println("You did not pick a possible option.");
                        break;
                }
                break;
            default:
                //not an option
                System.out.println("This is not an option.");
                break;
        }
    }
}