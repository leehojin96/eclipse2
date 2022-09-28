package day16.MyArrays;

public class Score implements MyComparable{

	String name;
	int kor;
	int eng;
	int total;	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Score() {
		// TODO Auto-generated constructor stub
	}
	public Score(String name, int kor, int eng ) {	 
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total = this.kor + this.eng;
	}
	
	public void printInfo() {
		System.out.println( name+ " " +  kor + " " + eng);
	}
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", total=" + total + "]";
	}
	
	@Override
	public int compareTo(Object obj) {
		Score s = (Score)obj;
		return this.kor-s.getKor();
	}
	
	
	
}
