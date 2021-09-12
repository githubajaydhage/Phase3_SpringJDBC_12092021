package com.simplilearn.phase3.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {

	private final String URL = "jdbc:mysql://localhost:3306/ecommerce";
	private final String USER = "root";
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String PASSWORD = "password";
	
	@Bean
	DataSource datasource() {
		DriverManagerDataSource dms = new DriverManagerDataSource();
		dms.setUrl(URL);
		dms.setUsername(USER);
		dms.setDriverClassName(DRIVER);
		dms.setPassword(PASSWORD);
		return dms;
	}
	
}
