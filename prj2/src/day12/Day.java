package day12;

// 객체 : 한 개  => 자료형 class
public class Day {
	
	private String time;
	private String contents;
	
	
	public Day() {
		
	}
	
	public Day( String time, String contents) {
		this.time = time;
		this.contents = contents;		
	}
	
	//
	public void printInfo() {
		System.out.println( time + "   " + contents);
	}
	
	//객체의 속성, 필드들은 각 각 setter가진다.   set+필드명(필드명 첫글자 대문자로)
	public void setTime(String time) {
		this.time = time;
	}
		
	
	public void setContents(String contents) {
		this.contents =contents;
	}
}
