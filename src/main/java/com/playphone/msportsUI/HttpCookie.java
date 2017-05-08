
package com.playphone.msportsUI;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.URL;

import java.net.URLConnection;

import java.util.Iterator;

import java.util.List;

import java.util.Map;

import java.util.Set;





/*	
public class HttpCookie {
    try {       
        // Instantiate CookieManager;
        // make sure to set CookiePolicy
        CookieManager manager = new CookieManager();
        manager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(manager);

        // get content from URLConnection;
        // cookies are set by web site
        URL url = new URL("http://host.example.com");
        URLConnection connection = url.openConnection();
        connection.getContent();

        // get cookies from underlying
        // CookieStore
        CookieStore cookieJar =  manager.getCookieStore();
        List<java.net.HttpCookie> cookies =
            cookieJar.getCookies();
        for (java.net.HttpCookie cookie: cookies) {
          System.out.println("CookieHandler retrieved cookie: " + cookie);
        }
    } catch(Exception e) {
        System.out.println("Unable to get cookie using CookieHandler");
        e.printStackTrace();
    }
}  
}
*/

public class HttpCookie {
	  public static void main(String[] argv) throws Exception {
		// Instantiate CookieManager;
	        // make sure to set CookiePolicy
	        CookieManager manager = new CookieManager();
	        manager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
	        CookieHandler.setDefault(manager);

	        // get content from URLConnection;
	        // cookies are set by web site
	        URL url = new URL("https://accounts.olympus-stage.playphone.cc/accounts/user/state");
	        URLConnection connection = url.openConnection();
	        connection.getContent();

	        // get cookies from underlying
	        // CookieStore
	        CookieStore cookieJar =  manager.getCookieStore();
	        List<java.net.HttpCookie> cookies =
	            cookieJar.getCookies();
	        for (java.net.HttpCookie cookie: cookies) {
	          System.out.println("CookieHandler retrieved cookie: " + cookie);
	  }
	}
}



//






/*
public class HttpCookie {
  public static void main(String[] argv) throws Exception {
	  //https://accounts.o01.dev.playphone.cc/accounts/user/state
    URL url = new URL("https://accounts.o01.dev.playphone.cc/accounts/user/state");
    URLConnection conn = url.openConnection();

    for (int i = 0;; i++) {
      String headerName = conn.getHeaderFieldKey(i);
      String headerValue = conn.getHeaderField(i);

      if (headerName == null && headerValue == null) {
        break;
      }
      if ("Set-Cookie".equalsIgnoreCase(headerName)) {
        String[] fields = headerValue.split(";\\s*");
        for (int j = 1; j < fields.length; j++) {
          if ("secure".equalsIgnoreCase(fields[j])) {
            System.out.println("secure=true");
          } else if (fields[j].indexOf('=') > 0) {
            String[] f = fields[j].split("=");
            if ("expires".equalsIgnoreCase(f[0])) {
              System.out.println("expires"+ f[1]);
            } else if ("domain".equalsIgnoreCase(f[0])) {
              System.out.println("domain"+ f[1]);
            } else if ("path".equalsIgnoreCase(f[0])) {
              System.out.println("path"+ f[1]);
            }
          }
        }
      }
    }
  }
}

*/









 /*

public class HttpCookie {

    public static void main(String[] args) throws Exception {
      //https://accounts.o01.dev.playphone.cc/accounts/user/state
        URL url = new URL("https://playphone.com");

        URLConnection conn = url.openConnection();

 

        Map<String, List<String>> headerFields = conn.getHeaderFields();

        Set<String> headerFieldsSet = headerFields.keySet();

        Iterator<String> hearerFieldsIter = headerFieldsSet.iterator();

         

        while (hearerFieldsIter.hasNext()) {

             

             String headerFieldKey = hearerFieldsIter.next();

              

             if ("Set-Cookie".equalsIgnoreCase(headerFieldKey)) {

                  

                 List<String> headerFieldValue = headerFields.get(headerFieldKey);

                  

                 for (String headerValue : headerFieldValue) {

                      

                    System.out.println("Cookie Found...");

                      

                    String[] fields = headerValue.split(";\\s*");

 

                    String cookieValue = fields[0];

                    String expires = null;

                    String path = null;

                    String domain = null;

                    boolean secure = false;

                     

                    // Parse each field

                    for (int j = 1; j < fields.length; j++) {

                        if ("secure".equalsIgnoreCase(fields[j])) {

                            secure = true;

                        }

                        else if (fields[j].indexOf('=') > 0) {

                            String[] f = fields[j].split("=");

                            if ("expires".equalsIgnoreCase(f[0])) {

                                expires = f[1];

                            }

                            else if ("domain".equalsIgnoreCase(f[0])) {

                                domain = f[1];

                            }

                            else if ("path".equalsIgnoreCase(f[0])) {

                                path = f[1];

                            }

                        }

                         

                    }

                     

                    System.out.println("cookieValue:" + cookieValue);

                    System.out.println("expires:" + expires);

                    System.out.println("path:" + path);

                    System.out.println("domain:" + domain);

                    System.out.println("secure:" + secure);

                      

                    System.out.println("*****************************************");

             

    

                 }

                  

             }

             

        }

         

    }

 

}*/
