package day07;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 일주일의 일정을 등록할 수 있는 배열을 만들고 조회될 수 있도록 작성하시오

		Scanner sc = new Scanner(System.in);
		int[] week_num = { 1, 2, 3, 4, 5, 6, 7 };
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
					// 요일 보여주기
					for (int i = 0; i < 7; i++) {
						System.out.print(week_days[i] + "	");
					}

					System.out.println(" ");
					System.out.println(" ");
					// 요일 선택
					System.out.print("일정 추가할 요일 (요일, 이전): ");
					String select_day = sc.next();
					System.out.println(" ");

					// 월
					if (select_day.equals("월")) {
						System.out.println("월요일 선택");
						System.out.println(" ");

						int day_index = 0;
						int work_index = 0;
						while (true) {

							System.out.print("추가할 일정 (일정, 이전): ");
							String sche = sc.next();

							if (sche.equals("이전")) {
								System.out.println("요일 선택으로 돌아갑니다.");
								System.out.println(" ");
								break;
							} else {
								week_sche[day_index][work_index] = sche;
								work_index++;
								System.out.println("일정 입력 완료. ");
							}
						}

					}
					// 화
					else if (select_day.equals("화")) {
						System.out.println("화요일 선택");
						System.out.println(" ");

						int day_index = 1;
						int work_index = 0;
						while (true) {

							System.out.print("추가할 일정 (일정, 이전): ");
							String sche = sc.next();

							if (sche.equals("이전")) {
								System.out.println("요일 선택으로 돌아갑니다.");
								System.out.println(" ");
								break;
							} else {
								week_sche[day_index][work_index] = sche;
								work_index++;
								System.out.println("일정 입력 완료. ");
							}
						}
					} 
					//수
					else if (select_day.equals("수")) {
						System.out.println("수요일 선택");
						System.out.println(" ");

						int day_index = 2;
						int work_index = 0;
						while (true) {

							System.out.print("추가할 일정 (일정, 이전): ");
							String sche = sc.next();

							if (sche.equals("이전")) {
								System.out.println("요일 선택으로 돌아갑니다.");
								System.out.println(" ");
								break;
							} else {
								week_sche[day_index][work_index] = sche;
								work_index++;
								System.out.println("일정 입력 완료. ");
							}
						}
					}
					//목
					else if (select_day.equals("목")) {
						System.out.println("목요일 선택");
						System.out.println(" ");

						int day_index = 3;
						int work_index = 0;
						while (true) {

							System.out.print("추가할 일정 (일정, 이전): ");
							String sche = sc.next();

							if (sche.equals("이전")) {
								System.out.println("요일 선택으로 돌아갑니다.");
								System.out.println(" ");
								break;
							} else {
								week_sche[day_index][work_index] = sche;
								work_index++;
								System.out.println("일정 입력 완료. ");
							}
						}
					} 
					//금
					else if (select_day.equals("금")) {
						System.out.println("금요일 선택");
						System.out.println(" ");

						int day_index = 4;
						int work_index = 0;
						while (true) {

							System.out.print("추가할 일정 (일정, 이전): ");
							String sche = sc.next();

							if (sche.equals("이전")) {
								System.out.println("요일 선택으로 돌아갑니다.");
								System.out.println(" ");
								break;
							} else {
								week_sche[day_index][work_index] = sche;
								work_index++;
								System.out.println("일정 입력 완료. ");
							}
						}
					} 
					//토
					else if (select_day.equals("토")) {
						System.out.println("토요일 선택");
						System.out.println(" ");

						int day_index = 5;
						int work_index = 0;
						while (true) {

							System.out.print("추가할 일정 (일정, 이전): ");
							String sche = sc.next();

							if (sche.equals("이전")) {
								System.out.println("요일 선택으로 돌아갑니다.");
								System.out.println(" ");
								break;
							} else {
								week_sche[day_index][work_index] = sche;
								work_index++;
								System.out.println("일정 입력 완료. ");
							}
						}
					} 
					//일
					else if (select_day.equals("일")) {
						System.out.println("일요일 선택");
						System.out.println(" ");

						int day_index = 6;
						int work_index = 0;
						while (true) {

							System.out.print("추가할 일정 (일정, 이전): ");
							String sche = sc.next();

							if (sche.equals("이전")) {
								System.out.println("요일 선택으로 돌아갑니다.");
								System.out.println(" ");
								break;
							} else {
								week_sche[day_index][work_index] = sche;
								work_index++;
								System.out.println("일정 입력 완료. ");
							}
						}
					} else if (select_day.equals("이전")) {
						System.out.println("작업 선택으로 돌아갑니다.");
						System.out.println(" ");
						break;
					} else {
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

}
