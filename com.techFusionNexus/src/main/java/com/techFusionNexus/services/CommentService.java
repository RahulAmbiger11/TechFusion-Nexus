package com.techFusionNexus.services;

import java.util.List;

import com.techFusionNexus.entities.Comment;

public interface CommentService {
    Comment addComment(Comment comment);
    List<Comment> getAllComments();
}
