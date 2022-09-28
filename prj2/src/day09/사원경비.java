package day09;

import java.util.Scanner;

public class 사원경비 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		int money = 0;
		
		int [] unit = {50000,10000,5000,1000};
		
		String[] name = new String[5];
		int cost [] []  = new int [4][5];
		
		//5번 사원명 , 출장비 입력 반복
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print("사원명 : "); name[i] = sc.next();
			System.out.print("출장비 : "); money = sc.nextInt();
			
			//처리
			for(int z = 0 ; z < 4 ; z++){
				cost[z][i] = money / unit[z];
				money %= unit[z];
			}
			
		}
		
		//출력
		//5명 출력
		for(int n = 0 ; n < 5 ; n++) {
			System.out.println("사원명 : " + name[n]);
			//화폐 출력
			for(int i = 0 ; i < 4 ; i++) {

				System.out.print(unit[i]+"원권:" + cost[i][n] + "장  ");
			}
			System.out.println("");
			System.out.println("");
		}
		
		
		
	}

}
