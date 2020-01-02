package com.zsy.dubbo;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.zsy.dubbo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        context.start();

        String username = "aotian";
        for(int i=0;i<20;i++) {
            DemoService demoService = (DemoService) context.getBean("demoService");
            System.out.print(demoService.sayHello(username)+": ");
            System.out.println(demoService.sayHi(username));
        }
    }
}
