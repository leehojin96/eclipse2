package day07;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] week_days = { "월", "화", "수", "목", "금", "토", "일" };
		String[][] week_sche = new String[7][7];

// 입력
		while (true) {

			System.out.print("일정 (추가, 조회, 종료) : ");
			String select_work = sc.next();

			System.out.println(" ");

			// 추가
			if (select_work.equals("추가")) {
				// System.out.print("1");

				while (true) {
					

					if (select_day.equals("월") 
						||select_day.equals("화")
						|| select_day.equals("수")
						|| select_day.equals("목")
						|| select_day.equals("금")
						|| select_day.equals("토")
						|| select_day.equals("일"))
					{
						week_sche = week_sche();
					}

					else if (day.equals("이전")) {
						System.out.println("작업 선택으로 돌아갑니다.");
						System.out.println(" ");
					}
					else {
						System.out.println("요일을 잘못 선택하셨습니다.");
						System.out.println(" ");
					}

				}
			} else if (select_work.equals("조회")) {
				// System.out.print("2");

				for (int i = 0; i < 7; i++) {
					System.out.print(week_days[i] + "		");
				}
				System.out.println(" ");

				for (int i = 0; i < 7; i++) {
					for (int z = 0; z < 7; z++) {
						System.out.print(week_sche[z][i] + "		");
					}
					System.out.println(" ");
				}
			} else if (select_work.equals("종료")) {
				break;
			}

		}

	}
	// 요일 보여주기
	public static void week_days() {
		String[] week_days = { "월", "화", "수", "목", "금", "토", "일" };
				for (int i = 0; i < 7; i++) {
					System.out.print(week_days[i] + "	");
				}
		
	}

	public static String[][] week_sche() {

		Scanner sc = new Scanner(System.in);

		int day_index = 0;
		int work_index = 0;
		String[][] week_sche = new String[7][7];
		
		week_days();

		System.out.println(" ");
		System.out.println(" ");
		// 요일 선택
		System.out.print("일정 추가할 요일 (요일, 이전) : ");
		String day = sc.next();
		System.out.println(" ");

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