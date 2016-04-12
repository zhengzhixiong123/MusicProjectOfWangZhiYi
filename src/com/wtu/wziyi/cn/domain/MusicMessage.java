package com.wtu.wziyi.cn.domain;

import java.io.Serializable;

public class MusicMessage implements Serializable{

	private String name;
	private String date;
	private String length;
	private String creater;//创作者
	private String category;//附加信息
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public MusicMessage(String name, String date, String length,
			String creater, String category) {
		super();
		this.name = name;
		this.date = date;
		this.length = length;
		this.creater = creater;
		this.category = category;
	}
	
	public MusicMessage(){}
	@Override
	public String toString() {
		return "MusicMessage [name=" + name + ", date=" + date + ", length="
				+ length + ", creater=" + creater + ", category=" + category
				+ "]";
	}
	
	
}
