package day14_2;

import java.util.ArrayList;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList list = new ArrayList();
		//배열을 가지고 있음 
		
		list.add(new Score("홍길동",100,90));
		list.add( new Score("가길동" , 90,90));
		list.add( new Score("나길동", 80,80));
		
		
		for( int i = 0 ; i< list.size() ;i++) {
			 System.out.println(list.get(i));
			//System.out.println(list.get(i).toString());
			// String result  =((Score)list.get(i)).getInfo();
			//.out.println( result);
		}
				
		
				

	}

}
