package day19.lhjpt;

public class Dropship extends AirUnit implements Repairable{
	public Dropship() {
		// TODO Auto-generated constructor stub
		super(125);
		hitPoint=MAX_HP;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dropship";
	}

}
