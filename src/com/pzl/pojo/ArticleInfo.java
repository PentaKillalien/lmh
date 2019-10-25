package com.pzl.pojo;

public class ArticleInfo {
	private int id;
	private String title;
	private String username;
	private String issuedate;
	private String issuetime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "ArticleInfo [id=" + id + ", title=" + title + ", username=" + username + ", issuedate=" + issuedate
				+ ", issuetime=" + issuetime + "]";
	}
	
}
