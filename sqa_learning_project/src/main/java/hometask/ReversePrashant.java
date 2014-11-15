package hometask;
//1.Write a java program that reverses the given input string. 
//2. For e.g. If I call the function with argument “Prashant”. It should print “tnahsarP”. 
//Hint : try to use String function to convert to char array and then loop through the array backwards. 
public class ReversePrashant {
	public static void main(String args[]){
		StringBuffer reverseExample = new StringBuffer ("Prashant");

		reverseExample.reverse();
		System.out.println(reverseExample);

	}

}