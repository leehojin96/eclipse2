package day14;

public class 오버라이딩Test {

	public static void main(String[] args) {
		
/*
 *			오버라이딩은 메서드의 내용만을 새로 작성하는 것이므로 메서드의 선언부는 조상의 것과 완전히 일치해야한다.
 *			
 *			조건
 *			1.이름이 같아야 한다.
 *			2.매개변수가 같아야 한다.
 *			3.반환타입이 같아야 한다.
 *
 *			한마디로 선언부가 일치해야 한다.
 * 			다만, 접근 제어자(access modifier)와 예외(exception)는 제한된 조건 하에서만 다르게 변경 가능하다.
 * 			
 * 			1.접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경 할 수 없다.
 * 			조상 클래스가 protected라면 , 이를 오버라이딩하는 자손 메서드는 protected나 public 이여야 한다. 대부분 같은 범위를 사용
 * 
 * 			2.조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
 * 			throws Exception은 모든 예외의 최고 조상이므로 조심
 * 
 * 			
 * 
 * 			조상 클래스읜 메서드를 자손 클래스에서 오버라딩할 때
 * 			1.접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
 * 			2.예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
 * 			3.인스턴스메서드를 static메서드로 또는 그 반대로 변경할 수 없다.
 * 
 * */
		
		Parent pa = new Parent();

		pa.display();

		Child ch = new Child();

		ch.display();

		Parent pc = new Child();

		pc.display(); // Child cp = new Parent();
		

	}

}
