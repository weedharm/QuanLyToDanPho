package com.mycompany.finalui.usefulfunction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	public static String dateToString(Date t) {
		return sdf.format(t);
	}
	
	public static String dateSQL(Date t) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(t);
	}
	
	public static Date stringToDate(String t) {
		try {
			return sdf.parse(t);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
