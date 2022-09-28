package day13_2;

public class Person {
	String name;  // 이름
	String id;  //주민
	
	
	 public Person() {}
	 
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void printInfo() {
		System.out.print(classNo + "반 ");
		System.out.print(name);
	}

}
