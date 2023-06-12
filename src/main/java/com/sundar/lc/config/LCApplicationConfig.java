package com.sundar.lc.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.sundar.lc.formatter.AmountFormatter;
import com.sundar.lc.formatter.CreditCardFormatter;
import com.sundar.lc.formatter.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.sundar.lc.controllers")
public class LCApplicationConfig implements WebMvcConfigurer {

	@Bean
	InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource reMessageSource = new ResourceBundleMessageSource();
		reMessageSource.setBasename("message"); 
		return reMessageSource;
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		System.out.println("inside the config file addformatter.");
		registry.addFormatter(new PhoneNumberFormatter());
		registry.addFormatter(new CreditCardFormatter());
     	registry.addFormatter(new AmountFormatter());
	}
	
	@Bean
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean factoryBean=new LocalValidatorFactoryBean();
		factoryBean.setValidationMessageSource(messageSource());
		return factoryBean;
	}

	@Override
	public Validator getValidator() {
		return validator();
	}
	
}
