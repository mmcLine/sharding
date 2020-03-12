package com.cxytiandi.sharding.repository;

import com.cxytiandi.sharding.po.ShareDb;
import com.cxytiandi.sharding.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ShareDbRepository {
	
	List<ShareDb> queryById(Long id);
}
