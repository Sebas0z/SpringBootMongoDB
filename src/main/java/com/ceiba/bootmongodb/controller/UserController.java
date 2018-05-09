package com.ceiba.bootmongodb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.bootmongodb.dal.UserRepository;

@RestController
@RequestMapping(value="/")
public class UserController {
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	private final UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

}
