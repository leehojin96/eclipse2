package day06;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3   점수를 입력 받아  학점을 구하시오(  90이상 A 80이상 B   70이상 C  나머지 F)
		Scanner sc = new Scanner(System.in);
		int su=0;
		char grade =0;
		
		System.out.print("점수 입력 : ");
		su = sc.nextInt();
		
		if(su>=90) {
			grade = 'A';
		}else if(su>=80){
			grade = 'B';
		}else if(su>=70){
			grade = 'C';
		}else {
			grade = 'F';
		}
		
		System.out.print(grade);
	}

}
