package day18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("output2.txt");

			fos.write(100);
			fos.write(98);
			fos.write('d');

			// fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-geneated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
