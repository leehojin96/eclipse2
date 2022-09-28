package day16.Lhjs;

public class Program {
	
	
	public void mainrun (MyRunnable runnable) {

		runnable.run();
//		runnable.fighting();
	}
	
	
	//테스터
	public static void main(String[] args) {
		
		
		//Program 클래스 타입 p 변수에 인스턴스 생성
		Program p = new Program();
		
		
		//p의 mainrun메소드(MyRunnable 인터페이스한 클래스);
		p.mainrun(new Lhj()); //new Lhj() : 참조변수가 없는 상태로 바로 입력해서 익명객체라 불림.
		
		
		
		
		
	}

}
