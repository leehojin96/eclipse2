package day06;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2.  국어점수와 영어점수를 입력받아 두 과목다 90이상이면 장학금 이라는 메시지를 출력합니다. 
		
		Scanner sc = new Scanner(System.in);
		int kor=0;
		int eng=0;
		
		System.out.print("국어 점수 입력 : "); kor = sc.nextInt();
		System.out.print("영어 점수 입력 : "); eng = sc.nextInt();
		
		if(kor >= 90 && eng >=90) {
			System.out.print("장학금 대상자 입니다.");
		}else{
			System.out.print("장학금 대상자가 아닙니다.");
		}
		
	}

}
