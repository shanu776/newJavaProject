package com.preciso.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.preciso.model.User;
@Repository("userDao")
public class UserDaoClass implements UserDao{
@Autowired
SessionFactory sessionFactory;
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
			sessionFactory.getCurrentSession().saveOrUpdate(user);	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return (List<User>)sessionFactory.getCurrentSession().createCriteria(User.class).list();
	}

	@Override
	public User getUserData(int id) {
		// TODO Auto-generated method stub
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	@Override
	public void deleteUserData(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("DELETE FROM User WHERE ID="+user.getId()).executeUpdate();
	}

}
