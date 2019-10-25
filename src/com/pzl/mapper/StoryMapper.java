package com.pzl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.pzl.pojo.ArticleInfo;
import com.pzl.pojo.ContentInfo;
import com.pzl.pojo.QueryInfo;
import com.pzl.pojo.Story;

public interface StoryMapper {
	@Select("select * from story where username=#{0} order by id desc")
	List<Story> selStoryByName(String username);
	@Insert("insert into story values(default,#{s_type},#{s_province},#{s_city},#{s_county},#{s_season},#{title},#{username},#{content},curdate(),curtime())")
	int insOneStory(Story story);
	@SelectProvider(type= StoryDaoProvider.class,method="querylist")
	List<ArticleInfo> querylist(QueryInfo queryInfo);
	
	class StoryDaoProvider{
		public String querylist(QueryInfo queryInfo) {
			String sql = "select id,title,username,issuedate,issuetime from story where 1=1";
			if(!queryInfo.getStoryType().equals("全部")) {
				sql += " and s_type='"+queryInfo.getStoryType()+"'";
			}
			if(!queryInfo.getProvince().equals("省份")) {
				sql += " and s_province='"+queryInfo.getProvince()+"'";
			}
			if(!queryInfo.getCity().equals("地级市")){
				sql += " and s_city='"+queryInfo.getCity()+"'";
			}
			if(!queryInfo.getCounty().equals("市、县级市")) {
				sql += " and s_county='"+queryInfo.getCounty()+"'";
			}
			if(!queryInfo.getStorySeason().equals("全部")) {
				sql += " and s_season='"+queryInfo.getStorySeason()+"'";
			}
			sql +=" order by id desc";	
			
			return sql;
		}
	}
	@Select("select title,username,content,issuedate,issuetime from story where id=#{0}")
	ContentInfo selById(String id);
}
