package day15;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "java";
		
		System.out.println(str);
		System.out.println(str.toString());
		
		Customer customer = new Customer("k100","1234");
	
		String result = customer.toString();
		System.out.println(result);
		
		
		System.out.println(customer.toString()); //toString() 메서드 생략가능
		System.out.println(customer);
		System.out.println(customer.getInfo());
	}

}
