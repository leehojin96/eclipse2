package day10;

import java.util.Scanner;

public class PrinterSoftwarer {

//-변수
//모델명
//무게 
//잉크 색상
//용지 
//금액
	Scanner s = new Scanner(System.in);

	boolean flag = true;
	String[] name = new String[5];

	int ink = 0;
	int paper = 0;

//-메소드

//-전원
	public void on_off() {

		String flag_String;
		while(true) {
			System.out.print("전원 입력(on / off) : ");
			flag_String = s.next();
			if(flag_String.equals("on")||flag_String.equals("off"))
			break;
		}
		if (flag_String.equals("on")) {
			flag = true;
			System.out.println("전원 on");
			System.out.println(" ");
		} else if (flag_String.equals("off")) {
			flag = false;
			System.out.println("전원 off");
			System.out.println(" ");
		}

//		while (true) {
//			System.out.print("전원 입력(on / off) : ");
//			flag_String = s.next();
//
//			if (flag_String.equals("on")) {
//				flag = true;
//				System.out.println("전원 on");
//				System.out.println(" ");
//				break;
//			} else if (flag_String.equals("off")) {
//				flag = false;
//				System.out.println("전원 off");
//				System.out.println(" ");
//				break;
//			} else {
//				System.out.println("잘못 입력하셨습니다.");
//				System.out.println(" ");
//			}
//
//		}
	}

	public String print_select() {
		String printName;

		System.out.print("작업할 프린터 선택 ( ");
		print_list();
		System.out.print(") : ");
		printName = s.next();
		System.out.println(" ");
		System.out.println(printName + " 선택");
		System.out.println(" ");
		return printName;

	}
	public void print_list() {
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
	}

	public void ink_check() {
		if (ink > 0) {
			System.out.println("잉크 : 약 " + ink / 2 + "장 인쇄 가능");
		} else {
			System.out.println("잉크가 부족합니다.");
		}
	}

	public void paper_check() {
		if (paper > 0) {
			System.out.println("종이 : 약 " + paper + "장 인쇄 가능");
		} else {
			System.out.println("종이가 부족합니다.");
		}
	}

	public String work_select() {
		String workSelect;

		System.out.println(" ");
		System.out.print("작업 선택 (인쇄 / 스캔 / 복사 / 팩스전송 / 충전 / 확인 / 프린터추가 /종료) : ");
		workSelect = s.next();

		return workSelect;
	}

	public void ink_charge() {

		System.out.print("충전할 잉크 ml : ");
		ink += s.nextInt();

	}
	
	public void paper_charge() {

		System.out.print("충전할 종이 장수 : ");
		paper += s.nextInt();

	}
	public String file() {
		
		String file;
		
		System.out.print("파일 입력 : ");
		file = s.next();
		
		return file;
	}
	public int paperQua(String file) {
		System.out.print("'"+file+"'" + "파일 인쇄 장 수 : ");
		int paperQua = s.nextInt();
		return paperQua;
	}

//인쇄
	public void printing(int paperQua, String file) {
		System.out.print("'"+file+"'" + "파일 " + paperQua + "장 인쇄 완료.");
		System.out.println(" ");
		ink -= paperQua*2;
		paper -= paperQua;
	}

//스캔
//복사
//팩스전송
//팩스수신
}