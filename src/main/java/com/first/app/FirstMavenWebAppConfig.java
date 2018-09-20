package com.first.app;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"com.first.app.*"})
@EnableWebMvc
@EnableTransactionManagement
@Import(FirstMavenWebAppHibernateConfig.class)
public class FirstMavenWebAppConfig {
	
    @Bean
    PropertyPlaceholderConfigurer getPropertyPlaceholder(){
        PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer();
        propertyPlaceholderConfigurer.setLocation(new FileSystemResource(this.getClass().getClassLoader().
                getResource("firstMavenRest.properties").getPath()));

        return propertyPlaceholderConfigurer;

    }
}
