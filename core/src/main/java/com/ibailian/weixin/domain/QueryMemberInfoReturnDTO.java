package com.ibailian.weixin.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Title: QueryMemberInfoReturnDTO
 * Description:会员信息查询 返回参数
 * @author IBMer
 * @date 2014年12月11日
 */
public class QueryMemberInfoReturnDTO implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1088790941780553865L;
	public String provinceName;//省名 ;;;
	public String cityName;//市名 ;;;
	public String districtName;//区名 ;;;
	public String address;//地址   ;;;  null,
    public String memo;//备注  ;;;  null,
    public String memberId;//会员ID ;;; 184,
    public String province;//所在省 ;;; null,
    public String city;//所在城市;;; null,
    public String district;//所在区域 ;;; null,
    public String contry;//国籍;;; null,
    public String districtSubInfo;//区域杂项;;; null,
    public String districtDesc;//区域说明;;;  null,
    public String postCode;//邮政编码;;; null,
    public String createTime;//创建时间;;; null,
    public String updateTime;//更新时间;;; null,
    public String certType;//个人证件类型;;; null,
    public String certCode;//个人证件证号;;; null,
    public String memberName;//会员真实姓名;;; null,
    public String email;//邮箱;;; "942bc@163.com",
    public String creator;//创建者;;; null,
    public String loginCode;// ;;;"942bc",
	public String mobile;//手机号;;; null,
    public String loginPasswd;//登陆密码 ";;;222222",
    public String nickName;//昵称;;; null,
    public String custType;//客户性质;;; null,
    public String gender;//性别;;; null,
    public String birthType;//生日类型;;; null,
    public String birthYear;//出生年份;;; 0,
    public String birthMonth;//出生阳历月份 ;;;0,
    public String birthDay;//出生阳历日;;; 0,
    public String birtyLunarMonth;//出生阴历月份;;; 0,
    public String birthLunarDay;//出生阴历日 ;;;0,
    public String marriageStatus;//婚否;;; null,
    public String eduLevel;// 文化程度;;;null,
    public String industry;//行业;;; null,
    public String title;//职务;;; null,
    public String tel;//固定电话;;; null,
    public String companyName;//公司名称;;; null,
    public String companyAddress;//公司地址;;; null,
    public String companyPostCode;//公司邮编;;; null,
    public String companyCode;//企业代码;;; null,
    public String companyLicense;//公司营业执照;;; null,
    public String companySize;//公司规模;;; null,
    public String companyTel;//公司电话;;; null,
    public String companyFax;//传真电话;;; null,
    public String companyTaxCode;// 企业税号;;;null,
    public String companyBank;//开户银行;;; null,
    public String companyBankAcct;//银行帐号;;; null,
    public String registerTime;//注册时间;;; null,
    public String channelId;//或取渠道;;; null,
    public String regType;//登记类型;;; null,
    public String orgId;//入会业态组织ID;;; null,
    public String introMemberId;//介绍人会员ID;;; null,
    public String accountMgrId;//专属服务经理ID;;; null,
    public String familyMemberNum;//家庭人口;;; 0,
    public String incomeLevel;//月收入水平;;; null,
    public String childRenNum;//子女人数;;; 0,
    public String childBirth1;//子女生日1;;; null,
    public String childGender1;//子女性别1;;; null,
    public String childBirth2;//子女生日2;;; null,
    public String childGender2;//子女性别2;;; null,
    public String memberType;//会员类型;;; null,
    public String cardFlag;//实体卡领取标记;;; null,
    public String cardFetchTime;//最后领卡时间;;; null,
    public String memberStatus;// null,
    public String updator;// null,
    public String checker;// null,
    public String checkTime;// null,
    public String auditor;// null,
    public String auditTime;// null,
    public String avatarUrl;//头像url地址;;; null,
    public String weiboId;//微博ID;;; null,
    public String weixinId;//微信ID;;; null,
    public String qq;//QQ号;;; null,
    public String carlicense;//车牌号;;; null,
    public String alipayId;//支付宝账号id;;; null
    
    public String mobileBindFlag;//是否已绑定手机号，0未绑定，1 已绑定
    public String emailBindFlag;//是否已绑定邮箱，0未绑定，1 已绑定
    public String memberLevelId;//会员等级Id
    public String pwdFlag;//实体卡是否设置了登录密码，0未设置 ，1 已设置
    //会员等级Code
  	private String memberLevelCode;
  	//会员密码强度
  	private String pwdStrength;
  	//民族
  	private String nation;
  	//星座
  	private String constellation;
  	//星座
  	private String hobby;
  	//车牌
  	private List<Map<String, String>> carlicenses;
  	//存放token 
  	private String membertoken;
  	
  	
    

    public String getMembertoken() {
		return membertoken;
	}
	public void setMembertoken(String membertoken) {
		this.membertoken = membertoken;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getPwdFlag() {
		return pwdFlag;
	}
	public void setPwdFlag(String pwdFlag) {
		this.pwdFlag = pwdFlag;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
	public String getDistrictSubInfo() {
		return districtSubInfo;
	}
	public void setDistrictSubInfo(String districtSubInfo) {
		this.districtSubInfo = districtSubInfo;
	}
	public String getDistrictDesc() {
		return districtDesc;
	}
	public void setDistrictDesc(String districtDesc) {
		this.districtDesc = districtDesc;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertCode() {
		return certCode;
	}
	public void setCertCode(String certCode) {
		this.certCode = certCode;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getLoginCode() {
		return loginCode;
	}
	public void setLoginCode(String loginCode) {
		this.loginCode = loginCode;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLoginPasswd() {
		return loginPasswd;
	}
	public void setLoginPasswd(String loginPasswd) {
		this.loginPasswd = loginPasswd;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthType() {
		return birthType;
	}
	public void setBirthType(String birthType) {
		this.birthType = birthType;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	public String getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getBirtyLunarMonth() {
		return birtyLunarMonth;
	}
	public void setBirtyLunarMonth(String birtyLunarMonth) {
		this.birtyLunarMonth = birtyLunarMonth;
	}
	public String getBirthLunarDay() {
		return birthLunarDay;
	}
	public void setBirthLunarDay(String birthLunarDay) {
		this.birthLunarDay = birthLunarDay;
	}
	public String getMarriageStatus() {
		return marriageStatus;
	}
	public void setMarriageStatus(String marriageStatus) {
		this.marriageStatus = marriageStatus;
	}
	public String getEduLevel() {
		return eduLevel;
	}
	public void setEduLevel(String eduLevel) {
		this.eduLevel = eduLevel;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyPostCode() {
		return companyPostCode;
	}
	public void setCompanyPostCode(String companyPostCode) {
		this.companyPostCode = companyPostCode;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyLicense() {
		return companyLicense;
	}
	public void setCompanyLicense(String companyLicense) {
		this.companyLicense = companyLicense;
	}
	public String getCompanySize() {
		return companySize;
	}
	public void setCompanySize(String companySize) {
		this.companySize = companySize;
	}
	public String getCompanyTel() {
		return companyTel;
	}
	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}
	public String getCompanyFax() {
		return companyFax;
	}
	public void setCompanyFax(String companyFax) {
		this.companyFax = companyFax;
	}
	public String getCompanyTaxCode() {
		return companyTaxCode;
	}
	public void setCompanyTaxCode(String companyTaxCode) {
		this.companyTaxCode = companyTaxCode;
	}
	public String getCompanyBank() {
		return companyBank;
	}
	public void setCompanyBank(String companyBank) {
		this.companyBank = companyBank;
	}
	public String getCompanyBankAcct() {
		return companyBankAcct;
	}
	public void setCompanyBankAcct(String companyBankAcct) {
		this.companyBankAcct = companyBankAcct;
	}
	public String getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getRegType() {
		return regType;
	}
	public void setRegType(String regType) {
		this.regType = regType;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getIntroMemberId() {
		return introMemberId;
	}
	public void setIntroMemberId(String introMemberId) {
		this.introMemberId = introMemberId;
	}
	public String getAccountMgrId() {
		return accountMgrId;
	}
	public void setAccountMgrId(String accountMgrId) {
		this.accountMgrId = accountMgrId;
	}
	public String getFamilyMemberNum() {
		return familyMemberNum;
	}
	public void setFamilyMemberNum(String familyMemberNum) {
		this.familyMemberNum = familyMemberNum;
	}
	public String getIncomeLevel() {
		return incomeLevel;
	}
	public void setIncomeLevel(String incomeLevel) {
		this.incomeLevel = incomeLevel;
	}
	public String getChildRenNum() {
		return childRenNum;
	}
	public void setChildRenNum(String childRenNum) {
		this.childRenNum = childRenNum;
	}
	public String getChildBirth1() {
		return childBirth1;
	}
	public void setChildBirth1(String childBirth1) {
		this.childBirth1 = childBirth1;
	}
	public String getChildGender1() {
		return childGender1;
	}
	public void setChildGender1(String childGender1) {
		this.childGender1 = childGender1;
	}
	public String getChildBirth2() {
		return childBirth2;
	}
	public void setChildBirth2(String childBirth2) {
		this.childBirth2 = childBirth2;
	}
	public String getChildGender2() {
		return childGender2;
	}
	public void setChildGender2(String childGender2) {
		this.childGender2 = childGender2;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public String getCardFlag() {
		return cardFlag;
	}
	public void setCardFlag(String cardFlag) {
		this.cardFlag = cardFlag;
	}
	public String getCardFetchTime() {
		return cardFetchTime;
	}
	public void setCardFetchTime(String cardFetchTime) {
		this.cardFetchTime = cardFetchTime;
	}
	public String getMemberStatus() {
		return memberStatus;
	}
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}
	public String getUpdator() {
		return updator;
	}
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	public String getChecker() {
		return checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}
	public String getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}
	public String getAuditor() {
		return auditor;
	}
	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}
	public String getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(String auditTime) {
		this.auditTime = auditTime;
	}
	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	public String getWeiboId() {
		return weiboId;
	}
	public void setWeiboId(String weiboId) {
		this.weiboId = weiboId;
	}
	public String getWeixinId() {
		return weixinId;
	}
	public void setWeixinId(String weixinId) {
		this.weixinId = weixinId;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getCarlicense() {
		return carlicense;
	}
	public void setCarlicense(String carlicense) {
		this.carlicense = carlicense;
	}
	public String getAlipayId() {
		return alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}
	public String getMobileBindFlag() {
		return mobileBindFlag;
	}
	public void setMobileBindFlag(String mobileBindFlag) {
		this.mobileBindFlag = mobileBindFlag;
	}
	public String getEmailBindFlag() {
		return emailBindFlag;
	}
	public void setEmailBindFlag(String emailBindFlag) {
		this.emailBindFlag = emailBindFlag;
	}
	public String getMemberLevelId() {
		return memberLevelId;
	}
	public void setMemberLevelId(String memberLevelId) {
		this.memberLevelId = memberLevelId;
	}
	public String getMemberLevelCode() {
		return memberLevelCode;
	}
	public void setMemberLevelCode(String memberLevelCode) {
		this.memberLevelCode = memberLevelCode;
	}
	public String getPwdStrength() {
		return pwdStrength;
	}
	public void setPwdStrength(String pwdStrength) {
		this.pwdStrength = pwdStrength;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getConstellation() {
		return constellation;
	}
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public List<Map<String, String>> getCarlicenses() {
		return carlicenses;
	}
	public void setCarlicenses(List<Map<String, String>> carlicenses) {
		this.carlicenses = carlicenses;
	}
    
    
    
	
}
