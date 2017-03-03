package util;

import util.CommonUtilities;
import util.EnvironmentInfoProvider;

/**
 * msports
 *
 */
public class TestDataProvider {
	
    private static final String CREATE_EMAIL_CHROME = "devpffse+" + CommonUtilities.getTimestamp() + "ch@gmail.com";
	private static final String EMAIL_CHROME = "devpchse@gmail.com";;
	private static final String PASSWORD_CHROME = "playphonechrome";
	
	
	private static final String CREATE_EMAIL_FIREFOX = "devpffse+" + CommonUtilities.getTimestamp() + "@gmail.com";
	private static final String EMAIL_FIREFOX = "devpffse@gmail.com";;
	private static final String PASSWORD_FIREFOX = "playphonefirefox";
	
	public static String getCreateEmail(String browserType) {
		if (browserType.equalsIgnoreCase("chrome")) {
			return CREATE_EMAIL_CHROME;
		} else {
			return CREATE_EMAIL_FIREFOX;
		}
	}
	
	public static String getEmail(String browserType) {
		if (browserType.equalsIgnoreCase("chrome")) {
			return EMAIL_CHROME;
		} else {
			return EMAIL_FIREFOX;
		}
	
}
	
	public static String getPassword(String browserType) {
		if (browserType.equalsIgnoreCase("chrome")) {
			return PASSWORD_CHROME;
		} else {
			return PASSWORD_FIREFOX;
		}
	
	}
}