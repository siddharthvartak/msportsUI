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

//public class HttpGetterJason{
	
/*@Test
 //Extract game id and tournament id
public void ExtractGameID() throws Exception {
try {
URL url = new URL(
"https://sdk.o01.dev.playphone.cc/sdk/discover/tournaments/873ac720-2d43-4987-9528-187032c60e65/0/100?format=Ranking");
HttpURLConnection conn = (HttpURLConnection) url.openConnection();
conn.setRequestMethod("GET");
conn.setRequestProperty("Content-Type", "application/json");

if (conn.getResponseCode() != 200) {
throw new RuntimeException(" HTTP error code : "+ conn.getResponseCode());
}

Scanner scan = new Scanner(url.openStream());
String entireResponse = new String();
while (scan.hasNext())
entireResponse += scan.nextLine();
System.out.println("Response : "+entireResponse);
scan.close();


JSONObject obj = new JSONObject(entireResponse );
//retrieve from this json object using:
JSONArray arr = obj.getJSONArray("data");
for (int i = 0; i < arr.length(); i++) {
String gameid = arr.getJSONObject(i).getString("game_id");
System.out.println("game_id : " + gameid);
String tournamentid = arr.getJSONObject(i).getString("tournament_id");
System.out.println("tournament_id : " + tournamentid);
//String formatAddress = arr.getJSONObject(i).getString("formatted_address");
//System.out.println("Address : " + formatAddress);


//validating game id
if(gameid.equalsIgnoreCase("873ac720-2d43-4987-9528-187032c60e65"))
{
System.out.println("Game ID is correct");
}
else
{
System.out.println("Game ID is incorrect");
}

}


conn.disconnect();
} catch (MalformedURLException e) {
e.printStackTrace();

} catch (IOException e) {

e.printStackTrace();

}

}
}






	//******Running CURL command from java test*******************************
	/*
	String sid = "curl -vX GET http://accounts.olympus-stage.playphone.cc/accounts/user/state"; 
			//System.out.println(sid); 
			Runtime r = Runtime.getRuntime(); 
			Process p = r.exec(sid); 	*/
	
	//**************************************************************************
	

//*************POST TEST *********************



public class HttpPostReq
{
    public static void main(String args[]) throws JSONException, UnsupportedEncodingException
    {
        String restUrl="https://accounts.olympus-stage.playphone.cc/accounts/login/async";
        
        
        String username = "ops@playphone.com";
        System.out.println("URLEncoder.encode returns "
          + URLEncoder.encode(username, "UTF-8"));

        System.out.println("getBytes returns "
          + new String(username.getBytes("UTF-8"), "ISO-8859-1"));
        
        
        
       
       
        
        //String username="ops@playphone.com";
        String password="password";
        String csrf="559a6ef0-bf67-4290-969e-310e4863d5de";
        
         /* ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
       // then add elements for each pair

         nameValuePairs.put("username", "ops@playphone.com");
         nameValuePairs.add("password", "password");
         */
        
        
        JSONObject user=new JSONObject();
         user.put("username", "ops@playphone.com");
         user.put("password", "password");
       //  user.put("csrf", "7790c2fc-cf7e-4200-bdfe-dd7c421975a4");
        String jsonData=user.toString();
        HttpPostReq httpPostReq=new HttpPostReq();
       // HttpPost httpPost=httpPostReq.createConnectivity(restUrl, username, password, csrf);
        HttpPost httpPost=httpPostReq.createConnectivity(restUrl, username, password);
        httpPostReq.executeReq( jsonData, httpPost);
    }
     
  //  HttpPost createConnectivity(String restUrl, String username, String password, String csrf)
    HttpPost createConnectivity(String restUrl, String username, String password)
    {
        HttpPost post = new HttpPost(restUrl);
        String auth=new StringBuffer(username).append(":").append(password).toString();
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));
       String authHeader = "Basic " + new String(encodedAuth);
       post.setHeader("AUTHORIZATION", authHeader);
       post.setHeader("Content-Type", "application/json");
           post.setHeader("Accept", "application/json");
            post.setHeader("Cookie", "8e6d317c-8005-4491-a1e6-d8c02e0f481b");
            post.setHeader("X-XSRF-TOKEN", "7790c2fc-cf7e-4200-bdfe-dd7c421975a4");
            
            //post.setHeader("X-Stream" , "true");
        return post;
    }
     
    void executeReq(String jsonData, HttpPost httpPost)
    {
        try{
            executeHttpRequest(jsonData, httpPost);
        }
        catch (UnsupportedEncodingException e){
            System.out.println("error while encoding api url : "+e);
        }
        catch (IOException e){
            System.out.println("ioException occured while sending http request : "+e);
        }
        catch(Exception e){
            System.out.println("exception occured while sending http request : "+e);
        }
        finally{
            httpPost.releaseConnection();
        }
    }
     
    void executeHttpRequest(String jsonData,  HttpPost httpPost)  throws UnsupportedEncodingException, IOException
    {
        HttpResponse response=null;
        String line = "";
        StringBuffer result = new StringBuffer();
        httpPost.setEntity(new StringEntity(jsonData));
        HttpClient client = HttpClientBuilder.create().build();
        response = client.execute(httpPost);
        System.out.println("Post parameters : " + jsonData );
        System.out.println("Response Code : " +response.getStatusLine().getStatusCode());
        System.out.println("Test " );
        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        while ((line = reader.readLine()) != null){ result.append(line); }
        System.out.println(result.toString());
    }

	
}