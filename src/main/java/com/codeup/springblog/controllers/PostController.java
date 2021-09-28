package com.codeup.springblog.controllers;

import com.codeup.springblog.repos.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class PostController {
    private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

    @GetMapping("/posts")
    public String Posts(Model model) {
        model.addAttribute("posts",postDao.findAll());
        return "index";
    }
    @GetMapping("/posts/{id}")
    @ResponseBody
    public String PostsId() {
        return "view an individual post";
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String PostsCreate() {
        return "view the form for creating a post";
    }
    @GetMapping("/posts/create/new")
    @ResponseBody
    public String PostsCreateNew() {
        return "create a new post";
    }
}
