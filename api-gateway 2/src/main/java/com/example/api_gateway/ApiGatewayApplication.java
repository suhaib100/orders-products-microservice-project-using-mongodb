package com.example.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.handler.predicate.PathRoutePredicateFactory;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient

@ComponentScan(basePackages = {"com.example.api_gateway.route.GatewayConfig"})

public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}






//	@Bean
//	public RouteLocatorBuilder routeLocatorBuilder(ConfigurableApplicationContext applicationContext) {
//		return new RouteLocatorBuilder(applicationContext);
//	}
//
//	@Bean
//	public PathRoutePredicateFactory pathRoutePredicateFactory() {
//		return new PathRoutePredicateFactory();
//	}
}
