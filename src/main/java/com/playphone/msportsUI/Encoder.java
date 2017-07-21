package com.playphone.msportsUI;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Encoder
{
  public static void main(String[] args) throws UnsupportedEncodingException {
    String s = "ops@playphone.com";
    System.out.println("URLEncoder.encode returns "
      + URLEncoder.encode(s, "UTF-8"));

    System.out.println("getBytes returns "
      + new String(s.getBytes("UTF-8"), "ISO-8859-1"));
  }
}

