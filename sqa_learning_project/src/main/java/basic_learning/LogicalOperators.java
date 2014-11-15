package basic_learning;

public class LogicalOperators {
	
	public static void main(String args[]){
		
		int a = 2;
		int b = 5;
		int c = 4;
		int d = 7;
		
		boolean orOperator = ((a + b )> 20) || ((c + d) > 10);
		boolean andOperator = ((a + b ) > 20) && ((c + d) > 10);
		boolean notOperator = !((a + b ) > 20) == ((c + d) > 10);
		
		System.out.println("result of orOperator is : "+orOperator);
		System.out.println("result of orOperator is : "+andOperator);
		System.out.println("result of orOperator is : "+notOperator);
	}

}
