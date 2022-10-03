package day18;

import java.util.ArrayList;
import java.util.Collections;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Score> list = new ArrayList<>();
		
		list.add(new Score("lee",90,90));
		list.add(new Score("kee",90,800));
		list.add(new Score("woo",100,90));
		
		
		Collections.sort(list);
		
//		System.out.println(list.get(0).toString()); toString()생략가능
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		//파일 저장
	}

}
