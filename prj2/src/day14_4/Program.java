package day14_4;

import java.util.Scanner;

public class Program {

	Calculator calculator;
	
	
	public Program() {}
	 
	
	public void setCalculator( Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void run() {
		
		Scanner sc = new Scanner(System.in);
	 
			System.out.println(" 두 수 입력");
			int su1 = sc.nextInt();
			int su2 = sc.nextInt();
			
			System.out.println("메뉴 1.더하기 2.빼기 3.곱하기 4나누기");
			int menu = sc.nextInt();
			int result=0;
			switch( menu) {
			case 1:				
				result =calculator.add( su1, su2);
				System.out.println( result);
				break;
			case 2:				
				result =calculator.sub( su1, su2);
				System.out.println( result);
				break;
			case 3:
				result = calculator.multiply(su1, su2);
				System.out.println( result);
				break;
			case 4 :
				result = calculator.divide(su1, su2);
				System.out.println( result);
				break;
			default:
				System.out.println("잘못된 입력");	
			}
		
	}
	
	public static void main(String[] args) {
		
		 Program p = new Program();
		// p.setCalculator(new HysCalculatorImp());
		 p.setCalculator(new LhjCalculatorIm());
		 
		 p.run();
	}
	 

}
