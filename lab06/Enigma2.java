//Amber Wallace
//10/5/2014
//lab06-Enigma2

import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40; //no division by zero
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 *  division by zero is not acceptable
 * 
 * 
 * 
 * 
 */

