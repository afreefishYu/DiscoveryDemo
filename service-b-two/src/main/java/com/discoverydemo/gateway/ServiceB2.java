package com.discoverydemo.gateway;

import com.discoverydemo.gateway.impl.MyDiscoveryEnabledStrategy;
import com.nepxion.discovery.plugin.strategy.adapter.DiscoveryEnabledStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ServiceB2 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceB2.class, args);
    }

    // 自定义负载均衡的灰度策略
    @Bean
    public DiscoveryEnabledStrategy discoveryEnabledStrategy() {
        return new MyDiscoveryEnabledStrategy();
    }
}
