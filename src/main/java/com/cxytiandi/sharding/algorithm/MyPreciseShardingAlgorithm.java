package com.cxytiandi.sharding.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.cxytiandi.sharding.config.SpringUtil;
import com.cxytiandi.sharding.service.ShareDbService;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;


/**
 * 自定义分片算法
 * 
 * @author mmc
 *
 */
public class MyPreciseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

	
	@Override
	public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Long> shardingValue) {
		Long id = shardingValue.getValue();
		ShareDbService shareDbService = SpringUtil.getBean(ShareDbService.class);
		List<String> dbs = shareDbService.getDbById(id);
		if(dbs!=null&&dbs.size()>0){
			return dbs.get(0);
		}
		throw new IllegalArgumentException("找不到数据库："+id);
	}

}
