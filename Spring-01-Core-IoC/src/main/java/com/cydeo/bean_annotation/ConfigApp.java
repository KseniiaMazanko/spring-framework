package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {

    @Bean(name="p1")//we are passing name to let Spring know which object we need
    FullTimeMentor fullTimeMentor(){

        return new FullTimeMentor();
    }

    //    @Bean(name = "p1")
    @Bean
    @Primary
//primary makes this object default: if I ask for a part time mentor - Spring gives me this one
    PartTimeMentor partTimeMentor(){

        return new PartTimeMentor();
    }

    //    @Bean(name = "p2")
    @Bean
    PartTimeMentor partTimeMentor2(){

        return new PartTimeMentor();
    }


}
