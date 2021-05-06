package com.haizhi.huaxing.http;

import com.haizhi.huaxing.http.util.EsbRequestUtil;
import com.haizhi.huaxing.http.util.Obj2XmlUtil;
import com.haizhi.huaxing.http.util.Uuid;
import com.haizhi.huaxing.http.xml.vo.*;

public class HttpRequestUUS1003TTest {
    public static void main(String args[]) {

        EsbMessage esb = getTestEsbMessage();

        System.out.println("--------------------------------------");
        System.out.println("用户查询接口:UUS1003T 测试开始~");

        String url = "http://10.1.89.195:9807";
        String ip = "10.1.89.195";
        Integer port = 9807;

//        EsbRequestUtil.sendXmlPost(esb,url);

//        EsbRequestUtil.sendXmlTcp(esb,ip,port);
        String xml = EsbRequestUtil.getTcpXml(esb);
        System.out.println("即将向地址 "+ip+",port="+ port +" 发送报文: \n"+xml);
        String resultXml = HttpRequest.sendTcp(ip, port,xml);
        System.out.println("tcp调用返回报文如下: \n"+resultXml);
        EsbResponseUUS1003T resp = Obj2XmlUtil.xml2Obj(resultXml.substring(8), EsbResponseUUS1003T.class);
        System.out.println("转换为对象如下: \n"+resp);
        Boolean isSuccess = EsbRequestUtil.isTcpSuccess(resultXml);
        System.out.println("tcp调用isSuccess: "+isSuccess);

        System.out.println("用户查询接口:UUS1003T 测试结束~");
        System.out.println("--------------------------------------");

    }

    private static EsbMessage getTestEsbMessage() {
        ReqSvcHeader header = new ReqSvcHeader();
        header.setConsumerId("KGS"); // 三位系统简称，图平台的是kgs，需要填大写
        header.setTranCode("001003"); // 交易码，不同的接口交易码不同
        String seqNo = Uuid.get16UUID("HAIZHI");
        header.setTranSeqNo(seqNo); // 自己生成的id，只要不重复就行，长度不超过32位
        header.setGlobalSeqNo(seqNo); // 自己生成的id，只要不重复就行，长度不超过32位
        header.setChannel("1001"); // 项目的渠道号（四位数字），每个项目可能不一样

        SvcBodyUUS1003T svcBody = new SvcBodyUUS1003T();
        svcBody.setVer("1.0"); // 版本号
        svcBody.setApp("知识图谱系统"); // 应用名称，发起方系统简称，当前是【知识图谱系统】
        svcBody.setSysId("000001"); // 系统标识，默认填“000001”
        svcBody.setSubUnitno("KGSS"); // 四位系统简称
        svcBody.setTemplateCode("801001"); // 模板代码，默认填 801001
        svcBody.setDomainId("yw.xie"); // 用户名

        EsbMessage esb = new EsbMessage();
        esb.setEsbServiceName("UUS1003T"); // Esb接口service名称
        esb.setReqSvcHeader(header);
        esb.setSvcBody(svcBody);
        return esb;
    }

}
