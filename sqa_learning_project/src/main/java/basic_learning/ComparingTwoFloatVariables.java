package basic_learning;

public class ComparingTwoFloatVariables {
	
	public static void main(String args[]){
		float a = 1.4f;
		float b = 2.3f;
		
		boolean isEqual = (a==b);
		boolean isNotEqual = (a!=b);
		boolean greaterThan = (a>b);
		boolean lessThan = (a<b);
		
		System.out.println(a+" isEqual "+b+" : "+isEqual);
		System.out.println(a+" isNotEqual "+b+" : "+isNotEqual);
		System.out.println(a+" greaterThan "+b+" : "+greaterThan);
		System.out.println(a+" lessThan "+b+" : "+lessThan);
		
		
	}

}
