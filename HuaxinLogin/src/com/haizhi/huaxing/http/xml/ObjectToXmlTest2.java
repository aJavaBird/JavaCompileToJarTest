package com.haizhi.huaxing.http.xml;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.haizhi.huaxing.http.util.Uuid;
import com.haizhi.huaxing.http.xml.vo.EsbMessage;
import com.haizhi.huaxing.http.xml.vo.ReqSvcHeader;
import com.haizhi.huaxing.http.xml.vo.SvcBodyUUS1009T;

public class ObjectToXmlTest2 {
    public static void main(String args[]) {
        EsbMessage esb = getTestEsbMessage();
        JAXBContext jc = null;
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
            System.out.println(writer.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static EsbMessage getTestEsbMessage() {
        ReqSvcHeader header = new ReqSvcHeader();
        header.setConsumerId("CRM");
        header.setTranCode("001009");
        String seqNo = Uuid.get16UUID("HAIZHI");
        header.setTranSeqNo(seqNo);
        header.setGlobalSeqNo(seqNo);

        SvcBodyUUS1009T svcBody = new SvcBodyUUS1009T();
        svcBody.setVer("1.0");
        svcBody.setApp("HAIZHI");
        svcBody.setSysId("000001");
        svcBody.setSubUnitno("AMLS");
        svcBody.setTemplateCode("801001");
        svcBody.setDomainId("yw.xie");
        svcBody.setToken("845B39B3EA9BB5545493F6F13C7F4DFE");

        EsbMessage esb = new EsbMessage();
        esb.setEsbServiceName("UUS1009T");
        esb.setReqSvcHeader(header);
        esb.setSvcBody(svcBody);
        return esb;
    }
}
