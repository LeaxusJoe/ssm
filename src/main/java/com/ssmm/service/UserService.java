package com.ssmm.service;

import java.util.List;

import com.ssmm.model.User;

public interface UserService {
	public User getUserById(int id);
	
	public void saveUser(User user);
	
	public List getUsers() ;
}
