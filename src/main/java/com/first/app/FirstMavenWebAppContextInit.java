package com.first.app;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
public class FirstMavenWebAppContextInit implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	public void initialize(ConfigurableApplicationContext applicationContext) {
		 ConfigurableEnvironment environment = applicationContext.getEnvironment();
		 environment.setDefaultProfiles("default");
		
	}

}
