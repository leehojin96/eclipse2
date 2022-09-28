package day08;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		//화폐 매수 구하기
//		(오만원 만원 오천원 천원 오백원 배원 오십원 십원)
//		각 화폐 매수 구하고 출력
		
//		1.준비
//			1-1.변수 : 비용 , 각 화폐별
//				배열 : 화폐(각 화폐별 변수를 대체)
//		2.비용 입력
//		3.비용 처리 및 입력
//			3-1.오만원 화폐 구함 그리고 그만큼 가격에서 뺌
//			3-2.각 화폐 변수를 만들어 입력 || 배열을 만들어 입력
//			3-3.순차적으로 십원 단위 까지
//		4.화폐 출력
//			4-1. 각 화폐별 변수 출력 || 배열 출력
		
		Scanner sc = new Scanner(System.in);
		
		
//		1.준비
		int cost = 0 ;
		int M5,M1,T5,T1,H5,H1,fif,ten =0;
		
		
//		2.입력
		System.out.print("금액 입력 : ");
//		처리
		cost = sc.nextInt();
		
//		3.처리 및 입력
		
		M5 = cost / 50000;
		
		cost = cost - (M5*50000);
//		cost = cost%50000;
		
		M1 = cost / 10000;
		cost = cost - (M1*10000);
//		cost = cost%10000;
		
		T5 = cost / 5000;
		cost = cost - (T5*5000);
//		cost = cost%5000;
		
		T1 = cost / 1000;
		cost = cost - (T1*1000);
//		cost = cost%1000;
		
		H5 = cost / 500;
		cost = cost - (H5*500);
//		cost = cost%500;
		
		H1 = cost / 100;
		cost = cost - (H1*100);
//		cost = cost%100;
		
		fif = cost / 50;
		cost = cost - (fif*50);
//		cost = cost%50;
		
		ten = cost / 10;
		cost = cost - (ten*10);
//		cost = cost%10;
		
		
	
//		4.출력
		System.out.print("오만원권 :"+M5+" "+M1+" "+T5+" "+T1+" "+H5+" "+H1+" "+fif+" "+ten);
	}
	
}