//Amber Wallace
//10/10/2014
//hw06-Roulette

/*
For this program, use a random number generator to simulate a person’s 
betting on 100 spins, but run the simulation 1000 times and collect data on 
the outcome.  For the 1000 repetitions of the 100-spin simulation, compute 
the number of times I lose everything (my number never comes up), compute 
the total winnings (out of total $100,000 bet), and compute the number of times
I walked away with a profit in one session of 100 spins of the wheel. 
*/

//create class
public class Roulette{
    //create method
    public static void main(String[] args){
        //create counters for 1000 run cycles
        int allGone=0; //increment one for each time I lose everything
        int totalWinnings=0; //add winnings each round
        int endWithProfit=0; //increment one each time profit is earned
        //loop through the test 1000 times
        int end=1000;
        int start=1;
        while(start<=end){
            //code for single trial of 100
            int currentTrial=1; //create incrementor
            int totalTrials=100; //set sentinal value
            int wins=0; //create incrementor for number of wins; reset every hundred
            while(currentTrial<=totalTrials){ //loop through 100 times
                //get bet number
                int bet=(int)(Math.random()*38);
                //get spin number
                int rand=(int)(Math.random()*38);
                if(bet==rand){ //if bet and spin are the same, you win
                    wins++; //increment win count
                }
                currentTrial++; //increment trial count
            }
            if(wins==0){ //if you did not win at all
                allGone++; //add one to lose everything count
            }
            totalWinnings+=(wins*36); //add winnings from this simulation to total from all other simulations
            if(wins>=3){ //if you win more than twice you have made a profit
                endWithProfit++; //increment the number of times with profit by one
            }
            start++; //increment trial count by one
        }
        //print data
        System.out.println("The number of times you lost everything was "+allGone);
        System.out.println("The total winnings were $"+totalWinnings);
        System.out.println("The number of times you ended with a profit was "+endWithProfit);
    }
}
        