package com.xurao.ums;

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
public class UMSApplication {

    public static void main(String[] args) {
        SpringApplication.run(UMSApplication.class, args);
    }

}
