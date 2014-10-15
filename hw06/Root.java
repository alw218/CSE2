//Amber Wallace
//10/10/2014
//hw06-Root

/*
Write a Java program that forces the user to enter a double that is greater
than 0, uses an algorithm to compute the square root of the number, 
and then prints it out. Use 0.0000001 as the “tolerance” for stopping the 
loop that computes the square root. 
*/

/*
Start by setting low to 0 and high to 1+x.
Now take the middle of the interval [low, high] and call it middle. 
If the square of middle is greater than x, then change high to middle; 
otherwise change low to middle. At this point the square root is still between 
low and high, but the distance between low and high has been halved. 
Repeat this process until the difference between high and low is less than 
some small multiple of 1+x, say 0.0000001*(1+x). Then the square root is very 
close to both low and high. For example, to find the square root of 2, start 
with [0,3] (0*0<2 and 3*3 > 2). The middle is 1.5. 1.5*1.5=2.25>2, so the 
new interval is [0,2.25]. Now the middle is 1.125. 1.125*1.125<2, so the new 
interval is [1.125,2.25]. And so on.
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
        double x=-5;
        System.out.print("Enter a double: ");
        if(input.hasNextDouble()){
            x=input.nextDouble();
        }
        else{
            //reject input
            System.out.println("That is not a double.");
            return;
        }
        double low=0;
        double high=x+1;
        double middle=(low+high)/2;
        while(high-low>0.0000001*(x+1)){
            middle=(low+high)/2;
            if(middle*middle>x){
                high=middle;
            }
            else{
                low=middle;
            }
        }
        System.out.println("The square root of "+x+" is "+middle);
    }
}
        
            