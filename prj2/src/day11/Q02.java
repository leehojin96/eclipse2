package day11;
//2. 나이가40살 
//이름이 james라는 남자가 있다
//이 남자는 결혼을 했고 자식이 셋이 있습니다
//
//<출력결과>
//나이 :
//이름 :
//결혼여부 :
//자녀수 :
public class Q02 {
	
	private int age;
	private String name;
	private boolean marriage;
	private int child;
	
//	private String[] userInfo;
	
	Q02(){
		
	}
	
	public void input(int age, String name, boolean marriage,int child) {
		this.age= age;
		this.name = name;
		this.marriage = marriage;
		this.child = child;
	}
	
	public void output() {
		System.out.println("나이 : "+ age);
		System.out.println("이름 : "+ name);
		System.out.println("결혼여부 : "+ marriage);
		System.out.println("자녀수 : "+ child);
	}
}
