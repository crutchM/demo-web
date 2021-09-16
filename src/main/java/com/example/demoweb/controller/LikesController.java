package com.example.demoweb.controller;
import com.example.demoweb.service.LikeService;
import com.example.demoweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LikesController {
    @Autowired
    LikeService likeService;

    @Autowired
    PostService postService;

    @ResponseBody
    @RequestMapping(path = "/post/{id}/like", method = RequestMethod.POST)
    public String like(@PathVariable("id") Long id){
        int likes = likeService.like(id);
        return ""+likes;

    }

}
