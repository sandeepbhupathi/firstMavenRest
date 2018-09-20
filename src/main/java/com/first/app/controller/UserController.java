package com.first.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.app.dao.FirstAppDAO;
import com.first.app.entity.User;

@RestController
public class UserController {

	@Autowired
	private FirstAppDAO firstAppDAO;
	
	@RequestMapping(path="/findAllUsers")
	public List<User> getAllUsers(){
		return firstAppDAO.findAllUsers();
	}
}
