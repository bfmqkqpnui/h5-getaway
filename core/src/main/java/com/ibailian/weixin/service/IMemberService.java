package com.ibailian.weixin.service;

import com.ibailian.weixin.common.vo.ReturnDTO;

/**
 * 会员接口
 */
public interface IMemberService {
    /*
    * @Title: queryMemberInfo
    * @Description 会员信息查询 接口
    * @Author 陆逸飞
    * @Date 2018-04-18 17:51
    * @Param [member_token]
    * @Return com.ibailian.weixin.common.vo.ReturnDTO
    */
    ReturnDTO queryMemberInfo(String  member_token);
}
