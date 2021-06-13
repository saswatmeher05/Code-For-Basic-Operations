package com.sm.util;

import java.util.Calendar;
import java.util.Formatter;

public class AppUtil {
	
	public Formatter getHourOfDayMessage(){
		Formatter formatter=new Formatter();
		Calendar cal=Calendar.getInstance();
		formatter.format("%tl:%tM", cal, cal);
		return formatter;
	}

}
