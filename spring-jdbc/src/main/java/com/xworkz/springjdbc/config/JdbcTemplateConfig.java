package com.xworkz.springjdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class JdbcTemplateConfig {

    public JdbcTemplateConfig()
    {
        System.out.println("JdbcTemplateConfig constructor");
    }

    @Bean
    public DataSource dataSource() {
        System.out.println("data source method");

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/java_connection");
        dataSource.setUsername("root");
        dataSource.setPassword("gowsi@92");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource)
    {
        System.out.println("jdbcTemplate method");
        return new JdbcTemplate(dataSource);
    }
}

