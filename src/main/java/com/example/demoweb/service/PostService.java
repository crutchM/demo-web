package com.example.demoweb.service;

import com.example.demoweb.model.post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<String> listAllPosts(){
        ArrayList<String> result = new ArrayList<>();
        result.add(new post("fskjnvfjwdnmvfodwmvoiw").getText());
        result.add(new post("kjhsdnckjsdanjvcksamovk").getText());
        result.add(new post("единственный адекватный текст").getText());
        return result;
    }
}
