package com.folksdev.blog.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BlogController {

    @GetMapping
    public String greating(){
        return "Hello folksdev team !";
    }

}
