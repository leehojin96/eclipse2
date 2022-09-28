package day14_1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Animal[] a = new Animal[5];
//		a[0] = new Cat();
//		a[1] = new Dog();
//		a[2] = new Chicken();
//		a[3] = new Elephant();
//		a[4] = new Tiger();

		Animal[] a = { new Cat(), new Dog(), new Chicken(), new Elephant(), new Tiger() };

		
		System.out.println("\n==============방법1=============\n");
		
		a[0].짖는다();
		a[1].짖는다();
		a[2].짖는다();
		a[3].짖는다();
		a[4].짖는다();
		

		System.out.println("\n==============방법2=============\n");

		for (int i = 0; i < a.length; i++)
			a[i].짖는다();

		System.out.println("\n==============방법3=============\n");
		
		for (int i = 0; i < a.length; i++)
			print(a[i]);
		
		System.out.println("\n===========================\n");
		
		
		
	}
	

	//매개변수의 다향성
	public static void print(Animal a) {
		a.짖는다();
		}
	}


