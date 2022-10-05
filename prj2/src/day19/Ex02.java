package day19;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());

		// 특정포멧으로 날짜표현하기
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sf.format(cal.getTime()));

		cal.add(Calendar.DATE, 14);
		System.out.println(sf.format(cal.getTime()));

		// 2달후
		cal.add(Calendar.MONTH, 2);
		System.out.println(sf.format(cal.getTime()));

		// 2년후
		cal.add(Calendar.YEAR, 2);
		System.out.println(sf.format(cal.getTime()));

	}

}
