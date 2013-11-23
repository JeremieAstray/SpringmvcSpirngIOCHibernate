package com.jeremie.www.dao;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

import com.jeremie.www.entity.User;

public class UserDaoImplTest {

	@Test
	public void test() {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		Configuration configuration = new Configuration().configure();
    	ServiceRegistry serviceRegistry= new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    	userDaoImpl.setSessionFactory(configuration.buildSessionFactory(serviceRegistry));
    	User user = new User();
    	user.setUserNum("123456489412");
    	user.setPassword("1234");
    	user.setName("123");
    	userDaoImpl.addUser(user);
	}

}
