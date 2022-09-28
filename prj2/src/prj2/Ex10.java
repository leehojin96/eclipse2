package prj2;

public class Ex10 {

	public static void main(String[] args) {
	 //김소영님 순한맛4
		/*
		 * 
		 * 4번
		자료명세(변수찾기)
		출력자료: sum(총합), n(항)
		입력자료:  
		처리자료: 합
		준비자료:
		
		처리과정 : n에 n+2의 과정의 합이1000 초과 시까지 반복 
		
		n=1   sum=1
          3       4
		  5       9
		  7      16 
		 */
		
		int sum=1, n=1;		
		while( sum <= 1000) {
			n=n+2;
			sum =  sum + n;
			//System.out.println(  n + "  "  +  sum);
		}		
		System.out.println(  n + "  "  +  sum);	

	}

}
