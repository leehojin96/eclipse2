package day04;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//  while  반복문, 반복횟수 정해지지 않은 경우,정해진경우		
			 // 입력받은 수가 0이 아닐동안  입력받은 수으 합을 출력하시오
			 int input;
			 int sum=0;
			 Scanner sc = new Scanner(System.in);
			 
			 input = sc.nextInt();
			 while( input != 0) {    //0이 아닐동안 반복 , 무한loop 조심해 주세요 !
				 sum = sum+ input ;   // sum+=input;
				 input = sc.nextInt();
			 }		
			 System.out.println( sum );

	}

}
