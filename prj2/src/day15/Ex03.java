package day15;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer("k100","1234");
		Customer c2 = new Customer("k100","1234");
		
		boolean result = c.equals(c2);//결과는?
		
		System.out.println(result);
	
		
	}

}
