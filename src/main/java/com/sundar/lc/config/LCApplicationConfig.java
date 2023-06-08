package com.sundar.lc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.sundar.lc.controllers")
public class LCApplicationConfig {

	@Bean
     InternalResourceViewResolver viewResolver() {
    	 InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
    	 viewResolver.setPrefix("/WEB-INF/view/");
    	 viewResolver.setSuffix(".jsp");
    	 return viewResolver;
     }
	
}
