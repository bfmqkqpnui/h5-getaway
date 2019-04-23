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

    /*
    * @Title: login
    * @Description 用户登录业务实现
    * @Author 陆逸飞
    * @Date 2018-04-18 16:50
    * @Param [params]
    * @Return ReturnDTO
    */
    @Override
    public ReturnDTO login(Map<String, Object> params) {
        ReturnDTO dto = new ReturnDTO();
        dto.setSuccess(false);
        if (CommonUtils.isExist(params)) {
            String path = api.getMemberLoginPath();
            logger.info("会员登录，url={},params={}", path, JsonUtils.object2JsonString(params));
            dto = this.restTemplate.postForObject(api.getMemberLoginPath(), params, ReturnDTO.class);
            logger.info("会员登录，result={}", JsonUtils.object2JsonString(dto.getObj()));
            if (StringUtils.isNotBlank(dto.getResCode()) && StringUtils.equals(ApiCommonConstans.VALUE_RETURN_SUCCESS_RES_CODE, dto.getResCode())) {
                dto.setSuccess(true);
            }
        }
        return dto;
    }
}
