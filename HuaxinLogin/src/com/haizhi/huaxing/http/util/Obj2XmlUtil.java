package com.haizhi.huaxing.http.util;

import com.haizhi.huaxing.http.xml.vo.EsbMessage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;

public class Obj2XmlUtil {

    public static String esb2Xml( EsbMessage esb){
        JAXBContext jc = null;
        String xml = null;
        try {
            jc = JAXBContext.newInstance(EsbMessage.class);
            //从上下文中获取Marshaller对象，用作将bean编组(转换)为xml
            Marshaller ma = jc.createMarshaller();
            //以下是为生成xml做的一些配置
            //格式化输出，即按标签自动换行，否则就是一行输出
            ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //设置编码（默认编码就是utf-8）
            ma.setProperty(Marshaller.JAXB_ENCODING, "GBK");
            //是否省略xml头信息，默认不省略（false）
            ma.setProperty(Marshaller.JAXB_FRAGMENT, false);
            //            ma.marshal(esb, System.out);
            StringWriter writer = new StringWriter();
            ma.marshal(esb, writer);
            xml = writer.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return xml;
    }

    public static <T> T xml2Obj( String xml, Class<T> clazz){
        JAXBContext jc = null;
        try {
            StringReader reader = new StringReader(xml);
            jc = JAXBContext.newInstance(clazz);
            Unmarshaller unma = jc.createUnmarshaller();
            return (T) unma.unmarshal(reader);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

}
