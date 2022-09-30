package day18;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		try {
			result = System.in.read();
			System.out.println((char)result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
