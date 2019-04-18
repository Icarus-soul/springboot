package com.example.demo.service.impl;

import com.example.demo.dao.SiteMapper;
import com.example.demo.domain.Site;
import com.example.demo.service.SiteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SiteServiceImpl implements SiteService {
  @Resource private SiteMapper siteMapper;

  @Override
  public void addSite(Site site) {
    siteMapper.insert(site);
  }

  @Override
  public void deleteSiteById(String id) {
    siteMapper.deleteByPrimaryKey(Integer.valueOf(id));
  }

  @Override
  public void updateSite(Site site) {
    siteMapper.updateByPrimaryKey(site);
  }

  @Override
  public Site getSiteById(String id) {
    return siteMapper.selectByPrimaryKey(Integer.valueOf(id));
  }

  @Override
  public List<Site> selectAll() {
    return siteMapper.selectAll();
  }

  @Override
  public List<Map<String, Object>> findPageSite(
      String pageNum, String pageSize, Map<String, Object> param) {
    int start = (Integer.valueOf(pageNum) - 1) * Integer.valueOf(pageSize);
    param.put("start", start);
    param.put("end", Integer.valueOf(pageSize));
    List<Map<String, Object>> row = siteMapper.findPageSite(param);
    return row;
  }
}
