package com.codewithsuraj.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithsuraj.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
