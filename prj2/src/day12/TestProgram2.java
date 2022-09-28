package day12;

import java.util.Scanner;

public class TestProgram2 {

	public static void main(String[] args) {	
		
		Day[] days = new Day[3];
		int index=0;
		Scanner sc = new Scanner(System.in);		
		loop1: while(true) {
			System.out.println("메뉴입력: 1.등록  2.조회 4.종료");
			int menu= sc.nextInt();			
			switch(menu) {
			case 1:				
				System.out.println("일정을 입력하세요");
				String time = sc.next();
				String contents = sc.next();
				
				Day day = new Day( time, contents);
				days[index] = day;
				index++;
				break;				
			case 2:				
				for( int i=0; i< index; i++) {
					 days[i].printInfo();
				}
				break;
			case 4:
				System.out.println("종료함");
				break loop1;			
			default:
				System.out.println("잘못된 입력");
			}
		}
	}

}
