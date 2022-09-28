package day04;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su1 = 10;
		int su2 = 10;
		int result1;
		int result2;
		
		result1 = su1++;
		result2 = ++su2;
		
		System.out.println(su1 + " " +result1);
		System.out.println(su2 + " " +result2);
		
		
		int sum = 0;
		int n = 0;
		
		while(n++ < 10) {
			sum = sum+n;
		}
		System.out.println(sum);
		
		
	}

}
