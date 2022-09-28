package prj2;

public class Ex14 {
	
	public static void main(String[] args) {
	 
		//2! 3! 4! 5! 6! 7! …
		//! : 팩토리얼 (1부터 자신의 수까지의 곱을 말한다) 3! =1 * 2 * 3
		
		//출력자료
		int sum =0;
		//처리자료
		int n=1 ; //  항		
		for( int i=2 ;  i<=7 ; i++) {
			
			n=n*i;                                 //  n=1      i=2     sum
			sum+=  n;  // sum  = sum + n;          //    2        3       2
			                                       //    6        4       8  
			                                       //    24       5       32
			                                       //    120      6       152   
		}		
		System.out.println( sum);
		
		
	}

}
