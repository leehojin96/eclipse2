package day04;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				Scanner sc = new Scanner(System.in);
				String coffee="아메리카노";		
				int price;
				int qty=10;
				int amount =0;
				//입력
				System.out.print("메뉴입력 :아메리카노 , 모카라떼  , 카푸치노: "); coffee = sc.next();
				System.out.print("수량입력:");qty = sc.nextInt();
				switch( coffee) {
					case "아메리카노":
						price=2500;
						break;
					case "모카라떼":
						price=3000;
						break;
					case "카푸치노":
						price=3500;
						break;
					default :
						System.out.println("잘못된 메뉴");
						price=0;			 
				}		
				amount = qty  * price ;
				System.out.println( "주문금액: " + amount);
				
			}

		}
