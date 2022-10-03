package day17.io;

import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) {
		int input;
		
		try {
			while( (input = System.in.read()) != '\n' ) {
				System.out.println((char)input);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
