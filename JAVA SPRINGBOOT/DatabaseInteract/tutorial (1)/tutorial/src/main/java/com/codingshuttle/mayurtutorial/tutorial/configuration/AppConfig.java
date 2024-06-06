package com.codingshuttle.mayurtutorial.tutorial.configuration;

import com.codingshuttle.mayurtutorial.tutorial.DB;
import com.codingshuttle.mayurtutorial.tutorial.DevDB;
import com.codingshuttle.mayurtutorial.tutorial.ProdDB;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(name = "project.mode",havingValue = "production")
    public DB getProdDBBean(){
        return new ProdDB();
    }

    @Bean
    @ConditionalOnProperty(name = "project.mode",havingValue = "development")
    public DB getDevDBBean(){
        return new DevDB();
    }

    @Bean
    public ModelMapper getModelMapper(){     // ModelMapper :- used for conversion from one type to another
        return new ModelMapper();           // As we needed frequently to convert from DTO to entity and vice versa.
    }
}
