package hometask;

public class ExersizeOnString {
	
	public static void main(String args[]){
		 String str1 = "Soccer";
		 String str2 = new String ("Football");
		 String str3 = "Cricket";
		 
		 System.out.println("Comparing references for str1 and str2 : " + (str1 == str2));
		 System.out.println("Comparing references for str1 and str3 : " + (str1 == str3));
		 System.out.println("Comparing references for str2 and str3 : " + (str2 == str3));
		 System.out.println("Comparing values for str1 and str2 : " +str1.equals(str2));
		 System.out.println("Comparing values for str1 and str3 : " +str1.equals(str3));
		 System.out.println("Comparing values for str2 and str3 : " +str2.equals(str3));
	}
}
