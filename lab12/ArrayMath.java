//Amber Wallace
//11/14/2014
//lab12-ArrayMath

/*
 Write the code for equals() and addArrays().  The method equals() should take two
 arrays of integers as input and return true if and only if the two arrays are of 
 the same length and have the same values in the same locations. The method addArrays() 
 should take two arrays of integers as input and return a new array of integers whose 
 entries are the sum of the entries at the corresponding indices of the input arrays
 (i.e. result[2] = array1[2] + array2[2]). If the two arrays are of different length,
 then your method should assume that there 0’s are implied at the end of the shorter 
 array. Below the program is the expected output of ArrayMath. Your program cannot 
 use other Java classes that manipulate arrays.
*/

//create class
public class ArrayMath{
    //create main method
    public static void main(String [] arg){
        double x[]={2.3, 3, 4, -2.1, 82, 23},
        y[]={2.3, 3, 4, -2.1, 82, 23},
        z[]={2.3, 13, 14},
        w[]={2.3, 13, 14, 12}, 
        v[],
        u[]={2.3, 12, 14};
        v=addArrays(x,y);
        System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
        System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                             +display(addArrays(x,z)));
        System.out.println("It is " + equals(x,y)+" that "+display(x)+
                           " == "+display(y));
        System.out.println("It is " + equals(z,w)+" that "+display(z)+
                           " == "+display(w));
        System.out.println("It is " + equals(u,z)+" that "+display(u)+
                           " == "+display(z));
    }
    
    //create method equals
    public static boolean equals(double[] x, double[] y){
        //check length
        if(x.length!=y.length){
            return false;
        }
        else{
            boolean test=true;
            for(int i=0; i<x.length; i++){
                if(x[i]!=y[i]){
                    test=false;
                }
            }
            return test;
        }
    }
    
    //create method addArrays
    public static double[] addArrays(double[] x, double[] y){
        //create var to store lenth of longer array
        int length=0;
        int shorter=0;
        //create new array
        double[] z;
        //find array of longer length
        if(x.length>y.length){
            length=x.length;
            shorter=y.length;
            z=new double[length];
            //loop through
            for(int i=0; i<shorter; i++){
                z[i]=x[i]+y[i];
            }
            for(int i=shorter; i<length; i++){
                z[i]=x[i];
            }
        }
        else{
            length=y.length;
            shorter=x.length;
            z=new double[length];
            //loop through
            for(int i=0; i<shorter; i++){
                z[i]=x[i]+y[i];
            }
            for(int i=shorter; i<length; i++){
                z[i]=y[i];
            }
        }
        return z;
    }
    
    //create method display
    public static String display(double [] x){
        String out="{";
        for(int j=0;j<x.length;j++){
            if(j>0){
                out+=", ";
            }
            out+=x[j];
        }
        return out+"}";
    }
}

/*
OUTPUT: {2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   = {4.6, 6.0, 8.0, -4.2, 164.0, 46.0}
{2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 13.0, 14.0}
   = {4.6, 16.0, 18.0, -2.1, 82.0, 23.0}
It is true that {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   == {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
It is false that {2.3, 13.0, 14.0}
   == {2.3, 13.0, 14.0, 12.0}
It is false that {2.3, 12.0, 14.0}
   == {2.3, 13.0, 14.0}
*/