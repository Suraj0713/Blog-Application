package com.codewithsuraj.blog.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithsuraj.blog.payloads.ApiResponse;
import com.codewithsuraj.blog.payloads.UserDto;
import com.codewithsuraj.blog.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;

	// POST - create a new user
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto) {
		UserDto createdUserDto = this.userService.createUser(userDto);
		return new ResponseEntity<>(createdUserDto, HttpStatus.CREATED);
	}

    //PUT - update an user
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto, @PathVariable Integer userId) {
		UserDto updatedUserDto = this.userService.updateUser(userDto, userId);
		return new ResponseEntity<UserDto>(updatedUserDto,HttpStatus.OK);
	}
    
	// DELETE -  delete a user
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer userId) {
		this.userService.deleteUser(userId);
	    return new ResponseEntity<ApiResponse>(new ApiResponse("User is deleted Successfully !!", true), HttpStatus.OK);
	}
    // GET  - get all users
	@GetMapping("/")
	 public ResponseEntity<List<UserDto>> getAllUsers() {
			
		return ResponseEntity.ok(this.userService.getAllUsers());
	}
	// GET  - get a user
	@GetMapping("/{userId}")
		 public ResponseEntity<UserDto> getUser(@PathVariable Integer userId) {
				
			return ResponseEntity.ok(this.userService.getUserById(userId));
		}
}
