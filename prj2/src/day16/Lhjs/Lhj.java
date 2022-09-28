package day16.Lhjs;

public class Lhj implements MyRunnable{
	
	
	
	//인터페이스에 있는 메소드
	@Override
	public void run() {
		
		System.out.println("이호진 run");
		
		Lhj lhj = new Lhj();
		lhj.fighting();
		}
	
	
	
	//인터페이스에 없는 메소드
	public void fighting(){
		System.out.println("다들 화이팅..");
	}
	

	
	
}
