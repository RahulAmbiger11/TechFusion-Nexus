package com.techFusionNexus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techFusionNexus.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
