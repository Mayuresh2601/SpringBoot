package com.bridgelabz.springboot.starter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public String registerUser(RegisterDTO regdto) {
		
		ModelMapper mapper = new ModelMapper();
		
		User user = mapper.map(regdto, User.class);
		
		return "User Registered Successfully";
	}
	
	public String loginUser(LoginDTO logindto) {
		
		ModelMapper mapper = new ModelMapper();
		
		User user = mapper.map(logindto, User.class);
		
		return "Login Successfully";
	}

}
