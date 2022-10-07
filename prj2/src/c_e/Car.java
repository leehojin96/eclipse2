package c_e;


public class Car {
	String carNumber; //자동차번호
	int inputTime; //입장시간
	int outputTime; //퇴장시간
	String ticNo; //티켓
	char tgn; //톨게이트넘버
	int ticCount; // 티켓에 들어갈 숫자
	int state = 1; //상태 0:고속도로에 없음 , 1:고속도로에 있음
	
	
	
	//생성자
	public Car(String carNumber,int inputTime,char tgn,int ticCount) {
		
		this.carNumber = carNumber;
		this.inputTime = inputTime;
		this.tgn = tgn;
		this.ticCount = ticCount;
		this.ticNo = String.valueOf(tgn)+ticCount;
		this.outputTime = 0;
		this.state = 1;		
		
	}
	
	//예시 생성자
	public Car(char tgn,int ticCount,String carNumber, int inputTime, int outputTime,int state) {
		
		this.carNumber = carNumber;
		this.inputTime = inputTime;
		this.tgn = tgn;
		this.ticCount = ticCount;
		this.ticNo = String.valueOf(tgn)+ticCount;
		this.outputTime = outputTime;
		this.state = state;
	}
	
	public String ticketGet(){
		return ticNo;
	}
	
	public void outputTimeSet(int outputTime) {
	this.outputTime = outputTime;
	this.state = 0;
	}
	
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "티켓번호 : " + ticNo + "	차량번호 : " + carNumber + "		입장시간 : " + inputTime + "	퇴장시간 : " + outputTime + "	상태 : " + state;
	}
	
}
