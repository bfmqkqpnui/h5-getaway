package com.emall.weixin.service.serviceImpl;

import com.emall.weixin.api.ApiBuildPath;
import com.emall.weixin.constants.ApiCommonConstans;
import com.emall.weixin.service.IMemberLoginService;
import com.emall.weixin.utils.CommonUtils;
import com.emall.weixin.common.vo.ReturnDTO;
import com.emall.weixin.utils.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @ClassName MemberLoginServiceImpl
 * @Description TODO
 * @Author 陆逸飞
 * @Date 2018-04-18 16:11
 * @Version v1.0
 */
@Component
public class MemberLoginServiceImpl implements IMemberLoginService {

    private Logger logger = LoggerFactory.getLogger(MemberLoginServiceImpl.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ApiBuildPath api;

}
