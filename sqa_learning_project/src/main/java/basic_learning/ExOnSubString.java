package basic_learning;

public class ExOnSubString {
	public static void main(String args[]){
		 String str1 = "Soccer";
		 String str2 = new String ("Football");
		 String str3 = "Cricket";
		 
		 int length = str1.length();
		 System.out.println("length of str1 is : "+length);
		 
		 String subStr3 = str3.substring(5,6);
		 System.out.println("Last character of str3 is : "+subStr3);
		 
		 int indexStr1 = str1.indexOf("c");
			System.out.println("Index of 'c' in str1 is : "+indexStr1);
		 
	}
}
