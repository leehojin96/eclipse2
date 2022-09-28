package day13;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat c = new Cat();
		c.먹는다();
		c.짖는다();
		c.쥐를잡는다();
		
		Animal a = c;
		Animal a2 = new Cat();
		
		Dog d = new Dog();
		d.먹는다();
		d.짖는다();
		
		Animal a3 = new Dog();
		
		//상속관계에서만 부모형 참조변수로 다룰 수 있다.
	}

}
