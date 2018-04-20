package com.ibailian.weixin.domain;

import java.io.Serializable;

public class MemberDTO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -6363313666278946112L;
    // 用户Tokran
    private String memberToken;
    // 返回码
    private String resCode;
    // 超时时间
    private String expireIn;
    // 用户id
    private String memberId;
    // 用户姓名
    private String memberName;
    // 是否需要补全信息
    private Boolean needComplete;
    // 是否黑名单
    private Boolean blackAccount;
    // 是否是高危账号
    private Boolean highRisk;
    // 正常或锁定,0正常，1锁定
    private String usableStat;
    // 锁定原因
    private String lockedReason;
    // 错误次数
    private String errorTimes;
    // 剩余次数
    private String remainTimes;
    // 手机号
    private String mobile;
    // 加密手机号
    private String encode_mobile;
    // 昵称
    private String nickName;
    // 是否是新注册用户
    private Boolean newRegFlag;
    // 会员群
    private String[] groupIds;
    // 会员等级ID
    private String memberLevelId;
    // 会员等级Code
    private String memberLevelCode;
    // 新增字段, 用来存第一医药登录后加密后的memberId
    private String aesMId;
    // 新增字段, 用来MP登录后加密后的ToKen
    private String mpTk;
    // 新增字段isSalesman 是否为营销员 0=不是 1=是
    private String isSalesman;
    private String realNameLevel;
    private String avatarUrl;
    private String idFlag;
    private String passportId;
    private String mediaCephUrl;
    private String shellId;
    private String sessionId;
    private String logincode;
    //第三方信息
    private String encode_memberId;


    public String getEncode_memberId() {
        return encode_memberId;
    }

    public void setEncode_memberId(String encode_memberId) {
        this.encode_memberId = encode_memberId;
    }

    public String getRealNameLevel() {
        return realNameLevel;
    }

    public void setRealNameLevel(String realNameLevel) {
        this.realNameLevel = realNameLevel;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getIdFlag() {
        return idFlag;
    }

    public void setIdFlag(String idFlag) {
        this.idFlag = idFlag;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getMediaCephUrl() {
        return mediaCephUrl;
    }

    public void setMediaCephUrl(String mediaCephUrl) {
        this.mediaCephUrl = mediaCephUrl;
    }

    public String getShellId() {
        return shellId;
    }

    public void setShellId(String shellId) {
        this.shellId = shellId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getLogincode() {
        return logincode;
    }

    public void setLogincode(String logincode) {
        this.logincode = logincode;
    }

    public String getAesMId() {
        return aesMId;
    }

    public void setAesMId(String aesMId) {
        this.aesMId = aesMId;
    }

    public String getMemberToken() {
        return memberToken;
    }

    public void setMemberToken(String memberToken) {
        this.memberToken = memberToken;
    }

    public String getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(String expireIn) {
        this.expireIn = expireIn;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Boolean getNeedComplete() {
        return needComplete;
    }

    public void setNeedComplete(Boolean needComplete) {
        this.needComplete = needComplete;
    }

    public Boolean getBlackAccount() {
        return blackAccount;
    }

    public void setBlackAccount(Boolean blackAccount) {
        this.blackAccount = blackAccount;
    }

    public Boolean getHighRisk() {
        return highRisk;
    }

    public void setHighRisk(Boolean highRisk) {
        this.highRisk = highRisk;
    }

    public String getUsableStat() {
        return usableStat;
    }

    public void setUsableStat(String usableStat) {
        this.usableStat = usableStat;
    }

    public String getLockedReason() {
        return lockedReason;
    }

    public void setLockedReason(String lockedReason) {
        this.lockedReason = lockedReason;
    }

    public String getErrorTimes() {
        return errorTimes;
    }

    public void setErrorTimes(String errorTimes) {
        this.errorTimes = errorTimes;
    }

    public String getRemainTimes() {
        return remainTimes;
    }

    public void setRemainTimes(String remainTimes) {
        this.remainTimes = remainTimes;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public Boolean getNewRegFlag() {
        return newRegFlag;
    }

    public void setNewRegFlag(Boolean newRegFlag) {
        this.newRegFlag = newRegFlag;
    }

    public String[] getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(String[] groupIds) {
        this.groupIds = groupIds;
    }

    public String getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(String memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMemberLevelCode() {
        return memberLevelCode;
    }

    public void setMemberLevelCode(String memberLevelCode) {
        this.memberLevelCode = memberLevelCode;
    }

    public String getEncode_mobile() {
        return encode_mobile;
    }

    public void setEncode_mobile(String encode_mobile) {
        this.encode_mobile = encode_mobile;
    }

    public String getMpTk() {
        return mpTk;
    }

    public void setMpTk(String mpTk) {
        this.mpTk = mpTk;
    }

    public String getIsSalesman() {
        return isSalesman;
    }

    public void setIsSalesman(String isSalesman) {
        this.isSalesman = isSalesman;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
