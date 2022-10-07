package c;

import java.util.ArrayList;
import java.util.Scanner;

public class TG1_Ex1 {
	ArrayList<Car> cars;
	ArrayList<Tg> tgs;
	Cost cost;
	Scanner sc = new Scanner(System.in);

	TG1_Ex1() {
		cars = new ArrayList<>();
		tgs = new ArrayList<>();
		
		addcars();
	}

	private void addcars() {
		cars.add(new Car('B', 1, "12가1234", 12, 0, 1));
		cars.add(new Car('C', 2, "12가1234", 18, 0, 1));
		cars.add(new Car('B', 3, "12가1234", 20, 0, 1));
	}

	void run() {
		
	//시작 위치 입력받기
		char n=0;
	 do {
		System.out.println("프로그램 시작 위치 : ");
		 n = (char) sc.next().charAt(0);
	 }while(n <'A'  || n > 'Z' );
			
		tgs.add(new Tg(n));

		loop1: while (true) {
			System.out.println("입력하세요 (1.입장 2.퇴장 3.차량조회 4.종료) : ");
			System.out.println();
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				inputCar();
				
				break;

			case 2:
				
				//퇴장 시간 입력
				int outputTime;
				do {
				System.out.println("퇴장 시간 입력 : ");
				outputTime = sc.nextInt();
				}while(outputTime < 0 || outputTime > 24);
				
				String carType;
				do {
				System.out.println("차량 종류 입력 : ");
				carType = sc.next();
				}while(carType.equals("경차") || carType.equals("전기차") || carType.equals("대형차")||carType.equals("중형차"));
				
				System.out.println("티켓 번호 입력 : ");
				String ticNo = sc.next();
				
				
				//비용처리
				cost = new Cost(outputTime,carType,ticNo.charAt(0),tg.tgn);
				
				
				
				
				//차량 데이터에 퇴장시간 입력 
				for( int i =0; i< cars.size();i++) {
					
					if( cars.get(i).ticketGet().equals(ticNo)) {
						
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

		cars.add(new Car(carNumber, inputTime, tg.tgn,tg.tgc));
		
		System.out.println();
		System.out.println("티켓 번호는 : " + tg.tgn + tg.tgc + "입니다.");
		System.out.println();
		
		++tg.tgc;

	}

	private void searchAll() {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
	}

}
