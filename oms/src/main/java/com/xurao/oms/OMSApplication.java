package com.xurao.oms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lazyb
 * @create 2018/7/30
 * @desc
 **/
@SpringBootApplication
@ComponentScan("com.xurao")
@ServletComponentScan
public class OMSApplication {

    public static void main(String[] args) {
        SpringApplication.run(OMSApplication.class, args);
    }

}
