package org.example.bookapptestingdemo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AppConfig {
    @Bean
    @Qualifier("mysqldatasource")
    @ConfigurationProperties(prefix = "spring.ds.mysql")
    public DataSource mysqldatasource() {
        return DataSourceBuilder.create().build();
    }

}
