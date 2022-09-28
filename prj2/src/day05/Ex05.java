package day05;


public class Ex05 {

	public static void main(String[] args) {
		
		
		//배열사용
		int[] kors = new int[5];
		kors[0]=90;
		kors[1]=80;
		kors[2]=70;
		kors[3]=100;
		kors[4]=80;
		
		int sum2 = kors[0]+ kors[1] + kors[2]+ kors[3]+ kors[4];
		
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
		System.out.println(kors[3]);
		System.out.println(kors[4]);
		System.out.println("배열을 사용한합계 = "+ sum2);
		
		for(int i = 0 ; i < kors.length ; i++) {
			System.out.println(kors[i]);
		}
		
		
		
		int sum3=0;
		for(int i = 0 ; i < kors.length ; i++) {
			sum3 = sum3 + kors[i];
		}
		
		System.out.print("배열 반복문사용 사용한합계 = "+ sum3);
		
		
		
	}

}
