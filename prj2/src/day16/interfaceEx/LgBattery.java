package day16.interfaceEx;

public class LgBattery implements Battery{
	public LgBattery() {
		System.out.println("Lg Battery 입니다.");
	}

	@Override
	public void getEnergy() {
		// TODO Auto-generated method stub
		System.out.println("에너지 얻어옴");
	}

	
}
