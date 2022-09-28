package day07;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. 수를 5개  입력받아 가장 큰값을 출력하시오 

		Scanner sc = new Scanner(System.in);
		int su = 0;
		int result = 0;

		for (int i = 0; i < 5; i++) {

			System.out.print("수 입력 : ");
			su = sc.nextInt();
			
			if(result < su) {
				result = su;
			}
			
//			if (su < sc.nextInt()) {
//				su = sc.nextInt();
//			}
		}
		System.out.print(result);
	}

}
