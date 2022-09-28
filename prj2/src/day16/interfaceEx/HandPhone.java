package day16.interfaceEx;

public class HandPhone {
	private Battery battery;

	void setBattery(Battery battery) {
		this.battery = battery;
		// 인터페이스 외부에서 접근할수 있는 경로
	}

	void powerOn() {
		battery.getEnergy();
		System.out.println("핸드폰이 켜집니다.");
	}
}
