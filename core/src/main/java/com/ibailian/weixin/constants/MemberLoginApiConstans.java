package com.ibailian.weixin.constants;

public class MemberLoginApiConstans extends ApiCommonConstans {
    //用户登录名
    public static final String FILED_INPUT_LOGIN_ID = "loginId";
    //用户密码
    public static final String FILED_INPUT_PASSWORD = "password";
    //登陆方式：code代表短信验证码方式，pwd代表密码验证方式
    public static final String FILED_INPUT_LOGIN_TYPE = "loginType";
    //用户token
    public static final String FILED_RETURN_MEMBER_TOKEN = "member_token";
    //超时时间
    public static final String FILED_RETURN_EXPIRE_IN = "expire_in";
    //用户id
    public static final String FILED_RETURN_MEMBER_ID = "member_id";
    //用户名称
    public static final String FILED_RETURN_MEMBER_NAME = "member_name";
    //是否需要补用户信息
    public static final String FILED_RETURN_NEED_COMPLETE = "need_complete";
    //是否黑名单
    public static final String FILED_RETURN_BLACK_ACCOUNT = "black_account";
    //是否是高危账号
    public static final String FILED_RETURN_HIGH_RISK = "high_risk";
    //正常或锁定,0正常，1锁定
    public static final String FILED_RETURN_USABLE_STAT = "usable_stat";
    //锁定原因
    public static final String FILED_RETURN_LOCKED_REASON = "locked_reason";
    //错误次数
    public static final String FILED_RETURN_ERROR_TIMES = "error_times";
    //剩余次数
    public static final String FILED_RETURN_REMAIN_TIMES = "remain_times";
    //是否是新注册用户
    public static final String FILED_RETURN_NEW_REG_FLAG = "newRegFlag";
    //手机号
    public static final String FILED_RETURN_MOBILE = "mobile";
    //加密手机号
    public static final String FILED_RETURN_ENCODE_MOBILE = "encode_mobile";
    //昵称
    public static final String FILED_RETURN_NICK_NAME = "nickName";
    //会员群
    public static final String FILED_RETURN_GROUP_IDS = "groupIds";
    //会员等级ID
    public static final String FILED_RETURN_MEMBER_LEVEL = "memberLevel";
    //会员等级code
    public static final String FILED_RETURN_MEMBER_LEVEL_CODE = "memberLevelCode";
    //用户对象
    public static final String FILED_RETURN_MEMBER_OBJ = "obj";
    //loginType,登陆方式：code代表短信验证码方式，
    public static final String VALUE_LOGIN_TYPE_CODE = "code";
    //pwd代表密码验证方式
    public static final String VALUE_LOGIN_TYPE_PWD = "pwd";
    //应用名称
    public static final String VALUE_LOGIN_APP_NAME = "i百联";
    // 登录错误信息
    public static final String VALUE_LOGIN_TYPE_WRONG = "登陆方式出错.";
    //新增是否为营销员 0=不是  1=是
    public static final String FILED_RETURN_IS_SALESMAN = "isSalesman";
    //session
    public static final String SESSION_ID = "sessionId";
    //passportId
    public static final String PASSPORT_ID = "passportId";
}
