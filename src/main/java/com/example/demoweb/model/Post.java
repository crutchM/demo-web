package com.example.demoweb.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private String text;
    private int likes;
    private Date creationDate;
    private Long id;
    public Post(){}
    public Post(Long id, String text, Date creationDate){
        this.text = text;
        likes = 0;
        this.creationDate = creationDate;
    }
    public Date getCreationDate(){
        return creationDate;
    }
    public void setLikes(int count){
        this.likes = count;
    }
    public String getText(){
        return text;
    }

    public Long getId(){
        return id;
    }
    public int getLikes(){
        return likes;
    }
}
