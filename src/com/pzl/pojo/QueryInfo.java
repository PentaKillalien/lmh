package com.pzl.pojo;

public class QueryInfo {
	private String storyType;
	private String province;
	private String city;
	private String county;
	private String storySeason;
	public String getStoryType() {
		return storyType;
	}
	public void setStoryType(String storyType) {
		this.storyType = storyType;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getStorySeason() {
		return storySeason;
	}
	public void setStorySeason(String storySeason) {
		this.storySeason = storySeason;
	}
	@Override
	public String toString() {
		return "QueryInfo [storyType=" + storyType + ", province=" + province + ", city=" + city + ", county=" + county
				+ ", storySeason=" + storySeason + "]";
	}
	
}
