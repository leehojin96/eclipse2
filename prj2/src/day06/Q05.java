package day06;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//5.  두 수를 입력받아 큰값에서 작은값을 뺀 결과를 출력하시오
		Scanner sc = new Scanner(System.in);
		int su1=0;
		int su2=0;
		System.out.print("첫번쨰 수 입력 : "); su1=sc.nextInt();
		System.out.print("두번째 수 입력 : "); su2=sc.nextInt();
		
		if(su1 - su2 > 0) {
			System.out.print(su1 - su2);
		}else {
			System.out.print(su2 - su1);
		}
		
	}

}
