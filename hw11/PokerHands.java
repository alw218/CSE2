//Amber Wallace
//12/5/2014
//hw11-PokerHands

/*
Write a program that prompts the user to enter a five card poker hand,
prints out the hand, and then prints out the rank of the hand, 
e.g. “Straight.” 
*/

//import scanner
import java.util.Scanner;
//create class
public class PokerHands {
    //create main method
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //ask user q
        System.out.print("Enter 'Y' or 'y' to enter a(nother) hand- ");
        //create variable to store user response
        String goAgain = input.next();
        //continue as long as user wants
        while (goAgain.equals("y") || goAgain.equals("Y")) {
            //create var to hold result
            String result;
            //get hand
            int[] hand = getHand(input);
            //show hand
            showOneHand(hand);
            //create array to store frequencys
            int[] frequencys = new int[13];
            //initialize all frequencys to 0
            for (int i = 0; i < 13; i++) {
                frequencys[i] = 0;
            }
            //for each card in hand, update frequency of rank
            for (int i = 0; i < 5; i++) {
                frequencys[hand[i] % 13] += 1; //increment frequency by one
            }
            //create array to store hand pattern
            int[] zerosThroughFours = new int[5];
            //initailize the counts on this array to zeros
            for (int i = 0; i < 5; i++) {
                zerosThroughFours[i] = 0;
            }
            //increment zeros through fours based on frequency data
            for (int i = 0; i < 13; i++) {
                zerosThroughFours[frequencys[i]] += 1;
            }
            //test for straight
            boolean straight = true; //straight(hand);
            //test for royalStraight
            boolean rStraight = royalStraight(hand);
            //test for flush
            boolean flush = testFlush(hand);
            //evaluate hand
            if (rStraight && flush) {
                result = "Royal Flush";
            }
            else if (straight && flush) {
                result = "Straight Flush";
            }
            else if (zerosThroughFours[4] == 1) {
                result = "Four of a Kind";
            }
            else if (zerosThroughFours[3] == 1 && zerosThroughFours[2] == 1) {
                result = "Full House";
            }
            else if (flush) {
                result = "Flush";
            }
            else if (straight) {
                result = "Straight";
            }
            else if (zerosThroughFours[2] == 2) {
                result = "Two Pair";
            }
            else if (zerosThroughFours[2] == 1) {
                result = "One Pair";
            }
            else {
                result = "High Card";
            }
            System.out.println("This is a " + result);
            //ask the user about playing again
            System.out.print("Enter 'Y' or 'y' to enter a(nother) hand- ");
            goAgain = input.next();
        }
    }




    public static boolean testFlush(int[] hand) {
        boolean flush = true;
        int min;
        int max;
        if (hand[0] < 13) {
            min = 0;
            max = 12;
        }
        else if (hand[0] < 26) {
            min = 13;
            max = 25;
        }
        else if (hand[0] < 39) {
            min = 26;
            max = 38;
        }
        else {
            min = 39;
            max = 51;
        }
        for (int i = 1; i < 5; i++) {
            if (!(hand[i] >= min && hand[i] <= max)) {
                flush = false;
            }
        }
        return flush;
    }

    public static String getSuit(Scanner input) {
        //create var to store suit
        String suit = "n";
        //monitor first time through
        boolean first = true;
        //check if the suit is acceptable
        while (!(suit.equals("c") || suit.equals("d") || suit.equals("h") || suit.equals("s"))) {
            if (!first) { //if not the first time asking for inupt
                System.out.println("You did not enter a valid response"); //give error message
            }
            //ask for suit
            System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- "); //ask for suit
            suit = input.next(); //store user input
            first = false; //now it is no longer the first time around
        }
        return suit;
    }

    public static int getValue(Scanner input) {
        int card = 15;
        while (card == 15) {
            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- "); //ask for input
            String value = input.next(); //take next user input
            if(value.equals("a")) { //convert value given to number in array deck
                card = 0;
            }
            else if(value.equals("k")) {
                card = 1;
            }
            else if(value.equals("q")) {
                card = 2;
            }
            else if(value.equals("j")) {
                card = 3;
            }
            else if(value.equals("10")) {
                card = 4;
            }
            else if(value.equals("9")) {
                card = 5;
            }
            else if(value.equals("8")) {
                card = 6;
            }
            else if(value.equals("7")) {
                card = 7;
            }
            else if(value.equals("6")) {
                card = 8;
            }
            else if(value.equals("5")) {
                card = 9;
            }
            else if(value.equals("4")) {
                card = 10;
            }
            else if(value.equals("3")) {
                card = 11;
            }
            else if(value.equals("2")) {
                card = 12;
            }
            else{
                System.out.println("You did not enter an acceptable value. Try again."); //error message
            }
        }
        return card;
    }

    public static int getTotalValue(String suit, int value) {
        //create variable to store total value
        int total;
        //alter card number based on suit
        if (suit.equals("c")) {
            total = value;
        }
        else if (suit.equals("d")) {
            total = value + 13;
        }
        else if (suit.equals("h")) {
            total = value + 26;
        }
        else {
            total = value + 39;
        }
        return total; //return final value
    }

    public static int getOneCard(Scanner input) {
        //get suit from user
        String suit = getSuit(input);
        //get value of card (a, k, q...2) from user
        int value = getValue(input);
        //get value of suit and number
        int totalValue = getTotalValue(suit, value);
        return totalValue;
    }

    public static int[] getHand(Scanner input) {
        //create new array to store hand
        int[] hand = new int[5];
        //get five different cards
        for (int i = 0; i < 5; i++) {
            //get one card
            hand[i] = getOneCard(input);
            if (i == 1) {
                //elimate chance of getting duplicate entry
                while (hand[1] == hand[0]) {
                    System.out.println("You already entered that card. Try again."); //error message for dup
                    hand[1] = getOneCard(input); //reselect a card
                }
            }
            else if (i == 2) {
                //elimate chance of getting duplicate entry
                while (hand[2] == hand[0] || hand[2] == hand[1]) {
                    System.out.println("You already entered that card. Try again."); //error
                    hand[2] = getOneCard(input); //reselect
                }
            }
            else if (i == 3) {
                //elimate chance of getting duplicate entry
                while (hand[3] == hand[0] || hand[3] == hand[1] || hand[3] == hand[2]) {
                    System.out.println("You already entered that card. Try again."); //error
                    hand[3] = getOneCard(input); //reselect
                }
            }
            else if (i == 4) {
                //elimate chance of getting duplicate entry
                while (hand[4] == hand[0] || hand[4] == hand[1] || hand[4] == hand[2] || hand[4] == hand[3]) {
                    System.out.println("You already entered that card. Try again."); //error
                    hand[4] = getOneCard(input); //reselect
                }
            }
        }
        return hand;
    }

    public static boolean straight(int hand[]) {
        boolean straight = false;
        //create new array to store ranks
        int[] ranks = new int[hand.length];
        //loop through and store ranks
        for (int i = 0; i < hand.length; i++) {
            ranks[i] = hand[i] % 13;
        }
        int min, tempValue; //store values
        for (int j = 0; j < hand.length; j++) { //go through each value
            min = ranks[j]; //min starts as the current value
            int pos=j;
            for (int k = j; k < hand.length; k++) { //go through next values
                if (ranks[k] < min) { //if next value is smaller
                    min = ranks[k]; //store value and and position
                    pos = k;
                }
            }
            tempValue = ranks[j];
            ranks[j] = min;
            ranks[pos] = tempValue;
        }
        if (ranks[1] == ranks[0] + 1 && ranks[2] == ranks[0] + 2 && ranks[3] == ranks[0] + 3 && ranks[4] == ranks[0] + 4) {
            straight = true;
        }
        return straight;
    }

    public static boolean royalStraight(int hand[]) {
        boolean rStraight = false;
        //create new array to store ranks
        int[] ranks = new int[hand.length];
        //loop through and store ranks
        for (int i = 0; i < hand.length; i++) {
            ranks[i] = hand[i] % 13;
        }
        int min, tempValue; //store values
        for(int i=0; i<ranks.length; i++){
            min = ranks[i];
            int pos=i;
            for(int j=i; j<ranks.length; j++){
                if(ranks[j]<min){
                    min=ranks[j];
                    pos=j;
                }
            }
            tempValue=ranks[i];
            ranks[i]=min;
            ranks[pos]=tempValue;
        }
        if (ranks[0] == 0 && ranks[1] == 1 && ranks[2] == 2 && ranks[3] == 3 && ranks[4] == 4) {
            rStraight = true;
        }
        return rStraight;
    }

    public static void showOneHand(int hand[]) {
        String suit[] = {
            "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        String face[] = {
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "
        };
        String out = "";
        for (int s = 0; s < 4; s++) {
            out += suit[s];
            for (int rank = 0; rank < 13; rank++)
                for (int card = 0; card < 5; card++)
                    if (hand[card] / 13 == s && hand[card] % 13 == rank)
                        out += face[rank];
            out += '\n';
        }
        System.out.println(out);
    }
}