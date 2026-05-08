package com.example.service;

import com.example.model.Comment;
import com.example.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private final CommentRepository repo;

    public CommentService(CommentRepository repo) {
        this.repo = repo;
    }

    public Comment addComment(Comment comment) {
        return repo.save(comment);
    }

    public List<Comment> getComments(Long postId) {
        return repo.findByPostId(postId);
    }
}