package com.tedu.consumerclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController //不做业务，去调用服务的提供者
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        String url = "http://localhost:7900/hello/"+name;
        url = "http://provider-user/hello/" + name;
        return restTemplate.getForObject(url,String.class);
    }

}
