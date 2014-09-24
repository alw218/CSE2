//Amber Wallace
//9/23/2014
//hw04-TimePadding.java
//get time in seconds and return h:m:s 

//import scanner
import java.util.Scanner;
//create class
public class TimePadding{
    //create method
    public static void main(String[] args){
        //create scanner
        Scanner input=new Scanner(System.in);
        //get input
        System.out.print("Enter the time in seconds: ");
        //check for correct input
        if(input.hasNextInt()){
            //set var for input
            int seconds=input.nextInt();
            //check for positive int
            if(seconds>0){
                //get hours
                int hours=(int)(seconds/(60*60));
                //get minutes
                int min=(int)((seconds%(60*60))/60);
                //get remaining seconds
                int secs=seconds-((hours*60*60)+(min*60));
                //print data
                System.out.printf("The time is %02d:%02d:%02d\n",hours,min,secs);
            }
            else{
                //reject input
                System.out.println("This is not a positive integer.");
            }
        }
        else{
            //reject input
            System.out.println("This is not an integer.");
        }
    }
}
                