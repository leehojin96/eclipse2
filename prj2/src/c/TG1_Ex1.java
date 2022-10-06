package c;

import java.util.ArrayList;
import java.util.Scanner;

public class TG1_Ex1 {
	ArrayList<Car> cars;
	Scanner sc = new Scanner(System.in);

	final char tgn ='A'; //톨게이트고유번호
	int ticNo = 01; // 톨카운트넘버

	TG1_Ex1() {
		cars = new ArrayList<>();
		
		addcars();
	}
	private void addcars() {
//		cars.add(new Car("12가1234", 12, 1));
	}

	void run() {
		loop1: while (true) {
			System.out.println("입력하세요 (1.입장 2.퇴장 3.차량조회 4.종료) : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				inputCar();

				break;

			case 2:
				System.out.println("티켓 번호 입력 : ");
				String ticketId = sc.next();

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
		
		cars.add(new Car(carNumber, inputTime,ticNo));
		System.out.println();
		System.out.println("티켓 번호는 : " + tgn+ticNo + "입니다.");
		++ticNo;

	}
	private void searchAll() {
		for(int i=0; i< cars.size() ; i++) {
			System.out.println(cars.get(i));
			}
	}
	
}
