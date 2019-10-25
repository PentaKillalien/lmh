package com.pzl.service;

import java.util.List;

import com.pzl.pojo.User;

public interface UserService {
	
	/**
	 * 登陆成功状态码
	 */
	public static int LOGIN_SUCCESS_STATUS =1;
	/**
	 * 登陆不成功状态码
	 */
	public static int LOGIN_NOT_SUCCESS_STATUS =2;
	/**
	 * 注册成功状态码
	 */
	public static int REGISTER_SUCCESS_STATUS =3;
	/**
	 * 注册时用户名字符长度过界
	 */
	public static int REGISTER_CHAR_OUT_OF_BOUNDS=4;
	/**
	 * 注册时两次密码不一致
	 */
	public static int REGISTER_PASSWORD_NOT_EQUALS =5;
	/**
	 * 注册时Email格式不对
	 */
	public static int REGISTER_EMAIL_NOT_MATCH = 6;
	/**
	 * 注册时有空值
	 */
	public static int REGISTER_HAVE_NULL_VALUES = 7;
	
	/**
	 * 注册用户用户名已存在
	 */
	public static int REGISTER_USER_EXIST =8;
	/**
	 * 查询所有人物信息
	 * @return
	 */
	List<User> selAll();
	/**
	 * 查询登陆用户是否存在
	 * @param username
	 * @param password
	 * @return
	 */
	User selOneUser(String username,String password);
	/**
	 * 用名字查询用户是否存在
	 * @param username
	 * @return
	 */
	User selOneUserByName(String username);
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	int insOneUser(User user);
}
