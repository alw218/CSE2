//Amber Wallace
//9/13/2014
//hw03-Root

//import Scanner
import java.util.Scanner;

//create class
public class Root{
    //create method
    public static void main(String[] args){
        //create new scanner
        Scanner input=new Scanner(System.in);
        //get user input
        System.out.print("Enter a number: ");
        double cube=input.nextDouble();
        double guess=cube/3; //initial guess
        //updated aproximations
        guess=(2*guess*guess*guess+cube)/(3*guess*guess);
        guess=(2*guess*guess*guess+cube)/(3*guess*guess);
        guess=(2*guess*guess*guess+cube)/(3*guess*guess);
        guess=(2*guess*guess*guess+cube)/(3*guess*guess);
        guess=(2*guess*guess*guess+cube)/(3*guess*guess);
        double guessCube=guess*guess*guess; //actual cube of aproximation
        //print output
        System.out.println("The estimate for the cube root is "+guess+" and the cube of this estimate is "+guessCube);
    }
}