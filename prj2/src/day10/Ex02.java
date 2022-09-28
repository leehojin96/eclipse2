package day10;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int kor;
		int eng;
		int total;
			
		name="홍길동";
		kor=90;
		eng=80;
		total= kor+eng;
		
		System.out.println( name);
		System.out.println( kor);
		System.out.println(eng);
		System.out.println( total);
		
		// 구조체  사용자정의 자료형 
		// 서로관련 데이터를 하나의 집합으로 다룰 수 있는 자료형 
		
		Score  s = new Score();
		
		s.name ="홍길동";
		s.kor=90;
		s.eng= 90;
		s.total  = s.kor+ s.eng;
		
		
		System.out.println( s.name);
		System.out.println( s.kor);
		System.out.println( s.eng);
		System.out.println( s.total);
	}

}
