package com.example.demoweb.service;

import com.example.demoweb.model.post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<post> listAllPosts(){
        ArrayList<post> result = new ArrayList<>();
        result.add(new post("fskjnvfjwdnmvfodwmvoiw", 0, new Date()));
        result.add(new post("kjhsdnckjsdanjvcksamovk", 0, new Date()));
        result.add(new post("единственный адекватный текст", 1, new Date()));
        return result;
    }
}
