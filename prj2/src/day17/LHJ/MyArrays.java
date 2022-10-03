package day17.LHJ;

public class MyArrays {

	public static void sort(Object[] arr) {
		for(int i = 0 ; i < arr.length -1 ; i++) {
			for(int j = i; j<arr.length ; j++) {
				if(((MyComparable)arr[i]).a(arr[j])>0) {
					Object tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
}
