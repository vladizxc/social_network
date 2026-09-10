package com.social_network.practice.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class User {

    private long id;

    private String name;
    private ArrayList<Post> posts;
    private ArrayList<Comment> comments;

    public User() {}

    public User(String name) {
        if(name.isEmpty()) throw new IllegalArgumentException();
        this.name = name;
        this.posts = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }
}
