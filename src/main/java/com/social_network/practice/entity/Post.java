package com.social_network.practice.entity;

import org.springframework.stereotype.Component;

@Component
public class Post {

    private long post_id;

    private String content;

    private long user_id;

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
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
}
