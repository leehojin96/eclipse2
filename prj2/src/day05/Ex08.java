package day05;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력자료
		int[] kors = new int[5];
		int[] engs = new int[5];
		int[] maths = new int[5];

		// 출력자료
		double[] persons_avg = new double[5];
		double kor_avg, eng_avg, math_avg;

		// 처리자료
		int[] persons_tot = new int[5];
		int kor_tot = 0, eng_tot = 0, math_tot = 0;

		Scanner sc = new Scanner(System.in);
		// 입력
		for (int i = 0; i < 5; i++) {
			System.out.print(" 국어 영어 수학점수 입력");
			kors[i] = sc.nextInt();
			engs[i] = sc.nextInt();
			maths[i] = sc.nextInt();
		}
		// 처리
		for (int i = 0; i < 5; i++) {
			persons_tot[i] = kors[i] + engs[i] + maths[i]; // kors[0]+ engs[0]+ maths[0]\
			persons_avg[i] = persons_tot[i] / 3.0; // 개인평균 : 개인총점/과목수
			// 각 과목별 총점 누적하기
			kor_tot += kors[i];
			eng_tot = eng_tot + engs[i];
			math_tot = math_tot + maths[i];
		}
		// 과목별 평균 구하기
		kor_avg = kor_tot / 5.0; // 국어총점 / 학생수
		eng_avg = eng_tot / 5.0;
		math_avg = math_tot / 5.0;
		// 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("개인평균" + i + 1 + " :" + persons_avg[i]);
		}
		System.out.println("국어과목평균=" + kor_avg);
		System.out.println("영어과목평균=" + eng_avg);
		System.out.println("수학과목평균=" + math_avg);

	}

}
