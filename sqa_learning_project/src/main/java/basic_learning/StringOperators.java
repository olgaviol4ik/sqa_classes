package basic_learning;

public class StringOperators {
	public static void main(String[] args) {
		String str1 = "Java classes are funny";
		String str2 = "are they really?";
				
		int length = str1.length();
		System.out.println("length of str1 is : "+length);
		
		String subStr1 = str1.substring(1,length);
		System.out.println("Substring of str1 is : "+subStr1);
		
		int indexStr2 = str2.indexOf(" are");
		System.out.println("Index of ' are' in str2 is : "+indexStr2);
	}

}
