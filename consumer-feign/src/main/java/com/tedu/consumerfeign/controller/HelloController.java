package com.tedu.consumerfeign.controller;

import com.tedu.consumerfeign.feign.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController //不做业务，去调用服务的提供者
public class HelloController {
    @Autowired
    private HelloFeign helloFeign;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name){
       return helloFeign.hello(name);
    }

}
