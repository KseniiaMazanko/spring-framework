package com.cydeo.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//if we dont put this one Spring will not know where to look for beans, COnfiguration tells Spring where to look for Beans
//@ComponentScan//this one looks for components (alternative to Beans), we put @Component on top of classes
@ComponentScan(basePackages = "com.cydeo")//will go outside the package
public class ConfigCourse {
}

//if the class is not your class (Integer, Spring etc) you can only use Bean, otherwise - you should use @Component
