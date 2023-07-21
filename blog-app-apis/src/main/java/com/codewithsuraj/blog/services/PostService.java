package com.codewithsuraj.blog.services;

import java.util.List;

import com.codewithsuraj.blog.payloads.PostDto;
import com.codewithsuraj.blog.payloads.PostResponse;

public interface PostService {

	// Create Post
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	// Update Post
	PostDto updatePost(PostDto postDto, Integer postId);

	// delete Post
	void deletePost(Integer postId);

	// get all posts
	PostResponse getAllPosts(Integer pageNumber, Integer pageSize, String sortBy,String sortDir);

	// get all posts by id
	PostDto getPostById(Integer postId);

	// get all posts by category
	List<PostDto> getPostsByCategory(Integer categoryId);

	// get all posts by user
	List<PostDto> getPostsByUser(Integer userId);

	// search posts
	List<PostDto> searchPosts(String Keyword);
}
