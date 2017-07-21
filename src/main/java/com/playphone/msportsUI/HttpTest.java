package com.playphone.msportsUI;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.io.UnsupportedEncodingException;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.URL;

import java.nio.charset.Charset;

import java.util.ArrayList;

import java.util.Base64;

import java.util.Scanner;

import org.apache.http.HttpResponse;

import org.apache.http.NameValuePair;

import org.apache.http.client.HttpClient;

import org.apache.http.client.methods.HttpPost;

import org.apache.http.entity.StringEntity;

import org.apache.http.impl.client.HttpClientBuilder;

import org.json.JSONArray;

import org.json.JSONException;

import org.json.JSONObject;

//import org.testng.Reporter;

import org.testng.annotations.Test;

import java.net.URLDecoder;

import java.net.URLEncoder;

public class HttpTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		HttpClient client = HttpClientBuilder.create().build();
		String restUrl = "http://accounts.msports.danny.cloudns.cc/accounts/login/async";
		String username = "ops@playphone.com";
		System.out.println("URLEncoder.encode returns " + URLEncoder.encode(username, "UTF-8"));
		System.out.println("getBytes returns " + new String(username.getBytes("UTF-8"), "ISO-8859-1"));
		String password = "password";
		System.out.println("URLEncoder.encode returns " + URLEncoder.encode(password, "UTF-8"));
		System.out.println("getBytes returns " + new String(password.getBytes("UTF-8"), "ISO-8859-1"));
		String session = "faf0b2a1-df85-4025-9603-030670f85e6a";
		String token = "65182908-5a35-4577-b767-9c970585ac3c";
		restUrl = restUrl+"?username="+username+"&password="+password+"&session="+session+"&token="+token;
		// System.out.println(restUrl + "restUrl");


		HttpPost post = new HttpPost(restUrl);

		// Create some NameValuePair for HttpPost parameters
		// List<NameValuePair> arguments = new ArrayList<>(3);
		// arguments.add(new BasicNameValuePair("username", "admin"));
		// arguments.add(new BasicNameValuePair("firstName", "System"));
		// arguments.add(new BasicNameValuePair("lastName", "Administrator"));

		try {
			// post.setEntity(new UrlEncodedFormEntity(arguments));
			HttpResponse response = client.execute(post);

			// Print out the response message
			System.out.println(response + "response");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
