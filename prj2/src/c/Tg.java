package c;

public class Tg {
	char tgn; // 톨게이트넘버
	int tgc; // 톨게이트 카운트
	
	Tg(){}
	Tg(char tgn){
		this.tgn = tgn;
		this.tgc = 1;
	}
	char get() {
		return tgn;
	}
}
