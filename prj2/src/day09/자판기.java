package day09;


//데이터 => 변수 (멤버변수) 
//기능 => 메서드 (멤버매서드)

//
public class 자판기 {
	
	//멤버변수
	private int 설탕;
	private int 프리마;
	private int 원두;
	private int 물;
	private int 매출금액;
	
	//멤버 매서드
	
	public void printInfo() {
		System.out.println("<자판기 정보 출력>");
		System.out.println("설탕:"+설탕);
		System.out.println("프리마:"+프리마);
		System.out.println("원두:"+원두);
		System.out.println("물:"+물);
		System.out.println("매출금액:"+매출금액);
	}
	
	public void fillCoffee() {
		설탕 += 100;
		프리마 += 100;
		원두 += 100;
		물 += 1000;
	}
	
	
	public String 밀크커피만들기(int 돈) {
		if(돈==100) {
			System.out.println("밀크커피 만들기 시작...");
			설탕 -=10;
			프리마 -=10;
			원두 -=20;
			물 -=100;
		}
		return "밀크커피 추출 완료";
	}
}
