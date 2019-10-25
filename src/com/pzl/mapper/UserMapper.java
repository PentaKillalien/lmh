package com.pzl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.pzl.pojo.User;

public interface UserMapper {
	@Select("select * from user")
	List<User> selAllUsers();
	@Select("select * from user where username=#{0} and password=#{1}")
	User selOneUser(String username,String password);
	@Select("select * from user where username=#{0}")
	User selOneUserByName(String username);
	@Insert("insert into user values(default,#{username},#{password},#{email})")
	int insOneUser(User user);
}
