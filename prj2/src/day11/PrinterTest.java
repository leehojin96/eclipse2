package day11;

public class PrinterTest {

	public static void main(String[] args) {

//		PrinterInfo p = new PrinterInfo();
		
//		p.input("M1120", 320000, true, "black", "A4");
		
//		p.output();
		
//		System.out.println(" ");
		
		
//		----------------------------------------------------------------
		
//		PrinterInfo c = null;
		
//		c = new PrinterInfo();
		
//		c.output();
		
//		System.out.println(" ");
		
//		----------------------------------------------------------------		
		
		PrinterInfo a = null;
		
		a = new PrinterInfo("M1320", 320000);
		
		a.output();
		
		System.out.println(" ");
		
//		----------------------------------------------------------------	
		
		PrinterInfo[] p = new PrinterInfo[3];
		
//		p[0].output();	배열안에 생성자 초기화를 하지 않아서 오류
		
		
//		p[0] 기본 생성자
		p[0]= new PrinterInfo();
		
		p[0].output();	
		
		System.out.println(" ");
		
//		
//		p[1]("M5690", 560000);
		
		
		
		p[0].input("M1120", 320000, true, "black", "A4");
		
		p[0].output();			
		
		
		
	}

}
