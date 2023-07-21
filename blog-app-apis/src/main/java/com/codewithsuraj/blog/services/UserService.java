package com.codewithsuraj.blog.services;

import java.util.List;

import com.codewithsuraj.blog.payloads.UserDto;

public interface UserService {
	
	UserDto registerNewUser(UserDto user);

	UserDto createUser(UserDto user);

	UserDto updateUser(UserDto user, Integer userId);

	UserDto getUserById(Integer UserId);

	List<UserDto> getAllUsers();

	void deleteUser(Integer userId);
}
