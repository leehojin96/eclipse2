package day06;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제11. 원하는 단을 입력받아 출력하기
		int su;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요 : "); su = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			
			System.out.println(su + " x " + i + " = " + ( su * i ));
			
		}
	}

}
