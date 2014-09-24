//Amber Wallace
//9/21/2014
//hw04-Month
//ask for month (and year if month==2) and return the number of days in the month

//import scanner
import java.util.Scanner;
//create class
public class Month{
    //create method
    public static void main(String[] args){
        //create new scanner
        Scanner input=new Scanner(System.in);
        //get month
        System.out.print("Enter a month (1-12): ");
        //check if int 
        if(input.hasNextInt()){
            //create variable for month
            int month=input.nextInt();
            //create variable for number of days in month
            int days;
            //check if input is actually a month (1-12)
            if(month>=1 && month<=12){
                if(month==2){ //check if leap year needs to be taken into consideration
                    //ask for year
                    System.out.print("Enter year- ");
                    //check if input is int
                    if(input.hasNextInt()){
                         //collect data for year
                        int year=input.nextInt();
                        //check if year is positive
                        if(year>0){
                            //find remainders for division by 4 100 and 400 to decide if leap year
                            int four=year%4;
                            int onehun=year%100;
                            int fourhun=year%400;
                            // if divisible by 400 than leap year
                            // if divisible by 4 but not 100 than leap year
                            // else not a leap year
                            if((four==0 && onehun!=0) || fourhun==0){ //if leap year
                                days=29;
                            }
                            else{ //not a leap year
                               days=28;
                            }
                        }
                        else{
                            //reject input
                            System.out.println("Year must be positive.");
                            return;
                        }
                    }
                    else{
                        //reject input
                        System.out.println("Year must be an integer.");
                        return;
                    }
                }
                else{ //months hava a consistant amount of days from year to year
                    switch(month){
                        default: //most months have 31 days
                            days=31;
                            break;
                        case 4: //april has 30 days
                            days=30;
                            break;
                        case 6: //june has 30 days
                            days=30;
                            break;
                        case 9: //september has 30 days
                            days=30;
                            break;
                        case 11: //november has 30 days
                            days=30;
                            break;
                    }
                }
                //print number of days
                System.out.println("This month has "+days+" days.");
            }
            else{
                //reject input
                System.out.println("Please enter an integer that correspondes with a month (1-12)");
                return;
            }
        }
        else{
            //reject input
            System.out.println("Please enter an integer.");
            return;
        }
    }
}

                    