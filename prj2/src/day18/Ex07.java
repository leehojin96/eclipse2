package day18;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Ex07 {

	public static void main(String[] args) {
		ArrayList<Score> list = new ArrayList<>();

		list.add(new Score("lee", 90, 90));
		list.add(new Score("kee", 90, 800));
		list.add(new Score("woo", 100, 90));

		// 파일저장
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("scoreList.txt"));
			Score data = new Score("홍길동", 100, 100);
			oos.writeObject(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//파일 읽어오기
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("scoreList.txt"));
//			Score data = (Score) ois.readObject();
//			System.out.print(data);
			
			//while			
		      try {
				while( true) {
					Score  data= (Score) ois.readObject();
					System.out.println("객체정보 " + data);
				}
		      }catch(EOFException e) {
		    	  System.out.println("다 읽었음");
		      }

			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
