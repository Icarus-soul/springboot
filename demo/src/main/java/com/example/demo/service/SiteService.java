package com.example.demo.service;

import com.example.demo.domain.Site;

import java.util.List;
import java.util.Map;

public interface SiteService {

  void addSite(Site site);

  void deleteSiteById(String id);

  void updateSite(Site site);

  Site getSiteById(String id);

  List<Site> selectAll();

  List<Map<String, Object>> findPageSite(
      String pageNum, String pageSize, Map<String, Object> param);
}
