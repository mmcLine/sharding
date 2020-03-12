package com.cxytiandi.sharding.service;

import java.util.List;

/**
 * @description:
 * @author: mmc
 * @create: 2020-03-12 12:14
 **/

public interface ShareDbService {

    List<String> getDbById(Long id);
}
