package com.example.demoweb.model;

public class post {
    private String text;
    private int likes;

    public post(String text, int likes){
        this.text = text;
        this.likes = likes;
    }

    public String getText(){
        return text;
    }

    public int getLikes(){
        return likes;
    }
}
