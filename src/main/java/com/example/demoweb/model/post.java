package com.example.demoweb.model;

public class post {
    private String text;
    private int likes;

    public post(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public int getLikes(){
        return likes;
    }
}
