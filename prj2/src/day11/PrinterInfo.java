package day11;

public class PrinterInfo {

	private String name;
	private int price;
	private boolean wifi;
	private String ink;
	private String paper;

	public PrinterInfo() {

	}

	public PrinterInfo(String name ,int price) {
		this.name = name;
		this.price = price;
		
	}
	
	public PrinterInfo(boolean wifi, String ink, String paper) {
		this.wifi = wifi;
		this.ink = ink;
		this.paper = paper;
		
	}

//정보 넣기
	public void input(String name, int price, boolean wifi, String ink, String paper) {
		this.name = name;
		this.price = price;
		this.wifi = wifi;
		this.ink = ink;
		this.paper = paper;

	}

	public void output() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(wifi);
		System.out.println(ink);
		System.out.println(paper);
	}

}