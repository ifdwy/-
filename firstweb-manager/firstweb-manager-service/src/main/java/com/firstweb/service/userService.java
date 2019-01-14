package com.firstweb.service;

import java.util.Map;

import com.firstweb.pojo.User;

public interface userService {
	User getUserById(int id);
	Map<String, Object> getUserList(Integer page, Integer limit);
}
