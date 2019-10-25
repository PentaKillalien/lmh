package com.pzl.service.impl;

import java.util.List;

import com.pzl.mapper.StoryMapper;
import com.pzl.pojo.ArticleInfo;
import com.pzl.pojo.ContentInfo;
import com.pzl.pojo.QueryInfo;
import com.pzl.pojo.Story;
import com.pzl.service.StoryService;

public class StoryServiceImpl implements StoryService{
	private StoryMapper storyMapper;
	
	
	public StoryMapper getStoryMapper() {
		return storyMapper;
	}


	public void setStoryMapper(StoryMapper storyMapper) {
		this.storyMapper = storyMapper;
	}


	@Override
	public List<Story> selStoryByName(String username) {
		return storyMapper.selStoryByName(username);
	}


	@Override
	public int insOneStory(Story story) {
		// TODO Auto-generated method stub
		return storyMapper.insOneStory(story);
	}


	@Override
	public List<ArticleInfo> querylist(QueryInfo queryInfo) {
		// TODO Auto-generated method stub
		return storyMapper.querylist(queryInfo);
	}


	@Override
	public ContentInfo selById(String id) {
		// TODO Auto-generated method stub
		return storyMapper.selById(id);
	}

}
