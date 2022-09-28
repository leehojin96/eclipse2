package prj2;

public class Ex12 {

	public static void main(String[] args) {		 
		//조재연님  	순한맛4
		// 출력
		int term=0 ;  //이전항을 저장할 변수
		int sum =0; // 항의 누적
		
		//처리변수
		int number=1;  //항을 구할 변수 		
		
		while( sum  <=10) {
			term  = number;
			sum =sum + term; 
			number = number+2; 
			//System.out.println(  term + " " + number  +" " +  sum);
		}		
		System.out.println ( term + " " + sum);		
	}

}
