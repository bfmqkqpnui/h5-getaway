package com.emall.weixin.common.vo;

import java.io.Serializable;

public class ReturnDTO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 4744725659892347560L;
    // 接口返回结果标识，true为成功，false为失败 (基于业务是否异常来判断)
    private boolean success;
    // 错误返回时的错误描述;
    private String msg;
    // 返回码
    private String resCode;
    // 如果成功的话,返回的对象
    private Object obj;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }


}
