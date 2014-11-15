package hometask;
//Exercise 6 : Define a function that accepts a String array 
//and print only first 3 characters of every string value. 
//Call this function from the main method 
//and pass a Strig array that has name of any 5 countries. 

public class AcceptingStringArray {
	
	public static void main(String args[]){
		
		String[] nameArr = new String[]{"usa","france","argentina","chili", "urugvai"};
		countriesSub(nameArr);
	}
	public static void countriesSub(String countries[]){
		for(int i=0; i<countries.length; i++){
			System.out.println(countries[i].substring(0, 3));
		}
	}

}
