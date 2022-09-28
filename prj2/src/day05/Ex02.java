package day05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메뉴입력 처리하는 문제 :반복
		int menu;
		// 1.입력 2.수정 3.삭제 4.조회합니다. 5.종료합니다
		/*1.반복1.1 메뉴입력1.2 메뉴에 따른 처리*/
		Scanner sc = new Scanner(System.in);
		//메뉴입력
		loop1 : while(true) {
			System.out.print("메뉴선택: 1.입력 2.수정 3.삭제 4.조회 5.종료");		menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.println("입력합니다");
		break;
		case 2:
			System.out.println("수정합니다");
		break;
		case 3:
			System.out.println("삭제합니다");
		break;
		case 4:
			System.out.println("조회합니다");
		break;
		case 5:
			System.out.println("종료합니다");
			break loop1;
		default:
			System.out.println("잘못된 메뉴입니다");
			}}
		System.out.println("프로그램 종료합니다");}
	}


