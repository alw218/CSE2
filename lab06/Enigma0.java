//Amber Wallace
//10/5/2014
//lab06-Enigma0 

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
    public static void main(String arg []){
        System.out.print("Enter an int- ");
        Scanner scan=new Scanner(System.in);
        String n; //variable must be declared here for proper scope also must be string
        if(scan.hasNextInt()){
            n=scan.next();
            System.out.println("You entered "+n);
        }
        else{
            n=scan.next(); //don't auto set as 4, store acutal input
            System.out.println("You did not enter an int."); //report issue
        }
    
        int k=4,p=6,q=7,r=8;
        switch(k+p+q+r){
            case 24: System.out.println("sum is 24"); //the sum would be 24 not 25
                     break; //need break so 24 and 25 aren't both printed
            case 25: System.out.println("sum is 25");
                System.out.println("Again, you entered "+n);
        }
    }
}

/* Error report:
 *   Scope error with int n;
 *   Had to move the declaration of int n outside of 
 *   and above the if statement.
 *   Had to change int n to string n so it could be called instead of autosetting n=4
 *   add different value for sum is 24 and add break
 */

