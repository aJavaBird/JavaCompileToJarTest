package com.haizhi.huaxing.http;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlEocodeTest2 {
    public static void main(String args[]){
        String url = "团伙113";
        String encodeUrl = null;
        try {
            encodeUrl = java.net.URLEncoder.encode(url,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(url);
        System.out.println(encodeUrl);
    }
}
