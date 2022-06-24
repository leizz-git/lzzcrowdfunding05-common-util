package com.lzz.crowd.constant;

import java.util.ArrayList;
import java.util.List;

public enum CrowdConstantEnum {

    ATTR_NAME_EXCEPTION("exception"),
    MESSAGE_LOGIN_FAILED("抱歉！账号密码错误！请重新输入！"),
    MESSAGE_LOGIN_ACCT_ALREADY_IN_USE("抱歉！这个账号已经被使用了！"),
    MESSAGE_ACCESS_FORBIDEN("请登录以后再访问！"),
    MESSAGE_STRING_INVALIDATE("字符串不合法！请不要传入空字符串！"),
    MESSAGE_SYSTEM_ERROR_LOGIN_NOT_UNIQUE("系统错误：登录账号不唯一！");

    //成员变量
    private String info;
    //私有构造方法
    private CrowdConstantEnum(String info){
        this.info = info;
    }

    public String value() {
        return info ;
    }
}
