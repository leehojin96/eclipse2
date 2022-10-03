package day17.io;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStreamReader rd = new InputStreamReader(System.in);
		
		try {
			
			while(true) {
				
			int a;
			
			a=rd.read();
			if(a==-1) {
				break;
			}
			System.out.println((char)a);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
