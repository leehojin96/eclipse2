package day07;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2차원배열 5행5열 // 1 ~ 25 까지 수를 배열에 저장 , 출력 (입력과 출력 분리 작업)
		
		int[][] box1 = new int[5][5];
		
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int z = 0 ; z <5 ; z++) {
				box1[i][z] = (z+1)+(i*5);
			}
		}
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int z = 0 ; z < 5 ; z++)
			{
				System.out.print(box1[i][z]+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		
		// 3차원 배열 : 2차원 배열 3개
		
		//1페이지 1~25 , 2페이지 짝수 25칸 , 3페이지 홀수 25칸
		
		int[][][] box2 = new int[5][5][3];
		
		for(int p = 0 ; p < 3 ; p++) {
			for(int i = 0 ; i<5 ; i++) {
				for(int z = 0 ; z < 5 ; z++) {
					box2[i][z][p] = (z+1)+(i*5)+(p*25);
				}
			}
		}
		
		for(int p = 0 ; p < 3 ; p++) { 
			System.out.println(p+1 +"번 페이지");
			for(int i = 0 ; i<5 ; i++) {
				for(int z = 0 ; z < 5 ; z++) {
					System.out.print(box2[i][z][p] + " ");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		
		
		
		
		
	}

}
