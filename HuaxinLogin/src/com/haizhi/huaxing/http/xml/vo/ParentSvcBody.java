package com.haizhi.huaxing.http.xml.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

// 子类需要配置在父类中加 @XmlSeeAlso
@XmlSeeAlso({ SvcBodyUUS1018T.class, SvcBodyUUS1009T.class, SvcBodyUUS1003T.class, SvcBodyUUS1007T.class })
@XmlAccessorType(XmlAccessType.FIELD)
public class ParentSvcBody {
    @XmlElement(name = "VER")
    private String ver;

    @XmlElement(name = "APP")
    private String app;

    @XmlElement(name = "sysId")
    private String sysId;

    @XmlElement(name = "subUnitno")
    private String subUnitno;

    @XmlElement(name = "templateCode")
    private String templateCode;

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getSubUnitno() {
        return subUnitno;
    }

    public void setSubUnitno(String subUnitno) {
        this.subUnitno = subUnitno;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }
}
