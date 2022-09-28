package day15;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I like java";
		String str2="I like java";
		
		//String 불변
		String result = str.concat(" hello");
		System.out.println(result);
		
		//수정가능함
		StringBuffer s = new StringBuffer("hello");
		s.setCharAt(0, 'k');
		s.append(" java");
		System.out.println(s);
	}

}
