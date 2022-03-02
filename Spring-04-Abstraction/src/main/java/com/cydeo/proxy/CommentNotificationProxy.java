package com.cydeo.proxy;

import com.cydeo.model.Comment;

//no component for interface
public interface CommentNotificationProxy {
    void sendComment(Comment comment);

}
