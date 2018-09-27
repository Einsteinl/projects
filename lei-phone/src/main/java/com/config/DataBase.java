package com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataBase {
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.url}")
    private  String url;
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Bean
    @Primary
    public DataSource dataSource(){

        DriverManagerDataSource dataSource=new DriverManagerDataSource();

        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClassName);
        return dataSource;

    }
    @Bean
    public JdbcTemplate jdbcTemplate(){

        return new JdbcTemplate(dataSource());

    }

}
