package day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fis = new FileReader("b.txt");
			
			int input;
			while((input = fis.read())!= -1 ) {
				System.out.print((char)input);
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}

}
