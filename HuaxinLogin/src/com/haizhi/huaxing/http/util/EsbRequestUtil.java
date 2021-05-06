package com.haizhi.huaxing.http.util;

import com.haizhi.huaxing.http.HttpRequest;
import com.haizhi.huaxing.http.xml.vo.EsbMessage;

import java.io.UnsupportedEncodingException;

public class EsbRequestUtil {
    // post 请求发送报文
    public static void sendXmlPost(EsbMessage esb, String url){
        String xml = Obj2XmlUtil.esb2Xml(esb);
        System.out.println("即将向地址 "+url+" 发送报文: \n"+xml);
        //发送 POST 请求
        String sr = HttpRequest.sendXmlPost(url,
                xml);
        System.out.println("http调用返回如下:");
        System.out.println(sr);
    }

    // tcp 请求发送报文
    public static String sendXmlTcp(EsbMessage esb,String ip,Integer port){
        String xml = Obj2XmlUtil.esb2Xml(esb);
        int length = 0;
        try {
            length = xml.getBytes("GBK").length;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String lengthStr = String.format("%8d",length).replaceAll(" ","0");
        xml = lengthStr+xml;
        System.out.println("即将向地址 "+ip+",port="+ port +" 发送报文: \n"+xml);
        //发送 POST 请求
        String sr = HttpRequest.sendTcp(ip, port,
                xml);
        System.out.println("tcp调用返回报文如下: \n"+sr);
        return sr;
    }

    public static String getTcpXml(EsbMessage esb){
        String xml = Obj2XmlUtil.esb2Xml(esb);
        int length = 0;
        try {
            length = xml.getBytes("GBK").length;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String lengthStr = String.format("%8d",length).replaceAll(" ","0");
        xml = lengthStr+xml;
        return xml;
    }

    public static Boolean isTcpSuccess(String tcpReturnXml){
        String successStr = "<returnCode>000000000000</returnCode>";
        return tcpReturnXml.indexOf(successStr)>0;
    }

}
