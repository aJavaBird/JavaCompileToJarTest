package com.haizhi.huaxing.http.xml.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ReqSvcHeader {
    private String consumerId="";

    private String tranCode="";

    private String tranSeqNo="";

    private String globalSeqNo="";

    private String tranDate = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());

    private String tranTime = new java.text.SimpleDateFormat("HHmmss").format(new java.util.Date());

    private String tranTellerNo="";

    private String branchId="";

    private String acctDate="";

    private String sourceSysId="";

    private String terminalCode="";

    private String cityCode="";

    private String authrTellerNo="";

    private String reviewAuthrTellerNo="";

    private String authrTellerSeqNo="";

    private String authrPwd="";

    private String userId="";

    private String orgId="";

    private String extendContent="";

    private String channel="";

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    public String getTranSeqNo() {
        return tranSeqNo;
    }

    public void setTranSeqNo(String tranSeqNo) {
        this.tranSeqNo = tranSeqNo;
    }

    public String getGlobalSeqNo() {
        return globalSeqNo;
    }

    public void setGlobalSeqNo(String globalSeqNo) {
        this.globalSeqNo = globalSeqNo;
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranTime() {
        return tranTime;
    }

    public void setTranTime(String tranTime) {
        this.tranTime = tranTime;
    }

    public String getTranTellerNo() {
        return tranTellerNo;
    }

    public void setTranTellerNo(String tranTellerNo) {
        this.tranTellerNo = tranTellerNo;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getAcctDate() {
        return acctDate;
    }

    public void setAcctDate(String acctDate) {
        this.acctDate = acctDate;
    }

    public String getSourceSysId() {
        return sourceSysId;
    }

    public void setSourceSysId(String sourceSysId) {
        this.sourceSysId = sourceSysId;
    }

    public String getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAuthrTellerNo() {
        return authrTellerNo;
    }

    public void setAuthrTellerNo(String authrTellerNo) {
        this.authrTellerNo = authrTellerNo;
    }

    public String getReviewAuthrTellerNo() {
        return reviewAuthrTellerNo;
    }

    public void setReviewAuthrTellerNo(String reviewAuthrTellerNo) {
        this.reviewAuthrTellerNo = reviewAuthrTellerNo;
    }

    public String getAuthrTellerSeqNo() {
        return authrTellerSeqNo;
    }

    public void setAuthrTellerSeqNo(String authrTellerSeqNo) {
        this.authrTellerSeqNo = authrTellerSeqNo;
    }

    public String getAuthrPwd() {
        return authrPwd;
    }

    public void setAuthrPwd(String authrPwd) {
        this.authrPwd = authrPwd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getExtendContent() {
        return extendContent;
    }

    public void setExtendContent(String extendContent) {
        this.extendContent = extendContent;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
