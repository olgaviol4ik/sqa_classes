package hometask;
////Exercise 6 : Define a function that accepts a String array 
//and print only first 3 characters of every string value. 
//Call this function from the main method 
//and pass a Strig array that has name of any 5 countries. 
//public class AcceptingStringArray2 {
	
	//public static void main(String[] args) {
	//	String[] ctryNameArr = new String[]{"usa", "England", "Germany","France", "Urugvai"};
		//printCountryName(ctryNameArr);
	//}
//	public static void printCountryName(String[] ctryNames){
	//	for(String ctryName : ctryNames){
		//	System.out.println(ctryName.substring(0,3));
	//}
	//for(int i=0; i<ctryNames.length; i++){
	//	String ctryName = ctryNames[i];
	//	System.out.println(ctryName.substring(0,3));
	//}
//}
//}
//Exercise 7 : In the above example, 
//add the validation to only do substring if string length is greater than 3 
//and change the case of all the countries to lower. (hint : String.toLowerCase())
// also remove if there are any leading or trailing white spaces in the name of the country. for e.g. " USA "
 //hint . String.trim();
public class AcceptingStringArray3ex7 {

public static void main(String[] args) {
		String[] ctryNameArr = new String[]{"usa", "England", "Germany","France", "Urugvai"};
		printCountryName(ctryNameArr);
	}
	public static void printCountryName(String[] ctryNames){
		for(String ctryName : ctryNames){
			if(ctryName.length() >3){
			System.out.println(ctryName.trim().substring(0,3).toLowerCase());
			//String trimmedName = ctryNAme.trim();
			//String substring = trimmedNAme.substring();
			//String lowerString = substring.toLowerCase();
	}
	//for(int i=0; i<ctryNames.length; i++){
	//	String ctryName = ctryNames[i];
	//	System.out.println(ctryName.substring(0,3));
	//}
	}
	}
}
