package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CommonUtilities {
	
	public static String getTimestamp() {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Calendar cal = Calendar.getInstance();
		String timestamp = dateFormat.format(cal.getTime());
		return timestamp;
	}

}
