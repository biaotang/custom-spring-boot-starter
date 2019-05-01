package com.example;

import com.alibaba.fastjson.JSONObject;

public class ShareDemo {

	private String name;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String doSomeThing() {
		return this.toString();
	}
	
	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}
	
}
