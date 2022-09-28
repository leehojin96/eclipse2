package day04;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';   //  'a'  => 숫자  (코드표) :유니코드 
		char ch_='한';
		System.out.println( ch);
		System.out.println( (int)ch);
		System.out.println( ch_);
		System.out.println( (int)ch_);		
				
		char ch1='h';
		char ch2='e';
		char ch3='l';
		char ch4='l';
		char ch5='o';				
		System.out.print( ch1);
		System.out.print( ch2);
		System.out.print( ch3);
		System.out.print( ch4);
		System.out.print( ch5);	
		
		System.out.println();
		char[] msg = new char[5];   // 기억장소크기 +연속적  0 1 2 (offset) 사용가능
		msg[0]='h';
		msg[1]='e';
		msg[2]='l';
		msg[3]='l';
		msg[4]='o';		
		for( int i =0 ; i< msg.length ;i++)		{
			System.out.print(msg[i]);
		}
	}

}
