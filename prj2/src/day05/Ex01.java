package day05;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break
		// 1~10합
		//int n=0;int sum=0;while( true ) {n++;
		// ++nsum += n;if( n >= 10) break;
		// 자신이 속한 반복을 빠져나감}System.out.println( sum);
		
		int n = 0;
		int sum = 0 ;
		while(true) {
			n++;
			sum += n;
			if(n>10)break;//자신이 속한 반복을 빠져나감.
		}
		System.out.println(sum);
		
	}

}
