package com.greyson.gycptest.service;

import com.github.pagehelper.PageInfo;
import com.greyson.gycptest.entity.UserModel;

public interface UserService {
	int addUser(UserModel user);
	PageInfo<UserModel> findAllUser(int pageNum,int pageSize);
}
