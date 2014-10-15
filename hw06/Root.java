//Amber Wallace
//10/10/2014
//hw06-Root

/*
Write a Java program that forces the user to enter a double that is greater
than 0, uses an algorithm to compute the square root of the number, 
and then prints it out. Use 0.0000001 as the “tolerance” for stopping the 
loop that computes the square root. 
*/

//import scanner
import java.util.Scanner;
//create class
public class Root{
    //create method
    public static void main(String[] args){
        //create new scanner
        Scanner input=new Scanner(System.in);
        //get input
        double x;
        System.out.print("Enter a double: ");
        if(input.hasNextDouble()){ //check for double
            x=input.nextDouble(); //accept double
        }
        else{
            //reject input
            System.out.println("That is not a double.");
            return;
        }
        if(x<0){ 
            //reject input
            System.out.println("The double must be positive.");
            return;
        }
        double low=0; //set initial low value
        double high=x+1; //set initial high value
        double middle=(low+high)/2; //set initial middle value
        while(high-low>0.0000001*(x+1)){ //test if guess for root is close enough
            middle=(low+high)/2; //update guess for middle
            if(middle*middle>x){ 
                high=middle; //set high as middle value
            }
            else{
                low=middle; //set low as middle value
            }
        }
        //print results
        System.out.println("The square root of "+x+" is "+middle);
    }
}
        
            