package day18;

import java.io.Serializable;

public class Score implements Serializable{
	String name;
	int kor;
	int eng;
	int total;

	public Score() {
		// TODO Auto-generated constructor stub
	}

	public Score(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total = this.kor + this.eng;
	}

	@Override
	public String toString() {
		return name + ", "+ kor+ ", " + eng + ", " + total;
	}
	
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return this.total - ((score)d.);
//	}

	
}
