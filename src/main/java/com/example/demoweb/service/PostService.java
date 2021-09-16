package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private ArrayList<Post> posts = new ArrayList<>();
    public PostService(){
        posts.add(new Post(0,"fskjnvfjwdnmvfodwmvoiw",  new Date()));
        posts.add(new Post(1,"kjhsdnckjsdanjvcksamovk",  new Date()));
        posts.add(new Post(2,"единственный адекватный текст", new Date()));
    }

    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text){
        posts.add(new Post(posts.get(posts.size()-1).getId() + 1, text, new Date()));
    }


}
