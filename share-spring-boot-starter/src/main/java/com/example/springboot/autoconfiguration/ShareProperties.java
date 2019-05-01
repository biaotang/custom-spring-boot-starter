package com.example.springboot.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.study")
public class ShareProperties {

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
		return "从配置中读取到结果：【name=" + name + ",age=" + age + "】";
	}
	
}
