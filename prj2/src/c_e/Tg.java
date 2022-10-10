package c_e;

public class Tg {
	char tollgateChar; // 톨게이트 고유 문자
	int passCarCount; // 통과 차량 카운트
	String ticket; // 티켓
	
	Tg(){}
	Tg(char tollgateChar){
		this.tollgateChar = tollgateChar;
		this.passCarCount = 1;
		this.ticket = String.valueOf(tollgateChar)+passCarCount;
	}
	
	public char tollgateCharGet() {
		return tollgateChar;
	}
	
	public int passCarCountGet() {
		return passCarCount;
	}
	public void passCarCountUp() {
		this.passCarCount++;
	}
	public String ticketGet() {
		return ticket;
	}
	
}
