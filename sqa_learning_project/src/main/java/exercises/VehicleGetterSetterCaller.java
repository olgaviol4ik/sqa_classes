package exercises;

public class VehicleGetterSetterCaller {
	
	public static void main(String arg[]){
		VehicleGetterSetter myVehicle = new VehicleGetterSetter();
		myVehicle.setColor("Blue");
		myVehicle.setModel("Mazda");
		myVehicle.setMake("CX5");
		
		printProperties(myVehicle);
	}
		
		public static void printProperties(VehicleGetterSetter carProperties){
		
		System.out.println("Mazda's color is : " +carProperties.getColor());
		System.out.println("Mazda's model is : " +carProperties.getModel());
		System.out.println("Mazda's make is : " +carProperties.getMake());
	}

}
