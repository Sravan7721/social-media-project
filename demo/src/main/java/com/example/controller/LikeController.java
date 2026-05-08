package com.example.controller;

import com.example.model.LikePost;
import com.example.service.LikeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/likes")
public class LikeController {

    private final LikeService service;

    public LikeController(LikeService service) {
        this.service = service;
    }

    @PostMapping
    public LikePost addLike(
            @RequestBody LikePost like) {

        return service.addLike(like);
    }

    @GetMapping("/{postId}")
    public int getLikes(
            @PathVariable Long postId) {

        return service.getLikeCount(postId);
    }
}