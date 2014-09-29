//Amber Wallace
//9/28/2014
//hw05-BoolaBoola
/*Write a program that has three boolean variables to each of which the
value of true or false is randomly assigned. Then, at random, combine 
the three variables with random choices of && and || and stores the result.
For example, one might have the expression true && false || true
(there are 32 possible expressions, so I will not list all the possibilities). 
The program should then present the expression to the user and ask the user
to state the result of of the expression.*/

//import scanner
import java.util.Scanner;
//create class
public class BoolaBoola{
    //create method
    public static void main(String[] args){
        //create scanner
        Scanner input=new Scanner(System.in);
        //generate three random variables
        boolean one=Math.random()<0.5;
        boolean two=Math.random()<0.5;
        boolean three=Math.random()<0.5;
        //create two strings which will eventually represent random operators
        String opp1;
        String opp2;
        //create var to store executed answer (true or false)
        boolean answer=false; //initially set as false and change only if true
        //determine first operator
        if(Math.random()<0.5){ //50% chance 1st opperator will be &&
            opp1="&&"; //operator is &&
            //determine second operator
            if(Math.random()<0.5){ //50% chance second opperator is &&
                opp2="&&"; //second operator is &&
                if(one && two && three){ //execute random statement
                    answer=true; // answer is true
                }
            }
            else{ //50% chance second opperator is ||
                opp2="||"; //second operator is ||
                if(one && two || three){ //if statement executes as true
                    answer=true; //answer should be true
                }
            }
        }
        else{ //50% chance first opperator is ||
            opp1="||"; //first opperator is ||
            //determine second operator
            if(Math.random()<0.5){ // 50% chance second opperator is &&
                opp2="&&"; //second operator is &&
                if(one || two && three){ //execute statement
                    answer=true; // answer is true
                }
            }
            else{ //50% chance second opperator is ||
                opp2="||"; //second operator is ||
                if(one || two || three){ //execute statement
                    answer=true; //answer is true
                }
            }
        }
        //present info and ask question
        System.out.print("Does "+one+" "+opp1+" "+two+" "+opp2+" "+three+" have the value true(t/T) or false(f/F)? ");
        //collect input
        String guess=input.next();
        //evaluate answer given with actual answer
        if(((guess.equals("t") || guess.equals("T")) && answer) || ((guess.equals("f") || guess.equals("F")) && !answer)){ //correct answer
            //respond with "Correct"
            System.out.println("Correct");
        }
        else{ //wrong answer
            //reject input
            System.out.println("Wrong; try again");
        }
    }
}