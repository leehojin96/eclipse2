package day13;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
//		Animal c = new Animal();
		Dog dog = new Dog();
//		Animal d = new Animal();
		
//		cat.짖는다();
		print1(cat);
		
//		dog.짖는다();
		print2(dog);
		
		print3(cat);
//		print3(dog);
		
	}

	
	public static void print1(Cat c) {
		c.짖는다();
	}
	public static void print2(Dog d) {
		d.짖는다();
	}
	
	//매개변수의 다향성
	public static void print3(Animal a) {
		a.짖는다();
		
//		if(a instanceof Cat) {
//			((Cat)a).쥐를잡는다(); //down캐스팅(형변환) 반드시 형 체크해야 함
//		}
	}
}
