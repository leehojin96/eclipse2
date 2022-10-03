package day17.LHJ;

public class MyArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score[] arr = new Score[3];

		arr[0] = new Score("lee", 87);
		arr[1] = new Score("park", 99);
		arr[2] = new Score("kim", 90);

		MyArrays.sort(arr);

		for (Score c : arr) {
			System.out.println(c);
		}

	}

}
