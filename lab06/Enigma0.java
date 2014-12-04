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
        int n; //variable must be declared here for proper scope
        if(scan.hasNextInt()){
            n=scan.nextInt();
            System.out.println("You entered "+n);
        }
        else{
            n=4;
            System.out.println("You entered "+n);
        }
    
        int k=4,p=6,q=7,r=8;
        switch(k+p+q+r){
            case 24: 
            case 25: System.out.println("sum is 25");
            default:
                System.out.println("Again, you entered "+n);
        }
    }
}

/* Error report:
 *   Scope error with int n;
 *   Had to move the declaration of int n outside of 
 *   and above the if statement.
 */

