package day14_2;

public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score a = new Score("홍길동", 100, 90);
		String result = a.getInfo();
		System.out.println(result);

		Object o = a;
		
		
		Customer c = new Customer("avc", "0000", "홍길동");
		String result2 = c.getInfo();
		System.out.println(result2);
		
		Object o2 = c;
		
		System.out.println(o.toString());
		System.out.println(o2.toString());

	}

}
