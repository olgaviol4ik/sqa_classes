package hometask;

//import org.apache.log4j.Logger;


public class CountryHashcodeEx18Caller {
	//Logger log = Logger.getLogger("abc");
	public static void main(String args[]){
		CountryHashcodeEx18 canada = new CountryHashcodeEx18("CAN","Canada", 351600000L, "CAD");
		CountryHashcodeEx18 canada2 = new CountryHashcodeEx18("CAN","Canada", 351600000L, "CAD");
		CountryHashcodeEx18 america = new CountryHashcodeEx18("USA","America", 316000000L, "USD");
		CountryHashcodeEx18 america2 = new CountryHashcodeEx18("USA","America", 316000000L, "USD");
		CountryHashcodeEx18 italy = new CountryHashcodeEx18("ITA","Italy", 598300000L, "EUR");
		CountryHashcodeEx18 italy2 = new CountryHashcodeEx18("ITA","Italy", 598300000L, "EUR");
		CountryHashcodeEx18 spain = new CountryHashcodeEx18("ESP","Spain", 472700000L, "EUR");
		CountryHashcodeEx18 spain2 = new CountryHashcodeEx18("ESP","Spain", 472700000L, "EUR");
		CountryHashcodeEx18 england = new CountryHashcodeEx18("GBR","England", 64100000L, "GBP");
		CountryHashcodeEx18 england2 = new CountryHashcodeEx18("GBR","England", 64100000L, "GBP");
		
		System.out.println("canada.equals(canada2) = "+canada.equals(canada2));
        System.out.println("canada == canada2 = "+(canada == canada2));
        System.out.println("america.equals(america2) = "+america.equals(america2));
        System.out.println("america == america2 = "+(america == america2));
        System.out.println("italy.equals(italy2) = "+italy.equals(italy2));
        System.out.println("italy == italy2 = "+(italy == italy2));
	}

}
