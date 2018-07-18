package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker //开启容错
@EnableFeignClients // 启动远程调用
public class EurekaClientComsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientComsumerApplication.class, args);
	}
}
