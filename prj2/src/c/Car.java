package c;

import java.util.UUID;

public class Car {
	String carNumber; //자동차번호
	String inputTime; //입장시간
	char tgn ='A'; //톨게이트번호
	int tgc = 1;
//	UUID carId = UUID.randomUUID(); //고유id (티켓)
	
	
	int state = 1; //상태 0:고속도로에 없음 , 1:고속도로에 있음
	
	
	//생성자
	public Car(String carNumber,String inputTime,char tgn) {
		this.carNumber = carNumber;
		this.inputTime = inputTime;
		this.tgn = tgn;
		
		tgc++;
	}
	
	
	
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return carNumber+ "\n" + inputTime + "\n" + tgn + "\n" + carId;
	}
	
}
