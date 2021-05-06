package com.haizhi.huaxing.http;

import com.haizhi.huaxing.http.util.EsbRequestUtil;
import com.haizhi.huaxing.http.util.Obj2XmlUtil;
import com.haizhi.huaxing.http.util.Uuid;
import com.haizhi.huaxing.http.xml.vo.*;

public class HttpRequestUUS1007TTest {
    public static void main(String args[]) {

        // 拼装发送的测试报文数据
        EsbMessage esb = getTestEsbMessage();

        System.out.println("--------------------------------------");
        System.out.println("令牌申请接口:UUS1007T 测试开始~");

        String ip = "10.1.89.195";
        Integer port = 9807;

        String xml = EsbRequestUtil.getTcpXml(esb);
        System.out.println("即将向地址 "+ip+",port="+ port +" 发送报文: \n"+xml);
        String resultXml = HttpRequest.sendTcp(ip, port,xml);
        System.out.println("tcp调用返回报文如下: \n"+resultXml);
        EsbResponseUUS1007T resp = Obj2XmlUtil.xml2Obj(resultXml.substring(8), EsbResponseUUS1007T.class);
        System.out.println("转换为对象如下: \n"+resp);
        Boolean isSuccess = EsbRequestUtil.isTcpSuccess(resultXml);
        System.out.println("tcp调用isSuccess: "+isSuccess);
        if(isSuccess){
            System.out.println("获得用户【"+((SvcBodyUUS1007T)esb.getSvcBody()).getDomainId()+"】的token为: "+resp.getSvcBodyUUS1007TRes().getToken());
        }

        System.out.println("令牌申请接口:UUS1007T 测试结束~");
        System.out.println("--------------------------------------");

    }

    private static EsbMessage getTestEsbMessage() {
        ReqSvcHeader header = new ReqSvcHeader();
        header.setConsumerId("KGS"); // 三位系统简称，图平台的是kgs，需要填大写
        header.setTranCode("001007"); // 交易码，不同的接口交易码不同
        String seqNo = Uuid.get16UUID("HAIZHI"); // 机器码，自定义，不要超过 7位就行
        header.setTranSeqNo(seqNo); // 自己生成的id，只要不重复就行，长度不超过32位
        header.setGlobalSeqNo(seqNo); // 自己生成的id，只要不重复就行，长度不超过32位
        header.setChannel("1001"); // 项目的渠道号（四位数字），每个项目可能不一样

        SvcBodyUUS1007T svcBody = new SvcBodyUUS1007T();
        svcBody.setVer("1.0"); // 版本号
        svcBody.setApp("知识图谱系统"); // 应用名称，发起方系统简称，当前是【知识图谱系统】
        svcBody.setSysId("000001"); // 系统标识，默认填“000001”
        svcBody.setSubUnitno("KGSS"); // 四位系统简称
        svcBody.setTemplateCode("801001"); // 模板代码，默认填 801001
        svcBody.setDomainId("y.song"); // 用户名

        EsbMessage esb = new EsbMessage();
        esb.setEsbServiceName("UUS1007T"); // Esb接口service名称
        esb.setReqSvcHeader(header);
        esb.setSvcBody(svcBody);
        return esb;
    }

}
