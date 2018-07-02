package com.greyson.gycptest.dao;

import java.util.List;

import com.greyson.gycptest.entity.UserModel;

public interface UserDao {
	int insert(UserModel userModel);
	List<UserModel> selectUsers();
}
