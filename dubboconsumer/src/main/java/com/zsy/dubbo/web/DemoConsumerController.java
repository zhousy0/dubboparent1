package com.zsy.dubbo.web;

import com.zsy.dubbo.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoConsumerController {
    @Resource
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name){
        return demoService.sayHello(name);
    }
}
