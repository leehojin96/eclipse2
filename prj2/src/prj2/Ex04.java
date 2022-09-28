package prj2;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		 
		
		/* 함희원님 순한맛3
		 * 문제3) 100개의 수 입력시, 양수,음수의 개수, 양수 중 짝수와 홀수의 개수
			
			start
			■자료명세표
			1. 출력자료  Minus = 음수
					Plus = 양수
			
			i=i+1
					Odd = 홀수
					Even = 양수
			2. 입력 자료 number : 100개중 입력되는 수
			
			minus=0 plus=0
			odd=0 even=0 MAX=100
			number
			   Symbolic Constant : MAX=100 (의미화 상수)
			3. 처리 자료 I = 반복제어변수
		  */
			int minus=0, plus=0 , odd=0, even=0 ;
			final int MAX =5;    // 의미화상수  변수-> 상수화시킴
			int number;			
			Scanner sc = new Scanner( System.in);			
			for( int i =1; i<=MAX ;i++ ) {
				number = sc.nextInt();  
				if( number >0) {
					plus++;	
					if( number %2 ==0) {
						even++;						
					}else {
						odd++;						
					}	
					
				}else{
					minus++;									
				}				
			}
			//
			System.out.println("양수=" + plus  + "음수=" + minus  );
			System.out.println("양수중 짝수개수=" + even +  "양수중 홀수 개수=" +odd);			
		
		
	}

}
