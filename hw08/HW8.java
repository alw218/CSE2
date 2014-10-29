//Amber Wallace
//10/24/2014
//hw08-HW8

/*
create three getInput() methods that each accept different types of inputs
one that accepts scanner and string, one that accepts scanner and two strings, 
and one that accepts scanner, string, and int. All methods should return a char, 
with the exception of the second method that maxes out after a certain number
of tries.
*/

//import scanner
import java.util.Scanner;
//create class
public class HW8 {
    //create main method
    public static void main(String[] arg) {
        char input; //create variable to store char
        Scanner scan = new Scanner(System.in); //create new scanner
        //request user input
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        input = getInput(scan, "Cc");
        System.out.println("You entered '" + input + "'");
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        input = getInput(scan, "yYnN", 5); //give up after 5 attempts
        if (input != ' ') {
            System.out.println("You entered '" + input + "'");
        }
        input = getInput(scan, "Choose a digit.", "0123456789");
        System.out.println("You entered '" + input + "'");
    }
    
    
    public static char getInput(Scanner input, String regEx){
        String entry=input.next(); //get initial input
        while(entry.length()!=1 || !regEx.matches(".*"+entry+".*")){ //repeat until conditions are met
            if(entry.length()!=1){ //if there are too many charachters 
                System.out.print("You should enter exactly one character- "); //notify user of issue
            }
            else{ //the charachter isn't acceptable 
                System.out.print("You did not enter a character from the list '"+regEx+"'; try again- "); //notify user
            }
            entry=input.next(); //request new and improved input
        }
        char letter=entry.charAt(0); //when input is correct store it in a char variable
        return letter; //return final input
    }
    
    public static char getInput(Scanner input, String regEx, int maxTries){
        String entry=input.next(); //get initial input
        int counter=1; //create var to keep track of # of tries
        while((entry.length()!=1 || !regEx.matches(".*"+entry+".*")) && counter<maxTries){ //repeat until conditions are met
            counter++; //increment counter
            if(entry.length()!=1){ //if there are too many charachters 
                System.out.print("You should enter exactly one character- "); //notify user of issue
                entry=input.next(); //request new and improved input
            }
            else if(!regEx.matches(".*"+entry+".*")){ //the charachter isn't acceptable 
                System.out.print("You did not enter a character from the list '"+regEx+"'; try again- "); //notify user
                entry=input.next(); //request new and improved input
            }
        }
        if(counter==maxTries){ //if you've max out your tries
            System.out.println("You failed after "+maxTries+" tries."); //tell user
            char letter=' '; //set return value to ' '
            return letter; //return empty string
        }
        else{
            char letter=entry.charAt(0); //when input is correct store it in a char variable
            return letter; //return final input
        }
    }
    
    public static char getInput(Scanner input, String prompt, String regEx){
        char[] chars=regEx.toCharArray(); //split string of options into an array
        String options=""; //initialize string for listing options
        for(int index=0; index<regEx.length(); index++){ //loop through to add each individual option into a string
            if(index==0){ //the frist time dont add comma on the front
                options="'"+chars[index]+"'"; //store first option
            }
            else{ //add comma and space before next options
                options=options+", '"+chars[index]+"'"; //add new option onto preceding ones
            }
        }
        System.out.println(prompt); //read prompt to user
        System.out.print("Enter one of: "+options+"- ");
        String entry=input.next(); //get initial input
        while(entry.length()!=1 || !regEx.matches(".*"+entry+".*")){ //repeat until conditions are met
            if(entry.length()!=1){ //if there are too many charachters 
                System.out.println("Enter exactly one character."); //notify user of issue
            }
            else{ //the charachter isn't acceptable 
                System.out.println("You did not enter an acceptable character."); //notify user
            }
            System.out.println("Choose a digit."); //repeat instructions
            System.out.print("Enter one of: "+options+"- "); //repeat instructions
            entry=input.next(); //request new and improved input
        }
        char value=entry.charAt(0); //when input is correct store it in a char variable
        return value; //return final input
    }
}

/*
SAMPLE RUNS:
Enter 'C' or 'c' to continue, anything else to quit- 7
You did not enter a character from the list 'Cc'; try again- ths
You should enter exactly one character- c
You entered 'c'
Enter 'y', 'Y', 'n', or 'N'- r
You did not enter a character from the list 'yYnN'; try again- r
You did not enter a character from the list 'yYnN'; try again- r
You did not enter a character from the list 'yYnN'; try again- r
You did not enter a character from the list 'yYnN'; try again- r
You did not enter a character from the list 'yYnN'; try again-
You failed after 5 tries
Choose a digit.
Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- yu
Enter exactly one character
Choose a digit.
Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- u
You did not enter an acceptable character
Choose a digit.
Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- 2
You entered '2’
-----------------------
Enter 'C' or 'c' to continue, anything else to quit- c
You entered 'c'
Enter 'y', 'Y', 'n', or 'N'- N
You entered 'N'
Choose a digit.
Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- 9
You entered '9’
*/