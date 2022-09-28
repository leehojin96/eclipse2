package day12;

public class Score {

	String name;
	int kor;
	int eng;
	int total;

	// 생성자

	public Score() {

	}

	public Score(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	// 매서드 , 내부적으로 this가 전달됨

	public void printInfo() {
		System.out.print(this.name + this.kor + eng + total);
	}

	// this 정달 안함 , 과거버전 함수랑 비슷함
	public static void printTitle() {
		System.out.println("");
	}

}
