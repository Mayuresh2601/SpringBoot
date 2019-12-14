package com.bridgelabz.springboot.starter.model;

import javax.validation.constraints.NotBlank;

public class User {

	@NotBlank(message = "FirstName is Mandatory")
	private String firstName;

	@NotBlank(message = "LastName is Mandatory")
	private String lastName;

	@NotBlank(message = "EmailId is Mandatory")
	private String email;

	@NotBlank(message = "Password is Mandatory")
	private String password;
	
	@NotBlank(message = "Confirm Password is Mandatory")
	private String confirmPassword;

	@NotBlank(message = "MobileNumber is Mandatory")
	private long mobileNumber;

}
