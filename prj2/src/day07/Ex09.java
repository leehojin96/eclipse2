package day07;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] arr2 = new int [3][];
		arr2[0] = new int[3];
		arr2[1] = new int[2];
		arr2[2] = new int[4];
		
		int cnt=0;
		
		for(int i = 0 ; i < arr2.length ; i++) {
			for(int j = 0 ; j < arr2[i].length ; j++) {
				arr2[i][j] = ++cnt;
				
			}
		}
		
		
		for(int i = 0 ; i < arr2.length ; i++) {
			for(int j = 0 ; j < arr2[i].length ; j++) {
				System.out.print(arr2[i][j]+ " ");
				
			}
			System.out.println(" ");
		}
		
	}

}
