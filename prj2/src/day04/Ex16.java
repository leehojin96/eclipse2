package day04;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch 대상에 따라 여러갈래로 분기됨
		int menu=4;
		switch(menu) {
		case 1:
			System.out.println("등록합니다");
			break;
		case 2:
			System.out.println("조회합니다");
			break;
		case 3:
			System.out.println("변경합니다");
			break;
		case 4:
			System.out.println("삭제합니다");
			break;
		default:
			System.out.println("잘못된 선택입니다");
		}
	}

}
