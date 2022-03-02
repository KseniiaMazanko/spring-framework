package com.cydeo.repository;

import com.cydeo.model.Comment;
import org.springframework.stereotype.Component;

@Component//because this class is being injected in CommentService
public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
