//Amber Wallace
//9/10/2014
//hw03-Bicycle

//import scanner
import java.util.Scanner;
//create class
public class Bicycle{
    //create method
    public static void main(String[] args){
        //new scanner
        Scanner input = new Scanner(System.in);
        //get user input
        //get counts
        System.out.print("Enter the number of counts: ");
        int counts=input.nextInt();
        //get seconds
        System.out.print("Enter the number of seconds: ");
        int seconds=input.nextInt();
        //conversion variables
        double wheelDiameter=27.0, //wheel diameter with extra decimal of precicion
        PI=3.14159, //store value of PI
        feetPerMile=5280, //store value of ft/mile
        inchesPerFoot=12, //store value of in/ft
        secondsPerMinute=60; //store value of s/min
        //distance
        double distance=(wheelDiameter*PI*counts)/inchesPerFoot/feetPerMile;
        //truncate more than two decimals for distance
        int distanceInt=(int)(distance*100);
        double distanceTrunc=(double)distanceInt/100;
        //time 
        double time=seconds/secondsPerMinute;
        double timeHrs=time/60;
        //truncate more than two decimals for time
        int timeInt=(int)(time*100);
        double timeTrunc=(double)timeInt/100;
        //ave mph
        double aveMph=distance/timeHrs;
        //truncate more than two decimals for average MPH
        int aveMphInt=(int)(aveMph*100);
        aveMph=(double)aveMphInt/100;
        //print info
        System.out.println("The distance was "+distanceTrunc+" miles and took "+timeTrunc+" minutes.");
        System.out.println("The average mph was "+aveMph+" mph.");
    }
}
    
        