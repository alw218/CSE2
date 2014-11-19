//Amber Wallace
//11/16/2014
//hw10-PokerOdds

/*
Randomly generate a poker hand and show cards. Repeat 10000 times and keep track
of how many times exactly one pair comes up for each card value. Also keep track
of how many hands don't have exactaly one pair. Print results. 
*/

//import random number generator
import java.util.Random;
//import scanner
import java.util.Scanner;
//create class
public class PokerOdds{
    
    //create main method
    public static void main(String [] arg){
        //call method showHands
        showHands();
        //call method simulateOdds
        simulateOdds();
    }
    
    //create method showHands
    public static void showHands(){
        /* The method showOneHand() should generate random poker hands, 
        prompting the user if they would like another hand to be generated
        (it will repeat as long the user desires). */
        //go through process at least once
        //create new scanner
        Scanner input=new Scanner(System.in);
        //create new Random
        Random random=new Random();
        //create string for go again
        String goAgain="n";
        do{
            //generate array for deck of cards
            int[] deck=new int[52];
            for(int i=0; i<52; i++){
                //assign numbers 0-51
                deck[i]=i;
            }
            //generate array for hand
            int[] hand=new int[5];
            for(int i=0; i<5; i++){
                //set all hand values equal to -1 initially 
                hand[i]=-1;
            }
            for(int i=0; i<5; i++){
                //generate random draw
                int draw=random.nextInt(52-i);
                //replace spot in hand with draw card from deck
                hand[i]=deck[draw];
                //replace card in deck with last card from deck
                deck[draw]=deck[51-i];
                //replace last card in deck with -1 
                deck[51-i]=-1;
            }
            //create array for card value conversions
            String[] cardValue={"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
            //create strings for each set of possible card values
            String clubs="Clubs:\t\t";
            String diamonds="Diamonds:\t";
            String hearts="Hearts:\t\t";
            String spades="Spades:\t\t";
            for(int i=0; i<5; i++){
                if((int)(hand[i]/13)==0){ //if club
                    int card=hand[i]%13; //find value
                    clubs+=cardValue[card]+" "; //add value to group of clubs
                }
            }
            for(int i=0; i<5; i++){
                if((int)(hand[i]/13)==1){ //if diamond
                    int card=hand[i]%13; //find value
                    diamonds+=cardValue[card]+" "; //add value to group of diamonds
                }
            }
            for(int i=0; i<5; i++){
                if((int)(hand[i]/13)==2){ //if heart
                    int card=hand[i]%13; //find value
                    hearts+=cardValue[card]+" "; //add value to group of hearts
                }
            }
            for(int i=0; i<5; i++){ 
                if((int)(hand[i]/13)==3){ //if spade
                    int card=hand[i]%13; //find value
                    spades+=cardValue[card]+" "; //add value to group of spades
                }
            }
            //print card hands
            System.out.println(clubs);
            System.out.println(diamonds);
            System.out.println(hearts);
            System.out.println(spades);
            System.out.println();
            //ask to go again
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            //store answer to goAgain
            goAgain=input.next();
        }while(goAgain.equals("y") || goAgain.equals("Y")); //if answer is yes go again
    }
    
    //create method simulateOdds
    public static void simulateOdds(){
        //create new scanner
        Scanner input=new Scanner(System.in);
        //create new Random
        Random random=new Random();
        //create array for card value conversions
        String[] cardValue={"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
        //create var to store cycles with not exactally one pair
        int noPair=0;
        //keep track of cycles
        int cycles=0;
        int[] dupCount=new int[13];
        //set all initial dupCount values to 0
        for(int i=0; i<13; i++){
            dupCount[i]=0;
        }
        //do 10000 cycles
        while(cycles<10000){
            //generate array for deck of cards
            int[] deck=new int[52];
            for(int i=0; i<52; i++){
                //assign numbers 0-51
                deck[i]=i;
            }
            //generate array for hand
            int[] hand=new int[5];
            for(int i=0; i<5; i++){
                //set all hand values equal to -1 initially 
                hand[i]=-1;
            }
            for(int i=0; i<5; i++){
                //generate random draw
                int draw=random.nextInt(52-i);
                //replace spot in hand with draw card from deck
                hand[i]=deck[draw];
                //replace card in deck with last card from deck
                deck[draw]=deck[51-i];
                //replace last card in deck with -1 
                deck[51-i]=-1;
            }
            if(exactlyOneDup(hand)){
                int x=whichDup(hand);
                //increase dup count for value of duplicate
                dupCount[x]++;
            }
            else{
                noPair++;
            }
            cycles++;
        }
        //print results
        System.out.println();
        System.out.println("Rank \tFrequency of exactly one pair");
        //loop through results
        for(int i=0; i<13; i++){
            System.out.println(cardValue[i]+": \t"+dupCount[i]);
        }
        System.out.println("----------------------------");
        System.out.println("Total not exactly one pair: "+noPair);
    }
    
    //create method for exactally one dup
    public static boolean exactlyOneDup(int num[]){
        //test for exactly one dup
        //create boolean variable
        boolean test=false;
        //create var to store number of instances of dups
        int numDups=0;
        for(int number=0; number<num.length; number++){ //cycle through members of array
            for(int check=0; check<num.length; check++){ //for each member of the array cycle through each member of the same array
                if(check!=number){ //if the member of the array is not the same
                    if(num[check]%13==num[number]%13){ //if the members of the array equal each other
                        numDups++; //increment instances of dups
                    }
                }
            }
        }
        if(numDups==2){ //if instances of dups = 2 (one duplicate)
            test=true; //result is true
        }
        return test; //return result 
    }
    
    //create method for whichDup
    public static int whichDup(int num[]){
        //test for whichDup
        //create int variable
        int test=0;
        //create var to store number of instances of dups
        int numDups=0;
        for(int number=0; number<num.length; number++){ //cycle through members of array
            for(int check=0; check<num.length; check++){ //for each member of the array cycle through each member of the same array
                if(check!=number){ //if the member of the array is not the same
                    if(num[check]%13==num[number]%13){ //if the members of the array equal each other
                        test=num[check]%13; //instances of dups
                    }
                }
            }
        }
        return test; //return result 
    }
}


/*
Clubs:    J 4 
Diamonds: 
Hearts:   J 7 4 
Spades:   

Go again? Enter 'y' or 'Y', anything else to quit- y
Clubs:    Q 2 
Diamonds: A 
Hearts:   5 
Spades:   J 

Go again? Enter 'y' or 'Y', anything else to quit- q
  rank   freq of exactly one pair
    A       312
    K       307
    Q       339
    J       325
   10       323
    9       334
    8       363
    7       312
    6       339
    5       349
    4       328
    3       293
    2       327
----------------------------
 total not exactly one pair: 5749
*/