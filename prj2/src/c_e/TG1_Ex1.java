package c_e;

import java.util.ArrayList;
import java.util.Scanner;

public class TG1_Ex1 {
	ArrayList<Car> cars;
	ArrayList<Tg> tgs;
	Cost cost;

	char tollgateChar;
	int passCarCount;

	int tollgateIndex;

	Scanner sc = new Scanner(System.in);

	TG1_Ex1() {
		cars = new ArrayList<>();
		tgs = new ArrayList<>();
	}

	void run() {
		loop1: while (true) {

			String inputText;
			System.out.println("톨게이트 프로그램 시작 위치 입력 (A ~ Z , 종료): ");
			inputText = sc.next();
			if (inputText.equals("종료")) {
				break loop1;
			} else {
				tollgateChar = (char) inputText.charAt(0);
			}

			for (int i = 0; i < tgs.size(); i++) {

				if (tgs.get(i).tollgateCharGet() == tollgateChar) {

					passCarCount = tgs.get(i).passCarCountGet();
					break;
				}
			}
			if (passCarCount == 0) {
				tgs.add(new Tg(tollgateChar));
				tollgateSet();
			}

			tollgateIndex = tollgateIndexget();

			loop2: while (true) {
				System.out.print("현재 '" + tollgateChar + "' 톨게이트 작업 입력 (1.입장 2.퇴장 3.차량조회 4.톨게이트 재선택 5.종료) : ");
				int menu = sc.nextInt();

				switch (menu) {
				case 1:
					inputCar();

					break;

				case 2:
					outputCar();

					break;

				case 3:
					searchAll();

					break;

				case 4:
					passCarCount = 0;
					break loop2;

				case 5:
					System.out.println("종료");
					break loop1;
				default:
				}
			}

		}
	}

	private void inputCar() {

		System.out.println();
		System.out.println("자동차 번호 입력 : ");
		String carNumber = sc.next();

		int inputTime;
		do {
			System.out.println();
			System.out.println("진입 시간 입력 : ");
			inputTime = sc.nextInt();
		} while (inputTime < 1 || inputTime > 24);

		cars.add(new Car(carNumber, inputTime, tollgateChar, passCarCount));

		System.out.println();
		System.out.println("티켓 번호는 " + tollgateChar + passCarCount + "입니다.");
		System.out.println();

		tgs.get(tollgateIndex).passCarCountUp();
		passCarCount = tgs.get(tollgateIndex).passCarCountGet();

	}

	private void outputCar() {
		int outputTime;
		do {
			System.out.println();
			System.out.println("퇴장 시간 입력 : ");
			outputTime = sc.nextInt();
		} while (outputTime < 1 || outputTime > 24);

		String carType;
		do {
			System.out.println();
			System.out.println("차량 종류 입력 : ");
			carType = sc.next();
		} while (carType.equals("전기차") || carType.equals("경차") || carType.equals("대형차") || carType.equals("중형차"));

		System.out.println();
		System.out.println("티켓 번호 입력 : ");
		String ticket = sc.next();

		// 티켓 번호 유효 검사
		for (int i = 0; i < cars.size(); i++) {

			if (cars.get(i).ticketGet().equals(ticket)) {

				// 비용처리
				cost = new Cost(outputTime, carType, ticket.charAt(0), tollgateChar);

			}
		}

		// 차량 데이터에 퇴장시간 입력
		for (int i = 0; i < cars.size(); i++) {

			if (cars.get(i).ticketGet().equals(ticket)) {

				cars.get(i).outputTimeSet(outputTime);
			}
		}

	}

	// cars어레이 리스트 조회
	private void searchAll() {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println();
	}

	// 톨게이트 고유 번호 입력시 통과자동차수 세팅
	private void tollgateSet() {
		for (int i = 0; i < tgs.size(); i++) {

			if (tgs.get(i).tollgateCharGet() == tollgateChar) {

				passCarCount = tgs.get(i).passCarCountGet();

			}
		}
	}

	// tgs에서 입력한 tollgateChar에 일치하는 Index 숫자 return해줌
	private int tollgateIndexget() {
		for (int i = 0; i < tgs.size(); i++) {

			if (tgs.get(i).tollgateCharGet() == tollgateChar) {

				return i;
			}
		}
		return 99;
	}
}
