package day07;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 국어점수가 다음과 같이 배열에 준비되어 있을 때{ 80,70,90,85,81,66}
//	    int[] kors = { 80,70,90,85,81,66} ;
//
//	   평균보다 높은 점수는 몇개인가?
		
		int[] kors = { 80,70,90,85,81,66} ;
		
		int kors_total = 0;
		int avrg = 0;
		
		for(int i = 0 ; i < kors.length ; i++) {
			kors_total += kors[i];
		}
		avrg = kors_total / kors.length;
		System.out.println("평균 값 : " + avrg);
		
		for(int i = 0 ; i < kors.length ; i++) {
			if(kors[i] > avrg) {
				
				System.out.println(kors[i]); 
			}
			
		}
		
	}

}
