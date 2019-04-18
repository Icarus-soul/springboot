package com.example.demo.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 通用分页模型-新
 *
 * @author
 */
public class PageInfoNew {
  /** 总条数 */
  private int totalRow;
  /** 当前页 */
  private int pageCurrent;
  /** 当前页详细数据 */
  private int pageSize;

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  private List list = new ArrayList();

  public int getTotalRow() {
    return totalRow;
  }

  public void setTotalRow(int totalRow) {
    this.totalRow = totalRow;
  }

  public int getPageCurrent() {
    return pageCurrent;
  }

  public void setPageCurrent(int pageCurrent) {
    this.pageCurrent = pageCurrent;
  }

  public List getList() {
    return list;
  }

  public void setList(List list) {
    this.list = list;
  }

  @Override
  public String toString() {
    return "PageInfo [totalRow="
        + totalRow
        + ", pageCurrent="
        + pageCurrent
        + ", list="
        + list
        + "]";
  }
}
