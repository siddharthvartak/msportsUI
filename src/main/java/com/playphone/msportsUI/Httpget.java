package com.playphone.msportsUI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpURLConnection;
import java.net.URL;

import java.net.URLConnection;

import java.util.Iterator;

import java.util.List;

import java.util.Map;

import java.util.Set;



/*public class Httpget {
 public static void main(String[] argv) throws Exception {*/
/*// Instantiate CookieManager;
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
CookieStore cookieJar =manager.getCookieStore();
List<java.net.HttpCookie> cookies =
cookieJar.getCookies();
for (java.net.HttpCookie cookie: cookies) {
System.out.println("CookieHandler retrieved cookie: " + cookie) ;
  }
 }
}

*/

