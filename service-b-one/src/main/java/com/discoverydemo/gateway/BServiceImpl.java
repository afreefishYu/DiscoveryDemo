package com.discoverydemo.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: DiscoveryDemo
 * @description:
 * @author: yufangze
 * @create: 2020-05-08 11:13
 */
@RestController
public class BServiceImpl {

    @GetMapping(path = "/invokeb/{value}")
    String invoke(@PathVariable(value = "value") String value){
        return "b-1.0";
    }
}