package org.ksyzkzk.book.springboot.web;

import lombok.RequiredArgsConstructor;
import org.ksyzkzk.book.springboot.service.posts.PostsService;
import org.ksyzkzk.book.springboot.web.dto.PostsResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final PostsService postsService;

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/genre")
    public String genre(){
        return "genre";
    }

    @GetMapping("/new")
    public String newsong(){
        return "new";
    }

    @GetMapping("/board")
    public String board(){
        return "board";
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("posts",postsService.findAllDesc());
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave(){
        return "save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id,Model model){
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post",dto);

        return "update";
    }

}
