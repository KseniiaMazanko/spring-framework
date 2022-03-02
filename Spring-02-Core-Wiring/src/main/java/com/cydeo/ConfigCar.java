package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }

    /*
    //Direct wiring
    @Bean
    Person person(){
        Person p =new Person();
        p.setName("Mike");
        p.setCar(car());//direct wiring calling the method from method
        return p;
    }
     */

    //Autowiring
    @Bean
    Person person(Car car){
        Person p =new Person();
        p.setName("Mike");
        p.setCar(car);//autowiring - when we are passing it as a parameter and just call it
        return p;
    }

}
