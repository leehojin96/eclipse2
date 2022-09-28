package prj2;

public class Ex13 {

	public static void main(String[] args) {
		 
		//박초희님  매운맛6
		  
		//출력자료
		double sum=0;
		
		//처리자료
		int sw=1 ;
		int n=1; // 항의 분모
		double f;  // 분수항
				
		for( int i= 1 ; i<=10; i++) {
			n= n*i;
			f= i/(double)n; 
			System.out.print(f +  "   ");
			sum = sum + ( f*sw);
			sw= -sw;   //( sw*-1)			
		}		
		System.out.println(  sum );		
		
	}

}
