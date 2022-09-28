package day11;

import java.util.Scanner;

public class Day {
	private int time;
	private String work;
	Scanner s = new Scanner(System.in);
	
	public Day(int time, String work) {
		super();
		this.time = time;
		this.work = work;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		while (true) {

			this.time = time;
			if (0 < time && time < 25) {
			} else {
				System.out.println("잘못 입력 했습니다.");
			}
		}
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		System.out.print("일정 : ");
		this.work = s.next();
	}
	
	
	
}
