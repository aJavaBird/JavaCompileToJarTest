package com.haizhi.huaxing.http.xml.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ROOT")
@XmlAccessorType(XmlAccessType.FIELD)
public class EsbMessage {
    @XmlElement(name = "esbServiceName")
    private String esbServiceName;

    @XmlElement(name = "ReqSvcHeader")
    private ReqSvcHeader reqSvcHeader;

    @XmlElementRef
    private ParentSvcBody svcBody; // 此类型使用了继承，实际使用时使用的是其子类，name 需要在子类型中的XmlRootElement中指定

    public String getEsbServiceName() {
        return esbServiceName;
    }

    public void setEsbServiceName(String esbServiceName) {
        this.esbServiceName = esbServiceName;
    }

    public ReqSvcHeader getReqSvcHeader() {
        return reqSvcHeader;
    }

    public void setReqSvcHeader(ReqSvcHeader reqSvcHeader) {
        this.reqSvcHeader = reqSvcHeader;
    }

    public ParentSvcBody getSvcBody() {
        return svcBody;
    }

    public void setSvcBody(ParentSvcBody svcBody) {
        this.svcBody = svcBody;
    }

}
