package com.haizhi.huaxing.http.xml.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SvcBody")
@XmlAccessorType(XmlAccessType.FIELD)
public class SvcBodyUUS1003T extends ParentSvcBody {

    @XmlElement(name = "domainId")
    private String domainId="";

    @XmlElement(name = "employeeId")
    private String employeeId="";

    @XmlElement(name = "tellerNo")
    private String tellerNo="";

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getTellerNo() {
        return tellerNo;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setTellerNo(String tellerNo) {
        this.tellerNo = tellerNo;
    }
}
