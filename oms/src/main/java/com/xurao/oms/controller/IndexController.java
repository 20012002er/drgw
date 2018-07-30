package com.xurao.oms.controller;

import com.xurao.common.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lazyb
 * @create 2018/7/30
 * @desc
 **/
@RestController
public class IndexController {

    @Autowired
    private ModuleService moduleService;

    @GetMapping("/")
    public String index() {
        return moduleService.omsModule();
    }

}
