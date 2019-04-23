package com.emall.weixin.api;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "defaultCoustom")
public class ApiBuildPath {
    //会员登录地址
    private String memberLoginPath;
    //会员信息查询地址
    private String queryBaseInfo;

    public String getQueryBaseInfo() {
        return queryBaseInfo;
    }

    public void setQueryBaseInfo(String queryBaseInfo) {
        this.queryBaseInfo = queryBaseInfo;
    }

    public String getMemberLoginPath() {
        return memberLoginPath;
    }

    public void setMemberLoginPath(String memberLoginPath) {
        this.memberLoginPath = memberLoginPath;
    }
}
