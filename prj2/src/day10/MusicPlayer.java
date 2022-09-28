package day10;



//속성+ 기능을 정의하는 것  => 클래스 정의
public class MusicPlayer {

	  // 이름, 색깔, 크기	
		String 이름;
		String 색깔;
		int 크기; //
		int 볼륨;
		String[] 음악목록 = { "천일동안"  ,"부디" , "water of march" , "0310" };
		int index;  	
		
	  /* 
	  - on/off
	  - 볼륨조절
	  - 랜덤재생
	  - 이전곡/다음곡
	  */
		
		
	  public  void  on_off( boolean flag ) {
		  if( flag)  System.out.println( "전원켜기");
		  else System.out.println("전환끄기");
	  }
 
	  public void 볼륨증가하기() {
		  볼륨+=2;
		  System.out.println("볼륨을 증가했습니다");
	  }
	  
	  
	  public void 볼륨감소하기() {
		  볼륨-=2;
		  System.out.println("볼륨을 감소했습니다");
	  }
	  
	  public String 랜덤재생하기() {
		  int index = (int)(Math.random() *4 ) ; //   0 ~1보다작은 형태의 실수형태의 난수 
		  this.index  =index;
		  String result  =음악목록[index];
		  return result;
		  
	  }
	  
	  public void 이전곡으로가기() {
		  
		  if( index  > 0  )
		   index--;                         // 0에서 이전은 가장큰 인덱스로 설정
		  else 
		   index  = 음악목록.length-1;
	  }
	  
	  
	  public void 다음곡으로가기() {
		  index++;
	  }
	  
	  public String 재생하기() {
		  String result = 음악목록[index];
		  return result;
	  }
	  
	  public void printInfo() {
		  System.out.println(이름);
		  System.out.println(색깔);
		  System.out.println(크기);
		  
		  
	  }
	  //음악목록
	  public void printMusicList() {
		  System.out.println("=======음악목록입니다=======");
		  for(int i = 0 ; i < 음악목록.length ; i++) {
			  System.out.println(음악목록[i]);
		  }
	  }
	  
	  
}
