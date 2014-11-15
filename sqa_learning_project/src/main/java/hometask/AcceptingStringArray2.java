package hometask;
//Exercise 6 : Define a function that accepts a String array 
//and print only first 3 characters of every string value. 
//Call this function from the main method 
//and pass a Strig array that has name of any 5 countries. 
public class AcceptingStringArray2 {
	
	public static void main(String[] args) {
		String[] ctryNameArr = new String[]{"usa", "England", "Germany","France", "Urugvai"};
		printCountryName(ctryNameArr);
	}
	public static void printCountryName(String[] ctryNames){
		for(String ctryName : ctryNames){
			System.out.println(ctryName.substring(0,3));
	}
	for(int i=0; i<ctryNames.length; i++){
		String ctryName = ctryNames[i];
		System.out.println(ctryName.substring(0,3));
	}
}
}
