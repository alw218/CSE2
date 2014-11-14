//Amber Wallace
//11/14/2014
//lab11-Arrays

/*
Create an array that can hold 10 ints
Ask the user enter 10 ints and store them in the array
Search the array for the highest entry and print it out
Search the array for the lowest entry and print it out
Sum the ints in the array and print out the sum
Copy the contents of the array into a second array in reverse order 
Print the contents of the two arrays in two columns, side by side. 
*/

//import scanner
import java.util.Scanner;
//create class
public class Arrays{
    //create main method
    public static void main(String[] args){
        //create new scanner
        Scanner input=new Scanner(System.in);
        //create array that can hold 10 ints
        int[] nums=new int[10];
        //create second array
        int[] reverse=new int[10];
        //create counters
        int sum=0;
        int high=0;
        int low=0;
        //ask the user for 10 ints
        System.out.println("Enter 10 ints- ");
        //loop through input values
        for(int i=0; i<10; i++){
            //store values in array
            nums[i]=input.nextInt();
            //store values in reverse order
            reverse[9-i]=nums[i];
            //keep track of sum
            sum+=nums[i];
            //set initial high and low values
            if(i==0){
                high=nums[i];
                low=nums[i];
            }
            //evaluate weather new num is high
            if(nums[i]>high){
                //set as new high
                high=nums[i];
            }
            if(nums[i]<low){
                low=nums[i];
            }
        }
        //print data
        System.out.println("The lowest entry is "+low);
        System.out.println("The highest entry is "+high);
        System.out.println("The sum is "+sum);
        //loop to print collected data
        for(int i=0; i<10; i++){
            System.out.println("\t"+nums[i]+"\t"+reverse[i]);
        }
    }
}





/*
Below is sample output that your program should resemble:

Enter 10 ints- -9 20 8 9 23 45 1 2 89 70
The lowest entry is -9
The highest entry is 89
The sum is 258
    -9     70
    20     89
     8      2
     9      1
    23     45
    45     23
     1      9
     2      8
    89     20
    70     -9
*/