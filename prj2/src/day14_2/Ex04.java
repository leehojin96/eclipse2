package week04.day1;

public class Ex04 {

	public static void main(String[] args) {
		 
		
		Score s = new Score("홍길동",100,90);
		String result = s.getInfo();
		System.out.println(result);		
		Object o = s;   // upcating 
		
				
		Customer c = new Customer("victo","0000","홍길동");
		String result2 = c.getInfo();
		System.out.println( result2);
		
		Object o2 = c;
		
		System.out.println(o.toString());
		System.out.println(o2.toString());		
		
		System.out.println(o);  
		System.out.println(o2);
		
		System.out.println(s);  
		System.out.println(c);
	 
	 
		
		String test="l like java";		
		System.out.println( test.toString());
		System.out.println( test);
		
		
		 
		

	}

}
