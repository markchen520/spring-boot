package com.roncoo.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.roncoo.shop.model.User;

@Mapper
public interface UserMapper {
	
	@Select("select * from user")
	List<User> findAllUsers();

}
