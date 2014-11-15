package hometask;
//1.Write a class with main method. 
//2.Define String str = new String(“abc”); 
//3. String test = “abc”; 
//4. String test1 = “abc”; 
//5. String test2 = new String(“abc”); 
//6. Compare 2 and 3, 2 and 4, 3 and 4 using “=” operator and also using “equal” operator.

public class ComparingStrings {
	
	public static void main(String args[]){
		String str = new String("abc");
		String test = "abc";
		String test1 = "abc";
		String test2 = new String("abc");
		
		System.out.println("Comparing references for test and test1 : " +(test == test1));
		System.out.println("Comparing references for test and test2 : " +(test == test2));
		System.out.println("Comparing references for test1 and test2 : " +(test1 == test2));
		System.out.println("Comparing values for test and test1 : " +test.equals(test1));
		System.out.println("Comparing values for test and test2 : " +test.equals(test2));
		System.out.println("Comparing values for test1 and test2 : " +test1.equals(test2));
	}

}
