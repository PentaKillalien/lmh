package com.pzl.service.impl;

import java.util.List;

import com.pzl.mapper.UserMapper;
import com.pzl.pojo.User;
import com.pzl.service.UserService;

public class UserServiceImpl implements UserService{
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public List<User> selAll() {
		return userMapper.selAllUsers();
	}

	@Override
	public User selOneUser(String username, String password) {
		return userMapper.selOneUser(username, password);
	}

	@Override
	public User selOneUserByName(String username) {
		return userMapper.selOneUserByName(username);
	}

	@Override
	public int insOneUser(User user) {
		return userMapper.insOneUser(user);
	}

}
