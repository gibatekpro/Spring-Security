package com.gibatekpro.spring_secure.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.logging.Logger;

@Configuration
@EnableWebMvc
@EnableAspectJAutoProxy
@EnableTransactionManagement
@ComponentScan("com.gibatekpro.spring_secure")
@PropertySource({"/resources"})
public class AppConfig {

    //Initialize logger
    private Logger logger = Logger.getLogger(getClass().getName());

    //Initialize Environment
    @Autowired
    Environment environment;

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix("/WEB-INF/view");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

}
