package com.jeremie.www.dao;

import com.jeremie.www.entity.User;

public interface UserDao {
	
	public void addUser(User user);
	
	public User getUser(User user);
}
