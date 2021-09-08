package com.example.demoweb.model;

import java.util.Date;

public class post{
    private String text;
    private int likes;
    private Date creationDate;

    public post(String text, int likes, Date creationDate){
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
    }
    public Date getCreationDate(){
        return creationDate;
    }
    public String getText(){
        return text;
    }

    public int getLikes(){
        return likes;
    }
}
