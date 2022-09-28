package day08;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		
		String season = "";

		Scanner sc = new Scanner(System.in);

		System.out.print("생월 입력 : ");
		int month = sc.nextInt();
		
		System.out.print(month+ "월 ");
		
		
		season = season(month);
		System.out.print("계절 : " + season);
		
	}

	public static String season(int month) {

		switch (month) {
		case 12:
		case 1:
		case 2:
			return "겨울";
		case 3:
		case 4:
		case 5:
			return "봄";
		case 6:
		case 7:
		case 8:
			return "여름";
		case 9:
		case 10:
		case 11:
			return "가을";
		default:
			return "잘못 입력되었습니다";
		}

	}
}
