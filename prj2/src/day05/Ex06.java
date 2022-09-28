package day05;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어성적 5개 입력받아 출력하기
				// 입력과 출력을 분리하기 ( 기억 처리가 불일치 할때 배열이 필요해짐 )
				int[] kors = new
				int[5];
				Scanner sc = new Scanner(System.in);
				
				// 국어점수 5개입력
				for (int i = 0; i < kors.length; i++) {
					System.out.print("국어점수입력");
					kors[i] = sc.nextInt();
				}
				
				// 국어점수 5개 출력
				for (int i = 0; i < kors.length; i++) {
					System.out.print(kors[i] + "");
				}
	}

}
