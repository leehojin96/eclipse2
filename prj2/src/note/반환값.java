package note;

public class 반환값 {
	public static void main(String[] args) {
		
		
		int x = diff(3, 7);
		System.out.print(x);
	}
	
	static int diff(int x ,int y) {
		return abs(x - y);
	}
	
	static int abs(int x) {
		return x>=0 ? x : -x;
	}

	
}

