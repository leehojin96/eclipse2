package day09;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5명의 사람의 이름을 입력받아 출력하시오.
		
		String[] names = new String[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < names.length ; i++) {
			names[i] = sc.next();
		}
		
		/*
		   names[0]= sc.next();
		   names[1]= sc.next();
		   names[2]= sc.next();
		   names[3]= sc.next();
		   names[4]= sc.next(); 		 
		 */
		
		//이름배열 출력
		for( int i=0; i< names.length ;i++) {
			System.out.println( names[i]);
		}
		
		/*
		  System.out.println( names[0]);
		  System.out.println( names[1]);
		  System.out.println( names[2]);
		  System.out.println( names[3]);
		  System.out.println( names[4]); 
		 
		 */


	}

}
