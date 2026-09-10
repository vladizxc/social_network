package com.social_network.practice.entity;

import org.springframework.stereotype.Component;

@Component
public class Comment {

    private long comment_id;

    private String text;

    private long user_id;

    private long post_id;

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
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getPost_id() {
        return post_id;
    }

    public void setPost_id(long post_id) {
        this.post_id = post_id;
    }

    public long getComment_id() {
        return comment_id;
    }
}
