package com.acron.Lhj;

public class LhjCalculator {

//	1. 패키지를 새로만든기 (  com.acorn.wjy)
//	  WjyCalculator 작성하기 ( 4가지 기능)
//
//
//	2. 라이브러 만들기
//	프로젝트 -> 우클릭 ->  export -> java -> jar 
//	해당클래스 선택 
//	->저장할 위치 선택  -> 마침    (WjyUtils.jar)

	public int add (int su1 , int su2) {
		return su1+su2;
	}
	
	public int sub( int su1 , int su2) {
		return su1 - su2;
	}
	
	public int mul( int su1 , int su2) {
		return su1*su2;
	}
	public int div( int su1 , int su2) {
		return su1/su2;
	}
}
