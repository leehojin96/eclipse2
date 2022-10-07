package week05.team4;

import java.util.ArrayList;
import java.util.Scanner;

public class TG1_Ex1 {
	ArrayList<Car> cars;
	Tg tg;
	CostA cost1;
	CostB cost2;
	CostC cost3;
	Scanner sc = new Scanner(System.in);

	TG1_Ex1() {
		cars = new ArrayList<>();
		addcars();

	}

	private void addcars() {
		cars.add(new Car('B', 1, "12가1234", 12, 0, 1));
		cars.add(new Car('C', 2, "12가1234", 18, 0, 1));
		cars.add(new Car('B', 3, "12가1234", 20, 0, 1));
	}

	void run() {

		System.out.println("프로그램 시작 위치 : ");
		char n = (char) sc.next().charAt(0);
		tg = new Tg(n);

		loop1: while (true) {
			System.out.println("입력하세요 (1.입장 2.퇴장 3.차량조회 4.종료) : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				inputCar();
				
				break;

			case 2:
				System.out.println("퇴장 시간 입력 : ");
				int outputTime = sc.nextInt();
				
				System.out.println("차량 종류 입력 : 1.승용차 2.경차 3.대형차");
				int carType = sc.nextInt();
				
				System.out.println("티켓 번호 입력 : ");
				String ticNo = sc.next();
				
				
				//비용처리
				if(ticNo.startsWith("A")==true) {
					cost1 = new CostA(outputTime,carType,ticNo.charAt(0));
				}else if (ticNo.startsWith("B")==true) {
					cost2 = new CostB(outputTime,carType,ticNo.charAt(0));
				}else if (ticNo.startsWith("C")==true) {
					cost3 = new CostC(outputTime,carType,ticNo.charAt(0));
				}
				
				System.out.println();
				//차량 데이터에 퇴장시간 입력 
				for( int i =0; i< cars.size();i++) {
					
					System.out.println(  cars.get(i).ticketGet());
					if( cars.get(i).ticketGet().equals(ticNo)) {
						System.out.println("-퇴장차량");
						cars.get(i).outputTimeSet(outputTime);
					}
				}
				
				
				break;
				
			case 3:
				searchAll();
				
				break;
				
			case 4:
				System.out.println("종료");
				break loop1;
				
			default:
			}
		}

	}

	private void inputCar() {

		System.out.println();
		System.out.println("자동차 번호 입력 : ");
		String carNumber = sc.next();

		System.out.println();
		System.out.println("진입 시간 입력 : ");
		int inputTime = sc.nextInt();

		cars.add(new Car(carNumber, inputTime, tg.tgn,tg.ticNo));
		
		System.out.println();
		System.out.println("티켓 번호는 : " + tg.tgn + tg.ticNo + "입니다.");
		++tg.ticNo;

	}

	private void searchAll() {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
	}

}
