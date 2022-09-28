package day07;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final int MAX =3;
		int[] kor = new int[MAX];// 국어,영어,수학 점수를 입력 받아서 개인총점, 과목별 평균
		int[] eng = new int[MAX];
		int[] math = new int[MAX];
		
		int kor_tot=0;
		int eng_tot=0;
		int math_tot=0;
		
		// 0	1	2		// 첫번째학생 : 80,90,100 (각 배열의 0번째 index)
		// 80	70	90		// 두번째학생 : 70,100,99 (각 배열의 1번째 index)
		// 90	100	80		// 세번째학생 : 90,80,80	(각 배열의 2번째 index)
		// 100	99	80
		
		Scanner sc =new Scanner(System.in);
		
		for(int i = 0 ; i <MAX ; i++) {
			System.out.print("국어 영어 수학");
			kor[i]=sc.nextInt;
			eng[i]=sc.nextInt;
			math[i]=sc.nextInt;
		}
	}

}
