package com.cxytiandi.sharding.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cxytiandi.sharding.po.User;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserRepository {
	
	Long addUser(User user);
	
	List<User> list();
	
	User findById(Long id);
	
	User findByName(String name);

	List<User> listPage();
}
