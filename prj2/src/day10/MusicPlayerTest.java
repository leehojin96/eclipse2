package day10;

public class MusicPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MusicPlayer player = new MusicPlayer();
		
		String music = player.랜덤재생하기();
		System.out.println(music);
		
		player.다음곡으로가기();
		music = player.재생하기();
		
		System.out.println(music);
		
		player.printMusicList();
	}

}


