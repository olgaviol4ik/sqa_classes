package class_object;
//Create a vehicle class. Properties : 
//String color, int make and String model.  
//Write a default and overloaded constructor 
//that initializes these properties. 
//Write a main method that creates the object by passing these values.
//Print the values of the properties after the object is created. 


	public class Vehicle {
	String name;
    int make;
    String color;
    
   // public Vehicle(){}  //default constructor
    
    public Vehicle(String name, int make, String color){
    	this.name = name;
    	this.make = make;
    	this.color = color;
    }
    
    public Vehicle(String name, int make){
    this(name,make,null);
    }
    
    public void printName(){
    		 System.out.println("Name is : " +name);
    }
    	
    public static void main(String args[]){ 
    		Vehicle myVehicle  = new Vehicle( "Mazda", 5 );
    		myVehicle.printName();
    		System.out.println("Car make is : " +myVehicle.make);
    
            
    	}
    	
    	
    }
    


