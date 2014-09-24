//Amber Wallace
//9/22/2014
//hw04-CourseNumber
/*get course number input, verify it is a legitimate 
course number, output info on course*/

//import scanner
import java.util.Scanner;
//create class
public class CourseNumber{
    //create main method
    public static void main(String[] args){
        //new scanner
        Scanner input=new Scanner(System.in);
        //get input
        System.out.print("Enter a six digit course number- ");
        //check for String
        if(input.hasNextInt()){
            //get int
            int courseNum=input.nextInt();
            //check if int is in range
            if(courseNum>=186510 && courseNum<=201440){
                //get year
                int year=(int)(courseNum/100);
                //get section
                int section=courseNum%100;
                //Switch through section options
                switch(section){
                    default: //wrong number
                        System.out.println("This is not an acceptable section number.");
                        break;
                    case 10: //spring
                        System.out.println("This course was offered in the Spring Semester of "+year);
                        break;
                    case 20: //summer 1
                        System.out.println("This course was offered in the Summer 1 Semester of "+year);
                        break;
                    case 30: //summer 2
                        System.out.println("This course was offered in the Summer 2 Semester of "+year);
                        break;
                    case 40: //fall
                        System.out.println("This course was offered in the Fall Semesterof "+year);
                        break;
                }        
            }
            else{
                //reject input
                System.out.println("The number you entered was not in the range");
            }
        }
        else{
            //reject input
            System.out.println("You did not enter an integer");
        }
    }
}

        