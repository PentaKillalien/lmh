package com.pzl.pojo;

public class ContentInfo {
	private String title;
	private String username;
	private String content;
	private String issuedate;
	private String issuetime;
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
		return "ContentInfo [title=" + title + ", username=" + username + ", content=" + content + ", issuedate="
				+ issuedate + ", issuetime=" + issuetime + "]";
	}
	
}
