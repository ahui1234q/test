package com.tedu.consumerfeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//调用服务的提供者
@FeignClient("provider-user")
public interface HelloFeign {
    @RequestMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);
}
