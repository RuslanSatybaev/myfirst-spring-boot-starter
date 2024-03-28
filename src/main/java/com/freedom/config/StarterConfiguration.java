package com.freedom.config;

import com.freedom.service.CopyrightGenService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(StarterProperties.class)
public class StarterConfiguration {

    @Bean
    public CopyrightGenService genService(StarterProperties props) {
        return new CopyrightGenService(props);
    }
}
