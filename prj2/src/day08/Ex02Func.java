package week02.day4;

public class Ex02Func {

	public static void main(String[] args) {			 	
		int result =add(5,6);
		System.out.println( result);		
		printStar(); 
		
	}
	
	//함수만들기
	/* 반환타입 함수이름( 입력자료){
	
    }*/	
	public static int add( int a, int b) {
		//add함수내에서의 지역변수   a, b, result 
		int result;
		result = a+b ;
		return result;
	}
	
	
	public static void printStar() {		
		System.out.println("*");
	}

}
