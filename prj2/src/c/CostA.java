package c;

public class CostA{
	
	
	CostA(int outPutTime,int carType, char tgn){
		
		if(carType==1) {
			int tax=2500*5;
			double total=tax-tax*0.05;
			System.out.println();
			System.out.println("총 오금은 "+total+"원입니다.");
		}else if(carType==2) {
			int tax=2500*5;
			double total=tax-tax*0.5;
			System.out.println();
			System.out.println("총 오금은 "+total+"원입니다.");
		}else if(carType==3) {
			int tax=2500*5;
			double total=tax-tax*0.35;
			System.out.println();
			System.out.println("총 오금은 "+total+"원입니다.");
		}
	}	
}