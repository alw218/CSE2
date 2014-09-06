// Amber Wallace
// 9/5/2014
// hw02-Arithmetic

//create class
public class Arithmetic{
    //create method
    public static void main(String[] args){
        //given data
        //Number of pairs of socks
        int numSocks=3;
        //Cost per pair of socks
        double priceSock=2.58;
        //Number of drinking glasses
        int numGlasses=6;
        //Cost per glass
        double priceGlass=2.29;
        //Number of boxes of envelopes
        int numEnvelopes=1;
        //cost per box of envelopes
        double priceEnvelope=3.25;
        //sales tax
        double taxPercent=0.06;
        //Total cost of each kind of item
        double priceSocks=priceSock*numSocks;
        double priceGlasses=priceGlass*numGlasses;
        double priceEnvelopes=priceEnvelope*numEnvelopes;
        //sales tax for individual total costs
        //multiply by 100 to preserve 2 decimal places
        double taxSocks=priceSocks*taxPercent*100;
        double taxGlasses=priceGlasses*taxPercent*100;
        double taxEnvelopes=priceEnvelopes*taxPercent*100;
        //cast to int to remove extra decimals
        int taxSocksInt = (int)taxSocks;
        int taxGlassesInt=(int)taxGlasses;
        int taxEnvelopesInt=(int)taxEnvelopes;
        //cast back to doubles
        double taxSocksD=(double)taxSocksInt;
        double taxGlassesD=(double)taxGlassesInt;
        double taxEnvelopesD=(double)taxEnvelopesInt;
        //divide by 100 to get back to original numbers with two decimals
        double taxSocks$=(taxSocksD/100);
        double taxGlasses$=(taxGlassesD/100);
        double taxEnvelopes$=(taxEnvelopesD/100);
        //Print info for socks
        System.out.println("The item being bought is socks.");
        System.out.println("The price of one pair is $"+priceSock);
        System.out.println("The number of pairs being bought is "+numSocks);
        System.out.println("The total for socks is $"+priceSocks+" and the tax is $"+taxSocks$);
        //print info for glasses
        System.out.println("The item being bought is glasses.");
        System.out.println("The price of one is $"+priceGlass);
        System.out.println("The number being bought is "+numGlasses);
        System.out.println("The total for glasses is $"+priceGlasses+" and the tax is $"+taxGlasses$);
        //print info for envelopes
        System.out.println("The item being bought is boxes of envelopes.");
        System.out.println("The price of one is $"+priceEnvelope);
        System.out.println("The number being bought is "+numEnvelopes);
        System.out.println("The total for boxes of envelopes is $"+priceEnvelopes+" and the tax is $"+taxEnvelopes$);
        //Totals
        double total=priceSocks+priceGlasses+priceEnvelopes; //total before tax
        double taxTotal=taxEnvelopes$+taxGlasses$+taxSocks$; //total tax
        double totalWithTax=total+taxTotal; //total with tax
        //print totals
        System.out.println("The total for socks, glasses, and boxes of envelopes before tax is $"+total);
        System.out.println("The total tax for socks, glasses, and boxes of envelopes is $"+taxTotal);
        System.out.println("The entire total, tax included, is $"+totalWithTax);
    }
}