package com.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.apple.user.domain.User;
import com.apple.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class UserTest {
	private static Logger logger = Logger.getLogger(UserTest.class);
	@Resource
	private UserService userService = null;


	@Test
	public void test1() {
		User userLogin=new User();
		User user = userService.login(userLogin);
		System.out.println(user.getName());
		logger.info(JSON.toJSONString(user));
	}
}
