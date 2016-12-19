package com.preciso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.preciso.dao.UserDao;
import com.preciso.model.User;
@Service
@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
public class UserServiceClass implements UserService{
@Autowired
UserDao userdao;
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userdao.addUser(user);
	}

	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return userdao.listUser();
	}

	@Override
	public User getUserData(int id) {
		// TODO Auto-generated method stub
		return userdao.getUserData(id);
	}

	@Override
	public void deleteUserData(User user) {
		// TODO Auto-generated method stub
		userdao.deleteUserData(user);
	}

}
