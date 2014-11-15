package exercises;
//Write a Calculator class that provides 4 methods: add, subtract, multiply and divide. 
//All the methods take two integer parameter 
//and performs the respective operation and returns the result. 
//Write a CalculatorCaller class. 
//Call the add, subtract, multiply and divide methods 
//and print the result values without creating the object of Calculator class. 

public class Calculator {

	public static int Add(int a, int b){
		int myVariable = a + b;
		return myVariable;
	}
	public static int Subtract(int a, int b){
		int myVariable = a - b;
		return myVariable;
	}
	public static int Multiply(int a, int b){
		int myVariable = a * b;
		return myVariable;
	}
	public static int Divide(int a, int b){
		int myVariable = a/b;
		return myVariable;
	}

}
