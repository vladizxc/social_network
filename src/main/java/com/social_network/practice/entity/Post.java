package com.social_network.practice.entity;

import jakarta.persistence.Entity;
import org.springframework.stereotype.Component;

@Entity
public class Post {

    private long postId;

    private String content;

    private long userId;

    public Post(){}

    public Post(String content){
        if(content.isEmpty()) throw new IllegalArgumentException();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getUser_id() {
        return userId;
    }

    public void setUser_id(long userId) {
        this.userId = userId;
    }
}
