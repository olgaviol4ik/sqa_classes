package inheritance;
//Create a Person Class with gender, age and name. 
//Create an Employee Class with IdNum, exprYr. 
//Define a default and overloaded constructor for Person class and Employee Class. 
//Employee class constructor should have all 5 properties.(2 of child and 3 of parent) 
//Write an Employee class caller. Create 2 objects: one without any arguments 
//and other with setting all the properties. Print out all the properties for both the objects. 

public class Employee extends Person {
	private int Idnum;
	private int exprYr;

	public Employee(){}
	
	public Employee(int IDnum, int exprYr, String gender, int age, String name){
		super(gender, age, name);
		this.Idnum = Idnum;
		this.exprYr = exprYr;
	}

	public int getIdnum() {
		return Idnum;
	}

	public void setIdnum(int idnum) {
		Idnum = idnum;
	}

	public int getExprYr() {
		return exprYr;
	}

	public void setExprYr(int exprYr) {
		this.exprYr = exprYr;
	}
	

}
