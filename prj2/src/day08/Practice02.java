package day08;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String day = "";
		
		System.out.print("요일 입력 : ");
		day = sc.next();

		String[][] week_sche = week_sche(day);

		//출력문
		for (int i = 0; i < 7; i++) {
			for (int z = 0; z < 7; z++) {
				System.out.print(week_sche[z][i] + "		");
			}
			System.out.println(" ");
		}

	}

	public static String[][] week_sche(String day) {

		Scanner sc = new Scanner(System.in);

		int day_index = 0;
		int work_index = 0;
		String[][] week_sche = new String[7][7];

		if (day.equals("월")) {
			day_index = 0;
		} else if (day.equals("화")) {
			day_index = 1;
		} else if (day.equals("수")) {
			day_index = 2;
		} else if (day.equals("목")) {
			day_index = 3;
		} else if (day.equals("금")) {
			day_index = 4;
		} else if (day.equals("토")) {
			day_index = 5;
		} else if (day.equals("일")) {
			day_index = 6;
		}

		System.out.println(day + "요일 선택");
		System.out.println(" ");

		while (true) {

			System.out.print("추가할 일정 (일정, 이전) : ");
			String sche = sc.next();

			if (sche.equals("이전")) {
				System.out.println("요일 선택으로 돌아갑니다.");
				System.out.println(" ");
				return week_sche;
			} else {
				week_sche[day_index][work_index] = sche;
				work_index++;
				System.out.println("일정 입력 완료. ");

			}
		}
	}

}
