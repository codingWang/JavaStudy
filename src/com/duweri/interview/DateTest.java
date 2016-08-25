package com.duweri.interview;

import java.util.Calendar;

public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y,m,d,h,mi,s,nowsj;
		Calendar calendar = Calendar.getInstance();
		y=calendar.get(Calendar.YEAR);
		m=calendar.get(Calendar.MONTH);
		d=calendar.get(Calendar.DATE);
		h=calendar.get(Calendar.HOUR_OF_DAY);
		mi=calendar.get(Calendar.MINUTE);
		s=calendar.get(Calendar.MINUTE);
		nowsj=y*100+m;
		System.out.println(y+"-"+m+"-"+d+"-"+h+"-"+nowsj);
		//2016-6-21-10-201606
	}

}
