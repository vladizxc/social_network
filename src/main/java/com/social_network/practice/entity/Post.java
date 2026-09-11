package com.social_network.practice.entity;

import jakarta.persistence.*;
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

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;

    public Post(){}

    public Post(String content, LocalDateTime createdAt, User user){
        if(content.isEmpty()) throw new IllegalArgumentException();
        this.content = content;
        this.createdAt = createdAt;
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public long getPostId() {
        return postId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
