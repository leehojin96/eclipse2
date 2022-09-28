package day11;

public class Q01Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q01[] Q01 = new Q01[5];
		
		
//		인덱스 0 만 객체 생성
//		Q01[0] = new Q01();
		
//		전체 인덱스 객체 생성
		for(int i = 0 ; i < Q01.length ; i++) {			
		Q01[i] = new Q01();
		}
		
		
//		인덱스0 에 매개변수 통해 직접 인풋 , 출력
		Q01[0].input("20220519001", "abc123", "2022년5월19일", "홍길순", "PM0345-12", "서울시 중구 을지로 299");
		Q01[0].output();
	}

}
