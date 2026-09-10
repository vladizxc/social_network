package com.social_network.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Entity
@Table(name="users")
public class User {
    @Id
    private long userId;

    @Column(name = "username")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    private ArrayList<Post> posts;
    private ArrayList<Comment> comments;

    public User() {}

    public User(String name, String email, String password) {
        if(name.isEmpty()) throw new IllegalArgumentException();
        if(email.isEmpty()) throw new IllegalArgumentException();
        if(password.isEmpty()) throw new IllegalArgumentException();
        this.name = name;
        this.posts = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public long getId() {
        return userId;
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
