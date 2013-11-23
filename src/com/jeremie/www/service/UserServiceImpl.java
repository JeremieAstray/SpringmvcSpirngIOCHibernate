package com.jeremie.www.service;

import com.jeremie.www.dao.UserDao;
import com.jeremie.www.entity.User;
import com.jeremie.www.util.MyUtil;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user) {
		user.setPassword(MyUtil.MD5(user.getPassword()));
		userDao.addUser(user);
	}

	public User getUser(User user) {
		user.setPassword(MyUtil.MD5(user.getPassword()));
		return userDao.getUser(user);
	}
}
