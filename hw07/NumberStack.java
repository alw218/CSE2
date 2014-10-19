//Amber Wallace
//10/17/2014
//hw07-NumberStack

/*get user input for a number between 1 and 9 inclusive and then create a
stack starting at 1 that is one row one column, then expand to twos that are 
two rows and three columns, then continue until the number given. Do this 
three times, first with for loops, then with while loops, and thirdly with 
do while loops. */

//import scanner
import java.util.Scanner;
//create class
public class NumberStack{
    //create main method 
    public static void main(String[] args){
        //create new scanner
        Scanner input=new Scanner(System.in);
        //get user input
        int n=0;
        while(!(n<=9 && n>=1)){
            System.out.print("Enter a number between 1 and 9- "); //ask for input
            if(input.hasNextInt()){ //check if int is given
                n=input.nextInt(); //reset n
            }
            else{
                String junk=input.next(); //throw away non integer data
            }
        }
        
        //For loop
        System.out.println("For Loop");
        for(int i=1; i<=n; i++){ //number of blocks
            for(int j=1; j<=i; j++){ // pair rows and columns
                for(int k=1; k<=(n-i); k++){
                    //add spaces to create indentation
                    System.out.print(" ");
                }
                for(int k=1; k<=(i*2)-1; k++){ //loop through row
                    System.out.print(i); //print number
                }
                System.out.println(); //line break
            }
            for(int k=1; k<=(n-i); k++){ //pad
                //add spaces to create indentation
                System.out.print(" ");
            }
            for(int l=1; l<=(i*2)-1; l++){ //separate number blocks
                System.out.print("-"); //print -'s
            }
            System.out.println(); //line break
        }
        
        //wihle loop
        System.out.println("While Loop");
        int i=1; //create incrementor
        while(i<=n){ //number of blocks
            int j=1; //create incrementor
            while(j<=i){ // pair rows and columns
                int k=1;//create incrementor
                while(k<=(n-i)){ //set limit for loop to operate on
                    //add spaces to create indentation
                    System.out.print(" ");
                    k++; //increment +1
                }
                int l=1; //create incrementor
                while(l<=(i*2)-1){
                    System.out.print(i); //print number block
                    l++; //increment +1
                }
                System.out.println(); //line break
                j++; //increment +1
            }
            int m=1; //create incrementor
            while(m<=(n-i)){
                //add spaces to create indentation
                System.out.print(" "); 
                m++; //increment +1
            }
            int o=1; //create incrementor
            while(o<=(i*2)-1){
                System.out.print("-"); //print -'s
                o++; //increment +1
            }
            System.out.println(); //line break
            i++; //increment +1
        }
        
        //do whle loop
        System.out.println("Do While Loop");
        i=1; //create incrementor
        do{ //number of blocks
            int j=1; //create incrementor
            do{ // pair rows and columns
                int k=1; //create incrementor
                int first=0; //create test for skipping first itterateion
                do{
                    if(first>0){
                        //add spaces to create indentation
                        System.out.print(" ");
                        k++; //increment +1
                    }
                    first++; //increment +1
                }
                while(k<=(n-i)); 
                int l=1; //create incrementor
                do{
                    System.out.print(i); //print number block
                    l++; //increment +1
                }
                while(l<=(i*2)-1); 
                System.out.println(); //line break
                j++; //increment +1
            }
            while(j<=i);
            int m=1; //create incrementor
            do{
                //add spaces to create indentation
                System.out.print(" ");
                m++; //increment +1
            }
            while(m<=(n-i));
            int o=1; //create incrementor
            do{
                System.out.print("-"); //create separation with -'s
                o++; //increment +1
            }
            while(o<=(i*2)-1);
            System.out.println(); //line break
            i++; //increment +1
        }
        while(i<=n);
    }
}