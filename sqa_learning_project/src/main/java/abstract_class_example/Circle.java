package abstract_class_example;


public class Circle extends Shape {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}

	public double getArea(){
		return 3.14*radius*radius;
	}

}
