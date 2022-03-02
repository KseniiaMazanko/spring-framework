package com.cydeo.model;

import lombok.Data;

//pojos are NOT component so model will not have @Component
@Data
public class Comment {

    private String author;
    private String text;

}
