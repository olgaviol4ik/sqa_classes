package inheritance;

public class EmployeeCaller {
	public static void main(String args[]){
		Employee num1 = new Employee();
		Employee num2 = new Employee(2, 2016, "male", 35, "Henry");
		
		System.out.println("Properties of num1 are: ");
		System.out.println("Idnum : " +num1.getIdnum()+"\n, expYr :  " +num1.getExprYr()+"\n gender : "+num1.getGender()+"\n name : "+num1.getName()+"\n age : "+num1.getAge());
		
		System.out.println("Properties of num2 are: ");
		System.out.println("Idnum : " +num2.getIdnum()+"\n, expYr : " +num2.getExprYr()+" \n gender : "+num2.getGender()+"\n name : "+num2.getName()+"\n age : "+num2.getAge());
		
	}

}
