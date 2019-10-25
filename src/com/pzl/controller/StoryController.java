package com.pzl.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pzl.pojo.ArticleInfo;
import com.pzl.pojo.ContentInfo;
import com.pzl.pojo.QueryInfo;
import com.pzl.pojo.Story;
import com.pzl.service.impl.StoryServiceImpl;

@Controller
public class StoryController {
	@Resource
	private StoryServiceImpl ssi;
	@RequestMapping("userstorylist")
	@ResponseBody
	public List<Story> UserStoryList(String username){
		System.out.println(username);
		List<Story> list = ssi.selStoryByName(username);
		for (Story story : list) {
			story.setContent(story.getContent().replaceAll(" ","&nbsp;").replaceAll("\r","<br/>"));
		}
		return list;
	}
	@RequestMapping("content")
	public ModelAndView Content(String content,String title,String username,String storyType,String province,String city,String county,String storySeason){
		  ModelAndView mav = new ModelAndView("redirect:/myself_work.jsp");
		  Story story = new Story(); 
		  story.setS_type(storyType);
		  story.setS_province(province);
		  story.setS_city(city);
		  story.setS_county(county);
		  story.setS_season(storySeason);
		  story.setTitle(title);
		  story.setUsername(username); 
		  story.setContent(content);
		  ssi.insOneStory(story);
		  
		  return mav;
	}
	@RequestMapping("querylist")
	@ResponseBody
	public List<ArticleInfo> QueryList(String storyType,String province,String city,String county,String storySeason) {
		System.out.println(storyType);
		System.out.println(province);
		System.out.println(city);
		System.out.println(county);
		System.out.println(storySeason);
		QueryInfo queryinfo  = new QueryInfo();
		queryinfo.setCity(city);
		queryinfo.setCounty(county);
		queryinfo.setProvince(province);
		queryinfo.setStorySeason(storySeason);
		queryinfo.setStoryType(storyType);
		List<ArticleInfo> querylist = ssi.querylist(queryinfo);
		
		return querylist;
	}
	@RequestMapping("showbyid")
	public String showById(@RequestParam(value="id")String id,HttpSession httpSession) {
		ContentInfo content = ssi.selById(id);
		content.setContent(content.getContent().replaceAll(" ","&nbsp;").replaceAll("\r","<br/>"));
		httpSession.setAttribute("content", content);
		return "otherself_show";
	}
	
}
