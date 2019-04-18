package com.example.demo.dao;

import com.example.demo.domain.Site;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface SiteMapper {
  @Delete("delete from site where id=#{id}")
  int deleteByPrimaryKey(Integer id);

  @Insert(
      "INSERT INTO site(id, sitename, companyid,companyname, lng, lat,addr, state) VALUES(#{id}, #{sitename}, #{companyid}, #{companyname}, #{lng}, #{lat}, #{addr}, #{state})")
  int insert(Site record);

  @Select("SELECT * FROM site WHERE id = #{id}")
  Site selectByPrimaryKey(@Param("id") Integer id);

  @Select("select * from site")
  List<Site> selectAll();

  @Update("update site set sitename=#{sitename},addr=#{addr} where id=#{id}")
  int updateByPrimaryKey(Site record);

  @Select("select * from site")
  List<Map<String, Object>> findPageSite(Map<String, Object> param);
}
