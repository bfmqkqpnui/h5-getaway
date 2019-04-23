package com.emall.weixin.constants;

public class ApiCommonConstans {
	// 是否成功
	public static final String FILED_RETURN_SUCCESS = "success";
	// 返回内容
	public static final String FILED_RETURN_MSG = "msg";
	// 错误信息
	public static final String FILED_RETURN_ERR_MSG = "errmsg";
	// //错误编码
	// public static final String FILED_RETURN_ERRORCODE="errorCode";
	// 返回编码
	public static final String FILED_RETURN_RESCODE = "resCode";
	// 返回对象
	public static final String FILED_RETURN_OBJ = "obj";

	// 返回编码
	public static final String FILED_RETURN_RESULTCODE = "resultCode";
	// 返回记录
	public static final String FILED_RETURN_RESULTINFO = "resultInfo";
	// 返回状态码
	public static final String FILED_RETURN_STATUSCODE = "statusCode";
	// 返回状态码 200 值
	public static final String FILED_RETURN_STATUSCODE_VALUE200 = "200";

	// 每页显示行数
	public static final String FILED_INPUT_PAGE_SIZE = "pageSize";
	// 当前第几页
	public static final String FILED_INPUT_PAGE_NUM = "pageNum";

	// 会员渠道（注册时）
	public static final String FILED_INPUT_CHANNELID = "channelId";
	// 微信渠道的值，2
	public static final String VALUE_INPUT_CHANNELID = "2";

	// 时间戳，格式为YYYYMMDD24HHMISS,必传
	public static final String FILED_INPUT_TIMESTAMP = "timeStamp";
	// 短信验证码,必传
	public static final String FILED_INPUT_SMS_CODE = "smsCode";
	// 系统标识码,必传
	public static final String FILED_INPUT_SYSID = "sysid";
	// 签名sign
	public static final String FILED_INPUT_SIGN = "sign";

	// 签名sign
	public static final String FILED_INPUT_CHANNEL = "channel";

	// 六大业态
	public static final String FILED_INPUT_SHOP_TYPE = "shopType";
	// 门店id
	public static final String FILED_INPUT_SHOP_ID = "storeCode";

	// 门店id
	public static final String FILED_INPUT_STORE_ID = "storeId";

	// 业态id
	public static final String FILED_BU_ID = "buid";

	public static final String FILED_INPUT_MEMBER_TOKEN = "member_token";

	public static final String FILED_INPUT_SEARCH_TYPE = "searchType";

	// 二级分类
	public static final String FILED_INPUT_TYPE = "type";

	// 返回列表
	public static final String FILED_RETURN_LIST = "list";
	// 返回值列表
	public static final String FILED_RETURN_LAYERNO_LIST = "layerNoList";
	// 返回一级分类结果集
	public static final String FILED_RETURN_STORE_CLASSFY_LIST = "BizTypeList";
	// 返回二级分类结果集
	public static final String FILED_RETURN_STORE_SEC_CLASSFY_LIST = "levelSecList";
	// 系统标识码,示例值 1
	public static final String VALUE_INPUT_SYSID = "1104";
	public static final String VALUE_INPUT_SYSID_APP = "1103";
	// 接口返回结果标识，true为成功，false为失败
	public static final Boolean VALUE_RETURN_SUCCESS_TRUE = true;
	// 接口返回结果标识，true为成功，false为失败
	public static final Boolean VALUE_RETURN_SUCCESS_FALSE = false;

	// 接口返回结果标识，true为成功，false为失败
	public static final String VALUE_RETURN_SUCCESS_TRUE_STR = "1";
	// 接口返回结果标识，true为成功，false为失败
	public static final String VALUE_RETURN_SUCCESS_FALSE_STR = "0";

	// 调用接口成功的返回码
	public static final String VALUE_RETURN_SUCCESS_RES_CODE = "00100000";

	// 调用接口返回码--输入账号已存在！
	public static final String VALUE_RETURN_LOGIN_NO_EXISTENT_RES_CODE = "05111008";

	// 百货
	public static final String VALUE_SHOP_TYPE_DEPARTMENT_STORES = "1010";
	// 浙江联华
	public static final String VALUE_SHOP_TYPE_ZJLIANHUA_7010 = "7010";
	// 浙江联华
	public static final String VALUE_SHOP_TYPE_ZJLIANHUA_7020 = "7020";
	// 浙江联华
	public static final String VALUE_SHOP_TYPE_ZJLIANHUA_7030 = "7030";
	// 浙江联华
	public static final String VALUE_SHOP_TYPE_ZJLIANHUA_7040 = "7040";
	// 浙江联华
	public static final String VALUE_SHOP_TYPE_ZJLIANHUA_7050 = "7050";
	// 浙江联华
	public static final String VALUE_SHOP_TYPE_ZJLIANHUA_7060 = "7060";
	// 浙江联华
	public static final String VALUE_SHOP_TYPE_ZJLIANHUA_7070 = "7070";
	// 浙江联华
	public static final String VALUE_SHOP_TYPE_ZJLIANHUA_7080 = "7080";
				
