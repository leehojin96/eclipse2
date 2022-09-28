package day13_2;

public class Student extends Person {

	// TODO Auto-generated method stub
	int classNo; // 반

	public Student(String name, String id, int classNo) {
		// 부모의 생성자 호출 , 부모의 기본생성자 호출
		super(name, id); // 명시적으로 부모의 매개변수있는 생성자 호출
		this.classNo = classNo;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(classNo);

	}

}
