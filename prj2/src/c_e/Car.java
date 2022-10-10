package c_e;


public class Car {
	String carNumber; //자동차번호
	int inputTime; //입장시간
	int outputTime; //퇴장시간
	String ticket; //티켓
	char tollgateChar; // 톨게이트 고유 문자
	int passCarCount; // 통과 차량 카운트
	int state = 1; //상태 0:고속도로에 없음 , 1:고속도로에 있음
	
	
	
	//생성자
	public Car(String carNumber,int inputTime,char tollgateChar,int passCarCount) {
		
		this.carNumber = carNumber;
		this.inputTime = inputTime;
		this.tollgateChar = tollgateChar;
		this.passCarCount = passCarCount;
		this.ticket = String.valueOf(tollgateChar)+passCarCount;
		this.outputTime = 0;
		this.state = 1;
		
	}
	
	public String ticketGet(){
		return ticket;
	}
	
	public void outputTimeSet(int outputTime) {
	this.outputTime = outputTime;
	this.state = 0;
	}
	
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "티켓번호 : " + ticket + "	차량번호 : " + carNumber + "		입장시간 : " + inputTime + "	퇴장시간 : " + outputTime + "	상태 : " + state;
	}
	
}
