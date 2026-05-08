package com.example.controller;

import com.example.model.Comment;
import com.example.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    private final CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }

    @PostMapping
    public Comment addComment(
            @RequestBody Comment comment) {

        return service.addComment(comment);
    }

    @GetMapping("/{postId}")
    public List<Comment> getComments(
            @PathVariable Long postId) {

        return service.getComments(postId);
    }
}