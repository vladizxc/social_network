package com.social_network.practice.entity;

import jakarta.persistence.Entity;
import org.springframework.stereotype.Component;

@Entity
public class Comment {

    private long commentId;

    private String text;

    private long userId;

    private long postId;

    public Comment(){}

    public Comment(String text){
        if(text.isEmpty()) throw new IllegalArgumentException();
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getUser_id() {
        return userId;
    }

    public void setUser_id(long userId) {
        this.userId = userId;
    }

    public long getPost_id() {
        return postId;
    }

    public void setPost_id(long postId) {
        this.postId = postId;
    }

    public long getComment_id() {
        return commentId;
    }
}
