package day16.interfaceEx;

public class SamsungBattery implements Battery{
	public SamsungBattery() {
		System.out.println("Samsung Battery 입니다.");
	}
	
	public void getEnergy() {
		System.out.println("에너지 얻어옴");
	}
}