//Amber Wallace
//9/19/2014
//hw04-IncomeTax
/*prompts the user to enter an int that gives the thousands of dollars of income
and then writes out the amount of tax on the income, given the following 
(progressive) schedule:  <20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14% */

//import scanner
import java.util.Scanner;
//create class
public class IncomeTax{
    //create main method
    public static void main(String[] args){
        //create new scanner
        Scanner input=new Scanner(System.in);
        //get income in thousands
        System.out.print("Enter an int giving the number of thousands- ");
        //test for int
        if(input.hasNextInt()){ 
            //collect input
            int incomeThou=input.nextInt();
            //test for positive input
            if(incomeThou>0){ //input is positive
                //create variables taxRate and tax
                int taxRate;
                double tax;
                int income=incomeThou*1000; //income in thousands
                //decide what tax % is
                if(incomeThou<20){ //income under 20k
                     taxRate=5; //5% tax
                      tax=0.05; //0.05 as multiplier
                }
                else if(incomeThou>=20 && incomeThou<40){ //income between 20k-40k
                     taxRate=7; //7% tax
                      tax=0.07; //0.07 as multiplier
                }
                else if(incomeThou>=40 && incomeThou<78){ //income between 40k-78k
                     taxRate=12; //12% tax
                      tax=0.12; //0.12 as multiplier
                }
                else if(incomeThou>=78){ //income above 78k
                     taxRate=14; //14% tax
                    tax=0.14; //0.14 as multiplier
                }
                else{
                     taxRate=0;
                    tax=0.0;
                }
                //calculate income tax
                double incomeTax=(double)income*tax;
                //print data
                System.out.println("The tax rate on $"+income+" is "+taxRate+"% and the tax is $"+incomeTax);
            }
            else{ //input is not positive
                //reject input
                System.out.println("You did not enter an int > 0");
                return;
            }
        }
        else{ //input is not an integer
            //reject input
            System.out.println("You did not enter an int");
            return;
        }
    }
}