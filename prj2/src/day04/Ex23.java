package day04;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1회 작업이 될 수 있도록 코딩합니다.
		// 반복을 적용한다.
		
		// 1. 반복
		// 1-1. 메뉴와 수량을 입력받는다 , stop이면 종료
		// 1-2. 단가를 구한다
		// 1-3. 주문금액 구한다
		// 1-4. 주문금액 출력
		
		
		String coffee;
		int qty;
		int price;
		int amount;
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("메뉴 : ");  coffee = sc.next();
//		System.out.print("수량 : ");  qty = sc.nextInt();
//		
//		switch(coffee) {
//		case "아메리카노":
//			price = 2500;
//			break;
//		case "모카라떼":
//			price = 3000;
//			break;
//		case "카푸치노":
//			price = 3500;
//			break;
//		default:
//			price = 0;
//			System.out.println("메뉴선택 오류");
//		}
//		
//		amount = price * qty;
//		System.out.println("주문음액 " + amount);
//	}
		
		
		while(true) {
			System.out.print("메뉴 : ");  coffee = sc.next();
			if(coffee.equals("stop"))break;
			System.out.print("수량 : ");  qty = sc.nextInt();
			
		}

}
