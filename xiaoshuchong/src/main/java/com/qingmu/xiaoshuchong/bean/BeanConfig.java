package com.qingmu.xiaoshuchong.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfig {
	@Bean
	public Novel Novel() {
		return new Novel();
	}

}
