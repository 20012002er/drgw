package com.xurao.common.service;

import org.springframework.stereotype.Service;

/**
 * @author lazyb
 * @create 2018/7/30
 * @desc
 **/
@Service("moduleService")
public class ModuleService {

    public String omsModule() {
        return "oms service running";
    }

    public String umsModule() {
        return "ums service running";
    }

}
