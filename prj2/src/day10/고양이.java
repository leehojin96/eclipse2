package day10;

public class 고양이 {

	/*	
		속성
		-이름
		-종
		-나이
		-성별
		-최근 병원 방문 일
		
	*/
		private String 이름;
		private String 종;
		private int age;
		private String 성별;
		private  String 최근병원방문일;
		//기능
		
		//입력받는다
		public void input(String 이름, String 종 , int age , String 성별 , String 방문일 ) {
			this.이름	 =이름;
			this.종 = 종;
			this.age =age;
			this.성별 = 성별;
			최근병원방문일 = 방문일;
			
		}
		//출력한다.
		
		public void printInfo() {
			System.out.println(이름);
			System.out.println(종);
			System.out.println(age);
			System.out.println(성별);
			System.out.println(최근병원방문일);
		}
		
		
	}

