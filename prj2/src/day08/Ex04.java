package day08;

public class Ex04 {

	public static void main(String[] args) {

		String[] result = method7();

		
		int result2 = method2();
		System.out.println(result2);
		
		double result3 = method3();
		System.out.println(result3);
		
		boolean result4 = isAdult(20);
		System.out.println(result4);
			
		String[] result  =method7();		
		System.out.println( result[0]);
		System.out.println( result[1]);
		System.out.println( result[2]);
		
		
		method1();
		int result2 = method2();
		System.out.println( result2);
		
		
		double result3 = method3();
		System.out.println( result3);
		
		
		boolean result4=isAdult(20);
		System.out.println( result4);
		
		
		if(result4) {  // true, false
			System.out.println("물건을 구매할 수 있다");			
		}else {
			System.out.println("구입 물가");
		}
		
		String result5 = method4();
		System.out.println(result5);
		
		char  result6 = method5();
		System.out.println( result6);
		
		int[] result7 = method6();
		
		for(int i=0; i< result7.length; i++) {
			System.out.println( result7[i]);
		}

	}
	

	public static void method1() {
		System.out.println("특정기능을 수행합니다");		
	}
	
	
	public static int method2() {
		return 5;   // int형의 값을 반환하는 매서드		
	}
	
	public static double method3() {
		return 35.12;   //double형의 값을 반환하는 매서드
	}
	
	
	public static String method4() {
		return  "hello";   //문자열 값을 반환하는 매서드
	}
	
	public static char method5() {
		return 'a' ;   // 문자 값을 반환하는 매서드 
	}
	
	
	public static int[] method6() {		
		int[] arr = {1,2,3,4,5};
		return arr;
	}
	
	public static String[] method7() {
		String[] arr = {"one","two","three"};
		return arr;
	}
	
	
	
	public static boolean isAdult(int age) {
		 boolean result;
		 
		 if( age>19) result= true;
		 else    	 result=false;
		 
		 return result;		 
	}

}
