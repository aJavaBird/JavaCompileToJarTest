package com.haizhi.huaxing.http.xml.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ROOT")
@XmlAccessorType(XmlAccessType.FIELD)
public class EsbResponseUUS1007T {

    @XmlElement(name = "RspSvcHeader")
    private RspSvcHeader rspSvcHeader;

    @XmlElement(name = "SvcBody")
    private SvcBodyUUS1007TRes svcBodyUUS1007TRes;

    public RspSvcHeader getRspSvcHeader() {
        return rspSvcHeader;
    }

    public void setRspSvcHeader(RspSvcHeader rspSvcHeader) {
        this.rspSvcHeader = rspSvcHeader;
    }

    public SvcBodyUUS1007TRes getSvcBodyUUS1007TRes() {
        return svcBodyUUS1007TRes;
    }

    public void setSvcBodyUUS1007TRes(SvcBodyUUS1007TRes svcBodyUUS1007TRes) {
        this.svcBodyUUS1007TRes = svcBodyUUS1007TRes;
    }

    @Override
    public String toString() {
        return "EsbResponseUUS1007T{" +
                "rspSvcHeader=" + rspSvcHeader +
                ", svcBodyUUS1007TRes=" + svcBodyUUS1007TRes +
                '}';
    }
}
