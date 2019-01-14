package com.firstweb.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstweb.mapper.UserMapper;
import com.firstweb.pojo.User;
import com.firstweb.pojo.UserExample;
import com.firstweb.pojo.UserExample.Criteria;
import com.firstweb.service.userService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class userServiceImpl implements userService {
	
	@Autowired
	private UserMapper usermapper;

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		//添加查询条件
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		List<User> list =usermapper.selectByExample(example);
		if(list != null && list.size()>0){
			User user = list.get(0);
			return user;
		}
		
		return null;
	}
	
	/**
	 * 实现列表查询
	 */
	@Override
	public Map<String, Object> getUserList(Integer page, Integer limit) {
		// TODO Auto-generated method stub
		//查询列表
		UserExample example = new UserExample();
		//分页处理
		PageHelper.startPage(Integer.valueOf(page), Integer.valueOf(limit));
		List<User> list =usermapper.selectByExample(example);
		long total = ((Page) list).getTotal();
		//创建一个返回值对象
		//layuiDataGridResult result = new layuiDataGridResult();
		Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",50);
        map.put("data",list);
        return map;
	}

}
