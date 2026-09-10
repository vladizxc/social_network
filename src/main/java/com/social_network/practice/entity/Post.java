package com.social_network.practice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Entity
@Table(name="posts")
public class Post {

    @Id
    private long postId;

    @Column(name="content")
    private String content;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    private long userId;

    public Post(){}

    public Post(String content, LocalDateTime createdAt){
        if(content.isEmpty()) throw new IllegalArgumentException();
        this.content = content;
        this.createdAt = createdAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public long getPostId() {
        return postId;
    }

    public long getUserId() {
        return userId;
    }
}
