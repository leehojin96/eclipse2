package note;

public class 객체배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv tv1, tv2, tv3;
		tv1 = new Tv();
		tv2 = new Tv();
		tv3 = new Tv();
		
		Tv[] tvArr1 = new Tv[3]; //길이가 3인 객체 배열 tvArr을 아래와 같이 생성하면
								//각 요소는 참조변수의 기본값인 null로 자동 초기화 된다.
		
		//객체를 생성해서 배열의 각 요소에 저장
		tvArr1[0] = new Tv();
		tvArr1[1] = new Tv();
		tvArr1[2] = new Tv();
		
		
		//한줄로
		Tv[] tvarr2 = {new Tv(), new Tv(), new Tv()};
		
		//반복문
		Tv[] tvArr3 = new Tv[100];
		for(int i = 0 ; i < tvArr3.length ; i++) {
			tvArr3[i] = new Tv();
		}
		
	}

}

class Tv {
	
}
