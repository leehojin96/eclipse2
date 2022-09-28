package day11;

import java.util.Scanner;

//Day  : 일정정보를 담는 클래스 
//
//일정 시간
//일정 내용
//
//
//10개 일정을 만들어서 관리  
//(일정등록, 일정조회)

//분 시스템 / 변경 시스템 / 

public class Q03 {

	private int time;
	private String work;
	Scanner s = new Scanner(System.in);

	Q03() {

	}
	
	
	
	

//	input 테스트
//	시간입력
//	public void input(int time, String work) {
//		this.time = time;
//		this.work = work;
//	}

	
	
//	 시간 입력
	public void setTime() {
		while (true) {

			System.out.print("일정 시간 (1~24): ");
			this.time = s.nextInt();
			if (0 < time && time < 25) {
				break;
			} else {
				System.out.println("잘못 입력 했습니다.");
			}
		}
//		if(0 < s.nextInt() && s.nextInt() < 25) {
//			this.time = s.nextInt();
//			break;
//		}else {
//			System.out.println("잘못 입력 했습니다.");
//		}
//		
		
	}

	
	
	// 일정 입력
	public void setWork() {
		System.out.print("일정 : ");
		this.work = s.next();

	}

	
	
	// 시간 일정 출력
	public void output() {
		System.out.println("시간 : " + time + "시" + "		일정 : " + work);
	}

}
