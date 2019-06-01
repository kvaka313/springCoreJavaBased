package com.infopulse.configuration;

import com.infopulse.beans.ExternalBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.infopulse.beans")
public class AutoConfiguration {

    @Bean
    public ExternalBean externalBean(){
        return new ExternalBean(200);
    }
}
