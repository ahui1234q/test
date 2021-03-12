package com.tedu.occzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy  //启动Zuul API 网关Gateway
public class OccZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(OccZuulApplication.class, args);
    }

}
