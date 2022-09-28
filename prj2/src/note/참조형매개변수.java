package note;

public class 참조형매개변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열도 참조변수 통해 주소를 저장하는 원리이기에 예제로 해봄
	
		int[] x = {10};
		System.out.println("main() : x = "+x[0]);
		
		
		change(x);
		System.out.println("change(x)");
		
		System.out.println("main(x) : x = "+x[0]);
	}
	static void change(int[] x) {
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]);
	}
}
