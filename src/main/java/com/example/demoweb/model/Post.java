package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private int likes;
    private Date creationDate;
    private long id;

    public Post(long id, String text, Date creationDate){
        this.text = text;
        likes = 500;
        //this.likes = (int) (Math.random() * ++a);
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

    public long getId(){
        return id;
    }
    public int getLikes(){
        return likes;
    }
}
