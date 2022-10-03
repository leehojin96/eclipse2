package day18;

import java.io.FileInputStream;

public class Ex02 {
	public static void main(String[] args) {
		try {
			// FileInputStream : byte 단위
			FileInputStream fis = new FileInputStream("a.txt");
			int input;

			input = fis.read();
			System.out.println((char) input);
//		catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

			while ((input = fis.read()) != -1) {
				System.out.print((char) input);

			}
		}

		// Exception 으로 여러개를 퉁가능
		catch (Exception e) {

		}

	}
}
