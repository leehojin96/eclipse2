package day04;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 3단 출력
		for(int i=1 ; i <= 9 ; i++) {
		System.out.println("3 * " + i +" = " + 3*i);
		}
		
		// 전체 구구단
		for(int z = 1 ; z <= 9 ; z++) {
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(z + " * " + i + " = " + z*i);
		}
		}
	}

}
