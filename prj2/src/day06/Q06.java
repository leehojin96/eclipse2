package day06;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
//		6.  0을 입력받을때 까지 계속 입력한 수를 누적하시오. 0이면 누적한 값을 출력하고 종료합니다.
		
		Scanner sc = new Scanner(System.in);
		int su=1;
		int sum = 0;
		
		
		while(su != 0) {
			System.out.print("수 입력 : "); su=sc.nextInt();
			sum += su;
		}
		System.out.println(sum);
		}
		
		
	}

