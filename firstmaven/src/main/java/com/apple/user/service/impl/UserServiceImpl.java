package com.apple.user.service.impl;

import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apple.common.utils.CommonUtil;
import com.apple.common.utils.EncryptUtil;
import com.apple.user.dao.UserMapper;
import com.apple.user.domain.User;
import com.apple.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	public Map<String, String> regist(User user) {
		user.setPassword(EncryptUtil.MD5(user.getPassword()));
		user.setCreateBy("apple");
		user.setCreateTime(new Date());
		userMapper.insertSelective(user);
		return null;
	}

	public User login(User user) {
		User user1 = userMapper.selectByUser(user);
		return user1;
	}

	public void addUsers() throws Exception {
		for (int i = 0; i < 2; i++) {
			User user = randomUser();
			userMapper.insertSelective(user);
			System.out.println(i+"--------"+new Date());
		}
//		throw new RuntimeException();
	}

	private User randomUser() {
		User user = new User();
		user.setName(CommonUtil.randomStr(12));
		user.setPassword(CommonUtil.randomStr(12));
		user.setPhone(CommonUtil.randomPhone());
		user.setAge(CommonUtil.randomAge());
		user.setSex(CommonUtil.randomSex());
		user.setMail(CommonUtil.randomMail());
		user.setCreateBy(CommonUtil.randomStr(12));
		user.setCreateTime(new Date());
		return user;
	}

}
