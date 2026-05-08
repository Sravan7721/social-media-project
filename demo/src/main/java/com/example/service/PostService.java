package com.example.service;

import com.example.model.Post;
import com.example.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository repo;

    public PostService(PostRepository repo) {
        this.repo = repo;
    }

    public Post createPost(Post post) {
        return repo.save(post);
    }

    public List<Post> getAllPosts() {
        return repo.findAll();
    }
}