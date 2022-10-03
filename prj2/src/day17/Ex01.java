package day17;
public class Ex01 {

	public static void main(String[] args) {
	 
		
		Customer[] arr = new Customer[3];
		
		arr[0]= new Customer(28,"이사람");
		arr[1]= new Customer(25,"김사람");
		arr[2]= new Customer(23,"박사람");		

		//정렬  직접 
		/*
		for( int i =0 ; i< arr.length-1 ; i++) {
			for( int j=i+1 ; j<arr.length ; j++) {
				//if(  arr[i].age > arr[j].age) {
				if( arr[i].name.compareTo(arr[j].name) >0) {  // 내가크면 양수, 음수 					
					Customer tmp;
					tmp= arr[i];
					arr[i] = arr[j];
					arr[j]= tmp;
				}
			}
		}
		
		*/			
//		MyArrays.sort(arr);
		for( Customer c : arr) {
			System.out.println( c); 
			//System.out.println( c.toString());
		}
		MyComparatorImp m = new MyComparatorImp();
		MyArrays.sort( arr, m );		
		for( Customer c : arr) {
			System.out.println( c); 
			//System.out.println( c.toString());
		}
		
		
		//MyArrays.sort( arr,  new MyComparator() {}  ); 
		//MyComparator() {}  => 익명으로 클래스를 정의하는 부분 ,익명클래스
		// 상속받아서 자손클래스를 정의 할 때만 가능 
		// new 객체 생성   => 익명클래스를 이용해서 객체를 생성 , 익명객체
		MyArrays.sort( arr,  new MyComparator() {
			@Override
			public int compare(Object o1, Object o2) {
				 Customer   c1 = (Customer)o1;
				 Customer   c2 = ( Customer)o2;
				return c1.name.compareTo(c2.name) ;
			}} 
		); 
		
		
		MyArrays.sort(arr, new MyComparator() {

			@Override
			public int compare(Object o1, Object o2) {
				 Customer   c1 = (Customer)o1;
				 Customer   c2 = ( Customer)o2;
				return c1.age - c2.age;
			}});
		
		 
		
		for( Customer c : arr) {
			System.out.println( c); 
			//System.out.println( c.toString());
		}
		
		
		
		
	}

}
