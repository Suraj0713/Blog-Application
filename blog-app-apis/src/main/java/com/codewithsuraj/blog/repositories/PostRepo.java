package com.codewithsuraj.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithsuraj.blog.entities.Category;
import com.codewithsuraj.blog.entities.Post;
import com.codewithsuraj.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);

	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title);
}
