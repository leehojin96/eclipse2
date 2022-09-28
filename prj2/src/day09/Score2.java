package day09;


//캡슐화

public class Score2 {
	String name;
	int kor;
	int eng;
	int total;
	double avg;

	public void print() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(total);
		System.out.println(avg);
		
		
		
	}

	public void input() {
		name = "홍길동";
		kor = 90;
		eng = 90;
	}

	public void calc() {
		total = kor + eng;
		avg = total / 2.0;
	}
}
