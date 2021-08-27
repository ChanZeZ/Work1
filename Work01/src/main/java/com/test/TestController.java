package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@RestController
public class TestController {

    /**
     * 取出自定义配置数据msg
     */
    @Value("${msg}")
    private String msg;

    @GetMapping("/getMsg")
    public String getMsg(){
        return msg;
    }

}
