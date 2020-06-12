package com.discoverydemo.gateway.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "discovery-guide-service-b")
public interface BFeign {


    @GetMapping(path = "/invokeb/{value}")
    String invoke(@PathVariable(value = "value") String value);

}