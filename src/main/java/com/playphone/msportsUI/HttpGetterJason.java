package com.playphone.msportsUI;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
//import org.testng.Reporter;
import org.testng.annotations.Test;

public class HttpGetterJason{
	
@Test
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