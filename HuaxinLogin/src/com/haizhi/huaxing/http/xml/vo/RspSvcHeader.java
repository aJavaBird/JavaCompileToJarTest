package com.haizhi.huaxing.http.xml.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RspSvcHeader {
    private String tranDate;
    private String acctDate;
    private String tranTime;
    private String backendSeqNo;
    private String backendSysId;
    private String globalSeqNo;
    private String returnCode;
    private String returnMsg;
    private String langCode;
    private String rsrvContent;

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }

    public String getAcctDate() {
        return acctDate;
    }

    public void setAcctDate(String acctDate) {
        this.acctDate = acctDate;
    }

    public String getTranTime() {
        return tranTime;
    }

    public void setTranTime(String tranTime) {
        this.tranTime = tranTime;
    }

    public String getBackendSeqNo() {
        return backendSeqNo;
    }

    public void setBackendSeqNo(String backendSeqNo) {
        this.backendSeqNo = backendSeqNo;
    }

    public String getBackendSysId() {
        return backendSysId;
    }

    public void setBackendSysId(String backendSysId) {
        this.backendSysId = backendSysId;
    }

    public String getGlobalSeqNo() {
        return globalSeqNo;
    }

    public void setGlobalSeqNo(String globalSeqNo) {
        this.globalSeqNo = globalSeqNo;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getRsrvContent() {
        return rsrvContent;
    }

    public void setRsrvContent(String rsrvContent) {
        this.rsrvContent = rsrvContent;
    }

    @Override
    public String toString() {
        return "RspSvcHeader{" +
                "tranDate='" + tranDate + '\'' +
                ", acctDate='" + acctDate + '\'' +
                ", tranTime='" + tranTime + '\'' +
                ", backendSeqNo='" + backendSeqNo + '\'' +
                ", backendSysId='" + backendSysId + '\'' +
                ", globalSeqNo='" + globalSeqNo + '\'' +
                ", returnCode='" + returnCode + '\'' +
                ", returnMsg='" + returnMsg + '\'' +
                ", langCode='" + langCode + '\'' +
                ", rsrvContent='" + rsrvContent + '\'' +
                '}';
    }
}
