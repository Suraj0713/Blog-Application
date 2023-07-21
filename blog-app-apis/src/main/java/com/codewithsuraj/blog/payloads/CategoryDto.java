package com.codewithsuraj.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	
	private Integer categoryId;
	
	@NotBlank
	@Size(min = 4, message = "minimum 4 characters required !!! ")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 10, message = "minimum 10 characters required !!! ")
	private String categoryDescription;
}
