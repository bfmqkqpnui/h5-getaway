package com.emall.weixin.service.serviceImpl;

import com.bailian.util.BailianBuildSign;
import com.emall.weixin.constants.MemberLoginApiConstans;
import com.emall.weixin.utils.DateUtils;
import com.emall.weixin.api.ApiBuildPath;
import com.emall.weixin.common.vo.ReturnDTO;
import com.emall.weixin.service.IMemberService;
import com.emall.weixin.utils.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName MemberServiceImpl
 * @Description TODO
 * @Author 陆逸飞
 * @Date 2018-04-18 17:40
 * @Version v1.0
 */
@Component
public class MemberServiceImpl implements IMemberService {
    private Logger logger = LoggerFactory.getLogger(MemberLoginServiceImpl.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ApiBuildPath apiBuildPath;

    @Override
    public ReturnDTO queryMemberInfo(String member_token) {
        logger.info("会员token校验业务开始");
        long beginTime = System.currentTimeMillis();
        ReturnDTO dto = new ReturnDTO();
        dto.setSuccess(false);
        if (StringUtils.isNotBlank(member_token)) {
            String url = apiBuildPath.getQueryBaseInfo();
            Map<String, String> param = new ConcurrentHashMap<String, String>();
            param.put(MemberLoginApiConstans.FILED_INPUT_MEMBER_TOKEN, member_token);
            param.put(MemberLoginApiConstans.FILED_INPUT_SYSID, MemberLoginApiConstans.VALUE_INPUT_SYSID);
            String timestamp = DateUtils.formatDate2Str(DateUtils.DATE_TIME_PATTON_3);
            param.put(MemberLoginApiConstans.FILED_INPUT_TIMESTAMP, timestamp);

            String sign = BailianBuildSign.getSign(param);
            param.put(MemberLoginApiConstans.FILED_INPUT_SIGN, sign);
            logger.info("会员token验证，url={},params={}", url, JsonUtils.object2JsonString(param));
            dto = this.restTemplate.postForObject(url, param, ReturnDTO.class);
            logger.info("会员token验证，result={}", JsonUtils.object2JsonString(dto));
        }
        logger.info("会员token校验业务完成,总耗时[" + (System.currentTimeMillis() - beginTime) + "]毫秒");
        return dto;
    }
}
