package com.sm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


/**
 * This is the configuration class for all the conponents and classes etc used to map using web.xml in xml 
 * based configurations
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= "com.sm.*")
public class AppConfig {
	
	@Bean
	public InternalResourceViewResolver resolve() {
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	

}
