package com.haizhi.huaxing.http.xml.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SvcBody")
@XmlAccessorType(XmlAccessType.FIELD)
public class SvcBodyUUS1018T extends ParentSvcBody {

    @XmlElement(name = "userNo")
    private String userNo;

    @XmlElement(name = "passWord")
    private String passWord;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
