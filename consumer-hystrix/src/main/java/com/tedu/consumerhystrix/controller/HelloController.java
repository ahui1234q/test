package com.tedu.consumerhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tedu.consumerhystrix.feign.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //不做业务，去调用服务的提供者
public class HelloController {
    @Autowired
    private HelloFeign helloFeign;


    @RequestMapping("/hello/{name}")
    @HystrixCommand(fallbackMethod = "fallBackHello")
    public String hello(@PathVariable String name){
       return helloFeign.hello(name);
    }

    //断路器方法,返回值要和方法一致，参数一致
    //注意一个bug，断路器刚启动时，第一次访问就到断路器了，不正常。第一次进入断路器不算数
    public String fallBackHello(String name){
        return "tonny";  //当发生异常时返回默认值，这种形式称为降级
    }
}
