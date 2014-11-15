package Static_example;
//a)
//1.Write a class that has static printName() method 
//2.Define non static method getName() in the same class 
//3.Call getName inside the printName() method. 
//b)
//1. in the same class that has non static method printAddress(); 
//2.Define a static method getAddress(); in the class. 
//3. Call getAddress() from printAddress() method.

public class StaticMethodExample {

	public static void main(String args[]){
		printName("Olya");
		getAddress("ElmSt");
	}

	public static void printName(String name){
		System.out.println("My name is : " + name);
		//getName("Tanya");
		//Cannot make a static reference to the non-static method getName(String) from the type StaticExample

	}

	public String getName(String name){
		return name;
	}
	public void printAddress(String address){
		System.out.println("My address is : " + address);
		getAddress("ElmSt");
	}
	public static void getAddress(String address){
		
	}
}