package c;

import java.util.Scanner;

public class TgMain_Ex1 {

	public static void main(String[] args) {
		
		String[][] car = new String[10][4];
		Scanner sc = new Scanner(System.in);
		String TGN="A";
		String ticketN="0";
		int car_i=0;

		loop1 :while (true) {
			System.out.println("입력하세요 (1.입장 2.퇴장 3.종료) : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1: 
				System.out.println();
				System.out.println("자동차 번호 입력 : ");
				String carId= sc.next(); 
				car[car_i][0]=carId;
				
				System.out.println();
				System.out.println("진입 시간 입력 : ");
				String inputTime= sc.next();
				car[car_i][1]=inputTime;
				
				//톨게이트넘버
				car[car_i][2]=TGN;
				
				//티켓넘버
				car[car_i][3]=ticketN;
				
				//카운트업
				int i = ticketN.charAt(0);
				i++;
				ticketN = Character.toString(i);
				System.out.println(ticketN);
				
				
				System.out.println();
				System.out.println("티켓번호는 " +car[car_i][2]+car[car_i][3]+ " 입니다.");
				
				car_i++;
				break;		
				
			case 2:
				System.out.println("티켓 번호 입력 : ");
				String inputTicket= sc.next(); 
				
			
				
				
				break;
			case 3:
				System.out.println("종료");
				break loop1;
			default:

				
				
				
			
			}
		}

	}

}
