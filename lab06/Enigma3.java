//Amber Wallace
//10/5/2014
//lab06-Enigma3

/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
    }
    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5;
        k/=9;
      default:
        n-=3;
        k-=5;
    }
     out+=1/n + 0; //replaced 1/k with 0 //division by zero (1/k) k=0
    System.out.println(out);
  }
}

/*
 * Error report:
 * line 52 k=0 division by zero error
 * don't divide by k or change k to something other than 0
 * 
 * 
 */

