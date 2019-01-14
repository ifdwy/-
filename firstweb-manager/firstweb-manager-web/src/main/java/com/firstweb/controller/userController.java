package com.firstweb.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firstweb.common.pojo.layuiDataGridResult;
import com.firstweb.pojo.User;
import com.firstweb.service.userService;

/**
 * 从数据库里查询出数据，打印在浏览器 里
 * @author weiye.duan
 *
 */

@Controller
public class userController {

		@Autowired
		private userService userService;
		
		@RequestMapping("/User/{id}")
		@ResponseBody
		public User getUserById(@PathVariable int id){
			User user = userService.getUserById(id);
			return user;
		}
		
		@RequestMapping("/user/list")
		@ResponseBody
		public Map<String, Object> getUserList(Integer page, Integer limit){
			Map<String, Object> result = userService.getUserList(page, limit);
			return result;
		}
}
