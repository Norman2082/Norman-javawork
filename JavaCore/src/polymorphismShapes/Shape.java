package polymorphismShapes;

public abstract class Shape {
String colour;

public Shape(String colour) {
	super();
	this.colour =colour;
}
public abstract void calculateArea();
}