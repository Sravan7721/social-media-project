package com.example.controller;

import com.example.model.Post;
import com.example.repository.PostRepository;
import com.example.security.JwtUtil;
import com.example.service.PostService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@CrossOrigin(origins = "*")
public class PostController {

    @Autowired
    private PostService service;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PostRepository repository;

    @GetMapping
    public List<Post> getAllPosts() {
        return service.getAllPosts();
    }

    @PostMapping
    public Post createPost(
            @RequestBody Post post,
            @RequestHeader("Authorization") String authHeader
    ) {

        String token = authHeader.replace("Bearer ", "");

        String username = jwtUtil.extractUsername(token);

        post.setUsername(username);

        return service.createPost(post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        repository.deleteById(id);
    }



    @PutMapping("/{id}")
public Post updatePost(
        @PathVariable Long id,
        @RequestBody Post updatedPost,
        @RequestHeader("Authorization") String authHeader
) {

    String token = authHeader.substring(7);

    String username = jwtUtil.extractUsername(token);

    Post post = repository.findById(id).orElseThrow();

    if (!post.getUsername().equals(username)) {
        throw new RuntimeException("Unauthorized");
    }

    post.setContent(updatedPost.getContent());

    return repository.save(post);
}

}