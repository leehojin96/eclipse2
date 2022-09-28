package day13_3;

public class SnailTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snail snail_1 = new Snail("RedSnail",2);
		Snail snail_2 = new Snail("GreenSnail",3);
		Snail snail_3 = new Snail("BossSnail",10,"몸통박치기");
		
		//기본생성자만 생성하면 어떻게 될까?
		Snail snail_4 = new Snail();
		
		//부모형에 자손형 주소를 넣으면 어떻게 될까?
		Monster m;
		m=snail_1;
		
		
		System.out.println(m.name);
		System.out.println(m.level);
		
//		System.out.println(m.armor);
//		private로 접근 불가
		
//		System.out.println(m.skill);
//		Monster(부모)형으로는 Snail(자손)형이 가지는 멤버에 접근 할 수 없음
		
		System.out.println(" ");
		
		
		
		snail_1.printInfo();
		snail_2.printInfo();
		snail_3.printInfo();
		
		
		snail_4.printInfo();
		//armor는 static 변수로 클래스를 선언하는 순간 생성
		//다른 멤버들은 자동 초기화된 빈값으로 출력되지만 armor는 정상 출력
		
		//snail_1을 통해 
		snail_1.armorUp();
		
		System.out.println("Armor Up");
		System.out.println(" ");
		
		snail_1.printInfo();
		snail_2.printInfo();
		snail_3.printInfo();
		
		
	}

}
