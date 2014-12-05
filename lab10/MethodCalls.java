//Amber Wallace
//10/29/2014
//lab10-MethodCalls

/*
For this lab session you will get practice writing methods that call methods.
Below is a Java class whose main program calls two different methods, addDigit() 
and join(). Under the class is a comment that shows the expected output when 
the program is run. The call addDigit(number,digit) expects that ‘digit’ is an 
int between 0 and 9, inclusive, and it returns an int whose value is  ‘number’
with digit preceding it.  If digit is not between 0 and 9, then addDigit() 
should simply return number. The method join() returns an int whose value 
consists of the values of the two input parameters “pasted together.” The code 
for join() should be written so that it calls addDigit() to do (part of) its 
work.
*/

//create class
public class MethodCalls{
    //create main method
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    public static int addDigit(int num, int digit){
        if(digit>9 || digit<0){
            return num;
        }
        else{
            if(num>=0){ // if num is positive
                int count=String.valueOf(num).length();
                double multiply=Math.pow(10,count);
                int done=(int) ((digit*multiply)+num);
                return done;
            }
            else{ // if num is negative
                int count=String.valueOf(num).length()-1;
                double multiply=Math.pow(10,count);
                int done=(int) (num-(digit*multiply));
                return done;
            }
        }
    } 
    public static int join(int a, int b){
        return b;
    }
}  
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
