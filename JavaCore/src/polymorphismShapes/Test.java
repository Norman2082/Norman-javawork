package polymorphismShapes;

public class Test {
	public static void main(String[] args) {
		Shape circle = new Circle("Red", 5);
		Shape sqr = new Square("Blue", 10);
		Shape tri = new Triangle("Orange", 10,10);
		circle.calculateArea();
		sqr.calculateArea();
		tri.calculateArea();
	}

}
