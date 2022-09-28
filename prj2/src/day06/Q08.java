package day06;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제8. 수를 입력받아 1부터 입력받은 수까지의 합을 출력하시오
		
		int su = 0;
		int sum = 0;
		
		//입력
		System.out.print("수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in); su = sc.nextInt();
		
		if(su<=0) {
			System.out.print("수를 다시 입력하시오.");
		}else if(su>0) {
			for (int i = 1; i <= su; i++) {
				sum+=i;
			}
			System.out.print(sum);
		}
		
	}

}
