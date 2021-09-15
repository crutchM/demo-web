package com.example.demoweb.service;

import com.example.demoweb.model.post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private ArrayList<post> posts = new ArrayList<>();
    public PostService(){
        posts.add(new post("fskjnvfjwdnmvfodwmvoiw",  new Date()));
        posts.add(new post("kjhsdnckjsdanjvcksamovk",  new Date()));
        posts.add(new post("единственный адекватный текст", new Date()));
    }

    public List<post> listAllPosts(){
        return posts;
    }

    public void create(String text){
        posts.add(new post(text, new Date()));
    }


}
