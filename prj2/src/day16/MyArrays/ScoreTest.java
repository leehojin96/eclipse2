package day16.MyArrays;



public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score2[] arr = new Score2[3];
		arr[0] = new Score2("이길동",90,100);
		arr[1] = new Score2("김길동",70,99);
		arr[2] = new Score2("박길동",80,89);
		
		MyArrays.sort(arr);
		
		for(int i = 0 ; i <arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
