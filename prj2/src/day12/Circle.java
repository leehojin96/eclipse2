package day12;

public class Circle {
	
	int radius;
	String name;
	
	public Circle(int radius,String name){
	this.radius = radius;
	this.name = name;
	}
	public double getAre() {
		return 3.14*radius*radius;
	}
	
	
}
