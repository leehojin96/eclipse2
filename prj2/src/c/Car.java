package c;


public class Car extends TG1_Ex1{
	String carNumber; //자동차번호
	int inputTime; //입장시간
	int outputTime; //퇴장시간
	int ticNo; //티켓넘버
	char tgn;
	int state = 1; //상태 0:고속도로에 없음 , 1:고속도로에 있음
	
	
	
	//생성자
	public Car(String carNumber,int inputTime,int ticNo) {
		
		this.carNumber = carNumber;
		this.inputTime = inputTime;
		this.ticNo = ticNo;
		this.outputTime = 0;
		this.state = 1;
		this.tgn = super.tgn;
		
	}
	
	
	public Car(char tgn,int ticNo,String carNumber, int inputTime, int outputTime,int state) {
		
		this.tgn = tgn;
		this.ticNo = ticNo;
		this.carNumber = carNumber;
		this.inputTime = inputTime;
		this.outputTime = outputTime;
		this.state = state;
	}
	
	
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "티켓번호 : " + tgn+ticNo + "	차량번호 : " + carNumber + "		입장시간 : " + inputTime + "	퇴장시간 : " + outputTime + "	상태 : " + state;
	}
	
}
