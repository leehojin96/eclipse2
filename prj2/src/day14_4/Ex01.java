package day14_4;

public class Ex01 {

	public static void main(String[] args) {
		 
		Calculator    calculator=null ;
		
		// calculator = new WjyCalculatorImp();
	 	
		//calculator = new GkyCalculatorImp();
		 calculator = new JhCalculatorImp();
		
		int result = calculator.add(5, 3);
		System.out.println( result); 

	}

}
