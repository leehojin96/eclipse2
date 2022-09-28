package day16;

public class Ex01 {

	public static void main(String[] args) {

		// arr,arr2 참조형 변수

		// int[] arr = {5,8,9,10,3};
		int[] arr = new int[] { 5, 8, 9, 10, 3 };

		// 배열복사
		// 얕은복사, 깊은복사
		int[] arr2 = arr;

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("");
		
		
		
		System.out.println("print(arr)");
		print(arr);
		System.out.println("");
		
		
		
		
		System.out.println("copy(arr)");
		int[] result = copy(arr);
		
		for(int i = 0 ; i < result.length ; i++) {
			System.out.println(result[i]);
		}
		
		
		arr[4]=33;
		
		System.out.println("변경후 print(arr)");
		print(arr);
		System.out.println("");
		
		
		
		System.out.println("변경후 copy(arr)");		
		for(int i = 0 ; i < result.length ; i++) {
			System.out.println(result[i]);
		}
		
	}

	// 배열의 깊은 복사
	private static int[] copy(int[] arr) {

		int[] newarr = new int[arr.length];

		for (int i = 0; i < newarr.length; i++) {
			newarr[i] = arr[i];
		}
		return newarr;

	}

	
	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
