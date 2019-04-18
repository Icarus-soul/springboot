package com.example.demo.common;

/** 客户端访问返回的基础类-新的返回形式 */
public class ReturnDataNew {
  /** 返回代码 */
  private String code = null;
  /** 返回消息 */
  private String message = null;
  /** 返回的数据 */
  private Object rows = null;

  // 总的条数
  private String total = null;
  // 当前页数
  private String pageCurrent = null;

  public ReturnDataNew() {
    this.code = SysCodeMsg.CODE_20000;
    this.message = SysCodeMsg.MSG_20000;
    this.total = null;
    this.pageCurrent = null;
    this.rows = null;
  }

  public ReturnDataNew(String code, String message, String total, String pageCurrent, Object rows) {
    this.code = code;
    this.message = message;
    this.total = total;
    this.pageCurrent = pageCurrent;
    this.rows = rows;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Object getRows() {
    return rows;
  }

  public void setRows(Object rows) {
    this.rows = rows;
  }

  public String getPageTotal() {
    return total;
  }

  public void setPageTotal(String total) {
    this.total = total;
  }

  public String getPageCurrent() {
    return pageCurrent;
  }

  public void setPageCurrent(String pageCurrent) {
    this.pageCurrent = pageCurrent;
  }

  /** 讲返回数据设置为系统错误状态 */
  public void change2SysError() {
    this.code = SysCodeMsg.CODE_10000;
    this.message = SysCodeMsg.MSG_10000;
  }
}
