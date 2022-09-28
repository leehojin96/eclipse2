package day06;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4   두 수를 입력받아 덧셈한 결과를 출력하시오 
		Scanner sc = new Scanner(System.in);
		int su1=0;
		int su2=0;
//		int sum = 0;
		
		System.out.print("첫번쨰 수 입력 : "); su1=sc.nextInt();
		System.out.print("두번째 수 입력 : "); su2=sc.nextInt();
//		sum = su1+su2;
		System.out.print("두 수의 합은 : " + (su1+su2));
	}

}
