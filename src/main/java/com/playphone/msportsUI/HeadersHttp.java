package com.playphone.msportsUI;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
//import java.nio.charset.Charset;
import java.util.ArrayList;
//import java.util.Base64;
import java.util.List;

//import java.util.Scanner;
import org.apache.http.HttpResponse;
//import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
//import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
//import org.apache.http.client.CookieStore;



public class HeadersHttp {
	public static void main(String[] args) throws IOException {
		CookieManager manager = new CookieManager();
		manager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
		CookieHandler.setDefault(manager);
		//get content from the URL connection;
		//cookies are set by the website
		URL url = new URL("https://accounts.olympus-stage.playphone.cc/accounts/user/state");
		URLConnection connection = url.openConnection();
		connection.getContent();
		
		//get cookies from underlying cookiestore
		CookieStore cookieJar = manager.getCookieStore();
		List<java.net.HttpCookie> cookies = cookieJar.getCookies();
		
		
		String session = "";
		ArrayList <String> arrayList = new ArrayList<String>();
		for (java.net.HttpCookie cookie: cookies) {
			System.out.println("CookieHandler retrieved cookie: " + cookie);
			session = cookie.getValue();
			System.out.println("session" + session);
			arrayList.add(session);
		}
		HttpClient client = HttpClientBuilder.create().build();
		String restUrl = "https://accounts.olympus-stage.playphone.cc/accounts/login/async";
		String username = "ops@playphone.com";
		System.out.println("URLEncoder.encode returns" + URLEncoder.encode(username, "UTF-8"));
		System.out.println("getBytes returns" + new String(username.getBytes("UTF-8"), "ISO-8859-1"));
		String password = "password";
		System.out.println("URLEncoder.encode returns" + URLEncoder.encode(password, "UTF-8"));
		System.out.println("getBytes returns " + new String(password.getBytes("UTF-8"),"ISO-8859-1"));
		String session1 = "";
		String token = "";
		
		session1 = arrayList.get(0);
		token = arrayList.get(1);
		System.out.println("session1" + session1);
		System.out.println("token" + token);
		restUrl = restUrl+"?username="+username+"&password="+password;
		System.out.println(restUrl + ":->>>>restUrl");
		
		HttpPost post = new HttpPost(restUrl);
		/*CookieStore cookieStore = new BasicCookieStore();
		BasicClientCookie cookie = new BasicClientCookie("session1", token);
		cookie.setPath("/");
		client.setCookieStore(cookieStore);
		response = client.execute(httppost);*/
		
		
		
		//response = client.execute(post);
		
		
		
		
		post.addHeader("Accept","application/json");
		post.addHeader("Content-type","application/json");
		post.addHeader("SESSION", session1);
		post.addHeader("SESSION", "");
		
		try {
			//client.setCookieStore(cookieJar);
			//HttpPost post = new HttpPost(restUrl);
			HttpContext localContext = new BasicHttpContext();
			
			//InMemoryCookieStore cookie = new InMemoryCookieStore ();
			localContext.setAttribute(HttpClientContext.COOKIE_STORE, cookieJar);
			HttpResponse response = client.execute(post, localContext);
			System.out.println(response + "response");
		}
		catch (IOException e) {
			e.printStackTrace();
			
		}
				
	}
	

}