package c_e;

public class Cost {

	Cost(int outPutTime, String carType, char ticNo_tgn, char tgn) {

		int n = Math.abs(ticNo_tgn - tgn);
		int tax = 2500 * (n+1);
		if (carType.equals("경차")) {
			double total = tax - tax * 0.05;
			System.out.println();
			System.out.println("총 요금은 " + total + "원입니다.");
		} else if (carType.equals("전기차")) {
			double total = tax - tax * 0.5;
			System.out.println();
			System.out.println("총 요금은 " + total + "원입니다.");
		} else if (carType.equals("대형차")) {
			double total = tax + tax * 0.3;
			System.out.println();
			System.out.println("총 요금은 " + total + "원입니다.");
		}else if (carType.equals("중형차")) {
			double total = tax;
			System.out.println();
			System.out.println("총 요금은 " + total + "원입니다.");
		}

	}
}