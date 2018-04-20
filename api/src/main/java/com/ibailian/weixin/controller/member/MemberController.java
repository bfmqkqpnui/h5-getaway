package com.ibailian.weixin.controller.member;

import com.ibailian.weixin.common.vo.ReturnDTO;
import com.ibailian.weixin.service.IMemberService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MemberController
 * @Description TODO
 * @Author 陆逸飞
 * @Date 2018-04-18 15:54
 * @Version v1.0
 */
@RestController
public class MemberController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private IMemberService memberService;

    @PostMapping("/member/vilidate")
    public ReturnDTO vilidateToken(@RequestBody String token){
        logger.info("会员token校验 开始");
        ReturnDTO dto = new ReturnDTO();
        dto.setSuccess(false);
        if(StringUtils.isNotBlank(token)){
            try {
                dto = memberService.queryMemberInfo(token);
            } catch (Exception e) {
                logger.error("会员token校验失败:",e);
            }
        }
        logger.info("会员token校验 完成,总耗时[]毫秒");
        return dto;
    }
}
