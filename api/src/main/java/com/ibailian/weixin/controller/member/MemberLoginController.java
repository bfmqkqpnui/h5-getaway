package com.ibailian.weixin.controller.member;

import com.ibailian.weixin.common.vo.ReturnDTO;
import com.ibailian.weixin.constants.MemberLoginApiConstans;
import com.ibailian.weixin.service.IMemberLoginService;
import com.ibailian.weixin.utils.CommonUtils;
import com.ibailian.weixin.utils.EncryptUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;
import java.util.Map;

@RestController
public class MemberLoginController {

    private Logger logger = LoggerFactory.getLogger(MemberLoginController.class);

    @Autowired
    private IMemberLoginService memberLoginService;

    @PostMapping(value = "/member/login")
    public ReturnDTO login(@RequestBody Map<String,Object> params){
        logger.info("会员登录 开始");
        long beginTime = System.currentTimeMillis();
        ReturnDTO returnDTO = new ReturnDTO();
        returnDTO.setSuccess(false);
        returnDTO.setMsg("");
        if(CommonUtils.isExist(params)){
            String password = params.get(MemberLoginApiConstans.FILED_INPUT_PASSWORD) == null ? "" : params.get(MemberLoginApiConstans.FILED_INPUT_PASSWORD).toString();
            if(StringUtils.isNotBlank(password)){
                try {
                    String md5Pwd = EncryptUtils.MD5Encrypt(password);
                    if(StringUtils.isNotBlank(md5Pwd)){
                        params.put(MemberLoginApiConstans.FILED_INPUT_PASSWORD,md5Pwd);
                    }
                } catch (NoSuchAlgorithmException e) {
                   logger.error("密码加密失败:",e);
                }
            }
            try {
                returnDTO = memberLoginService.login(params);
            } catch (Exception e) {
                logger.error("会员登录失败:",e);
            }
        }
        logger.info("会员登录完成,总耗时为["+(System.currentTimeMillis()-beginTime)+"]毫秒");
        return returnDTO;
    }
}
