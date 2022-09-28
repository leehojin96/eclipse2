package day12;

public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Score s = new Score("홍길동",100,90);
		s.printInfo();
		
		//static매서드 , 클래스명.매서드();
		Score.printTitle();
	}

}
