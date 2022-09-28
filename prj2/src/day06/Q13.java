package day06;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		
//		13번.  10개의 수를 입력 받아 짝수만 배열에 저장한 다음 한꺼번에 출력하시오( 배열은 넉넉히 10개로 준비합니다)
		
		int[] even = new int[10];
		int su=0;
		int index = 0;
		
		Scanner sc = new Scanner(System.in);		
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print("수를 입력하시오 : ");
			su = sc.nextInt();
			if(su % 2 ==0) {
				even[index] = su;
				index++;
			}
			
		}
		
		
		
		
		for(int i = 0 ; i < index ; i++) {
			System.out.print(" "+even[i]+" ");
		}
		
		
		
	}

}
