package day19.lhjpt;

public class SCV extends GroundUnit implements Repairable{
	public SCV() {
	// TODO Auto-generated constructor stub
		super(60);
		hitPoint=MAX_HP;
}
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint!=u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + " 수리완료");
		}
	}

}
