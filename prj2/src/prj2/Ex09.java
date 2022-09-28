package prj2;

public class Ex09 {

	public static void main(String[] args) {

     //  1   1   2    3    5     8   13      21
	// 홍윤성님 피보나치수열, 배열을 이용 매운맛3
	//처리과정
	/*
	    1.반복
	       -피보나치수열  항 구하기	 
	       -배열의 요소에 항을 저장하기     
	       -이전의 두 항을 갱신한다.
	    2. 피보나치배열 출력    
	       
	 */
		
	 int num1=1;
	 int num2=1;
	 int num3;
	 int[] p = new int[8];   //  자바스크립트배열선언  let arr = new Array(8);
	 
	 p[0]= 1;
	 p[1] =1; 
	 
	 for( int i =2 ;  i< p.length; i++) {		 
		 num3 = num1+num2;		
		 //System.out.print( num3 + "  ");		 
		 num1 = num2;
		 num2 = num3;	
		 p[i]= num3;
	 }
	 //p배열 출력
	  for( int i=0; i< p.length; i++ ) {
		  System.out.print( p[i] + "  , ");
	  }	 	 

	}

}
