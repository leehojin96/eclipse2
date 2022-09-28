package note;

public class Time클래스 {
	private int hour;
	private int minute;
	private float second;

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public float getsecond() {
		return second;
	}

	public void setHour(int h) {
		if (h < 0 || h > 23)
			return;
		hour = h;
	}
	public void setMinute(int m) {
		if(m < 0 || m > 60) return;
		minute = m;
	}
	public void setSecond(float s) {
		if(s < 0.0f || s > 59.99f) return;
		second = s;
	}

}
