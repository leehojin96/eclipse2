package day16.interfaceEx;

public class Handphone2 {
	private LgBattery battery;

	public HandPhone2() {
		battery = new LgBattery();
	}

	void powerOn() {
		battery.getEnergy();
		System.out.println("핸드폰이 켜집니다.");
	}
}
