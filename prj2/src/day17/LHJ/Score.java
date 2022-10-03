package day17.LHJ;

public class Score implements MyComparable{
	String name;
	int kor;
	
	public Score(String name,int kor) {
		this.name = name;
		this.kor = kor;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + kor;
	}
	
	@Override
	public int a(Object obj) {
		Score tmp = (Score)obj;
		return this.name.compareTo(tmp.name);
	}
}
