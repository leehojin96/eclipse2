package day10;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 
			
			String name;
			int kor;
			int eng;
			int total;		
			
			//입력
			name="홍길동";
			kor=90;
			eng=80;
			total= kor+eng;
			//출력
			printInfo( name, kor, eng, total);	
			
			
			Score s= new Score();
			s.name="홍길동2";
			s.kor=90;
			s.eng=80;
			s.total= s.kor + s.eng;
			
			printInfo2(s);
			

		}
		

		private static void printInfo2(Score a) {
			 System.out.println( a.name);
			 System.out.println( a.kor);
			 System.out.println( a.eng);
			 System.out.println( a.total);
			
		}


		private static void printInfo(String n, int k, int e, int total) {
			System.out.println( n);
			System.out.println( k);
			System.out.println(e);
			System.out.println( total);		
		}
		
		

	}