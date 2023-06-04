package com.tedu.exoa.vo;

public interface Code {

    public static final Integer SUCCESS = 200;

    public static final Integer ERROR = 201;

    public static final Integer LOGIN_SUCCESS = 2000;// 认证成功
    public static final Integer LOGIN_FAIL_NOT = 2001;//用户未登录
    public static final Integer LOGIN_FAIL_OVERDUE = 2002; //用户登录失效

}