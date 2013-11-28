package com.jeremie.www.service;

import com.jeremie.www.entity.User;

public interface UserService {

	public void addUser(User user);

	public User getUser(User user);
	
	public User updateUser(User user);
}
