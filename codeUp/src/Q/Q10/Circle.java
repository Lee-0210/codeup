package Q.Q10;

public class Circle {
	private double radius;
	final static double PI = Math.PI;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.pow(radius, 2) * PI;
	}
	
}
