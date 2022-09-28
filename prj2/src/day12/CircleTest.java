package day12;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle pizza = new Circle(10,"자바피자");
		Circle pizza1 = new Circle(20,"자바피자2");
		
		double result = pizza.getAre();
		
		System.out.print(result);
		
	}
}
