package day06;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제9. 10개의 수를 입력 받아 짝수의 개수를 출력하시오
		
		int su =0;
		int even=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print("수를 입력하세요: "); su = sc.nextInt();
			
			if(su%2==0 && su!=0) {
				even++;
			}
		}
		System.out.print(even);
	}

}
