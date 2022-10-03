package day17.ExceptionEx;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		
		
		try {
			
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		}catch(ArrayIndexOutOfBoundsException e) {
			//예외 발생시 수행 되어야 하는 코드를 작성하는 것
			System.out.println("배열의 범위를 벗어남");
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("정상종료");
		
	}

}
