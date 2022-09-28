package week02.day3;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		//배열로 관리하는 프로그램  (국어점수) 
		//1.등록  2.조회 ,  3.삭제(-1)  4.변경
		
		int[] kors = new int[10];		
		Scanner sc = new Scanner(System.in);
		int index=0;
		loop1: while(true) {			
			 System.out.print("\n1.등록, 2.조회  3.삭제  4. 변경  5. 종료  메뉴입력>>");			
			 int menu=sc.nextInt();	 			 
			 switch(menu) {
				 case 1:
					System.out.println("등록");
					System.out.println("수입력하세요");
					int tmp= sc.nextInt();
					kors[index]= tmp;    // kors[index++]=tmp
					index++;
					break;
				 case 2:
					System.out.println("조회합니다");					
					for(int i=0; i< index; i++) {
						System.out.print( kors[i] +"\t");
					}
				 
					break;
				 case  3:
					 System.out.println( "삭제합니다");
					 break;
				 case  4:
					 System.out.println("변경합니다");
					 System.out.println("점수는 다음과 같습니다");
					 for(int i=0; i< index; i++) {
							System.out.print( kors[i] +"\t");
					 }
					 System.out.println("변경할 점수의 순번을 입력하세요 !");
					 int update= sc.nextInt(); // 1   2   3
					 System.out.println("변경할 점수를 입력하세요");
					 int newKor = sc.nextInt();
					 kors[update-1]= newKor;
					 System.out.println("변경이 완료되었습니다");
					 
					 break;
				 case 5:
					 System.out.println("종료합니다");
					 break loop1;			 
			 }			
		}
				
		
		

	}

}
