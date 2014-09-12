//Amber Wallace
//9/12/2014
//lab03-BigMac.java program

//import scanner
import java.util.Scanner;
//create class
public class BigMac{
    //add main method
    public static void main(String[] args){
        //prompt the user for input
        Scanner myScanner=new Scanner(System.in);
        System.out.print("Enter the number of Big Macs (an integer > 0): ");
        //accept user input
        int nBigMacs=myScanner.nextInt();
        //get BigMac cost and tax
        System.out.print("Enter the cost per BigMac as "+"a double (in the form xx.xx): ");
        double bigMac$=myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate=myScanner.nextDouble();
        //get proportion
        taxRate/=100;
        //create new variables
        double cost$;
        int dollars,
        dimes,
        pennies;
        //find total cost
        cost$=nBigMacs*bigMac$*(1+taxRate);
        //convert cost to dollars dimes and pennies
        dollars=(int) cost$;
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%100;
        //print output
        System.out.println("The total cost of "+nBigMacs+" Big Macs, at $"+bigMac$+", with a sales tax of "
        +(int)(taxRate*100)+"%, is $"+dollars+"."+dimes+pennies);
    }
}