package com.jxy.bean;

import com.jxy.dao.IUserDao;

public class UserImpl implements IUserDao{

	public UserImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Hello I'm comming!");
	}

}
