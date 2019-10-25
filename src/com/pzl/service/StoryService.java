package com.pzl.service;

import java.util.List;

import com.pzl.pojo.ArticleInfo;
import com.pzl.pojo.ContentInfo;
import com.pzl.pojo.QueryInfo;
import com.pzl.pojo.Story;

public interface StoryService {
	/**
	 * 查询某个用户的故事
	 * @param username
	 * @return
	 */
	List<Story> selStoryByName(String username);
	/**
	 * 插入一条故事数据
	 * @param story
	 * @return
	 */
	int insOneStory(Story story);
	/**
	 * 根据条件查询故事
	 * @param queryInfo
	 * @return
	 */
	List<ArticleInfo> querylist(QueryInfo queryInfo);
	/**
	 * 根据id查询故事内容
	 * @param id
	 * @return
	 */
	ContentInfo selById(String id);
}
