package day07;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 사용자가 원하는 개수의 배열을 만들게 하고 그 배열의 개수만큼 값을 입력하고 출력하시오 (입력과 출력 분리) 
		
		Scanner sc = new Scanner(System.in);
		
		//배열 개수 입력
		System.out.print("배열 생성 수 입력 : ");
		int index = sc.nextInt();
		
		//배열 생성
		String[] box1 = new String[index];
		
		//입력
		for(int i = 0 ; i < index ; i++) {
			System.out.print("입력 : ");
			box1[i] = sc.next();
		}
		
		//출력
		for(int i = 0 ; i < index ; i++) {
			System.out.print(box1[i] + " ");
		}
		
	}

}
