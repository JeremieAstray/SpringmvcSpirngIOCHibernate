package com.jeremie.www.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.jeremie.www.entity.User;

public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}


	@Override
	public User getUser(User user) {
		
		String hql = "from User u where u.userNum=? and u.password=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, user.getUserNum());
		query.setString(1, user.getPassword());
		return (User)query.uniqueResult();
	}
	
	public User updateUser(User user) {
		return null;
	}
}
