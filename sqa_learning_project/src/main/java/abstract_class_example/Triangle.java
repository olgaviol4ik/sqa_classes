package abstract_class_example;


public class Triangle extends Shape {
	private double height;
	private double length;

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}

	public Triangle(String name, double height, double length){
		super(name);
		this.height = height;
		this.length = length;
	}

	public double getArea(){
		return 0.5*length*height;
	}
}
