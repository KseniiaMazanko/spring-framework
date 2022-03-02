package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class Java {

    //@Autowired //1st way field injection - not recommended
    OfficeHours officeHours;

    /*@Autowired // constructor injection - after version 4.3 we dont have to add @Autowired anymore, it will work without it (added as lombok)
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
     */

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours: " +   (20 + officeHours.getHours()));


    }

}
