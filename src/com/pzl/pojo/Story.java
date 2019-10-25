package com.pzl.pojo;


public class Story {
	private int id;
	private String s_type;
	private String s_province;
	private String s_city;
	private String s_county;
	private String s_season;
	private String title;
	private String username;
	private String content;
	private String issuedate;
	private String issuetime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getS_type() {
		return s_type;
	}
	public void setS_type(String s_type) {
		this.s_type = s_type;
	}
	public String getS_province() {
		return s_province;
	}
	public void setS_province(String s_province) {
		this.s_province = s_province;
	}
	public String getS_city() {
		return s_city;
	}
	public void setS_city(String s_city) {
		this.s_city = s_city;
	}
	public String getS_county() {
		return s_county;
	}
	public void setS_county(String s_county) {
		this.s_county = s_county;
	}
	public String getS_season() {
		return s_season;
	}
	public void setS_season(String s_season) {
		this.s_season = s_season;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	public String getIssuetime() {
		return issuetime;
	}
	public void setIssuetime(String issuetime) {
		this.issuetime = issuetime;
	}
	@Override
	public String toString() {
		return "Story [id=" + id + ", s_type=" + s_type + ", s_province=" + s_province + ", s_city=" + s_city
				+ ", s_county=" + s_county + ", s_season=" + s_season + ", title=" + title + ", username=" + username
				+ ", content=" + content + ", issuedate=" + issuedate + ", issuetime=" + issuetime + "]";
	}
	
	
}
