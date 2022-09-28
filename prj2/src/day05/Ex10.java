package day05;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// 국어, 영어, 수학 점수를 입력 받아 개인 평균 , 과목별 평균 출력
				// 100 90 80 => 90
				// 90 100 80 => 90
		
				// 80 90 100 => 90
				// 국어평균 90
				// 영어평균 93.33
				// 수학평균 86.6
				/*
				  자료명세 (문제분석하면서 변수찾기)
				  입력 : 국어점수:kor , 영어점수: eng , 수학점수 : math
				  출력 : 개인평균 person_avg, 국어점수평균 kor_avg, 영어점수평균 eng_avg, 수학점수평균 math_avg
				  처리 : 반복제어변수 i , 개인총점peson_tot, 국어점수총점kor_tot, 영어점수총점 eng_tot, 수학점수총점 math_tot처리과정
				  
				1.반복
					1.1 개인성적입력
					1.2 개인평균 구하기
					1.3 개인평균 출력하기
					1.4과목별 총점 누적하기
				2. 과목별 평균 구하기
				3. 과목별 평균 출력하기
				4. 종료
				*/
		
		
		
		int kor, eng, math;
		double  person_avg , kor_avg , eng_avg, math_avg; 
		int person_tot , kor_tot=0, eng_tot=0, math_tot=0;		
		
		Scanner sc = new Scanner(System.in);
		
		final int MAX=3;  
		
		for( int i=1; i<=MAX; i++) {
		    kor = sc.nextInt();
		    eng=sc.nextInt();
		    math = sc.nextInt();		    
		    person_tot = kor+ eng+ math;
		    person_avg = person_tot/ 3.0;		    
		    System.out.println("개인평균="+ person_avg);
		    kor_tot += kor;
		    eng_tot +=  eng;
		    math_tot += math; 			
		}
		
		kor_avg = (double)kor_tot/MAX;
		eng_avg = eng_tot/3.0;
		math_avg = math_tot  /3.0;				
		System.out.println( kor_avg);
		System.out.println( eng_avg);
		System.out.println( math_avg);

	}

}
