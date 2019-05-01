package com.example.springboot.autoconfiguration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.ShareDemo;

@Configuration
@EnableConfigurationProperties(ShareProperties.class)
public class ShareAutoConfiguration {

	@Bean
	public ShareDemo getShare(ShareProperties properties) {
		ShareDemo shareDemo = new ShareDemo();
		shareDemo.setName(properties.getName());
		shareDemo.setAge(properties.getAge());
		return shareDemo;
	}
	
}
