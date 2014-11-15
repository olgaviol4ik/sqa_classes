package abstract_class_example;

public class ShapeCaller {

	public static void main(String args[]){
		Shape bigCircle = new Circle("BigYellowCircle", 2);
		Shape smallTriangle = new Triangle("SmallRedTriangle", 1, 2);

//		double sCircle = bigCircle.getArea();
//		double sTriangle = smallTriangle.getArea();

//		System.out.println("Square of the circle \"" +bigCircle.getName() + "\" is : " +sCircle);
//		System.out.println("Square of the triangle \"" +smallTriangle.getName() + "\" is : " +sTriangle);
		
		Shape[] shpArr = new Shape[]{bigCircle, smallTriangle};
		for(Shape sh : shpArr){
			System.out.println("Area of : " +sh.getName() + " is : "+sh.getArea());
		}

	}
}


