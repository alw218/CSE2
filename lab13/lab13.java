//Amber Wallace
//12/4/2014
//lab13

/*
Write a program that creates a two dimensional ragged array of five rows of ints. 
The length the 0th row should be 5, the 1th row 8, etc. That is, for the jth row, 
the length should be j*3+5.
1. Fill the array with random numbers in the range 0...39, inclusive.
2. Display the array
3. Sort each row of the array in ascending order
4. Display the array.
*/

//import random number generator
import java.util.Random;
//create class
public class lab13{
    //create main method
    public static void main(String[] args){
        //create new Random
        Random random=new Random();
        //create an array of five arrays
        int[][] array=new int[5][];
        //cycle through first dimension of arrays to specify size of second dimension
        for(int i=0; i<5; i++){
            array[i]=new int[i*3+5];
        }
        System.out.println("The array before sorting"); //print message
        //cycle through members and assign a random number to each
        for(int i=0; i<5; i++){
            for(int j=0; j<i*3+5; j++){
                array[i][j]=random.nextInt(40); //generate random number between 0-39
                System.out.print(array[i][j]+" "); //print number
            }
            System.out.println(); //new line for new dimension of array
        }
        //sort new array
        int min, tempValue; //store values
        int pos=0;
        for(int i=0; i<5; i++){ //go through each array within array
            for(int j=0; j<array[i].length; j++){ //go through each value within inner array
                min=array[i][j]; //min starts as the current value
                for(int k=j; k<array[i].length; k++){ //go through next values
                    if(array[i][k]<min){ //if next value is smaller
                        min=array[i][k]; //store value and and position
                        pos=k;
                    }
                }
                tempValue=array[i][j];
                array[i][j]=min;
                array[i][pos]=tempValue;
            }
        }
        System.out.println("The array after sorting"); //print message
        //cycle through members and assign a random number to each
        for(int i=0; i<5; i++){
            for(int j=0; j<i*3+5; j++){
                System.out.print(array[i][j]+" "); //print number
            }
            System.out.println(); //new line for new dimension of array
        }
    }
}

/*
Here is a sample run of my solution of this problem:

The array before sorting
25 12 26 17 23
20  3 16 21 28 33 28 19
24 13 22 30 31  2 11 22 26 26 30
 0  7  4 36 38 31 39  2 35 33 27 28 13 38
31 39  2  7 22 10 35 32 38 30 13 26 37 10 20 23 12

The array after sorting
12 17 23 25 26
 3 16 19 20 21 28 28 33
 2 11 13 22 22 24 26 26 30 30 31
 0  2  4  7 13 27 28 31 33 35 36 38 38 39
 2  7 10 10 12 13 20 22 23 26 30 31 32 35 37 38 39
*/