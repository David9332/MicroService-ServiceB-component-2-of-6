package com.jb.serviceb;

import com.jb.serviceb.util.Art;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ServicebApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServicebApplication.class, args);
		System.out.println(Art.HEADER);
	}

	@Bean
	@LoadBalanced //ribbon (b,b,b)
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
