package com.example.repository;

import com.example.model.LikePost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeRepository
        extends JpaRepository<LikePost, Long> {

    List<LikePost> findByPostId(Long postId);
}