package com.jdbc.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = { "com.jdbc.withoutxml.dao" })
public class JavaConfig {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dms = new DriverManagerDataSource();
		dms.setDriverClassName("com.mysql.jdbc.Driver");
		dms.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dms.setUsername("root");
		dms.setPassword("1232587");
		return dms;
		
	}
	@Bean("jdbctemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(getDataSource());
		return jt;
	}
	
	
//	----------------if we use autowiring then no need to write this stuff---------------------
//	@Bean(name={"studentdao","studentdaoimpl"})
//	public StudentDao getStudentDao() {
//		StudentDaoImpl std = new StudentDaoImpl();
//		std.setJdbctemplate(getJdbcTemplate());
//		return std;		
//		
//	}
	
	
}
