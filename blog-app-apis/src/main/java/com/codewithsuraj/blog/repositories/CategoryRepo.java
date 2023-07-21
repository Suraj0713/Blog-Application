package com.codewithsuraj.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithsuraj.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
