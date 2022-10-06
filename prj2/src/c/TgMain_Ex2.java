package c;

import java.util.ArrayList;
import java.util.Scanner;

public class TgMain_Ex2 {

	public static void main(String[] args) {
		
		ArrayList<Car> cars = new ArrayList<>(); 
		Scanner sc = new Scanner(System.in);

		loop1 :while (true) {
			System.out.println("입력하세요 (1.입장 2.퇴장 3.종료) : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1: 
				System.out.println();
				System.out.println("자동차 번호 입력 : ");
				String carNumber= sc.next(); 
				
				System.out.println();
				System.out.println("진입 시간 입력 : ");
				String inputTime= sc.next();
			
				cars.add(new Car(carNumber,inputTime,'A'));
				
				
				break;		
				
			case 2:
				System.out.println("티켓 번호 입력 : ");
				String carId= sc.next(); 
				
				
			
				
				
				break;
			case 3:
				System.out.println("종료");
				break loop1;
			default:

				
				
				
			
			}
		}

	}

}
