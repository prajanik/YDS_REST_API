package com.yds.api.web.config;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author nikhil
 * @date Mar 26, 2018
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.yds.api.web")
@PropertySources({
	@PropertySource("classpath:env.properties")
})
public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Resource
	private Environment env;
	
    public WebConfig() {
	}

}
