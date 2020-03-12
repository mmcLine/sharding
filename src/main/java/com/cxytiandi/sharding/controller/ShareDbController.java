package com.cxytiandi.sharding.controller;

import com.cxytiandi.sharding.service.ShareDbService;
import org.apache.shardingsphere.api.config.sharding.strategy.StandardShardingStrategyConfiguration;
import org.apache.shardingsphere.api.hint.HintManager;
import org.apache.shardingsphere.core.strategy.route.standard.StandardShardingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: mmc
 * @create: 2020-03-12 13:52
 **/
@RestController
public class ShareDbController {

    @Autowired
    private ShareDbService shareDbService;

    @RequestMapping("/listShareDb/{id}")
    public List<String> list(@PathVariable  Long id){
        return shareDbService.getDbById(id);
    }
}
