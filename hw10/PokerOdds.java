//Amber Wallace
//11/16/2014
//hw10-PokerOdds

/*
To randomly generate a poker hand, first assign a distinct number to each of the
52 cards, 0, 1, …, 51, representing the clubs with 0 for an Ace of clubs, 1 for
a King of clubs, 2 for a Queen, 3 for a Jack, 4 for a 10, 5 for a 9, .. 12 for the 
2 of clubs.  The diamonds should start with 13 (ace of diamonds) and end with 25 
(2 of diamonds), the hearts should start with with 26 (ace of hearts) and end with 
38 (2 of hearts), and the spades start with 39 (Ace of spades) and end with 51 (2 
of spades). Under this scheme, if n is the number of a random card, then n/13 returns
the suit (0 = clubs, 1 = diamonds, …).  The expression n%13 generates the rank
(0 = ace, 1 = king, etc).  Now, to randomly draw five cards from a deck of 52 cards, 
start with an array of 52 entries, where the entries are initialized to 0, 1, …, 51 
respectively. That array represents the deck.  Represent the hand of cards with an 
array of size 5, where each member of the array is initialized to -1.  Next, “draw”
the first card by generating a random number between 0 and 51 inclusive. Use that 
number as an index into the array and store that number in the first array of the 
hand.  In the deck, set that position in the array equal to -1, then swap the value 
of the array position you randomly selected (that you just set to -1) with the last 
member of the deck array (initially the array member with index 51).  That swap 
allows you to select the next random card by generating a random number from 0 to 50 
inclusive, and swapping the selected card again, etc, until you have drawn 5 cards.
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
            //String[] cardValue=new String[13];
            String[] cardValue={"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
            String clubs="Clubs:\t";
            String diamonds="Diamonds:\t";
            String hearts="Hearts:\t";
            String spades="Spades:\t";
            for(int i=0; i<5; i++){
                if((int)(hand[i]/13)==0){
                    int card=hand[i]%13;
                    clubs+=cardValue[card]+" ";
                }
            }
            for(int i=0; i<5; i++){
                if((int)(hand[i]/13)==1){
                    int card=hand[i]%13;
                    diamonds+=cardValue[card]+" ";
                }
            }
            for(int i=0; i<5; i++){
                if((int)(hand[i]/13)==2){
                    int card=hand[i]%13;
                    hearts+=cardValue[card]+" ";
                }
            }
            for(int i=0; i<5; i++){
                if((int)(hand[i]/13)==3){
                    int card=hand[i]%13;
                    spades+=cardValue[card]+" ";
                }
            }
            System.out.println(clubs);
            System.out.println(diamonds);
            System.out.println(hearts);
            System.out.println(spades);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            goAgain=input.next();
        }while(goAgain.equals("y") || goAgain.equals("Y"));
    }
    
    //create method simulateOdds
    public static void simulateOdds(){
        //
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