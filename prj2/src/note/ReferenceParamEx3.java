package note;

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr);
		

	}
	static void printArr(int arr[]) {
		for(int i : arr)
			System.out.print(i+",");
	}
	
	static void sortArr(int[] arr) { //배열 오름차순으로 정렬 
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j <arr.length-1-i ; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}

}
