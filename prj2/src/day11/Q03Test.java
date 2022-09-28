package day11;

import java.util.Scanner;

public class Q03Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		Q03[] Q03 = new Q03[10];

		for (int i = 0; i < Q03.length; i++) {
			Q03[i] = new Q03();
		}

		int i = 0;

		while (true) {

			System.out.print("일정 작업 선택 (등록/조회/종료) : ");
			String YN = s.next();
			
				

			if (YN.equals("등록")) {
				if(i<10) {
				Q03[i].setTime();
				Q03[i].setWork();
				i++;
				}else {
					System.out.println("일정이 꽉찼습니다.");
				}
			} else if (YN.equals("조회")) {
				for (int i1 = 0; i1 < i; i1++) {
					Q03[i1].output();
				}
			} else if (YN.equals("종료")) {
				break;
			}else {
				System.out.println("잘못 입력 했습니다.");
			}
			
//		테스트
//		Q03[0].input(12, "병원");
//		Q03[0].output();
		}

	}
}
