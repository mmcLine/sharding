package com.cxytiandi.sharding.service;

import com.cxytiandi.sharding.po.ShareDb;
import com.cxytiandi.sharding.repository.ShareDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: mmc
 * @create: 2020-03-12 12:18
 **/
@Service
public class ShareDbServiceImpl implements ShareDbService {

    @Autowired
    private ShareDbRepository shareDbRepository;

    @Override
    public List<String> getDbById(Long id) {
        List<ShareDb> shareDbs = shareDbRepository.queryById(id);
        List<String> dbNames=new ArrayList<>();
        for (ShareDb shareDb:shareDbs){
            dbNames.add(shareDb.getDbName());
        }
        return dbNames;
    }
}
