package com.mycompany.mayapp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.mycompany.mayapp.*")
public class ApplicationConfiguration {
	
	/*@Bean
	ViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}*/

}
