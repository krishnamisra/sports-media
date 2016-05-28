package com.krishna.sportsmedia.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.krishna.sportsmedia.util.constants.SportsMediaConstants;



public class SportsMediaUtil {
	
	public static Date convertStringToDate(String date, String format) {
		
		System.out.println("the date is "+date);
		
		if (format == null) {
			// set it to default format which is ISO2801
			format = SportsMediaConstants.COMPACT_ISO_8601_DATE_FORMAT_HH_MM_SS;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date dateObject = null;
		try {
			dateObject = simpleDateFormat.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error converting String to Date :: "
					+ e.getMessage());
		}
		return dateObject;

	}

}
