package day05;

import java.util.Scanner;

public class Ex11{

	public static void main(String[] args) {
				//국어, 영어, 수학  점수를 입력 받아 개인 평균  , 과목별 평균  출력 
				// 100 90   80  => 90 
				//  90 100  80  => 90
				//  80  90 100  => 90
				
				// 국어평균  90 
				// 영어평균  93.33
				// 수학평균  86.6
				/*
				 * 입력, 처리, 출력을 분리해서 문제를 해결하는 방법 (배열사용)
				  
				  자료명세 (문제분석하면서 변수찾기)
				    입력 : 국어성적배열  kors(5) , 영어성적배열  engs(5) ,  수학성적배열  maths(5)  
				    출력 : 개인평균 person_avgs(5)  kor_avg, eng_avg, math_avg;
				    처리 : 반복제어변수 :i  , 	person_tots(5) , kot_tot , eng_tot, math_tot			         
				         MAX=5;
			    
				  처리과정
				  1.반복  // 입력
				     1.1 개인성적입력 
				  2.반복  // 처리
				     1.1 개인총점구하기 
				     1.2 개인평균구하기
				     1.3 각 과목별 총점 누적하기				     
				  3. 과목별 평균구하기				  
				  4. 반복
				     4.1 개인의 평균출력하기
				  5. 과목별 평균출력하기
				  6. 종료
				   
				  
				   처리과정
				   1. 개인성적에 각 점수배열에 입력
				   2. 반복
				      2.1 개인의 총점구하기
				      2.2 개인의 평균구하기
				      2.3 각 과목별 총점 누적하기 
				   3. 각 과목별 평균구하기
				   4. 개인성적과 평균을 출력하기
				   5. 각 과목별 평균출력하기
				   6. 종료  
				   
				   
				 */	
		
			//입력자료
			int[] kors = new int[5];
			int[] engs= new int[5];
			int[] maths= new int[5];
			
			//출력자료
			double[] persons_avg = new double[5];
			double  kor_avg, eng_avg, math_avg;
			
			//처리자료
			int[] persons_tot  =  new int[5];
			int kor_tot=0 , eng_tot=0 , math_tot=0; 
			
			
			Scanner sc = new Scanner(System.in);
			//입력
			for(int i=0 ;i< 5; i++) {
				System.out.print(" 국어 영어 수학점수 입력");
				kors[i]=sc.nextInt();
				engs[i]= sc.nextInt();
				maths[i]=sc.nextInt();
			}				
			//처리
			for( int i=0; i<5 ; i++) {
				persons_tot[i] = kors[i] + engs[i] +maths[i];   // kors[0]+  engs[0]+  maths[0]\
				persons_avg[i]  = persons_tot[i] / 3.0 ;  // 개인평균 : 개인총점/과목수				
				//각 과목별 총점 누적하기
				kor_tot += kors[i];
				eng_tot = eng_tot + engs[i];
				math_tot = math_tot + maths[i]; 
			}			
			//과목별 평균 구하기
			kor_avg = kor_tot/ 5.0;  //국어총점 / 학생수 
			eng_avg = eng_tot  /5.0;
			math_avg = math_tot /5.0;			
			//출력
			for(int i=0; i< 5; i++) {
				System.out.println( "개인평균"+ i+1 + " :" +persons_avg[i]);
			}
			System.out.println( "국어과목평균=" + kor_avg);
			System.out.println( "영어과목평균=" + eng_avg);
			System.out.println( "수학과목평균=" + math_avg);
			
			
			
		

	}

}
