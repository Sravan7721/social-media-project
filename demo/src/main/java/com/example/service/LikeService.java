package com.example.service;

import com.example.model.LikePost;
import com.example.repository.LikeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeService {

    private final LikeRepository repo;

    public LikeService(LikeRepository repo) {
        this.repo = repo;
    }

    public LikePost addLike(LikePost like) {
        return repo.save(like);
    }

    public int getLikeCount(Long postId) {

        List<LikePost> likes =
                repo.findByPostId(postId);

        return likes.size();
    }
}