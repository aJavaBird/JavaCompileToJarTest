package com.haizhi.huaxing.http.xml.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SvcBody")
@XmlAccessorType(XmlAccessType.FIELD)
public class SvcBodyUUS1009T extends ParentSvcBody {

    @XmlElement(name = "domainId")
    private String domainId;

    @XmlElement(name = "token")
    private String token;

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