	// 购物中心
	public static final String VALUE_SHOP_TYPE_SHOPING_MALL = "1020";
	// 奥特莱斯
	public static final String VALUE_SHOP_TYPE_OUTLETS = "1030";
	// 六大业态-快客
	public static final String VALUE_SHOP_TYPE_QUICK = "2030";
	// 六大业态-标超
	public static final String VALUE_SHOP_TYPE_LIANHUA = "2020";
	// 六大业态-大卖场
	public static final String VALUE_SHOP_TYPE_CENTURY_LIANHUA = "2010";
	// 分页参数总记录数
	public static final String FILED_RETURN_TOTAL_COUNT = "count";

	// 精选活动中查询条件 分类ID9999051503 (就)9999051099 最新9999070320 9999078494
	public static final String SIFT_GOODS_ID_C = "9999078494";

	// 全球购妈妈宝贝页面目录ID
	public static final String SIFT_GLOBAL_MM = "9999079987";

	// 全球购美妆个护页面目录ID
	public static final String SIFT_GLOBAL_MZ = "9999079988";

	// 全球购全球美食页面目录ID
	public static final String SIFT_GLOBAL_MS = "9999079989";

	// 全球购意大利页面目录ID
	public static final String SIFT_GLOBAL_YD = "9999079984";

	// 全球购美澳新页面目录ID
	public static final String SIFT_GLOBAL_MX = "9999079985";

	// 全球购日韩
	public static final String SIFT_GLOBAL_RH = "9999079986";

	// 全球购全精选页面目录ID
	public static final String SIFT_GLOBAL_QQ = "9999079989";

	// 全球购总节点
	public static final String SIFT_GLOBAL_INDEX = "9999078518";

	// 默认精选商品搜索条数
	public static final Integer SIFT_GOODS_PAGE = 50;

	// 微信渠道
	public static final String VALUE_H5_CHANNELID = "2";

	// APP渠道
	public static final String VALUE_H5_CHANNELID_APP = "1";

	// 级别categoryType
	public static final String VALUE_H5_LEV = "1";

	// 目录类型1：展示目录 2：页面目录
	public static final String VALUE_H5_CATEGORYTYPE = "2";

	// 请求IP地址clientRequestTime
	public static final String VALUE_H5_CLIENTIP = "clientIp";

	// 人人营销
	public static final String VALUE_INPUT_AD_CHANNEL_EVERY_BODY_SALE = "001";

	// 请求时间
	public static final String VALUE_H5_REQUEST_TIME = "clientRequestTime";

	// 请求的系统编号
	public static final String VALUE_H5_SYSTEMNO = "06";
	public static final String VALUE_H5_SYSTEM_NO = "systemNo";
	//传给中间件的渠道
	public static final String CHN_h5_FLG = "chnflg";
	public static final String CHN_h5_FLG_No = "1";
	//系统标识
	public static final String SYS_ID = "sysid";
	public static final String SYS_ID_NO = "1";
	// 分页页数
	public static final String VALUE_H5_PAGENO = "pageNo";
	public static final String VALUE_H5_PAGESIZE = "pageSize";

	// 参数中分页信息
	public static final String VALUE_H5_PAGE_MODEL = "pageModel";

	// 排序参数 排序字段（pri、defSort、crd）
	public static final String VALUE_H5_PAGE_SORCOL = "sorCol";
	// 排序方式
	public static final String VALUE_H5_PAGE_SORTYE = "sorTye";

	// 渠道类别
	public static final String VALUE_H5_PAGE_CHANNELSID = "channelSid";

	// 门店ID
	public static final String VALUE_H5_PAGE_SHOPID = "shopId";

	// 商户ID
	public static final String VALUE_H5_PAGE_MERCHANTID = "merchantId";

	// 过滤条件
	public static final String VALUE_H5_PAGE_SEARCHINFO = "searchInfo";

	// 请求参数requestData
	public static final String VALUE_H5_PAGE_REQUESTDATA = "requestData";

	// 会员签到接口 系统编码 sysid
	public static final String VALUE_WINXIN_CHECKIN_SYS_ID = "2";

	// 会员签到渠道 channelId
	public static final String VALUE_WINXIN_CHECKIN_CHANNEL_ID = "2";

