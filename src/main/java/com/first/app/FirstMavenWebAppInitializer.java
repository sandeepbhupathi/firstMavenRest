package com.first.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class FirstMavenWebAppInitializer implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext ();
        applicationContext.register(FirstMavenWebAppConfig.class);
        
        servletContext.addListener(new ContextLoaderListener(applicationContext));
        servletContext.setInitParameter("contextInitializerClasses", "com.first.app.FirstMavenWebAppContextInit");
        
        ServletRegistration.Dynamic registration = servletContext
                .addServlet("rootDispatcher", new DispatcherServlet(applicationContext));
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
        
    }
}
