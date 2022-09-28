package day09;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int cnt=0;
		
		cnt = addCount(cnt);
		cnt = addCount(cnt);
		cnt = addCount(cnt);
		
		System.out.println(cnt);
	}
	
	public static int addCount(int a) {
		a++;
		return a;
	}

}
