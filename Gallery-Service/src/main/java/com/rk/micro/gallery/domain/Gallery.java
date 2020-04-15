package com.rk.micro.gallery.domain;

import java.util.List;

public class Gallery {
	
	private int id;
	private List<Object> list;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}

}
