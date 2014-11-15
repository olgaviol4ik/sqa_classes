package exercises;
//Write a Calculator class that provides 4 methods: add, subtract, multiply and divide. 
	//All the methods take two integer parameter 
	//and performs the respective operation and returns the result. 
	//Write a CalculatorCaller class. 
	//Call the add, subtract, multiply and divide methods 
	//and print the result values without creating the object of Calculator class.
public class CalculatorCaller {
	 

	public static void main(String args[]){
		
		System.out.println("Result for Add is :" +Calculator.Add(2,5));
		System.out.println("Result for Subtract is :" +Calculator.Subtract(3,3));
		System.out.println("Result for Multiply is :" +Calculator.Multiply(4,5));
		System.out.println("Result for Divide is :" +Calculator.Divide(10,10));
	}
}
