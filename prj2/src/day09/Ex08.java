package day09;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score s = new Score();

		input(s);
		calc(s);
		print(s);
	}

	private static void print(Score s) {
		System.out.println(s.name);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.total);
		System.out.println(s.avg);
		
		
		
	}

	private static void input(Score s) {
		s.name = "홍길동";
		s.kor = 90;
		s.eng = 90;
	}

	private static void calc(Score s) {
		s.total = s.kor + s.eng;
		s.avg = s.total / 2.0;
	}

}
