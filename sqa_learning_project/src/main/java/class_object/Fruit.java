package class_object;
// Write a fruit class that defines 4 constructors: 
//a) default constructor 
//b) constructor with 1 argument (String name) 
//c) constructor with 2 arguments (String name, String taste) 
//d) constructor with 3 arguments (String name, String taste, String color); 
//Only one of the constructor should have the initialization code and rest of the constructors should use “this(…)” syntax.
//From the main method, create 4 objects one for each constructor type and print the properties after each object is created.

public class Fruit {
	String name;
	String color;
	String taste;

	public Fruit(){}

	public Fruit(String name, String color, String taste){
		this.name = name;
		this.color = color;
		this.taste = taste;
	}

	public Fruit(String name){
		this(name,null,null);
	}
	
	public Fruit(String name, String taste){
		this(name,taste,null);
	}
	
	public static void main(String args[]){
		Fruit fruitObject = new Fruit("Apple");
		System.out.println("Name of the fuit is:" +fruitObject.name);
		Fruit fruitObject2 = new Fruit("Green", "Sour");
		System.out.println("Color and taste of the fruit are :" +fruitObject2.color);
	}

}
