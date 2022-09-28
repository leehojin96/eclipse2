package day09;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5명의 사람의 이름을 입력받아 출력하시오.
		
				String[] names = new String[5];
				
				Scanner sc = new Scanner(System.in);
				
				input(names);
				print(names);
				
	}
	public static void input(String[] a) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i<a.length ; i++) {
			
		}
	}
	public static void print(String[] a) {
		System.out.print(a[0]);
	}

}
