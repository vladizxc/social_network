package com.social_network.practice.entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long commentId;

    @Column(name = "content")
    private String text;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "fk_post_id")
    private Post post;

    public Comment(){}

    public Comment(String text, LocalDateTime created_at, User user, Post post){
        if(text.isEmpty()) throw new IllegalArgumentException();
        if(user == null) throw new IllegalArgumentException();
        if(post == null) throw new IllegalArgumentException();
        this.createdAt = created_at;
        this.text = text;
        this.user = user;
        this.post = post;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public long getComment_id() {
        return commentId;
    }

    public LocalDateTime getCreated_at() {
        return createdAt;
    }
}
