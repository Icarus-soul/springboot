package com.example.demo.controller;

import com.example.demo.common.ReturnDataNew;
import com.example.demo.common.SysCodeMsg;
import com.example.demo.domain.Site;
import com.example.demo.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/site")
public class SiteController {
  @Autowired private SiteService siteService;

  @RequestMapping("/index")
  public String test() {
    return "index";
  }

  @ResponseBody
  @RequestMapping("/querySite")
  public Site query(@RequestParam String id, HttpServletRequest request) {
    return siteService.getSiteById(id);
  }

  @ResponseBody
  @RequestMapping(
      value = "addSite",
      produces = {"application/json;charset=UTF-8"})
  public ReturnDataNew insert(Site site, HttpServletRequest request) {
    siteService.addSite(site);
    ReturnDataNew returnData = new ReturnDataNew();
    return returnData;
  }

  @ResponseBody
  @RequestMapping("/deleteSite")
  public String delete(@RequestParam String id, HttpServletRequest request) {
    siteService.deleteSiteById(id);
    return "站点删除成功";
  }

  @ResponseBody
  @RequestMapping(
      value = "updateSite",
      produces = {"application/json;charset=UTF-8"})
  public ReturnDataNew update(Site site, HttpServletRequest request) {
    siteService.updateSite(site);
    ReturnDataNew returnData = new ReturnDataNew();
    return returnData;
  }

  @ResponseBody
  @RequestMapping("/siteList")
  public List<Site> list() {
    List<Site> datagridList = siteService.selectAll();
    return datagridList;
  }

  @RequestMapping(
      value = "findPageSite",
      produces = {"application/json;charset=UTF-8"})
  @ResponseBody
  public ReturnDataNew findPageSite(
      @RequestParam String page, @RequestParam String rows, String siteName) {
    ReturnDataNew returnData = new ReturnDataNew();
    List<Map<String, Object>> list = new ArrayList<>();
    try {
      Map<String, Object> param = new HashMap<String, Object>();
      list = siteService.findPageSite(page, rows, param);
      returnData.setPageCurrent(page);
      returnData.setPageTotal(rows);
      returnData.setRows(list);
    } catch (Exception e) {
      returnData.setCode(SysCodeMsg.CODE_10002);
      returnData.setMessage(SysCodeMsg.MSG_10002);
    }
    return returnData;
  }
}
