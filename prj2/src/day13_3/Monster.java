package day13_3;

public class Monster {
	
	//Monster의 클래스변수 
	private static int armor=3;
	
	//Monster의 인스턴스 변수
	 String name;
	 int level;
	
	//Monster 기본생성자
	Monster() {
		
	}
	
	Monster(String name,int level) {
		this.name = name;
		this.level = level;
	}
	
	//protected : 같은 클래스,패키지 + 자손클래스
	protected void armorUp() {
		armor++;
	}
	public void rmorDown() {
		armor--;
	}
	int getArmor(){
		return armor;
	}

}
