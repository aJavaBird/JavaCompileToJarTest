package com.haizhi.huaxing.http.xml.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SvcBody")
@XmlAccessorType(XmlAccessType.FIELD)
public class SvcBodyUUS1007TRes {

    private String employeeId;
    private String domainId;
    private String tellerNo;
    private String token;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getTellerNo() {
        return tellerNo;
    }

    public void setTellerNo(String tellerNo) {
        this.tellerNo = tellerNo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "SvcBodyUUS1007TRes{" +
                "employeeId='" + employeeId + '\'' +
                ", domainId='" + domainId + '\'' +
                ", tellerNo='" + tellerNo + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
