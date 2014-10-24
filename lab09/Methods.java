//Amber Wallace
//10/22/2014
//lab09-Methods

//import scanner
import java.util.Scanner;
//create class
public class Methods {
    //create main method
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three ints");
        a = getInt(scan);
        b = getInt(scan);
        c = getInt(scan);
        System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b));
        System.out.println("The larger of " + a + ", " + b + ", and " + c +
            " is " + larger(a, larger(b, c)));
        System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b +
            ", and " + c + " are in ascending order");
    }
    public static int getInt(Scanner scan){ //create method for geting user input
        System.out.print("Enter an int- "); //request user enter an int
        while(!scan.hasNextInt()){ //continue asking while user's input is not an integer
            String junk=scan.next(); //put bad input in a junk variable
            System.out.print("You did not enter an int; try again- "); //ask again for an int
        }
        return scan.nextInt(); //the method returns the entered int
    }
    public static int larger(int x, int y){ //method that determines which int is larger
        // code here
        if(x>y){ //if the first int is larger
            return x; //return the first int
        }
        else{ //otherwise
            return y; //return the second int
        }
    }
    public static boolean ascending(int i, int j, int k){ //method that determines weather three nums are ascending
        if(i<j && j<k){ //if the order is from smallest to largest
            return true; //ascending
        }
        else{
            return false; //not ascending 
        }
    }
}
        
/*******SAMPLE RUNS:
Enter three ints
Enter an int- r
You did not enter an int; try again- 3
Enter an int- 8
Enter an int- 9
The larger of 3 and 8 is 8
The larger of 3, 8, and 9 is 9
It is true that 3, 8, and 9 are in ascending order

Enter three ints
Enter an int- 4
Enter an int- 3
Enter an int- 7
The larger of 4 and 3 is 4
The larger of 4, 3, and 7 is 7
It is false that 4, 3, and 7 are in ascending order
*/
