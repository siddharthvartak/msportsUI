package com.playphone.msportsUI;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.StringReader;

import java.net.HttpURLConnection;

import java.net.URL;

//import javax.swing.text.Document;

import javax.swing.text.Element;

import javax.xml.parsers.DocumentBuilder;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.NodeList;

import org.xml.sax.InputSource;

import org.w3c.dom.Document;

import org.w3c.dom.Node;

import org.w3c.dom.NodeList;

public class OldHttpGetRequest {

	public static void main(String[] args) throws Exception {

		String sXML = OldHttpGetRequest

				.getDoc("https://sdk.o01.dev.playphone.cc/sdk/discover/tournaments/873ac720-2d43-4987-9528-187032c60e65/0/100?format=Ranking");

		Document dom = OldHttpGetRequest.loadXMLFromString(sXML);

		Element el = (Element) dom.getDocumentElement();

		System.out.println(OldHttpGetRequest.getTextValue(el, "game_id"));

		System.out.println(OldHttpGetRequest.getTextValue(el, "tournament_id"));

	}

	private static char[] getTextValue(Element el, String string) {

		// TODO Auto-generated method stub

		return null;

	}

	public static String getDoc(String urlToRead) {

		URL url;

		HttpURLConnection conn;

		BufferedReader rd;

		String line;

		String result = "";

		try {

			url = new URL(urlToRead);

			conn = (HttpURLConnection) url.openConnection();

			conn.setRequestMethod("GET");

			rd = new BufferedReader(

					new InputStreamReader(conn.getInputStream()));

			while ((line = rd.readLine()) != null) {

				result += line;

			}

			rd.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

		return result;

	}

	public static Document loadXMLFromString(String xml) throws Exception {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder = factory.newDocumentBuilder();

		InputSource is = new InputSource(new StringReader(xml));

		return builder.parse(is);

	}

	private static String getTextValue(Element ele, int string) {

		String textVal = null;

		NodeList nl = (NodeList) ele.getElement(string);

		if (nl != null && nl.getLength() > 0) {

			Element el = (Element) nl.item(0);

			textVal = ((Node) el).getFirstChild().getNodeValue();

		}

		return textVal;

	}

}