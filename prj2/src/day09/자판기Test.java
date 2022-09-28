package day09;

public class 자판기Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		자판기 s = new 자판기();
		s.printInfo();
		
		s.fillCoffee();
		s.printInfo();
		String result = s.밀크커피만들기(100);
		System.out.print(result);
		
	}

}
