package prj2;

public class Ex06 {

	public static void main(String[] args) {
	    //  2  6   18   54   162  486 
		//고기현님  매운맛5
		int sum=0;  //누적
		int n  ;// 항
		
		for( int  i=0;  i< 7 ; i++ ) {
			n = (int )(2* Math.pow(3, i));   // 3^i	  3의제곱 구하기		
			sum = sum+ n ;
			System.out.print( n + "   ");
		}		
		System.out.println( "\n합계= " + sum);		

	}

}