	// 签到渠道线上 或线下，线上1 线下2
	public static final String VALUE_WEIXIN_CHECKIN_CHANNEL_LINE_OFF = "2";

	// 卖场编号
	public static final String VALUE_INPUT_FLASH_CODE = "actCode";
	/**
	 * 随机参团编号
	 */
	public static final String GROUP_ACTIVITY_LIST = "groupActivityList";
	/**
	 * 商品编号
	 */
	public static final String GOODSSID = "goodsSid";
	/**
	 * 团编号
	 */
	public static final String GROUPACTIVITYNO = "groupActivityNo";
	/**
	 * 团售价
	 */
	public static final String GROUPBUYPRICE = "groupBuyPrice";
	/**
	 * 团活动编号
	 */
	public static final String GROUPNO = "groupNo";
	/**
	 * 会员头像
	 */
	public static final String HEADPICURL = "headPicUrl";
	/**
	 * 1 开团人	2 参团
	 */
	public static final String ISOPNER = "isOpner";
	/**
	 * 会员编号
	 */
	public static final String MEMBERID = "memberId";
	/**
	 * 会员昵称
	 */
	public static final String MEMBERNICKNAME = "memberNickName";
	/**
	 * 会员电话
	 */
	public static final String MEMBERPHONENO = "memberPhoneNo";
	/**
	 * 参团
	 */
	public static final String JOINGROUP = "0";
	/**
	 * 开团
	 */
	public static final String OPENGROUP = "1";
	
	/**
	 * prd  MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAsOrk5dTqjKLFLLKzitI90eJqBxAaKPgCB1Ej/0xMVHjhBbcC+3Zq8N5RenkL04++RbbCbpIyY1DcLvxDqp1kDQIDAQABAkA8AeBTyG0p+IeyioZ1fqwzRX27GY4V+VEO1EnGbUWynKEv5xp5Mk/vT84F3p3WBSEzdJzTeDD4I31lvM7mfOhhAiEA1Qzjacn/ApWqYIRq4KaPRLGXMNApyOvzGxz8SPWojNkCIQDUlUNfg+R0q/WiGZlw4LSc/yAJqmta6spq5r3bFzegVQIhALZHI56UExkcAbw4LtTrzDHim09JGibsMH+nCfZGL6HpAiACdJrrnoVkB5x1u9/22tGbQqMnGW3WBgJCi9nDjxgYZQIgR3tqTHv1Y+HzKdEW1Hqba1lap/gcRv8P+J0Dkoy41ws=
	 * sit  MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAs6mgjcqXTewBiG3vy4T+RM4rQ6jMoIfPkvce3Eqyi70LWX9+1NPK/F5dPM36natmY/BYfRt3UfrxUoxnnbuFZwIDAQABAkAvw2XSrExjQ934djms4pNymVj5KNQVzWVKzfXfXOBws4NIT5IAWOYpXHBwrCGulI+LYBfbcXOUdLvlNKy8jTl5AiEA9gjEmPhZY7p5CtlMWtTexjbVsLtyKFp/zUNRZ+vRJfUCIQC68J+1+iyyt8zRA2O7odvU0qwz84pR82gI1XaJXf0IawIgL84YVRi8VbJf3onGWkfOWXlCICrrzYd4Gawg3y5k3xkCIQCOnbBalqevGMXq11ko9kzNyoORhsUJzFacFq4+EjROTQIgWUu6XK/j6qZTn97XIhbCAyGF5eFKk4zRBdmIScxkc2I=
	 * 安付宝支付私钥
	 */
	public static final String ANFUBAOPRIVATEKEY="MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAsOrk5dTqjKLFLLKzitI90eJqBxAaKPgCB1Ej/0xMVHjhBbcC+3Zq8N5RenkL04++RbbCbpIyY1DcLvxDqp1kDQIDAQABAkA8AeBTyG0p+IeyioZ1fqwzRX27GY4V+VEO1EnGbUWynKEv5xp5Mk/vT84F3p3WBSEzdJzTeDD4I31lvM7mfOhhAiEA1Qzjacn/ApWqYIRq4KaPRLGXMNApyOvzGxz8SPWojNkCIQDUlUNfg+R0q/WiGZlw4LSc/yAJqmta6spq5r3bFzegVQIhALZHI56UExkcAbw4LtTrzDHim09JGibsMH+nCfZGL6HpAiACdJrrnoVkB5x1u9/22tGbQqMnGW3WBgJCi9nDjxgYZQIgR3tqTHv1Y+HzKdEW1Hqba1lap/gcRv8P+J0Dkoy41ws=";
}
