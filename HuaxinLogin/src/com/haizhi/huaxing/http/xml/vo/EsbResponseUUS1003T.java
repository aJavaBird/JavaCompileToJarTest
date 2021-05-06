package com.haizhi.huaxing.http.xml.vo;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ROOT")
@XmlAccessorType(XmlAccessType.FIELD)
public class EsbResponseUUS1003T {

    @XmlElement(name = "RspSvcHeader")
    private RspSvcHeader rspSvcHeader;

    @XmlElement(name = "SvcBody")
    private SvcBodyUUS1003TRes svcBodyUUS1003TRes;

    public RspSvcHeader getRspSvcHeader() {
        return rspSvcHeader;
    }

    public void setRspSvcHeader(RspSvcHeader rspSvcHeader) {
        this.rspSvcHeader = rspSvcHeader;
    }

    public SvcBodyUUS1003TRes getSvcBodyUUS1003TRes() {
        return svcBodyUUS1003TRes;
    }

    public void setSvcBodyUUS1003TRes(SvcBodyUUS1003TRes svcBodyUUS1003TRes) {
        this.svcBodyUUS1003TRes = svcBodyUUS1003TRes;
    }

    @Override
    public String toString() {
        return "EsbResponseUUS1003T{" +
                "rspSvcHeader=" + rspSvcHeader +
                ", svcBodyUUS1003TRes=" + svcBodyUUS1003TRes +
                '}';
    }
}
