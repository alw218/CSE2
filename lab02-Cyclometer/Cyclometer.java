// Amber Wallace
// 9/5/2014
// lab02-Cyclometer

// create class
public class Cyclometer{
    //create main method
    public static void main(String[] args){
        // enter hard data
        int secsTrip1=480; //seconds taken for first trip
        int secsTrip2=3220; //seconds taken for second trip
        int countsTrip1=1561; //counts for trip one
        int countsTrip2=9037; //counts for trip two
        //intermediate variables and output data
        double wheelDiameter=27.0, //wheel diameter with extra decimal of precicion
        PI=3.14159, //store value of PI
        feetPerMile=5280, //store value of ft/mile
        inchesPerFoot=12, //store value of in/ft
        secondsPerMinute=60; //store value of s/min
        double distanceTrip1, distanceTrip2, totalDistance; //creating variables to store output data
        // print the number of minutes and counts for each trip
        System.out.println("Trip one took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip two took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        // calculate the distance of trips
        distanceTrip1=countsTrip1*wheelDiameter*PI; //distance of trip one
        distanceTrip2=countsTrip2*wheelDiameter*PI; //distance of trip two
        distanceTrip1 /=(inchesPerFoot*feetPerMile); //gives distance in miles
        distanceTrip2 /=(inchesPerFoot*feetPerMile); //gives distance in miles
        totalDistance=distanceTrip1+distanceTrip2; //total distance in miles
        // print the distance of each trip in miles
        System.out.println("Trip one was "+distanceTrip1+" miles.");
        System.out.println("Trip two was "+distanceTrip2+" miles.");
        System.out.println("The total distance was "+totalDistance+" miles.");
    }
}
