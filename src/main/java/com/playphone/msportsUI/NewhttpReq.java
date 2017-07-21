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
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class NewhttpReq {

public static void main(String[] args) throws Exception {
NewhttpReq http = new NewhttpReq();
		// Sending get request

		// http.sendingGetRequest();

		// Sending post request

		http.sendingPostRequest();

	}

	/*
	 * 
	 * // HTTP GET request
	 * 
	 * private void sendingGetRequest() throws Exception {
	 * 
	 * 
	 * 
	 * String urlString =
	 * "http://localhost:8080/JAXRSJsonCRUDExample/rest/countries";
	 * 
	 * 
	 * 
	 * URL url = new URL(urlString);
	 * 
	 * HttpURLConnection con = (HttpURLConnection) url.openConnection();
	 * 
	 * 
	 * 
	 * // By default it is GET request
	 * 
	 * con.setRequestMethod("GET");
	 * 
	 * 
	 * 
	 * //add request header
	 * 
	 * con.setRequestProperty("User-Agent", USER_AGENT);
	 * 
	 * 
	 * 
	 * int responseCode = con.getResponseCode();
	 * 
	 * System.out.println("Sending get request : "+ url);
	 * 
	 * System.out.println("Response code : "+ responseCode);
	 * 
	 * 
	 * 
	 * // Reading response from input Stream
	 * 
	 * BufferedReader in = new BufferedReader(
	 * 
	 * new InputStreamReader(con.getInputStream()));
	 * 
	 * String output;
	 * 
	 * StringBuffer response = new StringBuffer();
	 * 
	 * 
	 * 
	 * while ((output = in.readLine()) != null) {
	 * 
	 * response.append(output);
	 * 
	 * }
	 * 
	 * in.close();
	 * 
	 * 
	 * 
	 * //printing result from response
	 * 
	 * System.out.println(response.toString());
	 * 
	 * 
	 * 
	 * }
	 */

	// HTTP Post request
    
   public static void main1(String[] args) throws UnsupportedEncodingException {
    String s = "ops@playphone.com";
    System.out.println("URLEncoder.encode returns "
      + URLEncoder.encode(s, "UTF-8"));

    System.out.println("getBytes returns "
      + new String(s.getBytes("UTF-8"), "ISO-8859-1"));
  }

	private void sendingPostRequest() throws Exception {

		String url = "https://accounts.olympus-stage.playphone.cc/accounts/login/async?username=ops@playphone.com&password=password";

		URL obj = new URL(url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// Setting basic post request

		con.setRequestMethod("POST");

		// con.setRequestProperty("User-Agent", USER_AGENT);

		// con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		con.setRequestProperty("Content-Type", "application/json;charset=UTF-8");

		// "data": {

		// "account_id": "33705d12-1b8f-11e6-b6ba-3e1d05defe78",

		// "username": "Playphone Ops",

		// "avatar":
		// "http://d2yp1cdjzexbw8.cloudfront.net/game_assets/14032197641138566953202.png"

		// String postJsonData =
		// "{"account_id":33705d12-1b8f-11e6-b6ba-3e1d05defe78}";

		// Send post request

		// con.setDoOutput(true);

		// DataOutputStream wr = new DataOutputStream(con.getOutputStream());

		// wr.writeBytes(postJsonData);

		// wr.flush();

		// wr.close();

		int responseCode = con.getResponseCode();

		System.out.println("nSending 'POST' request to URL : " + url);

		// System.out.println("Post Data : " + postJsonData);

		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(

				new InputStreamReader(con.getInputStream()));

		String output;

		StringBuffer response = new StringBuffer();

		while ((output = in.readLine()) != null) {

			response.append(output);

		}

		in.close();

		// printing result from response

		System.out.println(response.toString());

	}

}