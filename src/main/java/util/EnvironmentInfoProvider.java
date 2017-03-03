package util;

import org.testng.ITestContext;
import org.testng.xml.XmlTest;

import java.io.File;
//msports

	public class EnvironmentInfoProvider {
		
		/**
		 * Constants related to choosing the browser, url and language to use for the test
		 */
		public static final String BROWSER_SYSTEM_PROP = "com.playphone.msports.browser";
		public static final String BROWSER_ENV = "BROWSER";
		public static final String BROWSER_TEST_PARAM = "browser";

		public static final String SELENIUM_GRID_ENV = "SeleniumGrid_url";
		public static final String SELENIUM_GRID_TEST_PARAM = "grid-location";
		
		public static final String LANGUAGE_ENV = "LANGUAGE";
		public static final String LANGUAGE_TEST_PARAM = "language";

		public static String getURL(ITestContext context) {
			String gridUrl = System.getProperty(SELENIUM_GRID_ENV);
			if(gridUrl == null) {
				gridUrl = System.getenv(SELENIUM_GRID_ENV);
			}
			if(gridUrl == null && context != null) {
				gridUrl = context.getCurrentXmlTest().getParameter(SELENIUM_GRID_TEST_PARAM);
				if(gridUrl == null) {
					gridUrl = context.getSuite().getParameter(SELENIUM_GRID_TEST_PARAM);
				}
			}
			return gridUrl;
		}

		/**
		 * <p>Selenium is capable of running tests on multiple browsers. This method retrieves
		 * the specified browser the user wants to run tests on from the following places
		 * with the higher priority places listed first</p>
		 *
		 * <ul>
		 *     <li>From Java system property "com.playphone.devportal.browser"</li>
		 *     <li>From environment variable "BROWSER"</li>
		 *     <li>If a non-null ITestContext parameter is passed in, the TestNG parameters
		 *     are checked for a parameter named "browser".</li>
		 * </ul>
		 *
		 * <p>If a browser is not specified anywhere, a null is returned.</p>
		 *
		 * @return a String indicating the browser type to use for the test.
		 */
		public static String getSpecifiedBrowser(ITestContext ctx) {
			String browserType = System.getProperty(BROWSER_SYSTEM_PROP);
			if(browserType == null) {
				browserType = System.getenv(BROWSER_ENV);
			}

			if(browserType == null && ctx != null) {
				XmlTest t = ctx.getCurrentXmlTest();
				browserType = t.getParameter(BROWSER_TEST_PARAM);
				if(browserType == null) {
					browserType = ctx.getSuite().getParameter(BROWSER_TEST_PARAM);
				}
			}
			return browserType;
		}
		
		
		
	}

