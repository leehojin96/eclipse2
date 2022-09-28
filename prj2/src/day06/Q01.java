package day06;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
//1.  수를 입력받아 짝수 홀수를 판단하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		int su=0;
		
		System.out.print("수를 입력하시오 : "); su = sc.nextInt();
		
		if(su == 0) {
			System.out.print("입력 한 수는 0 입니다.");
		}
		else if(su % 2 == 0) {
			System.out.print("입력 한 수 " + su +"는 짝수 입니다.");
		}else if(su % 2 == 1) {
			System.out.print("입력 한 수 " + su + "는 홀수 입니다.");
		}else {
			System.out.print("입력한 수를 확인하세요.");
		}
		
	}

}
