package day14_4;

public class LhjCalculatorIm implements Calculator{

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("이호진 add");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("이호진 sub");
		if(su1-su2 >=0)
		return su1-su2;
		else
			return -(su1-su2);
	}

	@Override
	public int divide(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("이호진 div");
		return 0;
	}

	@Override
	public int multiply(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("이호진 mul");
		return 0;
	}

}
