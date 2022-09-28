package day05;


public class Ex04 {

	public static void main(String[] args) {
		

		System.out.println(args[0]);
		//"10" = 숫자로 사용하기 위해서 변환 parseInt
		int sul = Integer.parseInt(args[0]); //"10" 숫자로된 문자열의 형태를 진짜 숫자로 변환해주는
		System.out.println(sul+5);

		
	}

}
