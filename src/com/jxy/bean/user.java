package com.jxy.bean;

public class user {
	private String username;
	private String password;
	private Integer age;

	public String getUsername() {
		return username;
	}

	
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+ username+","+password+","+age+"]";
	}
}
