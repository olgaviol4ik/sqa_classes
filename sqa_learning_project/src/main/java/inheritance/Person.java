package inheritance;

public class Person {
	public String gender;
	public int age;
	public String name;
	
	public Person(){}
	
	public Person(String gender, int age, String name){
		this.gender = gender;
		this.age = age;
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
