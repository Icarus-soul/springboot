package com.example.demo.common;

public class SysCodeMsg {
  public static final String CODE_10000 = "10000";
  public static final String CODE_10001 = "10001";
  public static final String CODE_10002 = "10002";
  public static final String CODE_10003 = "10003";
  public static final String CODE_10004 = "10004";
  public static final String CODE_10005 = "10005";
  public static final String CODE_10006 = "10006";
  public static final String CODE_10007 = "10007";
  public static final String CODE_10008 = "10008";
  public static final String CODE_10009 = "10009";
  public static final String CODE_10101 = "10101";
  public static final String CODE_10102 = "10102";

  public static final String CODE_20000 = "20000";
  public static final String CODE_20001 = "20001";

  public static final String MSG_10000 = "系统错误";
  public static final String MSG_10001 = "无操作权限";
  public static final String MSG_10002 = "未登录或登录超时";
  public static final String MSG_10003 = "用户名或密码为空";
  public static final String MSG_10004 = "用户名或密码错误";
  public static final String MSG_10005 = "必填参数未填";
  public static final String MSG_10006 = "参数不符合规定";
  public static final String MSG_10007 = "%1$s 参数不能为空";
  public static final String MSG_10008 = "用户ID不存在";
  public static final String MSG_10009 = "%1$s 不存在";
  public static final String MSG_10101 = "部门名称已存在";
  public static final String MSG_10102 = "用户名已存在";

  public static final String MSG_20000 = "成功";
  public static final String MSG_20001 = "失败";

  public static final ReturnDataNew SYSTEM_ERROR =
      new ReturnDataNew(SysCodeMsg.CODE_10000, SysCodeMsg.MSG_10000, null, null, null);
}
