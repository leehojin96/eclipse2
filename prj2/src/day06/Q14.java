package day06;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			
			
				for(int i = 1 ; i < 8 ; i += 2) { // 1 3 5 7
					
					for(int z = i ; z < 6 ; z += 2) { // 3 2 1 0
						System.out.print(" ");
					}
					for(int z = 0 ; z < i ; z++ ) { // 1 3 5 7
						System.out.print("*");
					}
					System.out.println("");
				}
			
			
			
				for(int i = 5 ; i > 0 ; i -= 2) {  // 5 3 1
					for(int z = i ; z < 6 ; z += 2) { // 1 3 5
						System.out.print(" ");
					}
					for(int z = 0 ; z < i ; z++) { // 5 3 1
						System.out.print("*");
					}
					System.out.println("");
				}
			
		}
	}


