package day16.interfaceEx;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandPhone cellphone = new HandPhone();
		
		LgBattery lg = new LgBattery();
		cellphone.setBattery(lg);
		
//		SamsungBattery Samsung = new SamsungBattery();
//		cellphone.setBattery(Samsung);
		
		cellphone.powerOn();
	}

}
