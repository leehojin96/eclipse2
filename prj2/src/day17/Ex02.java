package day17;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		 
		String[] strs = {"spring", "summer","fall" ,"winter"} ;		
		 
		for( int i=0; i<strs.length ; i++) {
			for( int j= i+1 ;  j< strs.length ;j++) {
				if(  strs[i].compareTo(strs[j])  >0 ) {					
					String tmp;
					tmp  = strs[i] ;
					strs[i] = strs[j];
					strs[j] = tmp;
				}
			}
		}		
		 
		//반복문 안해도 toString은 각 요소에 적용함
		System.out.println( Arrays.toString(strs));
		
		
		 
		
		 
	}
}
