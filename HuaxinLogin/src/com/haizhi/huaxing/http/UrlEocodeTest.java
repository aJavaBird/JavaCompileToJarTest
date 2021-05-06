package com.haizhi.huaxing.http;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlEocodeTest {
    public static void main(String args[]){
        String url = "http://10.1.98.170:5000/atlas/atlasGap/#/graph/cluster?appId=7&templateId=4&name=团伙113";
        String encodeUrl = null;
        try {
            encodeUrl = URLEncoder.encode(url,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(url);
        System.out.println(encodeUrl);
    }
}
