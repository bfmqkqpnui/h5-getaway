package com.ibailian.weixin.service;

import com.ibailian.weixin.common.vo.ReturnDTO;

import java.util.Map;

/**
 * @ClassName IMemberLoginService
 * @Description TODO 会员登录
 * @Author 陆逸飞
 * @Date 2018-04-18 16:11
 * @Version v1.0
 */
public interface IMemberLoginService {
    ReturnDTO login(Map<String, Object> params);
}
