package com.social_network.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    private long commentId;

    @Column(name = "content")
    private String text;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    private long userId;

    private long postId;

    public Comment(){}

    public Comment(String text, LocalDateTime created_at){
        if(text.isEmpty()) throw new IllegalArgumentException();
        this.text = text;
        this.createdAt = createdAt;
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

    public LocalDateTime getCreated_at() {
        return createdAt;
    }
}
