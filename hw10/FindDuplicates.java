//Amber Wallace
//11/14/2014
//hw10-FindDuplicates

/*
I have omitted the code for two methods called in the main method, hasDups() and 
exactlyOneDup(). Write these methods. Below the program, I show the expected output. 
The method hasDups() should return true if and only if the input array has at least 
one repeated entry. The method exactlyOneDup() returns true if and only if there 
is exactly one repeated entry (for example, exactlyOneDup() is true for {2, 7, 2},
false for {2, 2, 2, 3, 4} and false for { 2, 2, 3, 3})
*/

//import scanner
import java.util.Scanner;
//create class
public class FindDuplicates {
    //create main method
    public static void main(String[] arg) {
        //create new scanner
        Scanner scan = new Scanner(System.in);
        //create new array
        int num[] = new int[10];
        //create empty string var
        String answer = "";
        do { 
            System.out.print("Enter 10 ints- "); //ask user for data
            for (int j = 0; j < 10; j++) { //collect ints 10 times
                num[j] = scan.nextInt(); //store ints in array
            }
            //output the array
            String out = "The array ";
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) { //if has dups 
                out += "has "; //print has
            }
            else { //if doesnt have dups
                out += "does not have "; //print does not have
            }
            out += "duplicates."; //print duplicates
            System.out.println(out); 
            out = "The array ";
            out += listArray(num);
            if (exactlyOneDup(num)) {
                out += "has ";
            }
            else {
                out += "does not have ";
            }
            out += "exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); //ask to go again
            answer = scan.next(); //check answer
        } while (answer.equals("Y") || answer.equals("y")); //if answer is yes repeat process
    }
    
    //create method for hasDups
    public static boolean hasDups(int[] num){
        //test for dups
        //create new boolean
        boolean test=false;
        //cycle through members of array
        for(int number=0; number<num.length; number++){
            //for each member of array cycle through all members of the same array
            for(int check=0; check<num.length; check++){
                //if they are not the same member
                if(check!=number){
                    //if the members are the same number
                    if(num[check]==num[number]){
                        //test for dups = true
                        test=true;
                    }
                }
            }
        }
        //return boolean result
        return test;
    }
    
    //create method for exactally one dup
    public static boolean exactlyOneDup(int num[]){
        //test for exactly one dup
        //create boolean variable
        boolean test=false;
        //create var to store number of instances of dups
        int numDups=0;
        for(int number=0; number<num.length; number++){ //cycle through members of array
            for(int check=0; check<num.length; check++){ //for each member of the array cycle through each member of the same array
                if(check!=number){ //if the member of the array is not the same
                    if(num[check]==num[number]){ //if the members of the array equal each other
                        numDups++; //increment instances of dups
                    }
                }
            }
        }
        if(numDups==2){ //if instances of dups = 2 (one duplicate)
            test=true; //result is true
        }
        return test; //return result 
    }

    //create method for listing array
    public static String listArray(int num[]) {
        //create string
        String out = "{"; //include bracket
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                out += ", "; //include comma when appropriate
            }
            out += num[j]; //include each member of array
        }
        out += "} "; //include end bracket
        return out; //return string of printed array
    }
}

/*
Sample Output:

Enter 10 ints- 1 23 1 3 4 5 6 7 8 9 
The array {1, 23, 1, 3, 4, 5, 6, 7, 8, 9} has duplicates.
The array {1, 23, 1, 3, 4, 5, 6, 7, 8, 9} has exactly one duplicate.
Go again? Enter 'y' or 'Y', anything else to quit- y
Enter 10 ints- 1 2 3 4 5 6 7 8 9 0
The array {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} does not have duplicates.
The array {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} does not have exactly one duplicate.
Go again? Enter 'y' or 'Y', anything else to quit- y
Enter 10 ints- 1 2 1 2 3 4 5 8 9 7
The array {1, 2, 1, 2, 3, 4, 5, 8, 9, 7} has duplicates.
The array {1, 2, 1, 2, 3, 4, 5, 8, 9, 7} does not have exactly one duplicate.
Go again? Enter 'y' or 'Y', anything else to quit- n
*/