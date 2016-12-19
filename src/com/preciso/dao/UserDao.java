package com.preciso.dao;

import java.util.List;

import com.preciso.model.User;

public interface UserDao {
public void addUser(User user);
public List<User> listUser();
public User getUserData(int id);
public void deleteUserData(User user);
}
