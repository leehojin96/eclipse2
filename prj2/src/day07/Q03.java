package day07;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 수를 5개 입력받아 거꾸로 출력하시오  (입력과 출력분리)
		//3-1. 넣을때 순차적으로 넣고 출력을 거꾸로 할것인가?
		//3-2. 넣을때 거꾸로 넣고 출력을 순차적으로 할것인가?

		Scanner sc = new Scanner(System.in); 
		
//		3-1.
		int[] box1 = new int[5];
		
		//순차적으로 넣기
		for(int i = 0 ; i < box1.length ; i++) {
			
		System.out.print("수 입력 : ");
		box1[i] = sc.nextInt();
		
		}
	
		//거꾸로 출력
		for(int i = box1.length-1 ; i >= 0 ; i--) {
			System.out.print(box1[i] + " ");
			
		}
		System.out.println(" ");
	
		
		
		//3-2.
		int[] box2 = new int[5];
		
		//거꾸로 넣기
		for(int i = box1.length-1 ; i >= 0 ; i--) {
			System.out.print("수 입력 : ");
			box1[i] = sc.nextInt();
		}
		
		//순차적 출력
		for(int i = 0 ; i < box1.length ; i++) {
			System.out.print(box1[i] + " ");
		}
	
	}

}
