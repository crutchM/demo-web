package com.example.demoweb.controller;

import com.example.demoweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostsViewController {
    @Autowired
    public PostService postService;
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("appName", "моё супер приложение");
        model.addAttribute("posts", postService.listAllPosts());
        return "list";
    }

    @ResponseBody
    @RequestMapping(path = "/post/{id}", method = RequestMethod.GET)
    public String single(@PathVariable("id") long id){
        return "page №" + id;
    }

    @ResponseBody
    @RequestMapping(path = "/txt", method = RequestMethod.GET)
    public String txt(){
        return "text";
    }
}
