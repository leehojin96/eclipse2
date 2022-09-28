package day14_2;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] arrs = new Animal[3];
		arrs[0] = new Cat();
		arrs[1] = new Dog();
		arrs[2] = new Wolf();
		
		for(int i = 0 ; i < arrs.length ; i++) {
			arrs[i].짖는다();
		}
	}

}
