package com.apple.user.service;

import java.util.Map;

import com.apple.user.domain.User;

public interface UserService {
	
	public Map<String, String> regist(User user);
	
	public User login(User user);
	
	public void addUsers() throws Exception;
}
