package com.springcore.alternateofxml10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfigwithBean {
	
//	first it will create object of WithoutComponentAnnotation class and then return that object
//	then @Bean annotation inject dependency to that WithoutComponentAnnotation class object
//	whenever we use @Bean annotation then no need to write @Componentscan annotation
//	spring container automatic inject dependency to that particular class
	
	
	@Bean
//	we can give any beanname and any number of name using @Bean(name={"","","",......})
	public WithoutComponentAnnotation getWithoutComponentAnnotation() {
		WithoutComponentAnnotation wca = new WithoutComponentAnnotation();
		return wca;
	}
}
