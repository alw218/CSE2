//Amber Wallace
//9/18/2014
//lab04-BigMacAgain
//ask for number of BigMacs and Fries and generate price

//import scanner
import java.util.Scanner;
//create class
public class BigMacAgain{
    //create main method
    public static void main(String[] args){
        //create new scanner
        Scanner input=new Scanner(System.in);
        //get number of bigmacs
        System.out.print("Enter the number of Big Macs: ");
        //test for int
        if(input.hasNextInt()){ 
            //collect input
            int numBM=input.nextInt();
            //test for positive input
            if(numBM>0){ //input is positive
                double priceBM=222*numBM/100.0; //price of x bigmacs
                //print price of just bigmacs
                System.out.println("You ordered "+numBM+" for a cost of "+numBM+"x2.22 = $"+priceBM);
                //ask about fries
                System.out.print("Do you want an order of fries (Y/y/N/n)?: ");
                String fries=input.next();
                //check for a y or n and respond accordingly
                if(fries.equals("y") || fries.equals("Y")){
                    //update cost
                    double price=priceBM+2.15;
                    //print info
                    System.out.println("You ordered fries at a cost of $2.15");
                    System.out.println("The total cost of the meal is $"+price);
                }
                else if(fries.equals("n") || fries.equals("N")){
                    //print final price W/O fries
                    System.out.println("The total cost of the meal is $"+priceBM);
                }
                else{
                    //reject input
                    System.out.println("You did not enter one of 'y','Y','n','N'");
                }
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