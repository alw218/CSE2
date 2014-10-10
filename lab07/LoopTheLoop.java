//Amber Wallace
//10/9/2014
//lab07-LoopTheLoop

//import scanner
import java.util.Scanner;
//create class
public class LoopTheLoop{
    //create method
    public static void main(String[] args){
        //create new scanner
        Scanner input=new Scanner(System.in);
        //infinate loop to repeat question until break
        while(true){
            //set initial value for nStars outside of acceptable range
            int nStars=0;
            //loop until acceptable input is given
            while(nStars>15 || nStars<1){
                //ask for number of stars between 1-15
                System.out.print("Enter an int between 1 and 15 - ");
                //check if input is acceptable
                while(!input.hasNextInt()){
                    //use input
                    String trash=input.next();
                    //prompt user for input again
                    System.out.print("Enter an int between 1 and 15- ");
                }
                //update number of stars
                nStars=input.nextInt();
            }
            //create incrementor
            int i=1;
            //loop to print stars
            while(i<=nStars){
                //print a star on the same line each cycle through the loop
                System.out.print("*");
                //increment by one
                i++;
            }
            //reset incrementor
            i=1;
            //loop through stars one by one
            while(i<=nStars){
                //set new incrementor
                int j=1;
                //create new line for each cycle through nested loop
                System.out.println("\n");
                //loop through stars for each individual line
                while(j<=i){
                    //print a star on the same line for each cycle through the loop
                    System.out.print("*");
                    //increase inner incrementer 
                    j++;
                }
                //increase outer incrementer
                i++;
            }
            //ask weather to continue or break
            System.out.println("\n");
            System.out.print("Enter y or Y to go again- ");
            //get response
            String cont=input.next();
            //unless response is y or Y do not continue
            if(!cont.equals("y") && !cont.equals("Y")){
                //do not continue
                break;
            }
        }
    }
}
        