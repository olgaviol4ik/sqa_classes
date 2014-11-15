package hometask;
//Write a method which takes a parameter of array of String and print all the items in array
public class ArrayStringPrintAll {
	
	public static void main(String args[]){
		
		String[] PrintAllArr = new String[]{"England","France","Germany","Mexico"};
		System.out.println("The length of array is: " +PrintAllArr.length);
		for (int i=0; i<=PrintAllArr.length; i++){
		System.out.println("The name of country "+i+" is : "+PrintAllArr[i]);
		}
	}

}
