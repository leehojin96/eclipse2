package day17;


// 배열관 관련된 기능을 제공하는 클래스
public class MyArrays {

	
	//   sort
	public static void sort(Object[] arr) {
		
		//선택정렬
		for( int i=0;  i< arr.length-1 ; i++) {
			for( int j=i+1 ; j< arr.length ; j++ ) {		
				  
				if( ((MyComparable)arr[i]).compareTo(arr[j]) >0   ) {  //양수, 음수 
					//i번째 요소와  j번째 요소 교환 , 임시변수 한 개가 필요함 
					Object tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		
	}	
	
	
	//   sort
	public static void sort(Object[] arr ,  MyComparator  c) {
		
		for( int i=0; i< arr.length -1 ; i++ ) {
			for( int j=i+1   ; j< arr.length ; j++) {
				if(  c.compare(arr[i], arr[j]) >0 ) {
					
					Object tmp;
					tmp= arr[i];
					arr[i] =arr[j];
					arr[j] =tmp;
				}
			}
		}
	}
	
}
