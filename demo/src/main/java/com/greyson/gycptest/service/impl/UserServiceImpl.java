package com.greyson.gycptest.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.greyson.gycptest.dao.UserDao;
import com.greyson.gycptest.entity.UserModel;
import com.greyson.gycptest.service.UserService;

@Service(value = "UserService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public int addUser(UserModel user) {
		// TODO Auto-generated method stub
		return userDao.insert(user);
	}
	
   /*
    * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
    * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
    * pageNum 开始页数
    * pageSize 每页显示的数据条数
    */
	@Override
	public PageInfo<UserModel> findAllUser(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		List<UserModel> users = userDao.selectUsers();
		PageInfo<UserModel> result = new PageInfo<UserModel>(users);		
		return result;
	}

	
}
