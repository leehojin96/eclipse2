package day12;
import java.util.Scanner;

public class DayManagement {
	
	Day[] days;
	int index ;
	Scanner sc = new Scanner(System.in);
	
	public DayManagement() {
		days = new Day[10];
		index=0;
	}
	
	public DayManagement(int max) {
		days= new Day[max];
		index=0;
	}
	
	//일정등록하기
	public void register() {	
		System.out.println("등록합니다");
		System.out.println("시간 일정 입력하세요");
		String time = sc.next();
		String contents = sc.next();
		//Day day = new Day(time, contents );
		//days[index]= day;
		days[index] = new Day( time, contents);
		index++;		
	}
	//일정변경하기
	public void update() {
		//전체보여주기
		printInfoAll();
		
		System.out.println("변경하고 싶은 일정을 선택:");
		int select = sc.nextInt();		
		System.out.println("변경할 시간 ,일정을 입력하세요");
		String time = sc.next();
		String contents =sc.next();
		days[select-1].setTime(time);
		days[select-1].setContents(contents);
	}	
	
	//일정조회하기 , 전체	
	public void printInfoAll() {
		System.out.println("조회"); //등록된 일정만 조회합니다
		for( int  i=0 ; i<index; i++) {
			 System.out.print( (i+1) + ":" ); 
			 days[i].printInfo();
		}
		
	}
	
	// 일정관리 프로그램의 시작 , 메뉴 1.등록 2.조회, 3.종료
	public void run() {
		System.out.println("<<일정관리프로그램 1.0 >>");
		
		loop1: while(true) {
			System.out.println("메뉴선택 1.등록, 2.조회 3.변경 4. 종료");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				 register();
				break;
			case 2:
				printInfoAll();
				break;
			case 3:
				update();
				break;
			case 4:
				System.out.println("종료");
				break loop1;
			default:
				System.out.println("잘못된 메뉴");
			}
			
		}
		
	}
	
}
