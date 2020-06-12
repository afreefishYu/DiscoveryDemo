package com.discoverydemo.api;

import com.discoverydemo.gateway.feign.BFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: DiscoveryDemo
 * @description:
 * @author: yufangze
 * @create: 2020-05-08 11:06
 */
@RestController
public class AController {

    @Autowired
    private BFeign bFeign;

    @GetMapping(path = "/invoke/{value}")
    String invoke(@PathVariable(value = "value") String value) {
        System.out.println("service-a-1.1");
        String result = bFeign.invoke("a");
        return "a-1.1==="+result;
    }

}