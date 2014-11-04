//Amber Wallace
//11/3/2014
//hw09-BlockedAgain

/*
create and call a bunch of methods that ultimately build the same block tower as
hw07-NumberStack.java
*/

//import scanner
import java.util.Scanner;
//create class
public class BlockedAgain {
    //create main method
    public static void main(String[] s) {
        //create int var to store acceptable input
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }
    
    //create method [A]
    public static int getInt(){
        //create scanner
        Scanner input=new Scanner(System.in);
        //create var for data
        int data;
        //ask the user for input
        System.out.print("Enter an int between 1 & 9- ");
        //use the method that returns true if an int to check for int
        while(!checkInt(input)){
            //when input is not an int store it in junk
            String junk=input.next();
            //ask the user to try again
            System.out.print("That was not an int. Please try again- ");
        }
        //when user enters int, store as data
        data=input.nextInt();
        //ensure data is within range
        int finalData=checkRange(data, input);
        //return data
        return finalData;
    }
    //create method for [A1]
    public static boolean checkInt(Scanner input){
        //create a variable to store boolean value
        boolean isInt;
        //if there is an int
        if (input.hasNextInt()){
            //boolean is true
            isInt=true;
        }
        //if there is no int
        else{
            //boolean is false
            isInt=false;
        }
        //return boolean
        return isInt;
    }
    //create method for [A2]
    public static int checkRange(int data, Scanner input){
        if(data>=1 && data<=9){ //if within range
            return data; //return data
        }
        else{ //if not within range
            //request new data
            System.out.print("Int was not within specified range of 1-9. Please try again- ");
            while(!checkInt(input)){ //recheck for int
                String junk=input.next(); //store input that isnt int
                System.out.print("That was not an int. Please try again- "); //request new data
            }
            //store data that is int
            data=input.nextInt();
            //again, check weather int is within range
            data=checkRange(data, input);
            //return data
            return data;
        }
    }
    //create method [B]
    public static void allBlocks(int number){
        //set sentinal value
        int sentinal=number+1;
        //loop through numbers in tower
        while(number>0){
            //call block function
            block(sentinal-number, sentinal);
            //call line function
            line(sentinal-number, sentinal);
            //reduce number by one
            number--;
        }
    }
    //create method[B1]
    public static void block(int num, int forPadding){
        //loop for rows
        for(int rows=1; rows<=num; rows++){
            //loop for padding
            for(int padding=forPadding-num-1; padding>0; padding--){
                System.out.print(" "); //print spaces as padding
            }
            //loop for printing numbers in columns
            for(int columns=1; columns<=num*2-1; columns++){
                System.out.print(num); //print number
            }
            System.out.println(); //drop line
        }
    }
    //create method [B2]
    public static void line(int num, int forPadding){
        //loop for padding
        for(int padding=forPadding-num-1; padding>0; padding--){
            System.out.print(" "); //print spaces as padding
        }
        //loop for dashes
        for(int lines=1; lines<=num*2-1; lines++){
            System.out.print("-"); //print dashes
        }
        System.out.println(); //drop new line
    }
}
