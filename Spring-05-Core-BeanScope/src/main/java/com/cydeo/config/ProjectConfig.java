package com.cydeo.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.cydeo") //will scan other packages as well
public class ProjectConfig {
}
