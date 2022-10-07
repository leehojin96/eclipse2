package week05.team2;

	
	public class Gate{
		//진입게이트는 GATE1하나로 설정, 출구게이트 정보 담기위한 클래스
		
		int number ; //게이트번호 
		int change ; //기본요금
		int mileage ;// gate1에서부터의 주행거리 
		
		
		
		//생성자
		public Gate() {};
		public Gate(int number, int change, int mileage) {
		
			this.number = number;
			this.change = change;
			this.mileage = mileage;
		}
		//게이트기본정보 설정 
		@Override
		public String toString() {
			return "게이트정보안내 [Gate" + number + ", 기본요금은" + change + "이며, 거리는 " + mileage + "입니다.]";
		}
		
	}		

/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

*/
