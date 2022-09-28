package prj2;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {		//
		//홍윤성님 매운맛2
		int code, t;
		String name;
		
		int pay;  //출력
		Scanner sc = new Scanner(System.in);		
		code= sc.nextInt();
		t = sc.nextInt();
		name = sc.next();
		
		if( code ==1 ) {
			pay= t* 2000;
		}else if( code  ==2) {
			pay = t *2500;
		}else if( code ==3 ) {
			pay = t*3000;
		}else {
			pay = t*4000;
		}		
		System.out.println("pay" +   pay);	

	}

}
 