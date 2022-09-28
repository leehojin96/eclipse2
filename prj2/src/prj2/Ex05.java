package prj2;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 
		 * 함희원님 
		 * 매운맛 2번 문제
			
			■자료명세표
			1.출력자료 money 임금
			2.입력자료 code:입력코드
				 name:사원 이름
				 time:작업시간
			3.처리 자료 pay:시간당 임금
			
			■처리과정
			1.입력받은 code의 값 판단
			1.1 code 값에 따라 pay 값 입력
			2. 입력받은 pay와 time으로 money 값 출력
			3.종료
		 */		
		 int money;
		 int code,time;
		 String name;		 
		 int pay=0;		 
		 Scanner sc = new Scanner( System.in);		 
		 name = sc.next();
		 code = sc.nextInt();
		 time = sc.nextInt();
		 
		 if( code ==1 ) {
			 pay=2000;
		 }else if( code  ==2) {
			 pay =2500;
		 }else if( code  ==3) {
			 pay=3000;
		 }else if( code ==4 ) {
			 pay=4000;
		 }		 
		 money = pay* time;
		 System.out.println (  name + "  " + money);	 
		 
	}

}
