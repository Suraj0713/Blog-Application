package com.codewithsuraj.blog.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Role {
	
	@Id
	private int id;
	
	private String name;
}
