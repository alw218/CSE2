//Amber Wallace
//9/13/2014
//hw03-FourDigits

//import scanner
import java.util.Scanner;
//create class
public class FourDigits{
    //create method
    public static void main(String[] args){
        //new scanner
        Scanner input = new Scanner(System.in);
        //get user input
        System.out.print("Enter a double: ");
        double num=input.nextDouble();
        //get first digit
        int denNum1=(int)num*10; //get denomonator for first digit
        int quoNum1=(int)(num*10); //get quotient for first digit
        int firstDigit=quoNum1%denNum1; //the remainder is the first digit
        //get second digit
        int denNum2=(int)(num*10)*10; //get denomonator for second digit
        int quoNum2=(int)(num*100); //get quotient for second digit
        int secondDigit=quoNum2%denNum2; //the remainder is the second digit
        //get third digit
        int denNum3=(int)(num*100)*10; //get denomonator for third digit
        int quoNum3=(int)(num*1000); //get quotient for third digit
        int thirdDigit=quoNum3%denNum3; //the remainder is the third digit
        //get fourth digit
        int denNum4=(int)(num*1000)*10; //get denomonator for fourth digit
        int quoNum4=(int)(num*10000); //get quotient for fourth digit
        int fourthDigit=quoNum4%denNum4; //the remainder is the fourth digit
        //print digits together
        System.out.println("The four digits are: "+firstDigit+secondDigit+thirdDigit+fourthDigit);
    }
}