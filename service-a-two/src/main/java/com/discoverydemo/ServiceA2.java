package com.discoverydemo;

import com.discoverydemo.impl.MyDiscoveryEnabledStrategy;
import com.nepxion.discovery.plugin.strategy.adapter.DiscoveryEnabledStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiceA2 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceA2.class, args);
    }

    // 自定义负载均衡的灰度策略
    @Bean
    public DiscoveryEnabledStrategy discoveryEnabledStrategy() {
        return new MyDiscoveryEnabledStrategy();
    }
}
